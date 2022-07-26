package com.mixedmodel.system.service;

import com.mixedmodel.system.mapper.EbookMapper;
import com.mixedmodel.system.pojo.Ebook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jyc
 * @date 2022/7/26 - 17:06
 */

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
