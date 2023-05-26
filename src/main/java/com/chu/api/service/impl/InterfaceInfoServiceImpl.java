package com.chu.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chu.api.common.ErrorCode;
import com.chu.api.exception.BusinessException;
import com.chu.api.model.entity.InterfaceInfo;
import com.chu.api.service.InterfaceInfoService;
import com.chu.api.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;


/**
* @author Chu
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-04-17 18:50:05
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        String description = interfaceInfo.getDescription();
        String url = interfaceInfo.getUrl();
        String requestParams = interfaceInfo.getRequestParams();
        String requestHeader = interfaceInfo.getRequestHeader();
        String responseHeader = interfaceInfo.getResponseHeader();
        Integer status = interfaceInfo.getStatus();
        String method = interfaceInfo.getMethod();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name, description, url, requestParams, requestHeader,responseHeader, method) || ObjectUtils.anyNull(status)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
    }
}




