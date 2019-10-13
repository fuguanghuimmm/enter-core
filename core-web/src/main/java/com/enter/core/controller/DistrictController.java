package com.enter.core.controller;

import com.enter.core.pojo.dto.entity.DistrictDTO;
import com.enter.core.result.ResultBean;
import com.enter.core.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DistrictController
 * @Description TODO
 * @Date 2019/10/11 2:58
 * @Created by 符光辉
 */
@RestController
public class DistrictController {
    @Autowired
    private DistrictService districtService;
    @RequestMapping("/getAllDistricts")
    public ResultBean getAllDistricts() {

        return new ResultBean<>(districtService.selectAll());
    }

    @RequestMapping("/getDistrict")
    public ResultBean getDistrict(DistrictDTO districtDTO) {

        return new ResultBean<>(districtService.selectByPrimary(districtDTO));
    }
    @RequestMapping("/addDistrict")
    public ResultBean addDistrict(DistrictDTO districtDTO) throws Exception {
        districtService.insert(districtDTO);
        return new ResultBean<>();
    }
    @RequestMapping("/updateDistrict")
    public ResultBean updateDistrict(DistrictDTO districtDTO){
        districtService.updateByPrimary(districtDTO);
        return new ResultBean<>();
    }
    @RequestMapping("/deleteDistrict")
    public ResultBean deleteDistrict(DistrictDTO districtDTO){
        districtService.deleteByPrimary(districtDTO);
        return new ResultBean<>();
    }
}
