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
public class ChefDTO extends SuperDTO{
    private int cid;
    private String chefName;
    private String chefContact;
    private String chefAddress;
    private int topCId;
    private String topTime;
    private int topQty;
    private String topDate;

    public ChefDTO() {
    }

    public ChefDTO(int cid, String chefName, String chefContact, String chefAddress, int topCId, String topTime, int topQty, String topDate) {
        this.cid = cid;
        this.chefName = chefName;
        this.chefContact = chefContact;
        this.chefAddress = chefAddress;
        this.topCId = topCId;
        this.topTime = topTime;
        this.topQty = topQty;
        this.topDate = topDate;
    }
    public ChefDTO(int cid, String chefName, int chefContract, String chefAddress) {
        this.topCId = cid;
        this.topTime = chefName;
        this.topQty = chefContract;
        this.topDate = chefAddress;
    }
    public ChefDTO(int cid, String chefName, String chefContact, String chefAddress) {
        this.cid = cid;
        this.chefName = chefName;
        this.chefContact = chefContact;
        this.chefAddress = chefAddress;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public String getChefContact() {
        return chefContact;
    }

    public void setChefContact(String chefContact) {
        this.chefContact = chefContact;
    }

    public String getChefAddress() {
        return chefAddress;
    }

    public void setChefAddress(String chefAddress) {
        this.chefAddress = chefAddress;
    }

    public int getTopCId() {
        return topCId;
    }

    public void setTopCId(int topCId) {
        this.topCId = topCId;
    }

    public String getTopTime() {
        return topTime;
    }

    public void setTopTime(String topTime) {
        this.topTime = topTime;
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
