package com.course.server.service.impl;

import com.course.server.dao.TestDao;
import com.course.server.domain.Test;
import com.course.server.service.TestService;
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
