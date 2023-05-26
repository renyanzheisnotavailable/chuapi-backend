package com.chu.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chu.api.model.entity.InterfaceInfo;
import com.chu.api.model.entity.Post;

/**
* @author Chu
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-04-17 18:50:05
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param post
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
