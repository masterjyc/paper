package com.mixedmodel.system.service;

import com.mixedmodel.system.mapper.DemoMapper;
import com.mixedmodel.system.pojo.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jyc
 * @date 2022/7/26 - 17:06
 */

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
