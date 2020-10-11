/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decision;

import java.util.HashMap;

/**
 *
 * @author jimmykane
 */
public class DecisionModel {
    
    //Joe made these------
    private Integer creditScore;
    private boolean debtAproval;//If true, debt level has been approved and the application can be approved.
    private String name;
    
    HashMap<String, String> questionsAndAnswers = new HashMap<String, String>();
    
    public DecisionModel(){
        DecisionModel decisionModel = new DecisionModel();
    }
    
       //Get application?????-----------------**********

    /**
     * @return the creditScore
     */
    public Integer getCreditScore() {
        return creditScore;
    }

    /**
     * @param creditScore the creditScore to set
     */
    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    /**
     * @return the debtAproval
     */
    public boolean isDebtAproval() {
        return debtAproval;
    }

    /**
     * @param debtAproval the debtAproval to set
     */
    public void setDebtAproval(boolean debtAproval) {
        this.debtAproval = debtAproval;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
