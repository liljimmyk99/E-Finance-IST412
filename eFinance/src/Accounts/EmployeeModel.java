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
 * @author jimmykane
 */
public class EmployeeModel extends AccountsModel {
    
    
    
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
    
    public EmployeeModel(String id){
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Name: " + super.name + "ID: " + super.id; 
    }
    
}
