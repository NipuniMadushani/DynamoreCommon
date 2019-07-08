/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom;

import java.rmi.RemoteException;
import java.util.ArrayList;
import lk.ijse.dinamore.dto.OrderDetailDTO;
import lk.ijse.dinamore.service.SuperService;

/**
 *
 * @author Kavindu
 */
public interface OrderDetailService extends SuperService {

    public boolean addOrder(OrderDetailDTO orderDetailDTO) throws RemoteException;

    public ArrayList<OrderDetailDTO> searchOrder(String oid) throws Exception;
}
