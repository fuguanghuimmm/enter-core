package com.enter.core.pojo.entity;

import com.enter.core.pojo.entity.infc.TimeSet;
import com.enter.util.utils.TimeUtils;
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
@Table(name = "district")
public class District implements Serializable,TimeSet {
    private static final long serialVersionUID = -1156598537967837244L;
    /**
     * 区域id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 区域名
     */
    private String name;

    /**
     * 关联学校id
     */
    @Column(name = "school_id")
    private Integer schoolId;

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

    /**
     * 使用次数
     */
    @Column(name = "usage_counter")
    private Integer usageCounter;

    /**
     * 获取使用次数
     * @return
     */
    public Integer getUsageCounter() {
        return usageCounter;
    }

    /**
     * 设置使用次数
     * @param usageCounter
     */
    public void setUsageCounter(Integer usageCounter) {
        this.usageCounter = usageCounter;
    }

    /**
     * 获取区域id
     *
     * @return id - 区域id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置区域id
     *
     * @param id 区域id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取区域名
     *
     * @return name - 区域名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置区域名
     *
     * @param name 区域名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取关联学校id
     *
     * @return school_id - 关联学校id
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * 设置关联学校id
     *
     * @param schoolId 关联学校id
     */
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
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
     * 获取最后更新时间
     *
     * @return last_update_time - 最后更新时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置最后更新时间
     *
     * @param lastUpdateTime 最后更新时间
     */


    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public void setAllTime() {
        Date currentTime = TimeUtils.getCurrentTime();
        this.setCreateTime(currentTime);
        this.setLastUpdateTime(currentTime);
    }

    @Override
    public void refreshLastUpdateTime() {
        this.setLastUpdateTime(TimeUtils.getCurrentTime());
    }
}