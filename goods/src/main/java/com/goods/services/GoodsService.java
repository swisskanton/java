package com.goods.services;

import com.goods.domain.Goods;

public interface GoodsService {
    Iterable<Goods> findAll();
}
