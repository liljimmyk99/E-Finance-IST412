/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Accounts;

import Login.Main;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

/**
 *
 * @author Alex Clapper
 */
public class AccountsController implements Initializable {
    
    private Main application;
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

    public void createCustomerAccount(String id, String email){
        if(CustomerModel.getUsers().containsKey(id)){
            System.out.println("A user with this id already exists");
        }else{
            CustomerModel.of(id).setEmail(email);
        }    
    }

    public void createEmployeeAccount(String id, String email){
            if(EmployeeModel.getUsers().containsKey(id)){
                System.out.println("A user with this id already exists");
            }else{
                CustomerModel.of(id).setEmail(email);
            }    
    }     
}
