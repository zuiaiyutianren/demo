package com.itheima.service.impl;

import com.itheima.dao.Dao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private Dao dao;

    public Items findById(Integer id) {

        return dao.findById(id);
    }
}
