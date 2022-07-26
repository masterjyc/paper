package com.mixedmodel.system.service;

import com.mixedmodel.system.mapper.TestMapper;
import com.mixedmodel.system.pojo.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jyc
 * @date 2022/7/26 - 17:06
 */

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}
