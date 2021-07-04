/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMP.Control;
import LMP.Model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
/**
 *
 * @author DELL
 */
public class AccountAccess {
    Connection conn;
    ResultSet rs;
    Statement stmt;
    String sql;
    PreparedStatement pstmt;
    int rc;
    public Account getAccount(String aUsename) {
        Account a = null;
        try {
            conn = ConnectData.getConnection();
            sql = "Select * from account where UserName='" + aUsename + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String UserName = rs.getString(1);
                String Password = rs.getString(2);
                a = new Account(UserName, Password);
            }
            conn.close();
            System.out.println("Get Account successfully!");
        } catch (Exception ex) {
            System.out.println("Get Account failure!");
            System.out.println(stmt);
        }
        return a;
    }
    public Vector<Account> getAllAccount(){
        Vector allAccount=new Vector();
        try {
            conn = ConnectData.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("Select * from account");
            while (rs.next()) {
                Vector<String> v = new Vector<>();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                allAccount.add(v);
            }
            conn.close();
            System.out.println("Get all of Account successfully!");
        } catch (Exception ex) {
            System.out.println("Get all of Account failure!");
            System.out.println(stmt);
        }
        return allAccount;
    }
    public int addNewAccount(String aUserName, String aPassword) {
        rc = 0;
        try {
            conn = ConnectData.getConnection();
            sql = "INSERT INTO account(USername, Password) VALUES(?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, aUserName);
            pstmt.setString(2, aPassword);
            rc = pstmt.executeUpdate();
            conn.close();
            System.out.println("Add Account successfully!");
        } catch (Exception ex) {
            System.out.println("Add Account failure!");
            System.out.println(pstmt);
        }
        return rc;
    }
    public int updateAccount(String aUserName, String aPassword) {
        rc = 0;
        try {
            conn = ConnectData.getConnection();
            sql = "Update books set Password=? where Username=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, aPassword);
            pstmt.setString(2, aUserName);
            rc = pstmt.executeUpdate();
            conn.close();
            System.out.println("Update Account successfully!");
        } catch (Exception ex) {
            System.out.println("Update Account failure!");
            System.out.println(pstmt);
        }
        return rc;
    }
    public int deleteAccount(String aUsername) {
        rc = 0;
        try {
            conn = ConnectData.getConnection();
            sql = "Delete from account where Username='" + aUsername + "'";
            stmt = conn.createStatement();
            rc = stmt.executeUpdate(sql);
            conn.close();
            System.out.println("Delete account successfully!");
        } catch (Exception ex) {
            System.out.println("Delete account failure!");
            System.out.println(stmt);
        }
        return rc;
    }
    public int checkAccount(String aUsername, String aPassword) throws SQLException{
        rc = 0;
        if ("admin".equals(aUsername)&&"admin".equals(aPassword)) {
            return 3;
        } else {
            sql="select * from account where Username=? and Password=?";
                try {
                    conn = ConnectData.getConnection();
                    pstmt=conn.prepareStatement(sql);
                    pstmt.setString(1,aUsername);
                    pstmt.setString(2,aPassword);
                    rs=pstmt.executeQuery();
                    if (rs.next()) {
                    rs.close();
                    rc=1;
                    System.out.println("Login account successfully!");
                    }else
                        rc=0;
                    conn.close();
                }
                catch(SQLException e)
                {
                    System.out.println("Login account failure!");
                    System.out.println(pstmt);
                }
        }
        return rc;
    }
}
