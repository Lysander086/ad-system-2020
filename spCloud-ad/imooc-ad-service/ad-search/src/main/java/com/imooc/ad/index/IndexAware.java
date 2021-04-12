package com.imooc.ad.index;

public interface IndexAware<K, V> {
    V get(K key);

    /* 添加索引 */
    void add(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);

}
