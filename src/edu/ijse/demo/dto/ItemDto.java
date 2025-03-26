/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.demo.dto;

/**
 *
 * @author kavindu-sasmitha
 */
public class ItemDto {
    private String itemCode;
    private String description;
    private String packSize;
    private int qoh;
    private double unitPrice;

    public ItemDto() {
    }

    public ItemDto(String itemCode, String description, String packSize, int qoh, double unitPrice) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.qoh = qoh;
        this.unitPrice = unitPrice;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    public int getQoh() {
        return qoh;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "itemCode=" + itemCode + ", description=" + description + ", packSize=" + packSize + ", qoh=" + qoh + ", unitPrice=" + unitPrice + '}';
    }
    
    
     
    
    
}
