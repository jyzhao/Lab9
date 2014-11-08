/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author zhaojiyuan
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();
        
        //create a network
        //create an enterprise
        //initialize some org
        //have some emplyees
        //create useraccount role
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Yash");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
}
