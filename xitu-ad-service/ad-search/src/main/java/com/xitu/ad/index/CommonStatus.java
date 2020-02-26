package com.xitu.ad.index;

import lombok.Getter;

/**
 * Created by billy
 */
@Getter
public enum  CommonStatus {

    VALID(1, "VALID STATUS"),
    INVALID(0, "INVALID STATUS");

    private Integer status;
    private String desc;

    CommonStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
