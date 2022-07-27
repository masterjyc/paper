package com.mixedmodel.system.controller;

import com.mixedmodel.system.req.EbookReq;
import com.mixedmodel.system.resp.CommonResp;
import com.mixedmodel.system.resp.EbookResp;
import com.mixedmodel.system.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jyc
 * @date 2022/7/25 - 20:54
 */

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list(EbookReq req) {
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);

        resp.setContent(list);
        return resp;
    }
}
