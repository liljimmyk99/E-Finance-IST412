/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Records;

<<<<<<< HEAD
import Application.AppModel;
import java.util.HashMap;
=======
>>>>>>> facf91e9d03bcc3254acb4bf5a7f688b8cba5a8c
import java.util.Map;

/**
 *
 * @author jimmykane
 */


public class RecordsModel {
    private Map<String, Application.AppModel> apps = new HashMap<String, Application.AppModel>();
    private Map<String, String> paymentHistory = new HashMap<String, String>();
    
    public RecordsModel(){
        
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
    
}
