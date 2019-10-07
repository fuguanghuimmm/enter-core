package com.enter.core.database.mysql.mybatis;

import com.enter.core.pojo.entity.Project;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Liquid
 * @version 1.0
 * @date 2019/10/7
 */

@org.apache.ibatis.annotations.Mapper
@Repository
public interface ProjectMapper extends Mapper<Project> {
}