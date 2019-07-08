/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom;

import java.util.ArrayList;
import lk.ijse.dinamore.dto.ItemDTO;
import lk.ijse.dinamore.dto.OrdersDTO;
import lk.ijse.dinamore.dto.ReportDTO;
import lk.ijse.dinamore.service.SuperService;

/**
 *
 * @author Kavindu
 */
public interface OrdersService extends SuperService{
    public boolean saveOrder(OrdersDTO orderDTO,ArrayList<ItemDTO> itemList)throws Exception;

    public int lastId()throws Exception;

    public ArrayList<OrdersDTO> searchThisOrder(String id)throws Exception;
    
    public ArrayList<OrdersDTO> view()throws Exception;

    public OrdersDTO takeOrder()throws Exception;

    public boolean addOrder(OrdersDTO orderDto)throws Exception;

    public boolean update(OrdersDTO dto)throws Exception;

    public OrdersDTO find(String i)throws Exception;

    public OrdersDTO checkPendingOrder(String id)throws Exception;

    public boolean saveReport(ReportDTO dto)throws Exception;

    public OrdersDTO todayReport(String a, String text)throws Exception;
    
    public OrdersDTO OrderReport(String date,String id,String i)throws Exception;

     public ArrayList<OrdersDTO> getQueueData()throws Exception;
    
    public ArrayList<OrdersDTO> getProcessData()throws Exception;
    
}
