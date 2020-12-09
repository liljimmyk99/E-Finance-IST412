/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author jimmykane
 */
public class BuisnessApplication extends AppModel {

    
    public BuisnessApplication(String name, String poc, String email, String phoneNumber, String address, double revenue, String purpose, String amount){
        //Calls AppModel Constructor
        //super(name, address, phoneNumber, ssn, yearlyIncome, creditScore, underGradDegree, currentlyEmployed, married);
    }
    
    public BuisnessApplication(){}

    @Override
    public String getApplicationType(){
        return "Business";
    }
}

    
