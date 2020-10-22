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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author jimmykane
 */
public class AppViewController extends AnchorPane implements Initializable {

    @FXML private Button logOutButton;
    
    private Main application;
    
    //Gets Access to the LoggedUsers fields and methods
    private AccountsModel currentUser;
    
    //Gets the LoanApplication Object
    private AppModel loanApplication;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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

    public void createApplication(String name, String address, String phoneNumber, String ssn, double yearlyIncome, Integer creditScore, String underGradDegree, boolean currentlyEmployed, boolean married){
        loanApplication = new AppModel(name, address, phoneNumber, ssn, yearlyIncome, creditScore, underGradDegree,currentlyEmployed, married);
    }
    
    public void createApplication(){
        loanApplication = new AppModel();
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
    
}
