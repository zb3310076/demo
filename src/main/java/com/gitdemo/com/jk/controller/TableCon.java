package com.gitdemo.com.jk.controller;

import com.gitdemo.com.jk.bean.Table;
import com.gitdemo.com.jk.service.TableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: zb
 * @create: 2018-07-03 17:10
 **/

@Controller
@RequestMapping("tableCon")
public class TableCon {

    @Autowired private TableService tableService;

    @RequestMapping("queryTable")
    public String queryTable(Model model){

        List<Table> list= tableService.queryTable();
        model.addAttribute("aa",list);
         return "/index.html";
    }

}
