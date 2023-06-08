package com.goods.services;

import com.goods.domain.Category;

public interface CategoryService {
    Iterable<Category> findAll();
}
