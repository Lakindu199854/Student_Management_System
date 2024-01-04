/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.studentManagement.db;



import com.iCet.studentManagement.db.StudentList.Node;
import com.iCet.studentManagement.model.Student;

import java.awt.Component;
import static java.lang.Double.parseDouble;
import java.util.Arrays;
import static java.util.Collections.list;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class StudentDB {
    StudentList list;
     public StudentDB(){
       list=new StudentList();
    }
     
    public boolean add(Student student){
        Node newNode=new Node(student);
            if(list.first==null){
               list.first=newNode;
               return true;
            }
        Node tempNode=list.first;
        while(tempNode.next!=null){
            tempNode=tempNode.next;
        }
        tempNode.next=newNode;
        return true;
    }   
   
    public Student search(String id){
        
       Node tempNode=list.first;
       while(tempNode!=null){
           if(tempNode.student.getId().equalsIgnoreCase(id)){
               return tempNode.student;
           }
            tempNode=tempNode.next;
        }
       return null;
    }
    
      public Student delete(String id){
       Node tempNode=list.first;
       if(tempNode.student.getId().equalsIgnoreCase(id)){
           if(tempNode.next==null){
               list.first=null;
           }else{
               list.first=list.first.next;
           }
           return null;
       }
       
       
       while(tempNode.next!=null){
           if(tempNode.next.student.getId().equalsIgnoreCase(id)){
              if(tempNode.next.next==null){
                  tempNode.next=null;   
                  return null;
                  
              }else{
                  tempNode.next=tempNode.next.next;
                  return null;
              }
           }
            tempNode=tempNode.next;
        }
       return tempNode.student;
    }
       public boolean update(String id,String name,String prf,String dbms){
       Node tempNode=list.first;
       while(tempNode!=null){
            if(tempNode.next.student.getId().equalsIgnoreCase(id)){
               tempNode.next.student.setName(name);
               tempNode.next.student.setPrf(prf);
               tempNode.next.student.setDbms(dbms);
               return true;
            }
       }
     
       return false;
      }
    
   
  
    
    public void add(int index,Student customer){
      
    }   

    

    public StudentList getStudents() {
      return list;
    }
    
}
       

      

