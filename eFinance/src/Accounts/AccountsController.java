/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Accounts;

import Login.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 *
 * @author Alex Clapper
 */
public class AccountsController implements Initializable {
    
    private Main application;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void createAccount(String id, String email, String Status){
        if(AccountsModel.getUsers().containsKey(id)){
            System.out.println("A user with this id already exists");
        }else{
            AccountsModel.of(id).setEmail(email);
            AccountsModel.of(id).setStatus(Status); 
        }
        
    }    
    
}
