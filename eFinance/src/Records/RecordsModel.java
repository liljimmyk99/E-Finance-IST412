/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Records;

import Application.AppModel;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jimmykane
 */


public class RecordsModel {
    private static Map<String, Application.AppModel> apps = new HashMap<String, Application.AppModel>();
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
    
}
