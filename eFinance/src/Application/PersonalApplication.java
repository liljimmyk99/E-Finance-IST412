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
public class PersonalApplication extends AppModel {
    public PersonalApplication(String name, String address, String phoneNumber, String ssn, double yearlyIncome, Integer creditScore, String underGradDegree, boolean currentlyEmployed, boolean married){
        //Calls AppModel Constructor
        super(name, address, phoneNumber, ssn, yearlyIncome, creditScore, underGradDegree, currentlyEmployed, married);
    }
    
    public PersonalApplication(){}

    public String getApplicationType(){
        return "Personal";
    }
}

    
