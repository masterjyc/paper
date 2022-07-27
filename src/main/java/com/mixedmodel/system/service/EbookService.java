package com.mixedmodel.system.service;

import com.mixedmodel.system.mapper.EbookMapper;
import com.mixedmodel.system.pojo.Ebook;
import com.mixedmodel.system.pojo.EbookExample;
import com.mixedmodel.system.req.EbookReq;
import com.mixedmodel.system.resp.EbookResp;
import com.mixedmodel.system.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jyc
 * @date 2022/7/26 - 17:06
 */

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebookList) {
//            /*EbookResp ebookResp = new EbookResp();
//            BeanUtils.copyProperties(ebook, ebookResp);*/
//             //对象复制
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }

        //列表复制
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return list;
    }
}
