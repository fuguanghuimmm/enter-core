package com.enter.core.pojo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Liquid
 * @version 1.0
 * @date 2019/10/7
 */
@Data
@Table(name = "dormitory_compound")
public class DormitoryCompound implements Serializable{
    private static final long serialVersionUID = -4894058107091023668L;
    /**
     * 宿舍大院id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 大院名
     */
    private String name;

    /**
     * 关联学校Id
     */
    @Column(name = "school_id")
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
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后更新时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;


}