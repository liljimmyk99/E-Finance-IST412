/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

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
public class CustomerNavigationController extends AnchorPane implements Initializable {

    private Main application;
    
    @FXML
    Button ApplicationButton;
    @FXML
    Button PaymentTwoButton;
    @FXML
    Button logoutButton;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setApp(Main application){
        this.application = application;
        //Hello
    }
    
    public void logout(ActionEvent e){
        application.userLogout();
    }
    
    public void showApplicationSelection(ActionEvent e){
        application.showApplication();
    }
    
    public void showPayment(ActionEvent e){
        application.showPayment();
    }
}
