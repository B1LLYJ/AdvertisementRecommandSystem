package com.xitu.ad.service;

import com.xitu.ad.vo.CreativeRequest;
import com.xitu.ad.vo.CreativeResponse;

/**
 * Created by billy
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
