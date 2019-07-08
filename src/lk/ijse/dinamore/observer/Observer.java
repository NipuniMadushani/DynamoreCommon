/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.observer;

import java.rmi.Remote;
import lk.ijse.dinamore.dto.OrdersDTO;

/**
 *
 * @author acer
 */
public interface Observer extends Remote{
    public default void updateProcess(String oid)throws Exception{}
    public default void updateDelivered(String oid)throws Exception{}
    public default void updateTable(OrdersDTO oid)throws Exception{}
    public default void notifyOther()throws Exception{}
    public default void notifyOrderAdd(String oid)throws Exception{}
}
