/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

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
    
    public void setApp(Main application){
        this.application = application;
    }
    
    public void logout(ActionEvent e){
        application.userLogout();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

public String GetSomething(int age){
    return "";
}    
    
}
