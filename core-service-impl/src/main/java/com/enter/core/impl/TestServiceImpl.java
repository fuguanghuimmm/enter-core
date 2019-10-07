package com.enter.core.impl;

import com.enter.core.database.mysql.mybatis.TestMapper;
import com.enter.core.pojo.entity.Test;
import com.enter.core.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liquid
 * @类名： TestServiceImpl
 * @描述：
 * @date 2019/10/6
 */
@com.alibaba.dubbo.config.annotation.Service(
        version = "1.0",
        timeout = 10000
)
@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> test() {

        return testMapper.selectAll();
    }
}
