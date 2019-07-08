/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom;

import java.util.ArrayList;
import lk.ijse.dinamore.dto.ItemDTO;
import lk.ijse.dinamore.service.SuperService;

/**
 *
 * @author Kavindu
 */
public interface ItemService extends SuperService {

    public boolean saveItem(ItemDTO dto) throws Exception;

    public ArrayList<ItemDTO> getAllItem() throws Exception;

    public ItemDTO find(String name) throws Exception;
}
