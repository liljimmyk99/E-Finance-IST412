/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Records;

import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author Alex Clapper
 */
public class Loan {
    private final SimpleStringProperty loanID;
    private final SimpleStringProperty loanee;
    private SimpleDoubleProperty loanAmount;
    private SimpleDoubleProperty amountRemaining;
    private SimpleDoubleProperty minimumPayment;
    private LocalDate nextDueDate;
    
    public Loan(String loanID, String loanee, double loanAmount, double amountRemaining, double minimumPayment, LocalDate nextDueDate){
        this.loanID = new SimpleStringProperty(loanID);
        this.loanee = new SimpleStringProperty(loanee);
        this.loanAmount = new SimpleDoubleProperty(loanAmount);
        this.amountRemaining = new SimpleDoubleProperty(amountRemaining);
        this.minimumPayment = new SimpleDoubleProperty(minimumPayment);
        this.nextDueDate = nextDueDate;
    }
    
    public String getLoanee(){
        return loanee.get();
    }
    
    public void setLoanAmount(Double loanAmount){
        this.loanAmount = new SimpleDoubleProperty(loanAmount);
    }
    
    public double getLoanAmount(){
        return loanAmount.get();
    }
    
    public void setAmountRemaining(Double amountRemaining){
        this.amountRemaining = new SimpleDoubleProperty(amountRemaining);
    }
    
    public double getAmountRemaining(){
        return amountRemaining.get();
    }
    
    public void setMinimumPayment(Double minimumPayment){
        new SimpleDoubleProperty(minimumPayment);
    }
    
    public double getMinimumPayment(){
        return minimumPayment.get();
    }
    
    public void setNextDueDate(LocalDate nextDueDate){
        this.nextDueDate = nextDueDate;
    }
    
    public LocalDate getNextDueDate(){
        return nextDueDate;
    }
    
}
