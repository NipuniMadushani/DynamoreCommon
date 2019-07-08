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
public class ChefLoginDTO extends SuperDTO{
    private int cid;
    private String userName;
    private String Password;

    public ChefLoginDTO() {
    }

    public ChefLoginDTO(int cid, String userName, String Password) {
        this.cid = cid;
        this.userName = userName;
        this.Password = Password;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
