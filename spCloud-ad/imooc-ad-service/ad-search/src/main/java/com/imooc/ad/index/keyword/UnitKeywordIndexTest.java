package com.imooc.ad.index.keyword;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class UnitKeywordIndexTest {
    Set<Long> longs;

    @BeforeEach
     void setUp() {
        longs = new HashSet<>();
        longs.add(1L);
        longs.add(2L);
    }

    @Test
    void test_add() {


    }
}