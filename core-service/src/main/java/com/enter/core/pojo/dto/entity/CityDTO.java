package com.enter.core.pojo.dto.entity;

import com.enter.core.pojo.DoConvertible;
import com.enter.core.pojo.entity.City;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Classname CityDTO
 * @Description TODO
 * @Date 2019/10/11 1:56
 * @Created by 符光辉
 */
@Data
public class CityDTO implements Serializable{

    private static final long serialVersionUID = 3738862463982810279L;
    /**
     * 城市id
     */
    private Integer id;

    /**
     * 城市名
     */
    private String name;

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

    private static CityDoConvert cityDoConvert;


    static {
        cityDoConvert = new CityDoConvert();
    }

    public City convertToDo() {
        return cityDoConvert.convertToDO(this);
    }

    public CityDTO convertToDTO(City city) {
        return cityDoConvert.convertToDTO(city);
    }


    private static class CityDoConvert implements DoConvertible<City, CityDTO> {
        @Override
        public City convertToDO(CityDTO cityDTO) {
            City city = new City();
            BeanUtils.copyProperties(cityDTO, city);
            return city;
        }

        @Override
        public CityDTO convertToDTO(City city) {
            CityDTO cityDTO = new CityDTO();
            BeanUtils.copyProperties(city, cityDTO);
            return cityDTO;
        }
    }

}
