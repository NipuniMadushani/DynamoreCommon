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
public interface Subject extends Remote{
    public void registerObserver(Observer observer) throws Exception;

    public void unregisterObserver(Observer observer) throws Exception;

    public void notifyAllObserversProcess(String oid) throws Exception;

    public void notifyAllObserverDeliver(String oid) throws Exception;

    public void notifyAllRefreshTable(OrdersDTO oid) throws Exception;

    public void notifyAllChefs(String oid) throws Exception;

    public void registerObserverQueue(Observer aThis)throws Exception;
    
    public void unRegisterObserverQueue()throws Exception;
}
