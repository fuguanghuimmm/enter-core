package com.enter.core.service;

import com.enter.core.pojo.dto.entity.DistrictDTO;
import com.enter.core.service.infc.Cruder;

/**
 * @Classname DistrictService
 * @Description TODO
 * @Date 2019/10/11 2:17
 * @Created by 符光辉
 */
public interface DistrictService extends Cruder<DistrictDTO>{
    String selectSchoolNameById(Integer id);
}
