/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Accounts;

import Login.Main;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Alex Clapper
 */
public class AccountsController extends AnchorPane implements Initializable {
    
    @FXML
    Label errorLabel;
    @FXML
    TextField newUserIDField;
    @FXML
    TextField passwordField;
    @FXML
    ComboBox accountTypeComboBox;
    
    private Main application;
    private AccountsModel currentUser;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        accountTypeComboBox.getItems().addAll("Employee Account","Customer Account");
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
    
    public void goBack(ActionEvent e){
        application.goToEmployeeNavigation();
    }

    public void newAccount(ActionEvent e){
        System.out.println("newAccount function activated");
        errorLabel.setText("");
        String newUserID = newUserIDField.getText();
        System.out.println("UserID: " + newUserID);
        String newPassword = passwordField.getText();
        System.out.println("Password: " + newPassword);
        String accountType = (String) accountTypeComboBox.getValue();
        System.out.println("Account Type: " + accountType);
        
        if(newUserID.equalsIgnoreCase("") || newPassword.equalsIgnoreCase("")){
            errorLabel.setText("No Value for UserID or password");
            return;
        }
        
        if(accountType == null){
            errorLabel.setText("No Selected Account Type");
            return;
        }
        
       if(accountType.equals("Employee Account")){
           application.createEmployeeAccount(newUserID, newPassword);
           application.goToEmployeeNavigation();
       } else if(accountType.equals("Customer Account")){
           application.createCustomerAccount(newUserID, newPassword);
           application.goToEmployeeNavigation();
       }
    }

}
