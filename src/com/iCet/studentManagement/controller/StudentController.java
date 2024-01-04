/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.studentManagement.controller;

import com.iCet.studentManagement.db.StudentDB;
import com.iCet.studentManagement.db.DBConnection;
import com.iCet.studentManagement.db.StudentList;
import com.iCet.studentManagement.model.Student;

/**
 Student Controller is the one which can provide us with a StudentDB reference
 */

public class StudentController { 
    //Adding to the database
    public static boolean addStudent(Student student){
        StudentDB studentDB=DBConnection.getInstance().getStudentDB();
        return studentDB.add(student);
       
    }

    public static Student searchStudent(String id) {
       StudentDB studentDB=DBConnection.getInstance().getStudentDB();
       return studentDB.search(id);
    }
    
    public static Student deleteCustomer(String id) {
       StudentDB studentDB=DBConnection.getInstance().getStudentDB();
       return studentDB.delete(id);
    }

    public static boolean updateStudent(String id, String name, String prf, String dbms) {
       StudentDB studentDB=DBConnection.getInstance().getStudentDB();
       return studentDB.update(id,name,prf,dbms);
    }

    public static StudentList getAllStudents() {
       StudentDB studentDB=DBConnection.getInstance().getStudentDB();
        return studentDB.getStudents();
    }

 
    
    
}
