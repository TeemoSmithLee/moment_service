package com.pulingle.moment_service.service;

import com.pulingle.moment_service.domain.dto.RespondBody;
import com.pulingle.moment_service.domain.entity.Moment;

/**
 * Created by @杨健 on 2018/4/3 12:33
 *
 * @Des: 动态服务
 */

public interface MomentService {

    /**
    * @param: Moment
    * @return: RespondBody
    * @Des: 动态发布
    */
    RespondBody publishMoment(Moment moment);
}
