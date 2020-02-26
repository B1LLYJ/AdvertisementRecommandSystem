package com.xitu.ad.mysql.listener;

import com.xitu.ad.mysql.dto.BinlogRowData;

/**
 * Created by billy
 */
public interface Ilistener {

    void register();

    void onEvent(BinlogRowData eventData);
}
