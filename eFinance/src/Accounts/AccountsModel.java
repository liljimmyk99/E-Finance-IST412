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

public class AccountsModel {

    private static final Map<String, AccountsModel> USERS = new HashMap<String, AccountsModel>();

    public static AccountsModel of(String id) {
        AccountsModel user = USERS.get(id);
        if (user == null) {//
            user = new AccountsModel(id);
            USERS.put(id, user);
        }
        return user;
    }

    private AccountsModel(String id) {
        this.id = id;
    }
    
    private String id;

    public String getId() {
        return id;
    }
    
    public static Map<String, AccountsModel> getUsers(){
        return USERS;
    }
    
    private String email = "No email on File";
    private String status = "Status not assigned";
    
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
    
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return "[" + id + ", " + email + ", " + status + "]";
    }





}
