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
@Table(name = "project")
public class Project implements Serializable {
    private static final long serialVersionUID = 1083240588375976824L;
    /**
     * 项目id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目关联的用户类型
     */
    @Column(name = "user_type")
    private String userType;

    /**
     * 关联学习id
     */
    @Column(name = "school_id")
    private Integer schoolId;

    /**
     * 关联学校名称
     */
    @Column(name = "school_name")
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
     * 项目流量
     */
    private Integer flow;

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