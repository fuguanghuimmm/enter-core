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
@Table(name = "service_label")
public class ServiceLabel implements Serializable {
    private static final long serialVersionUID = 3358153568748544243L;
    /**
     * 标签id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 标签名
     */
    private String name;

    /**
     * 标签关联项目Id
     */
    @Column(name = "project_id")
    private Integer projectId;

    /**
     * 禁用状态
     */
    private Boolean status;

    /**
     * 优先级权重最高100
     */
    private Integer priority;

    /**
     * 使用数
     */
    @Column(name = "used_count")
    private Integer usedCount;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后更新时间
     */
    @Column(name = "last_update_tie")
    private Date lastUpdateTie;

}