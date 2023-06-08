package com.goods.services;

import com.goods.domain.Subcategory;
import com.goods.repositories.SubcategoryRepository;

public class SubcategoryServiceImpl implements SubcategoryService {

    private final SubcategoryRepository subcategoryRepository;

    public SubcategoryServiceImpl(SubcategoryRepository subcategoryRepository) {
        this.subcategoryRepository = subcategoryRepository;
    }

    @Override
    public Iterable<Subcategory> findAll() {
        return subcategoryRepository.findAll();
    }
}
