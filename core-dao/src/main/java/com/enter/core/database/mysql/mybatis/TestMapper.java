package com.enter.core.database.mysql.mybatis;

import com.enter.core.pojo.entity.Test;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Liquid
 * @description
 * @date 2019/9/20
 */

@org.apache.ibatis.annotations.Mapper
@Repository
public interface TestMapper extends Mapper<Test> {


}
