package com.upgrad.Grofers.service.business;


import com.upgrad.Grofers.service.dao.ItemDao;
import com.upgrad.Grofers.service.entity.ItemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;


    @Override
    public List<ItemEntity> getItemsByCategoryAndStore(String storeId, String categoryId) {
        return itemDao.getItemsByCategoryAndStore(storeId, categoryId);
    }

}
