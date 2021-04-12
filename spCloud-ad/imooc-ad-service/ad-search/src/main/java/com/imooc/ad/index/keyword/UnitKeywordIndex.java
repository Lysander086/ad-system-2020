package com.imooc.ad.index.keyword;

import com.imooc.ad.index.IndexAware;
import com.imooc.ad.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.metrics.Stat;
import org.hibernate.tool.schema.internal.StandardTableExporter;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

@Slf4j
@Component
public class UnitKeywordIndex implements IndexAware<String, Set<Long>> {

    /* 倒排索引 */
    private static Map<String, Set<Long>> keywordUnitMap;

    /* 正向索引 */
    private static Map<Long, Set<String>> unitKeywordMap;

    static {
        keywordUnitMap = new ConcurrentHashMap<>();
        unitKeywordMap = new ConcurrentHashMap<>();
    }

    @Override
    public Set get(String key) {
        return null;
    }

    @Override
    public void add(String key, Set<Long> values) {
        log.info("UnitKeywordIndex, before add: {}", unitKeywordMap);

        Set<Long> unitIdSet = CommonUtils.getOrCreate(
                key, keywordUnitMap,
                ConcurrentSkipListSet::new
        );

        unitIdSet.addAll(values);

        for (Long unitId : values) {
            Set<String> keywordSet = CommonUtils.getOrCreate(unitId, unitKeywordMap,
                    ConcurrentSkipListSet::new
            );
            keywordSet.add(key);
        }

        log.info("UnitKeywordIndex, after add: {}", unitKeywordMap);
    }

    @Override
    public void update(String key, Set value) {

    }

    @Override
    public void delete(String key, Set value) {

    }
}
