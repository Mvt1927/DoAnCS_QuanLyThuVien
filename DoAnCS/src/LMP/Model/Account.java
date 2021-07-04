/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMP.Model;

/**
 *
 * @author DELL
 */
public class Account {
    private String UserName, Password;
    public Account(String UserName, String Password){
        this.UserName=UserName;
        this.Password=Password;
    }
    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    //toString method
    @Override
    public String toString() {
        return "Account{" + "Username=" + UserName + ", Password=" + Password + '}';
    }
}
