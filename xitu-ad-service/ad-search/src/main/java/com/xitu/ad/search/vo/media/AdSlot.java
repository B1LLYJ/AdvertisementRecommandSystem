package com.xitu.ad.search.vo.media;

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
public class AdSlot {

    // ad slot code
    private String adSlotCode;

    // position type
    private Integer positionType;

    // size
    private Integer width;
    private Integer height;

    // ad material type: image, video..
    private List<Integer> type;

    // minimum payment
    private Integer minCpm;
}
