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
public class TelOperatorReportDTO {
    private int tid;
    private String custName;
    private String contact;
    private int orders;

    public TelOperatorReportDTO() {
    }

    public TelOperatorReportDTO(int tid, String custName, String contact, int orders) {
        this.tid = tid;
        this.custName = custName;
        this.contact = contact;
        this.orders = orders;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }
    
    
}
