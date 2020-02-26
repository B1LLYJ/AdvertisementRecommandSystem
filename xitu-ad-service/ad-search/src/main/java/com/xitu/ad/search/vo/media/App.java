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
public class App {

    // application code
    private String appCode;
    // application name
    private String appName;
    // package name
    private String packageName;
    // activity name
    private String activityName;
}
