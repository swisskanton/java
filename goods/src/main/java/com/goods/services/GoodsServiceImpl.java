package com.goods.services;

import com.goods.domain.Goods;
import com.goods.repositories.GoodsRepository;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {

    private final GoodsRepository goodsRepository;

    public GoodsServiceImpl(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @Override
    public Iterable<Goods> findAll() {
        return goodsRepository.findAll();
    }
}
