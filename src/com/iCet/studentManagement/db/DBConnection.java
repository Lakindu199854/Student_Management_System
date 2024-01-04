/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.studentManagement.db;

/**
 *
 * @author ASUS
 */

public class DBConnection {
    private StudentDB studentDB;
    private static DBConnection dBConnection;
    private DBConnection(){
        studentDB=new StudentDB();
    }
    public StudentDB getStudentDB(){
        return studentDB;
    }
    public static DBConnection getInstance(){
        if(dBConnection==null){
            dBConnection=new DBConnection();
        }
        return dBConnection;
    }
}
