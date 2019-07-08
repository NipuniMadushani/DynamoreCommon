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
public class TelOperatorDTO extends SuperDTO{
    private int tid;  
    private String telName;
    private String telContract;
    private String telAddress;
    private int topId;
     private int topQty;
    private String topDate;

    public TelOperatorDTO() {
    }

    public TelOperatorDTO(int tid, String telName, String telContract, String telAddress, int topId, int topQty, String topDate) {
        this.tid = tid;
        this.telName = telName;
        this.telContract = telContract;
        this.telAddress = telAddress;
        this.topId = topId;
        this.topQty = topQty;
        this.topDate = topDate;
    }
    public TelOperatorDTO(int tid, String telName, String telContract, String telAddress) {
        this.tid = tid;
        this.telName = telName;
        this.telContract = telContract;
        this.telAddress = telAddress;
    }
    public TelOperatorDTO(int tid,  int topQty, String topDate) {
        this.tid = tid;
        this.topQty = topQty;
        this.topDate = topDate;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTelName() {
        return telName;
    }

    public void setTelName(String telName) {
        this.telName = telName;
    }

    public String getTelContract() {
        return telContract;
    }

    public void setTelContract(String telContract) {
        this.telContract = telContract;
    }

    public String getTelAddress() {
        return telAddress;
    }

    public void setTelAddress(String telAddress) {
        this.telAddress = telAddress;
    }

    public int getTopId() {
        return topId;
    }

    public void setTopId(int topId) {
        this.topId = topId;
    }

    public int getTopQty() {
        return topQty;
    }

    public void setTopQty(int topQty) {
        this.topQty = topQty;
    }

    public String getTopDate() {
        return topDate;
    }

    public void setTopDate(String topDate) {
        this.topDate = topDate;
    }
    
    
}
