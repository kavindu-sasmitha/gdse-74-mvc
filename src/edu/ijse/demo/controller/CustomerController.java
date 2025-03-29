package edu.ijse.demo.controller;

import edu.ijse.demo.dto.CustomerDto;
import edu.ijse.demo.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Handles the business logic for Customer operations.
 */
public class CustomerController {

    private final CustomerModel customerModel;

    // Constructor to initialize the CustomerModel
    public CustomerController() {
        customerModel = new CustomerModel();
    }

    // Method to save a Customer
    public String saveCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException {
        return customerModel.savedCustomer(dto);
    }

    // Method to update a Customer
    public String updateCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException {
        return customerModel.updateCustomer(dto);
    }

    // Method to delete a Customer
    public String deleteCustomer(String custId) throws SQLException, ClassNotFoundException {
        return customerModel.deleteCustomer(custId);
    }

    // Method to search for a Customer
    public CustomerDto searchCustomer(String custId) throws SQLException, ClassNotFoundException {
        return customerModel.searchCustomer(custId);
    }

    // Method to get all Customers
    public ArrayList<CustomerDto> getAllCustomers() throws SQLException, ClassNotFoundException {
        return customerModel.getAll();
    }
}
