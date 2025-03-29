/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.demo.model;
import java.sql.PreparedStatement;
import java.sql.Connection;


import edu.ijse.demo.db.DBConnection;
import edu.ijse.demo.dto.CustomerDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author kavindu-sasmitha
 */
public class CustomerModel {
 public String savedCustomer(CustomerDto customer) throws SQLException,ClassNotFoundException{
     Connection connection=DBConnection.getInstance().getConnection();
     String sql="INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)";
     PreparedStatement statement=connection.prepareStatement(sql);
     statement.setString(1, customer.getCustId());
            statement.setString(2, customer.getCustTitle());
            statement.setString(3, customer.getCustName());
            statement.setString(4, customer.getDob());
            statement.setDouble(5, customer.getSalary());
            statement.setString(6, customer.getCustAddress());
            statement.setString(7, customer.getCity());
            statement.setString(8, customer.getProvince());
            statement.setInt(9, customer.getPostalCode());
     
     
     return statement.executeUpdate()>0 ? "Succesfully saved Customer":"Saved Faild";
     
 }
 public String updateCustomer(CustomerDto customer)throws SQLException,ClassNotFoundException{
    
     Connection connection=DBConnection.getInstance().getConnection();
     String sql="UPDATE Customer SET CustTitle=?,CustName =?,DOB =?, salary =?, CustAddress=?, City  =?,Province=?, PostalCode=? WHERE CustID=?";
     PreparedStatement statement=connection.prepareStatement(sql);
      statement.setString(1, customer.getCustTitle());
       statement.setString(2, customer.getCustName());
            statement.setString(3, customer.getDob());
            statement.setDouble(4, customer.getSalary());
            statement.setString(5, customer.getCustAddress());
            statement.setString(6, customer.getCity());
            statement.setString(7, customer.getProvince());
            statement.setInt(8, customer.getPostalCode());
            statement.setString(9, customer.getCustId());
      return statement.executeUpdate()>0 ? "Succesfully Update Customer":"Update Faild";
    
 }  
 public String deleteCustomer(String custId) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Customer WHERE CustID=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1,custId);
        
        return statement.executeUpdate() > 0 ? "Successfully Deleted" : "Fail";
    }
 public ArrayList<CustomerDto> getAll() throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet rst = statement.executeQuery();
        ArrayList<CustomerDto> CustomrtDto = new ArrayList<>();
        
        while (rst.next()) {            
            
           CustomerDto dto;
            dto = new CustomerDto(rst.getString("CustID"),(rst.getString("CustTitle")),(rst.getString("CustName")),
                    (rst.getString("DOB")),(rst.getDouble("Salary")),(rst.getString("City")),(rst.getString("CustAddress")),
                    (rst.getString("Province")),(rst.getInt("PostalCode")));
            CustomrtDto.add(dto);
        }
        
        
        return CustomrtDto;
    }

    public CustomerDto searchCustomer(String custId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<CustomerDto> getAllCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    

}
    
