
package com.iCet.studentManagement.model;

public class Student {
    private String id;
    private String name;
    private String prf;
    private String dbms; 

    Student(){
        
    }

    public Student(String id, String name, String prf, String dbms) {
        this.id = id;
        this.name = name;
        this.prf = prf;
        this.dbms = dbms;
    }

   
    public boolean equals(Object obj){
        Student c1=(Student)obj;
        return this.id.equalsIgnoreCase(c1.id);
    }
    
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getPrf() {
        return prf;
    }

    /**
     * @param address the address to set
     */
    public void setPrf(String address) {
        this.prf = address;
    }

    /**
     * @return the salary
     */
    public String getDbms() {
        return dbms;
    }

    /**
     * @param salary the salary to set
     */
    public void setDbms(String dbms) {
        this.dbms = dbms;
    }

}
 