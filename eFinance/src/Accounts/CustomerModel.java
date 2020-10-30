/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jimmykane
 */
public class CustomerModel extends AccountsModel {

    //User Attributes
    private int creditScore;
    private Date dateOfBirth;
    private int SSN;
    private String address;
    private ArrayList<String> NickNames;
    private String race;
    private String gender;
    private Boolean USCitizen;
    private String relationshipStatus;
    private Double averageYearlyIncome;
    private Double totalAssetsValue;
    private String franchiseLocation;
    
    private static final Map<String, CustomerModel> USERS = new HashMap<String, CustomerModel>();
    
    public static CustomerModel of(String id) {
        CustomerModel user = USERS.get(id);
        if (user == null) {
            user = new CustomerModel(id);
            USERS.put(id, user);
        }
        return user;
    }
    public CustomerModel(String id){
        this.id = id;
    }
    public CustomerModel(String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public static Map<String, CustomerModel> getUsers(){
        return USERS;
    }
    
    
    @Override
    public String toString() {
        return "Name: " + super.name + "ID: " + super.id; //To change body of generated methods, choose Tools | Templates.
    }
    
}
