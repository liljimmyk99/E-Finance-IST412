/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Payment;

import Login.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;

/**
 *
 * @author Alex Clapper
 */
public class PaymentController implements Initializable {
    
    @FXML 
    ComboBox<String> loanComboBox;
    @FXML
    Button selectButton;
    
    @FXML
    private Button backButton;

    @FXML
    void clcikedBack(ActionEvent event) {
        application.showCustomerNavigation();
    }
    
    private Main application;
    private static Records.RecordsModel records;
    private List<String> loans;
    private ArrayList<Records.Loan> loanList;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    records = Records.RecordsModel.getRecordsModel();
    loans = records.getLoans();
    for(String loan : loans){
        loanComboBox.setItems(FXCollections.observableArrayList(loans));
    }      
    }    
    
    public void goToPayment2(ActionEvent e){
        application.goToPayment2(loanComboBox.getValue());
    }
    
    //Gets the Application Object so this class can call the main method functions and get user information
    public void setApp(Main application){
        this.application = application;
    }
    
    //Takes the user back to the log in page
    public void logout(ActionEvent e){
        application.userLogout();
    } 
    
    
}
