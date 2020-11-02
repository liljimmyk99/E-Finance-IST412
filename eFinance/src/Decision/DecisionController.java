/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decision;

import Accounts.AccountsModel;
import Application.AppModel;
import Login.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author jimmykane
 */
public class DecisionController implements Initializable {

    private Main application;
    
    private AppModel userApplication;
    private AccountsModel currentUser;
    /**
     * Initializes the controller class.
     */
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
    
    public void approveApplication(ActionEvent e){
        userApplication.setApprovedApplication(true);
    }
    
    public void denyApplication(ActionEvent e){
        userApplication.setApprovedApplication(false);
    }
    
    public void setApplication(AppModel userApplication){
        this.userApplication = userApplication;
    }
}
