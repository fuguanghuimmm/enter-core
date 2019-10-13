package com.enter.core.impl;

import com.enter.core.database.mysql.mybatis.CityMapper;
import com.enter.core.pojo.dto.entity.CityDTO;
import com.enter.core.pojo.entity.City;
import com.enter.core.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname CityServiceImpl
 * @Description TODO
 * @Date 2019/10/11 2:21
 * @Created by 符光辉
 */
@Service("cityService")
public class CityServiceImpl implements CityService{
    @Autowired
    private CityMapper cityMapper;
    @Override
    public void insert(CityDTO cityDTO) throws Exception {
        City city = cityDTO.convertToDo();
        city.setAllTime();
        cityMapper.insertSelective(city);
    }

    @Override
    public List<CityDTO> selectAll() {
        List<City> cities = cityMapper.selectAll();
        ArrayList<CityDTO> cityDTOS= new ArrayList<>();
        for (City city:cities){
            cityDTOS.add(new CityDTO().convertToDTO(city));
        }
        return cityDTOS;
    }

    @Override
    public CityDTO selectByPrimary(CityDTO cityDTO) {
        return cityDTO.convertToDTO(cityMapper.selectByPrimaryKey(cityDTO.getId()));
    }

    @Override
    public void updateByPrimary(CityDTO cityDTO) {
        City city = cityDTO.convertToDo();
        city.refreshLastUpdateTime();
        cityMapper.updateByPrimaryKeySelective(city);
    }

    @Override
    public void deleteByPrimary(CityDTO cityDTO) {
    cityMapper.deleteByPrimaryKey(cityDTO.getId());
    }
}
