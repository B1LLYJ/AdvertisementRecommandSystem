package com.xitu.ad.search.vo;

import com.xitu.ad.search.vo.feature.DistrictFeature;
import com.xitu.ad.search.vo.feature.FeatureRelation;
import com.xitu.ad.search.vo.feature.ItFeature;
import com.xitu.ad.search.vo.feature.KeywordFeature;
import com.xitu.ad.search.vo.media.AdSlot;
import com.xitu.ad.search.vo.media.App;
import com.xitu.ad.search.vo.media.Device;
import com.xitu.ad.search.vo.media.Geo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by billy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest {

    // Media ID
    private String mediaId;
    // request info
    private RequestInfo requestInfo;
    // matched info
    private FeatureInfo featureInfo;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RequestInfo {

        private String requestId;

        private List<AdSlot> adSlots;
        private App app;
        private Geo geo;
        private Device device;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FeatureInfo {

        private KeywordFeature keywordFeature;
        private DistrictFeature districtFeature;
        private ItFeature itFeature;

        private FeatureRelation relation = FeatureRelation.AND;
    }
}
