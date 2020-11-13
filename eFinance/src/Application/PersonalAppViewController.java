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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author jimmykane
 */
public class PersonalAppViewController extends AnchorPane implements Initializable {

    ObservableList<String> maritalStatusList = FXCollections.observableArrayList("Single", "Married", "Divorced");
    
    @FXML private Button logOutButton;
    @FXML private Button backButton;
    @FXML private TextField nameTextField;
    @FXML private TextField ssnTextField;
    @FXML private TextField emailTextField;
    @FXML private TextField creditScoreTextField;
    @FXML private DatePicker DateOfBirthField;
    @FXML private CheckBox maleCheckBox;
    @FXML private CheckBox femaleCheckBox;
    @FXML private ChoiceBox relationshipStatusField;
    
    
    
    private Main application;
    
    //Gets Access to the LoggedUsers fields and methods
    private AccountsModel currentUser;
    
    //Gets the LoanApplication Object
    private AppModel loanApplication;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        relationshipStatusField.setItems(maritalStatusList);
    }
    
    //Gets the Application Object so this class can call the main method functions and get user information
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
        loanApplication = new PersonalApplication(name, address, phoneNumber, ssn, yearlyIncome, creditScore, underGradDegree,currentlyEmployed, married);
    }
    
    public void createApplication(){
        loanApplication = new PersonalApplication();
    }
    
    public AppModel GetCurrentApplication(){
        //Looks up User in the Application Model
        return loanApplication;
    }

    public void SubmitApplication(ActionEvent e){
        AccountsModel user = application.getLoggedUser();
        //Adds Application to the User
        loanApplication.setApplicationInProgress(false);
        //user.SubmitApplication()
    }
    
    public void SaveApplication(ActionEvent e){
        AccountsModel user = application.getLoggedUser();
        //Adds Application to the User with an notfinished Flag
        loanApplication.setApplicationInProgress(true);
        //user.SaveApplication(this.currentApplication
    }
    
    public void GetHelp(ActionEvent e) {
        //Call Representative
        
        //Email Representative
    }
    
    //Validate User Input
    public boolean checkInputs(ActionEvent e){
        
        return false;
    }
    
}
