package com.mkweb.api.common.controller;

import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName: com.mkweb.api.common.controller
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-11
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-11   kangmin5    최초생성
 */
@RestController
public class CommonController {
    public String now(){
        return new SimpleDateFormat("yyyy-MM-dd일 hh-mm-ss초").format(new Date());
    }
}
