package com.gitdemo.com.jk.dao;

import com.gitdemo.com.jk.bean.Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: zb
 * @create: 2018-07-03 17:14
 **/
@Repository
@Mapper
public interface TableDao {

     @Select("SELECT * FROM T_TABLE")
     List<Table> queryTable();
}
