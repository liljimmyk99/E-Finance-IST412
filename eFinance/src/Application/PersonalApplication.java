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
public class PersonalApplication {
    private String name;
    private String address;
    private String phoneNumber;
    private String SSN;
    private double yearlyIncome;
    private Integer creditScore;
    private String underGradDegree;
    private boolean currentlyEmployed;
    private boolean married;
    private boolean applicationInProgress;
    private boolean approvedApplication;
    
    public PersonalApplication(String name, String address, String phoneNumber, String ssn, double yearlyIncome, Integer creditScore, String underGradDegree, boolean currentlyEmployed, boolean married){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.SSN = ssn;
        this.yearlyIncome = yearlyIncome;
        this.creditScore = creditScore;
        this.underGradDegree = underGradDegree;
        this.currentlyEmployed = currentlyEmployed;
        this.married = married;
        this.applicationInProgress = true;
    }
    
    public PersonalApplication(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getUnderGradDegree() {
        return underGradDegree;
    }

    public void setUnderGradDegree(String underGradDegree) {
        this.underGradDegree = underGradDegree;
    }

    public boolean isCurrentlyEmployed() {
        return currentlyEmployed;
    }

    public void setCurrentlyEmployed(boolean currentlyEmployed) {
        this.currentlyEmployed = currentlyEmployed;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean isApplicationInProgress() {
        return applicationInProgress;
    }

    public void setApplicationInProgress(boolean applicationInProgress) {
        this.applicationInProgress = applicationInProgress;
    }

    public boolean isApprovedApplication() {
        return approvedApplication;
    }

    public void setApprovedApplication(boolean approvedApplication) {
        this.approvedApplication = approvedApplication;
    }
}

    
