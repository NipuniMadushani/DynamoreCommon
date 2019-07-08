/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom;

import java.util.ArrayList;
import lk.ijse.dinamore.dto.TelOperatorDTO;
import lk.ijse.dinamore.dto.TelOperatorLoginDTO;
import lk.ijse.dinamore.service.SuperService;

/**
 *
 * @author Kavindu
 */
public interface TpOparatorService extends SuperService{
    public boolean saveOperator(TelOperatorDTO tPOperatorDTO,TelOperatorLoginDTO tpDto)throws Exception;
    
    public boolean searchLogin(String userName, String password) throws Exception;
    
    public int lastId() throws Exception;
    
    public TelOperatorLoginDTO findLogin(String name) throws Exception ;
    
     public ArrayList<TelOperatorDTO> telReport(String name)throws Exception;

    public ArrayList<TelOperatorDTO> view()throws Exception;
}
