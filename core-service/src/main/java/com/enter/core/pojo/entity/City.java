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
@Table(name = "city")
public class City implements Serializable {
    private static final long serialVersionUID = 6484884143739345068L;
    /**
     * 城市id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
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