package com.goods.controllers;

import com.goods.services.CategoryService;
import com.goods.services.GoodsService;
import com.goods.services.SubcategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final CategoryService categoryService;
    private final SubcategoryService subcategoryService;
    private final GoodsService goodsService;

    public HomeController(CategoryService categoryService, SubcategoryService subcategoryService, GoodsService goodsService) {
        this.categoryService = categoryService;
        this.subcategoryService = subcategoryService;
        this.goodsService = goodsService;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/subcategory")
    public String subcategories() {
        return "subcategory";
    }

    @RequestMapping("/subcategory/{id}")
    public String item(@PathVariable(value = "id") String id, Model model) {
        model.addAttribute("id", id);
        return "goods";
    }
}
