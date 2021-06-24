package com.course.system.service.impl;

import com.course.system.dao.TestDao;
import com.course.system.domain.Test;
import com.course.system.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestDao testDao;

    @Override
    public List<Test> list() {
        return testDao.list();
    }
}
