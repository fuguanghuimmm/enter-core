package com.enter.core.impl;

import com.enter.core.database.mysql.mybatis.DistrictMapper;
import com.enter.core.pojo.dto.entity.DistrictDTO;
import com.enter.core.pojo.entity.District;
import com.enter.core.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname DistrictServiceImpl
 * @Description TODO
 * @Date 2019/10/11 2:23
 * @Created by 符光辉
 */
@Service("districtService")
public class DistrictServiceImpl implements DistrictService{
    @Autowired
    private DistrictMapper districtMapper;
    @Override
    public void insert(DistrictDTO districtDTO) throws Exception {
        District district = districtDTO.convertToDo();
        district.setAllTime();
        districtMapper.insertSelective(district);

    }

    @Override
    public List<DistrictDTO> selectAll() {

        List<District> districts = districtMapper.selectAll();
        ArrayList<DistrictDTO> districtDTOS= new ArrayList<>();
        for (District district:districts){
            districtDTOS.add(new DistrictDTO().convertToDTO(district));
        }
        return districtDTOS;
    }

    @Override
    public DistrictDTO selectByPrimary(DistrictDTO districtDTO) {
        return districtDTO.convertToDTO(districtMapper.selectByPrimaryKey(districtDTO.getId()));
    }

    @Override
    public void updateByPrimary(DistrictDTO districtDTO) {
        District district = districtDTO.convertToDo();
        district.refreshLastUpdateTime();
        districtMapper.updateByPrimaryKeySelective(district);
    }

    @Override
    public void deleteByPrimary(DistrictDTO districtDTO) {
        districtMapper.deleteByPrimaryKey(districtDTO.getId());
    }

    @Override
    public String selectSchoolNameById(Integer id) {

          String schoolName = districtMapper.selectSchoolNameById(id);

        return schoolName;
    }
}
