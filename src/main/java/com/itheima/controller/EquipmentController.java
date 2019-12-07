package com.itheima.controller;

import com.itheima.domain.Equipment;
import com.itheima.domain.User;
import com.itheima.mapper.EquipmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EquipmentController {

    @Autowired
    private EquipmentMapper equipmentMapper;

    @RequestMapping("/queryEquipmentList")
    @ResponseBody
    public List<Equipment> queryEquipmentList(){
        List<Equipment> equipments = equipmentMapper.queryEquipmentList();
        return equipments;
    }

}
