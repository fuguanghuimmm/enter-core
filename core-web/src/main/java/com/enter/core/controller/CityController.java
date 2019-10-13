package com.enter.core.controller;

import com.enter.core.pojo.dto.entity.CityDTO;
import com.enter.core.result.ResultBean;
import com.enter.core.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname CityController
 * @Description TODO
 * @Date 2019/10/11 2:57
 * @Created by 符光辉
 */
@RestController
public class CityController {
    @Autowired
    private CityService cityService;
    @RequestMapping("/getAllCitys")
    public ResultBean getAllCitys() {
        return new ResultBean<>(cityService.selectAll());
    }
    @RequestMapping("/getCity")
    public ResultBean getCity(CityDTO cityDTO) {
        return new ResultBean<>(cityService.selectByPrimary(cityDTO));
    }
    @RequestMapping("/addCity")
    public ResultBean addCity(CityDTO cityDTO) throws Exception {
        cityService.insert(cityDTO);
        return new ResultBean<>();
    }
    @RequestMapping("/updateCity")
    public ResultBean updateCity(CityDTO cityDTO){
        cityService.updateByPrimary(cityDTO);
        return new ResultBean<>();
    }
    @RequestMapping("/deleteCity")
    public ResultBean deleteCity(CityDTO cityDTO){
       cityService.deleteByPrimary(cityDTO);
        return  new ResultBean<>();
    }
}
