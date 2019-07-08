/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.dto;

/**
 *
 * @author acer
 */
public class ItemDTO extends SuperDTO{
    private int iid;
    private String itemName;
    private double itemPrice;
    private int qty;

    public ItemDTO() {
    }

    public ItemDTO(int iid, String itemName, double itemPrice, int qty) {
        this.iid = iid;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.qty = qty;
    }
     public ItemDTO(int itemId, String itemName, double itemPrice) {
        this.iid = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
     public ItemDTO(String name, double price) {

        this.itemName = name;
        this.itemPrice = price;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
}
