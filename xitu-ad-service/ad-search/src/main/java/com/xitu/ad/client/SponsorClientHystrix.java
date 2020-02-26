package com.xitu.ad.client;

import com.xitu.ad.client.vo.AdPlan;
import com.xitu.ad.client.vo.AdPlanGetRequest;
import com.xitu.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by billy
 */
@Component
public class SponsorClientHystrix implements SponsorClient{
    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(AdPlanGetRequest request) {
        return new CommonResponse<>(-1, "eureka-client-ad-sponsor error");
    }
}
