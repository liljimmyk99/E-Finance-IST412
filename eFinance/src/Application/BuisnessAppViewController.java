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
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author jimmykane
 */
public class BuisnessAppViewController extends AnchorPane implements Initializable {

       //CheckBox Options
    ObservableList<String> approvalOptionList = FXCollections.observableArrayList("Agree", "Disagree");
    //Buttons
    @FXML private Button logOutButton;
    @FXML private Button backButton;
    @FXML private Button submitButton;
    
    //User Input Fields
    @FXML private TextField nameTextField;
    @FXML private TextField pocTextField;
    @FXML private TextField emailTextField;
    @FXML private TextField phoneNumberField;
    @FXML private TextField addressField;
    @FXML private TextField revenueField;
    @FXML private TextArea purposeArea;
    @FXML private TextField amountField;
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
        approvalField.setItems(approvalOptionList);
        revenueField.textProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
                String newValue) {
                if (!newValue.matches("\\d*")) {
                revenueField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        amountField.textProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, 
                String newValue) {
                if (!newValue.matches("\\d*")) {
                amountField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        }); 
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
        application.showCustomerNavigation();
    }    
    
    public void createApplication(String name, String poc, String email, String phoneNumber, String address, double revenue, String purpose, String amount){
        loanApplication = new BuisnessApplication(name, poc, email, phoneNumber, address, revenue, purpose, amount);
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
            System.out.println("All fields completed");
            //Create New Application
            createApplication(nameTextField.getText(), pocTextField.getText(), emailTextField.getText(), phoneNumberField.getText(), addressField.getText(), Double.parseDouble(revenueField.getText()), purposeArea.getText(), amountField.getText());

            //Adds Application to the User
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Application Submitted");
            alert.setHeaderText(null);
            alert.setContentText("Application Submitted");
            alert.showAndWait();
            //user.SubmitApplication()
            
            application.showCustomerNavigation();
        } else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Fields Not Completed");
            alert.setHeaderText(null);
            alert.setContentText("Please make sure all fields are completed");
            alert.showAndWait();
        }        
        
    }
       
    //Validate User Input
    public boolean checkEmptyInputs(){
        System.out.println("checkEmptyInputs method activated");
        //Print out Field Values
        System.out.println("Name: |" + nameTextField.getText() + "|");
        System.out.println("Point of Contact: " + pocTextField.getText());
        System.out.println("Email: " + emailTextField.getText());
        System.out.println("Phone Number: " + phoneNumberField.getText());
        System.out.println("Address: " + addressField.getText());
        System.out.println("Annual Revenue: " + revenueField.getText());
        System.out.println("Purpose: " + purposeArea.getText());
        System.out.println("Loan AMount: " + amountField.getText());
        System.out.println("Affirmation: " + approvalField.getValue());
        
        
//Ensure Fields are not Empty
        if (nameTextField.getText().equals("")){
            System.out.println("nameTextField is empty");
            return false;
        } else if (pocTextField.getText().equals("")){
            System.out.println("pocTextField is empty");
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
        } else if (revenueField.getText().equals("")){
            System.out.println("revenueField is empty");
            return false;
        }else if (purposeArea.getText().equals("")){
            System.out.println("purposeArea is empty");
            return false;
        } else if (amountField.getText().equals("")){
            System.out.println("amountField is empty");
            return false;
        } else if (approvalField.getValue() == null){
            System.out.println("approvalField is empty");
            return false;
        }
        
        //If this far, all attributes are filled out
        return true;
    }

}
