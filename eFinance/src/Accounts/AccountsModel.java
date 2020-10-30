/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alex Clapper
 */

public abstract class AccountsModel {
     protected String id;
     protected String name;
     protected String email = "No email on File";
    //Put this in the Customer Class.....
    //private String franchiseLocation = "State College";
    
    //private static final Map<String, AccountsModel> USERS = new HashMap<String, AccountsModel>();

//    public static AccountsModel of(String id) {
//        AccountsModel user = USERS.get(id);
//        if (user == null) {
//            user = new AccountsModel(id);
//            USERS.put(id, user);
//        }
//        return user;
//    }
    
    public String getId() {
        return id;
    }
    
    
//    public static Map<String, AccountsModel> getUsers(){
//        return USERS;
//    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
 
    public abstract String toString();
}
