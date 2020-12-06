/*
 * Copyright (c) 2008, 2012 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package Login;

import Accounts.AccountsModel;
import Accounts.AccountsModel;
import Accounts.AccountsModel;
import Accounts.CustomerModel;
import Accounts.EmployeeModel;
import Application.ApplicationTypeSelectionViewController;
import Application.BuisnessAppViewController;
import Application.OtherAppViewController;
import Application.PersonalAppViewController;
import Decision.DecisionController;
import Login.Authenticator;
import Login.Authenticator;
import Login.LoginController;
import Login.LoginController;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Main Application. This class handles navigation and user session.
 */
public class Main extends Application {

    private Stage stage;
    private AccountsModel loggedUser;
    private final double MINIMUM_WINDOW_WIDTH = 390.0;
    private final double MINIMUM_WINDOW_HEIGHT = 500.0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(Main.class, (java.lang.String[])null);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            stage = primaryStage;
            stage.setTitle("E-Finance");
            stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
            stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
            gotoLogin();
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public AccountsModel getLoggedUser() {
        System.out.println("getLoggedUser Method Activated");
        return loggedUser;
    }
        
    public boolean customerLogging(String userId, String password){
        System.out.println("CustomerLogging Method Activated");
        if (Authenticator.validate(userId, password)) {
            loggedUser = CustomerModel.of(userId);
            //Need a go to somewhere
            showCustomerNavigation();
            return true;
        } else {
            return false;
        }
    }
    
    public boolean employeeLogging(String userId, String password){
        System.out.println("EmployeeLogging Method Activated");
        if (Authenticator.validate(userId, password)) {
            loggedUser = EmployeeModel.of(userId);
            //Need a go to somewhere
            showEmployeeNavigation();
            return true;
        } else {
            return false;
        }
    }
    
    public void userLogout(){
        loggedUser = null;
        gotoLogin();
    }
    
    public void showApplication(){
        System.out.println("showApplication Method Activated");
        goToApplicationSelection();
    }
    
    public void showDecision(){
        System.out.println("showDecision Method Activated");
        goToDecision();
    }
    
    public void showCustomerNavigation(){
        System.out.println("showCustomerNavigation Method Activated");
        goToCustomerNavigation();
    }
    
    public void showEmployeeNavigation(){
        System.out.println("showEmployeeNavigation Method Activated");
        goToEmployeeNavigation();
    }
    
    public void showPersonalLoanApplication(){
        System.out.println("showPersonalLoanApplication Method Activated");
        goToPersonalLoan();
    }
    public void showBuisnessLoanApplication(){
        System.out.println("showBuisnessLoanApplication Method Activated");
        goToBuisnessLoan();
    }
    public void showOtherLoanApplication(){
        System.out.println("showOtherLoanApplication Method Activated");
        goToOtherLoan();
    }
    

    private void gotoLogin() {
        System.out.println("gotoLogin Method Activated");
        try {
            LoginController login = (LoginController) replaceSceneContent("login.fxml");
            login.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void goToApplicationSelection(){
        System.out.println("goToApplicationSelection Method Activated");
        try {
            ApplicationTypeSelectionViewController app = (ApplicationTypeSelectionViewController) replaceSceneContent("/Application/ApplicationTypeSelectionView.fxml");
            app.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void goToDecision(){
        System.out.println("goToDecision Method Activated");
        try {
            DecisionController app = (DecisionController) replaceSceneContent("/Decision/DecisionView.fxml");
            app.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void goToCustomerNavigation(){
        System.out.println("goToCustomerNavigation Method Activated");
        try {
            CustomerNavigationController app = (CustomerNavigationController) replaceSceneContent("CustomerNavigationView.fxml");
            app.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void goToEmployeeNavigation(){
        System.out.println("goToEmployeeNavigation Method Activated");
        try {
            EmployeeNavigationController app = (EmployeeNavigationController) replaceSceneContent("EmployeeNavigationView.fxml");
            app.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void goToPersonalLoan(){
        System.out.println("goToPersonalLoan Method Activated");
        try {
            PersonalAppViewController app = (PersonalAppViewController) replaceSceneContent("/Application/PersonalAppView.fxml");
            app.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void goToBuisnessLoan(){
        System.out.println("goToBuisnessLoan Method Activated");
        try {
            BuisnessAppViewController app = (BuisnessAppViewController) replaceSceneContent("/Application/BuisnessAppView.fxml");
            app.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void goToOtherLoan(){
        System.out.println("goToOtherLoan Method Activated");
        try {
            OtherAppViewController app = (OtherAppViewController) replaceSceneContent("/Application/OtherAppView.fxml");
            app.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Main.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        } 
        Scene scene = new Scene(page, 800, 600);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
}
