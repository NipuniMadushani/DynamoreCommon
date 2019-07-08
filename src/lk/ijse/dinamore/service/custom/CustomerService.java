/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom;

import lk.ijse.dinamore.dto.CustomerDTO;
import lk.ijse.dinamore.service.SuperService;

/**
 *
 * @author Kavindu
 */
public interface CustomerService extends SuperService{
    public boolean saveCustomer(CustomerDTO customerDTO)throws Exception;
    
    public CustomerDTO searchCustomer(String id)throws Exception;
}
