/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jimmykane
 */
public class EmployeeModel extends AccountsModel {
    /*
    *
    * User Attributes
    *
    */
    private Date dateOfEmployment;
    private String address;
    private String jobTitle;
    private double salery;
    private Date dateOfBirth;
    private String ssn;
    private EmployeeModel manager;
    private String collegeDegree;
    
    private static final Map<String, EmployeeModel> USERS = new HashMap<String, EmployeeModel>();
    
    public static Map<String, EmployeeModel> getUsers(){
        return USERS;
    }
    
    
    public static EmployeeModel of(String id) {
        EmployeeModel user = USERS.get(id);
        if (user == null) {
            user = new EmployeeModel(id);
            USERS.put(id, user);
        }
        return user;
    }
    
    /*
    *
    * Constructors
    *
    */
    
    public EmployeeModel(String id){
        this.id = id;
    }
    
    /*
    *
    * To String
    *
    */
    
    @Override
    public String toString() {
        return "Name: " + super.name + "ID: " + super.id; 
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public EmployeeModel getManager() {
        return manager;
    }

    public void setManager(EmployeeModel manager) {
        this.manager = manager;
    }

    public String getCollegeDegree() {
        return collegeDegree;
    }

    public void setCollegeDegree(String collegeDegree) {
        this.collegeDegree = collegeDegree;
    }
    
    
    
}
