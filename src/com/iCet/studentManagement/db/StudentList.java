
package com.iCet.studentManagement.db;

import com.iCet.studentManagement.model.Student;

 public class StudentList {
    public Node first;

    
        public static class Node {
        public Node next;
        public Student student;
        
        Node(Student student){
            this.student=student;
        }
         
        public Node (){
             
         }
       }
    }