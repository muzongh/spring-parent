package com.dangdang.service.biz.service.impl;

import com.dangdang.service.biz.anno.AnnoInterfaceAspectJ;
import com.dangdang.service.biz.service.BaseService;

/**
 * Create by tianjiaqin 2019/4/12-22-48
 */
public class BaseServiceImpl implements BaseService {


    @Override
    public String base() {

        return null;
    }
    
    
    @AnnoInterfaceAspectJ(description = "自定义注解 aspectJ")
    public String annoBase(){
        
        return null;
        
    }
}