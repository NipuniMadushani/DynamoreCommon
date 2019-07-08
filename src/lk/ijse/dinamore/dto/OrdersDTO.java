/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.dto;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class OrdersDTO extends SuperDTO implements Comparable<OrdersDTO>{
    private int oid;
    private double price;
    private int cusId;
    private int tid;
    private String status;
    private String dateTime;
    private int qty;
    private ArrayList<ItemDTO> list;

    public OrdersDTO() {
    }

    public OrdersDTO(int oid, double price, int cusId, int tid, String status, String dateTime, int qty, ArrayList<ItemDTO> list) {
        this.oid = oid;
        this.price = price;
        this.cusId = cusId;
        this.tid = tid;
        this.status = status;
        this.dateTime = dateTime;
        this.qty = qty;
        this.list = list;
    }
    public OrdersDTO(int oid, double price, int cusId, int tid, String status, String dateTime) {
        this.oid = oid;
        this.price = price;
        this.cusId = cusId;
        this.tid = tid;
        this.status = status;
        this.dateTime = dateTime;

    }

    public OrdersDTO(int oid, double price, int cusId, int tid, String status, String dateTime, int qty) {
        this.oid = oid;
        this.price = price;
        this.cusId = cusId;
        this.tid = tid;
        this.status = status;
        this.dateTime = dateTime;
        this.qty = qty;
    }

    public OrdersDTO(int oid, int tid, double price, String dateTime) {
        this.oid = oid;
        this.tid = tid;
        this.price = price;
        this.dateTime = dateTime;
    }

    public OrdersDTO(int oid, int tid, double price, int cusId, String dateTime) {
        this.oid = oid;
        this.tid = tid;
        this.price = price;
        this.cusId = cusId;
        this.dateTime = dateTime;
    }

    public OrdersDTO(int oid, int tid, double price) {
        this.price = price;
        this.oid = oid;
        this.tid = tid;
        this.price = price;

    }
    

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public ArrayList<ItemDTO> getList() {
        return list;
    }

    public void setList(ArrayList<ItemDTO> list) {
        this.list = list;
    }
    
    

    @Override
    public int compareTo(OrdersDTO o) {
        return o.getOid()==this.oid ? 0 : 1;
    }
    
}
