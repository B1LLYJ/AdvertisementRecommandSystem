package com.xitu.ad.search;

import com.xitu.ad.search.vo.SearchRequest;
import com.xitu.ad.search.vo.SearchResponse;

/**
 * Created by billy
 */
public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
