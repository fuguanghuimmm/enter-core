package com.enter.core.pojo.dto.entity;

import com.enter.core.pojo.DoConvertible;
import com.enter.core.pojo.entity.DormitoryCompound;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

/**
 * @Classname DormitoryCompoundDTO
 * @Description TODO
 * @Date 2019/10/11 1:57
 * @Created by 符光辉
 */
@Data
public class DormitoryCompoundDTO implements Serializable{
    private static final long serialVersionUID = -2517198992713429854L;
    /**
     * 宿舍大院id
     */
    private Integer id;

    /**
     * 大院名
     */
    private String name;

    /**
     * 关联学校Id
     */
    private Integer schoolId;

    /**
     * 禁用状态
     */
    private Boolean status;

    /**
     * 权重优先级 最高100
     */
    private Integer priority;

    /**
     * 使用次数
     */
    private Integer usageCounter;

    private static DormitoryCompoundDoConvert dormitoryCompoundDoConvert;


    static {
        dormitoryCompoundDoConvert = new DormitoryCompoundDoConvert();
    }

    public DormitoryCompound convertToDo() {
        return dormitoryCompoundDoConvert.convertToDO(this);
    }

    public DormitoryCompoundDTO convertToDTO(DormitoryCompound dormitoryCompound) {
        return dormitoryCompoundDoConvert.convertToDTO(dormitoryCompound);
    }


    private static class DormitoryCompoundDoConvert implements DoConvertible<DormitoryCompound, DormitoryCompoundDTO> {

        @Override
        public DormitoryCompound convertToDO(DormitoryCompoundDTO dormitoryCompoundDTO) {
            DormitoryCompound dormitoryCompound = new DormitoryCompound();
            BeanUtils.copyProperties(dormitoryCompound,dormitoryCompoundDTO);
            return dormitoryCompound;
        }

        @Override
        public DormitoryCompoundDTO convertToDTO(DormitoryCompound dormitoryCompound) {
            DormitoryCompoundDTO dormitoryCompoundDTO = new DormitoryCompoundDTO();
            BeanUtils.copyProperties(dormitoryCompound,dormitoryCompoundDTO);
            return dormitoryCompoundDTO;
        }
    }
}
