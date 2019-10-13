package com.enter.core.pojo.dto.entity;

import com.enter.core.pojo.DoConvertible;
import com.enter.core.pojo.entity.District;
import com.enter.core.service.DistrictService;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Classname DistrictDTO
 * @Description TODO
 * @Date 2019/10/11 1:57
 * @Created by 符光辉
 */
@Data
public class DistrictDTO implements Serializable{

    private static final long serialVersionUID = 458223880617791546L;
//    @Autowired
//    private DistrictService districtService;
    /**
     * 区域id
     */
    private Integer id;

    /**
     * 区域名
     */
    private String name;

    /**
     * 关联学校id
     */
    private Integer schoolId;

    /**
     * 隶属学校
     */
    private String schoolName;

    /**
     * 禁用状态
     */
    private Boolean status;

    /**
     * 优先级权重最高100
     */
    private Integer priority;

    /**
     * 使用次数
     */
    private Integer usageCounter;


    private static DistrictDoConvert districtDoConvert;


    static {
        districtDoConvert = new DistrictDoConvert();
    }

    public District convertToDo() {
        return districtDoConvert.convertToDO(this);
    }

    public DistrictDTO convertToDTO(District district) {
        return districtDoConvert.convertToDTO(district);
    }


    private static class DistrictDoConvert implements DoConvertible<District, DistrictDTO> {
        @Override
        public District convertToDO(DistrictDTO districtDTO) {
            District district = new District();
            BeanUtils.copyProperties(districtDTO, district);
            return district;
        }

        @Override
        public DistrictDTO convertToDTO(District district) {
            DistrictDTO districtDTO = new DistrictDTO();
            BeanUtils.copyProperties(district, districtDTO);
            return districtDTO;
        }
    }
}
