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
@Table(name = "school")
public class School implements Serializable{
    private static final long serialVersionUID = -7375556409671889950L;
    /**
     * 学校id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 学校名
     */
    private String name;

    /**
     * 关联city
     */
    @Column(name = "city_id")
    private Integer cityId;

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
     * 最后一次更新时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 获取学校id
     *
     * @return id - 学校id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置学校id
     *
     * @param id 学校id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取学校名
     *
     * @return name - 学校名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学校名
     *
     * @param name 学校名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取关联city
     *
     * @return city_id - 关联city
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置关联city
     *
     * @param cityId 关联city
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取禁用状态
     *
     * @return status - 禁用状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置禁用状态
     *
     * @param status 禁用状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取优先级权重最高100
     *
     * @return priority - 优先级权重最高100
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置优先级权重最高100
     *
     * @param priority 优先级权重最高100
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后一次更新时间
     *
     * @return last_update_time - 最后一次更新时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置最后一次更新时间
     *
     * @param lastUpdateTime 最后一次更新时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}