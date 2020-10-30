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

   /*
    *
    * User Attributes
    *
    */
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
    
    //Map of Available Users
    private static final Map<String, CustomerModel> USERS = new HashMap<String, CustomerModel>();
    
    //Gets & creates Specific User Element
    public static CustomerModel of(String id) {
        CustomerModel user = USERS.get(id);
        if (user == null) {
            user = new CustomerModel(id);
            USERS.put(id, user);
        }
        return user;
    }
    
    /*
    *
    * To String
    *
    */
    @Override
    public String toString() {
        return "Name: " + super.name + "ID: " + super.id; //To change body of generated methods, choose Tools | Templates.
    }
    
    /*
    *
    * Constructors
    *
    */
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
    
    /*
    *
    * Getters and Setter for Attributes
    *
    */

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getNickNames() {
        return NickNames;
    }

    public void setNickNames(ArrayList<String> NickNames) {
        this.NickNames = NickNames;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getUSCitizen() {
        return USCitizen;
    }

    public void setUSCitizen(Boolean USCitizen) {
        this.USCitizen = USCitizen;
    }

    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    public Double getAverageYearlyIncome() {
        return averageYearlyIncome;
    }

    public void setAverageYearlyIncome(Double averageYearlyIncome) {
        this.averageYearlyIncome = averageYearlyIncome;
    }

    public Double getTotalAssetsValue() {
        return totalAssetsValue;
    }

    public void setTotalAssetsValue(Double totalAssetsValue) {
        this.totalAssetsValue = totalAssetsValue;
    }

    public String getFranchiseLocation() {
        return franchiseLocation;
    }

    public void setFranchiseLocation(String franchiseLocation) {
        this.franchiseLocation = franchiseLocation;
    }
    
    
    
    
    
    
}
