package com.course.server.impl;

import com.course.server.domain.Test;
import com.course.server.domain.TestExample;
import com.course.server.mapper.TestMapper;
import com.course.server.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public List<Test> list() {
        TestExample testExample = new TestExample();
        testExample.setOrderByClause("id desc");
        testExample.or().andIdBetween("0","1");
        return testMapper.selectByExample(testExample);
    }
}
