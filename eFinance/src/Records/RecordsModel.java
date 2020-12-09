/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Records;

import Application.AppModel;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author jimmykane
 */


public class RecordsModel {
    private static Map<String, Application.AppModel> apps = new HashMap<String, Application.AppModel>();
    private static ArrayList<String> loans = new ArrayList<String>();
    private static ArrayList<Records.Loan> loanList = new ArrayList<Records.Loan>();
    static{
        loanList.add(new Records.Loan("L00001", "demo", 50000, 40000, 500, LocalDate.now()));
        loanList.add(new Records.Loan("L00002","demo", 60000, 500, 500, LocalDate.of(2020, 12, 12)));
        loans.add("L00001");
        loans.add("L00001");
    }
    private static Map<String, String> paymentHistory = new HashMap<String, String>();
    
    private static RecordsModel recordsModel = null;//JOE G SINGLETON
    
    private RecordsModel(){}
    
    public static RecordsModel getRecordsModel(){
        if(recordsModel == null){
            recordsModel = new RecordsModel();
        }
        return recordsModel;
    }
    
    
    public RecordsModel(Map<String, Application.AppModel> apps, Map<String, String> paymentHistory){
        this.apps = apps;
        this.paymentHistory = paymentHistory;
    }

    public Map<String, AppModel> getApps() {
        return apps;
    }

    public void setApps(Map<String, AppModel> apps) {
        this.apps = apps;
    }

    public Map<String, String> getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(Map<String, String> paymentHistory) {
        this.paymentHistory = paymentHistory;
    }
    
    public void addApplication(String key, AppModel newApp){
        apps.put(key, newApp);
    }
    
//    public void addLoan(Loan newLoan){
//        loans.add(newLoan);
//    }
    
    public ArrayList<String> getLoans(){
        return loans;
    }
    
    public ArrayList<Records.Loan> getLoanList(){
        return loanList;
    }
    
}
