package com.xitu.ad.sender;

import com.xitu.ad.mysql.dto.MySqlRowData;

/**
 * Created by billy
 */
public interface ISender {

    void sender(MySqlRowData rowData);
}
