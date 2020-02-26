package com.xitu.ad.service;

import com.xitu.ad.entity.AdPlan;
import com.xitu.ad.exception.AdException;
import com.xitu.ad.vo.AdPlanGetRequest;
import com.xitu.ad.vo.AdPlanRequest;
import com.xitu.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * Created by billy
 */
public interface IAdPlanService {

    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;


    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;


    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;


    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
