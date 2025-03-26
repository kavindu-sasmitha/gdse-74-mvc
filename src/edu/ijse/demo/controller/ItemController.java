/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.demo.controller;
import edu.ijse.demo.model.ItemModel;
import edu.ijse.demo.dto.ItemDto;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author kavindu-sasmitha
 */
public class ItemController {
    private ItemModel itemModel;
    
    public ItemController(){
        itemModel=new ItemModel();
    
    
    }
    public String saveItem(ItemDto dto)throws SQLException,ClassNotFoundException{
        String resp=itemModel.savedItem(dto);
        return resp;
    
    }
     public String updateItem(ItemDto dto)throws SQLException,ClassNotFoundException{
        String resp=itemModel.updateItem(dto);
        return resp;
    
    }
      public String deletItem(String itemCode)throws SQLException,ClassNotFoundException{
        String resp=itemModel.deleteItem(itemCode);
        return resp;
    
    }
       public String searchItem(String itemCode)throws SQLException,ClassNotFoundException{
        String resp=itemModel.savedItem(itemCode);
        return resp;
    
    }
         public ArrayList<ItemDto> getAllItem() throws  SQLException, ClassNotFoundException{
        ArrayList<ItemDto> resp = itemModel.getAll();
        return resp;
    }
       
        
        
        
        
        
    
    
    
}
