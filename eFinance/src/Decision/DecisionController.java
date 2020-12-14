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
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author jimmykane
 */
public class DecisionController implements Initializable {

    private Main application;
    
    @FXML
    private ComboBox applicationComboBox;
    
    private AppModel userApplication;
    private AccountsModel currentUser;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        applicationComboBox.setItems(FXCollections.observableArrayList(Records.RecordsModel.getRecordsModel().getApplications()));
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
    
    public void approveApplication(ActionEvent e){
        Records.RecordsModel.getRecordsModel().deleteApplication(applicationComboBox.getValue().toString());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Application Approved");
        alert.setHeaderText(null);
        alert.setContentText("Application Approved");
        alert.showAndWait();
        applicationComboBox.setItems(FXCollections.observableArrayList(Records.RecordsModel.getRecordsModel().getApplications()));
        applicationComboBox.setValue(null);
    }
    
    public void denyApplication(ActionEvent e){
        Records.RecordsModel.getRecordsModel().deleteApplication(applicationComboBox.getValue().toString());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Application Denied");
        alert.setHeaderText(null);
        alert.setContentText("Application Denied");
        alert.showAndWait();
        applicationComboBox.setItems(FXCollections.observableArrayList(Records.RecordsModel.getRecordsModel().getApplications()));
        applicationComboBox.setValue(null);
    }
    
    public void setApplication(AppModel userApplication){
        this.userApplication = userApplication;
    }
}
