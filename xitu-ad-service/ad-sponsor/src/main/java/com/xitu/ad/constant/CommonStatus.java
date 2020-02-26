package com.xitu.ad.constant;

import lombok.Getter;

/**
 * Created by billy
 */
@Getter
public enum CommonStatus {

    VALID(1, "valid status"),
    INVALID(0, "invalid status");

    private Integer status;
    private String desc;

    CommonStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
