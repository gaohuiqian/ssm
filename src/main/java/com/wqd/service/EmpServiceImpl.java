package com.wqd.service;

import com.wqd.mapper.EmpMapper;
import com.wqd.pojo.Emp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper empMapper;

    Logger logger = LoggerFactory.getLogger(EmpServiceImpl.class);

    @Override
    @Transactional
    public Emp test() {

        Emp emp = new Emp();
        emp.setUsername("test111");
        int insert = empMapper.insert(emp);
        System.out.println(insert+"---------------------");


        throw new RuntimeException("测试事务回滚");
//        logger.info("test--------------");
//        return null;
    }
}
