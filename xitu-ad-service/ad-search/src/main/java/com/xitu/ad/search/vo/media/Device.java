package com.xitu.ad.search.vo.media;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by billy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Device {

    // device id
    private String deviceCode;

    // mac
    private String mac;

    // ip
    private String ip;

    // model code
    private String model;

    // resolution size
    private String displaySize;

    // screen size
    private String screenSize;

    // device serial#
    private String serialName;
}
