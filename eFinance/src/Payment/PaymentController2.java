/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Payment;

import Accounts.AccountsModel;
import Application.AppModel;
import Login.Main;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Alex Clapper
 */
public class PaymentController2 implements Initializable {

    @FXML
    private Label lnameLabel;

    @FXML
    private Label Title;

    @FXML
    private Label fnameLabel;

    @FXML
    private TextField fnameInput;

    @FXML
    private TextField lnameInput;

    @FXML
    private Label emailLabel;

    @FXML
    private TextField emailInput;

    @FXML
    private Label cardNumLabel;

    @FXML
    private TextField cardNumInput;

    @FXML
    private Button submitButton;

    @FXML
    private Label csvLabel;

    @FXML
    private TextField csvInput;
    
    @FXML
    private Label fillOutLabel;
    
    @FXML
    private Label successLabel;
    
    @FXML
    private Button homeButton;
    
    @FXML
    void clickedHome(ActionEvent event) {
        application.goToCustomerNavigation();
    }
    
    
    @FXML
    void clickedSubmit(ActionEvent event) {
        if((fnameInput.getText()).equals("") || (lnameInput.getText().equals("")) || (emailInput.getText()).equals("") || (cardNumInput.getText()).equals("") || (csvInput.getText()).equals("")){
            fillOutLabel.setVisible (true);
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Payment Successful");
            alert.setHeaderText(null);
            alert.setContentText("Payment Successful");
            alert.showAndWait();
            application.showCustomerNavigation();
        }
    }
    
    private Main application;
    
    private AppModel userApplication;
    private AccountsModel currentUser;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        fillOutLabel.setVisible (false);
        successLabel.setVisible (false);
        homeButton.setVisible(false);
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
    

}
