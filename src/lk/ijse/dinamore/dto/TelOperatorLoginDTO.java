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
public class TelOperatorLoginDTO extends SuperDTO{
    private int tid;
    private String userName;
    private String password;

    public TelOperatorLoginDTO() {
    }

    public TelOperatorLoginDTO(int tid, String userName, String password) {
        this.tid = tid;
        this.userName = userName;
        this.password = password;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
