package com.gitdemo.com.jk.service.impl;

import com.gitdemo.com.jk.bean.Table;
import com.gitdemo.com.jk.dao.TableDao;
import com.gitdemo.com.jk.service.TableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: zb
 * @create: 2018-07-03 17:13
 **/
@Service
public class TableServiceImpl implements TableService {

    @Resource private TableDao tableDao;

    @Override
    public List<Table> queryTable() {
        return tableDao.queryTable();
    }
}
