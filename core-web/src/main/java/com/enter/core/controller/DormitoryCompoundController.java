package com.enter.core.controller;

import com.enter.core.pojo.dto.entity.DormitoryCompoundDTO;
import com.enter.core.result.ResultBean;
import com.enter.core.service.DormitoryCompoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DormitoryCompoundController
 * @Description TODO
 * @Date 2019/10/11 2:59
 * @Created by 符光辉
 */
@RestController
public class DormitoryCompoundController {
    @Autowired
    private DormitoryCompoundService dormitoryCompoundService;
    @RequestMapping("/getAllDormitoryCompounds")
    public ResultBean getAllDormitoryCompounds() {
        return new ResultBean<>(dormitoryCompoundService.selectAll());
    }
    @RequestMapping("/getDormitoryCompound")
    public ResultBean getDormitoryCompound(DormitoryCompoundDTO dormitoryCompoundDTO) {
        return new ResultBean<>(dormitoryCompoundService.selectByPrimary(dormitoryCompoundDTO));
    }
    @RequestMapping("/addDormitoryCompound")
    public ResultBean addDormitoryCompound(DormitoryCompoundDTO dormitoryCompoundDTO) throws Exception {
        dormitoryCompoundService.insert(dormitoryCompoundDTO);
        return new ResultBean<>();
    }
    @RequestMapping("/updateDormitoryCompound")
    public ResultBean updateDormitoryCompound(DormitoryCompoundDTO dormitoryCompoundDTO){
        dormitoryCompoundService.updateByPrimary(dormitoryCompoundDTO);
        return new ResultBean<>();
    }
    @RequestMapping("/deleteDormitoryCompound")
    public ResultBean deleteDormitoryCompound(DormitoryCompoundDTO dormitoryCompoundDTO){
        dormitoryCompoundService.deleteByPrimary(dormitoryCompoundDTO);
        return new ResultBean<>();
    }
}
