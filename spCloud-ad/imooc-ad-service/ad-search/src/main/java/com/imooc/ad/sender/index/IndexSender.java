package com.imooc.ad.sender.index;

import com.imooc.ad.mysql.dto.MySqlRowData;
import com.imooc.ad.sender.ISender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/* 为了构建增量索引 */
@Slf4j
@Component("indexSender")
public class IndexSender implements ISender {

    @Override
    public void sender(MySqlRowData rowData) {

    }
}
