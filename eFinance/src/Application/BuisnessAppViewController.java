/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Accounts.AccountsModel;
import Login.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author jimmykane
 */
public class BuisnessAppViewController extends AnchorPane implements Initializable {

       //CheckBox Options
    ObservableList<String> maritalStatusList = FXCollections.observableArrayList("Single", "Married", "Divorced");
    ObservableList<String> educationStatusList = FXCollections.observableArrayList("Some High School", "High School Diploma", "Some Trade School", "Trade Certificate", "Some College", "Associates Degree", "Bachalors Degree", "Master's Degree");
    ObservableList<String> genderList = FXCollections.observableArrayList("Male", "Female");
    ObservableList<String> approvalOptionList = FXCollections.observableArrayList("Agree", "Disagree");
    //Buttons
    @FXML private Button logOutButton;
    @FXML private Button backButton;
    @FXML private Button submitButton;
    
    //User Input Fields
    @FXML private TextField nameTextField;
    @FXML private TextField ssnTextField;
    @FXML private TextField emailTextField;
    @FXML private TextField phoneNumberField;
    @FXML private TextField addressField;
    @FXML private TextField creditScoreTextField;
    @FXML private DatePicker dateOfBirthField;
    @FXML private ChoiceBox genderSelectionField;
    @FXML private ChoiceBox relationshipStatusField;
    @FXML private ChoiceBox educationStatusField;
    @FXML private TextField incomeField;
    @FXML private ChoiceBox approvalField;
    
    private Main application;
    
    //Gets Access to the LoggedUsers fields and methods
    private AccountsModel currentUser;
    
    //Gets the LoanApplication Object
    private AppModel loanApplication;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         relationshipStatusField.setItems(maritalStatusList);
        educationStatusField.setItems(educationStatusList);
        genderSelectionField.setItems(genderList);
        approvalField.setItems(approvalOptionList);
    }

    public void setApp(Main application){
        this.application = application;
        currentUser = application.getLoggedUser();
    }
    
    //Takes the user back to the log in page
    public void logout(ActionEvent e){
        application.userLogout();
    }
    
    public void backToNavigation(ActionEvent e){
        application.showNavigation();
    }    
    
    public void createApplication(String name, String address, String phoneNumber, String ssn, double yearlyIncome, Integer creditScore, String underGradDegree, boolean currentlyEmployed, boolean married){
        loanApplication = new BuisnessApplication(name, address, phoneNumber, ssn, yearlyIncome, creditScore, underGradDegree,currentlyEmployed, married);
    }
    
    public void createApplication(){
        loanApplication = new BuisnessApplication();
    }
    
    public AppModel GetCurrentApplication(){
        //Looks up User in the Application Model
        return loanApplication;
    }

    public void SubmitApplication(ActionEvent e){
        //Check that Inputs are not Empty
        if (checkEmptyInputs()){
            System.out.println("Application is Free From Errors");
        }
        
        //Check that Inputs are formatted Correctly
        
        //Create New Application
        createApplication(nameTextField.getText(), "Some Address", "Some Phone Number", ssnTextField.getText(), Double.parseDouble(incomeField.getText()), Integer.parseInt(creditScoreTextField.getText()), educationStatusField.getValue().toString(), true, false);
       
        
        //Adds Application to the User
        //user.SubmitApplication()
    }
    
    //Validate User Input
    public boolean checkEmptyInputs(){
        System.out.println("checkEmptyInputs method activated");
        //Print out Field Values
        System.out.println("Name: |" + nameTextField.getText() + "|");
        System.out.println("Email: " + emailTextField.getText());
        System.out.println("Date of Birth: " + dateOfBirthField.getValue());
        System.out.println("Credit Score: " + creditScoreTextField.getText());
        System.out.println("SSN: " + ssnTextField.getText());
        System.out.println("Gender: " + genderSelectionField.getValue());
        System.out.println("Relationship Status: " + relationshipStatusField.getValue());
        System.out.println("Education Status " + educationStatusField.getValue());
        System.out.println("Income: " + incomeField.getText());
        System.out.println("Approval: " + approvalField.getValue());

//Ensure Fields are not Empty
        if (nameTextField.getText().equals("")){
            System.out.println("nameTextField is empty");
            return false;
        } else if (emailTextField.getText().equals("")){
             System.out.println("emailTextField is empty");
            return false;
        } else if (phoneNumberField.getText().equals("")){
            System.out.println("phoneNumberField is empty");
            return false;
        } else if (addressField.getText().equals("")){
            System.out.println("addressField is empty");
            return false;
        }else if (dateOfBirthField.getValue() == null){
             System.out.println("dateOfBirthField is empty");
            return false;
        } else if (creditScoreTextField.getText().equals("")){
             System.out.println("creditScoreTextField is empty");
            return false;
        } else if (ssnTextField.getText().equals("")){
             System.out.println("ssnTextField is empty");
            return false;
        } else if (genderSelectionField.getValue() ==""){
            System.out.println("genderSelectionField is empty");
        } else if (relationshipStatusField.getValue() == null){
             System.out.println("relationshipStatusField is empty");
            return false;
        } else if (educationStatusField.getValue() == null){
             System.out.println("educationStatusField is empty");
            return false;
        } else if (incomeField.getText().equals("")){
             System.out.println("incomeField is empty");
            return false;
        } else if (approvalField.getValue() == ""){
            System.out.println("approvalField is empty");
            return false;
        }
        
        //If this far, all attributes are filled out
        return true;
    }
}
