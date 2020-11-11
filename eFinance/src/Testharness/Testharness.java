/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testharness;

import Application.PersonalAppViewController;
import Decision.DecisionController;
import Login.Authenticator;
import Login.LoginController;
import javafx.event.ActionEvent;

/**
 *
 * @author acsoc
 */
public class Testharness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginController loginCntl = new LoginController();
        if (Authenticator.validate("demo", "demo")){
            System.out.println("Valid Login: Succesful Test");
        }else{
            System.out.println("Invalid Login: Test Failed");
        }
        
        PersonalAppViewController AppViewCntl = new PersonalAppViewController();
        AppViewCntl.createApplication("Alex", "State College", "717-476-4425", "555-55-5555", 10000.00, 750, "UnderWater Basket Weaving", true, false);
        System.out.println("Expected Result: Alex; Actual Result:" + AppViewCntl.GetCurrentApplication().getName());
        
        DecisionController DecisionCntl = new DecisionController();
        DecisionCntl.setApplication(AppViewCntl.GetCurrentApplication());
        DecisionCntl.approveApplication(new ActionEvent());
        System.out.println(AppViewCntl.GetCurrentApplication().isApprovedApplication());
        
        
        
        
            
    }
    
}
