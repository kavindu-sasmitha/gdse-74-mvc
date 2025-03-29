/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.demo.dto;

/**
 *
 * @author kavindu-sasmitha
 */
public class CustomerDto {
    private String custId;
    private String custTitle ;
    private String custName ;
    private String dob ;
    private double salary ;
    private String custAddress;
    private String city   ;
    private String  province;
    private int postalCode ;
    
    public CustomerDto(){
        
    }
    public CustomerDto(String custId,String custTitle,String custName,String dob,double salary,String custAddress,String city,String province,int postalCode){
  this.custId=custId;
  this.custTitle=custTitle;
  this.custName=custName;
  this.dob=dob;
  this.salary=salary;
  this.custAddress=custAddress;
  this.province=province;
  this.postalCode=postalCode;
  
    }
    public void setCustId(String custId){
        this.custId=custId;
        
    }
    public String getCustId(){
        return this.custId;
    }
    public void setCustTitle(String custTitle){
        this.custTitle=custTitle;
    }
    public String getCustTitle(){
        return this.custTitle;
    }

    public String getCustName() {
        return custName;
    }

    public String getDob() {
        return dob;
    }

    public double getSalary() {
        return salary;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custId=" + custId + ", custTitle=" + custTitle + ", custName=" + custName + ", dob=" + dob + ", salary=" + salary + ", custAddress=" + custAddress + ", city=" + city + ", province=" + province + ", postalCode=" + postalCode + '}';
    }
    
    
    
}
