/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom;

import java.util.ArrayList;
import lk.ijse.dinamore.dto.ChefDTO;
import lk.ijse.dinamore.dto.ChefLoginDTO;
import lk.ijse.dinamore.service.SuperService;

/**
 *
 * @author Kavindu
 */
public interface ChefService extends SuperService {

    public boolean saveChef(ChefDTO chefDTO) throws Exception;

    public int lastId() throws Exception;

    public boolean addChef(ChefDTO dto, ChefLoginDTO log) throws Exception;

    public ChefLoginDTO findLogin(String name) throws Exception;

    public ArrayList<ChefDTO> view() throws Exception;

    public ArrayList<ChefDTO> chefReport(String name) throws Exception;
}
