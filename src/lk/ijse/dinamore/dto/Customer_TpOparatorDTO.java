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
public class Customer_TpOparatorDTO extends SuperDTO{
    private int cusId;
    private int tid;
    private String dateTime;

    public Customer_TpOparatorDTO() {
    }

    public Customer_TpOparatorDTO(int cusId, int tid, String dateTime) {
        this.cusId = cusId;
        this.tid = tid;
        this.dateTime = dateTime;
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

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    
    
}
