package com.enter.core.impl;

import com.enter.core.database.mysql.mybatis.DormitoryCompoundMapper;
import com.enter.core.pojo.dto.entity.DormitoryCompoundDTO;
import com.enter.core.pojo.entity.DormitoryCompound;
import com.enter.core.service.DormitoryCompoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname DormitoryCompoundServiceImpl
 * @Description TODO
 * @Date 2019/10/11 2:23
 * @Created by 符光辉
 */
@Service("dormitoryCompoundService")
public class DormitoryCompoundServiceImpl implements DormitoryCompoundService {
    @Autowired
    private DormitoryCompoundMapper dormitoryCompoundMapper;
    @Override
    public void insert(DormitoryCompoundDTO dormitoryCompoundDTO) throws Exception {
        DormitoryCompound dormitoryCompound = dormitoryCompoundDTO.convertToDo();
        dormitoryCompound.setAllTime();
        dormitoryCompoundMapper.insertSelective(dormitoryCompound);
    }

    @Override
    public List<DormitoryCompoundDTO> selectAll() {

        List<DormitoryCompound> dormitoryCompounds = dormitoryCompoundMapper.selectAll();
        ArrayList<DormitoryCompoundDTO> dormitoryCompoundDTOS= new ArrayList<>();
        for (DormitoryCompound dormitoryCompound:dormitoryCompounds){
            dormitoryCompoundDTOS.add(new DormitoryCompoundDTO().convertToDTO(dormitoryCompound));
        }
        return dormitoryCompoundDTOS;
    }

    @Override
    public DormitoryCompoundDTO selectByPrimary(DormitoryCompoundDTO dormitoryCompoundDTO) {
        return dormitoryCompoundDTO.convertToDTO(dormitoryCompoundMapper.selectByPrimaryKey(dormitoryCompoundDTO.getId()));
    }

    @Override
    public void updateByPrimary(DormitoryCompoundDTO dormitoryCompoundDTO) {
        DormitoryCompound dormitoryCompound = dormitoryCompoundDTO.convertToDo();
        dormitoryCompound.refreshLastUpdateTime();
        dormitoryCompoundMapper.updateByPrimaryKeySelective(dormitoryCompound);
    }

    @Override
    public void deleteByPrimary(DormitoryCompoundDTO dormitoryCompoundDTO) {
        dormitoryCompoundMapper.deleteByPrimaryKey(dormitoryCompoundDTO.getId());
    }
}
