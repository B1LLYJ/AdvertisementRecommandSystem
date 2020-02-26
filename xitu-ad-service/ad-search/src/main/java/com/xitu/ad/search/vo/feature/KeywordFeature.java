package com.xitu.ad.search.vo.feature;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by billy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeywordFeature {

    private List<String> keywords;
}
