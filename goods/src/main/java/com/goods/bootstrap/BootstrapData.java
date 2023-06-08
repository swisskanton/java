package com.goods.bootstrap;

import com.goods.domain.Category;
import com.goods.domain.Goods;
import com.goods.domain.Subcategory;
import com.goods.repositories.CategoryRepository;
import com.goods.repositories.GoodsRepository;
import com.goods.repositories.SubcategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class BootstrapData implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final SubcategoryRepository subcategoryRepository;
    private final GoodsRepository goodsRepository;

    public BootstrapData(CategoryRepository categoryRepository, SubcategoryRepository subcategoryRepository, GoodsRepository goodsRepository) {
        this.categoryRepository = categoryRepository;
        this.subcategoryRepository = subcategoryRepository;
        this.goodsRepository = goodsRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Category food = new Category("food");
        Category foodSaved = categoryRepository.save(food);
        Category cloths = new Category("cloths");
        Category clothsSaved = categoryRepository.save(cloths);

        Subcategory cheeses = new Subcategory("cheeses");
        Subcategory cheesesSaved = subcategoryRepository.save(cheeses);
        Subcategory fruits = new Subcategory("fruits");
        Subcategory fruitsSaved = subcategoryRepository.save(fruits);
        Subcategory vegetables = new Subcategory("vegetables");
        Subcategory vegetablesSaved = subcategoryRepository.save(vegetables);

        foodSaved.getSubcategories().add(cheesesSaved);
        foodSaved.getSubcategories().add(fruitsSaved);
        foodSaved.getSubcategories().add(vegetablesSaved);

        Goods apple = new Goods("apple", 1.89, 5);
        Goods appleSaved = goodsRepository.save(apple);
        Goods pear = new Goods("pear", 1.99, 4);
        Goods pearSaved = goodsRepository.save(pear);
        Goods cheddar = new Goods("cheddar", 3.99, 2);
        Goods cheddarSaved = goodsRepository.save(cheddar);
        Goods brie = new Goods("brie", 1.99, 6);
        Goods brieSaved = goodsRepository.save(brie);
        Goods tomato = new Goods("tomato", 1.49, 8);
        Goods tomatoSaved = goodsRepository.save(tomato);
        Goods potato = new Goods("potato", 1.29, 9);
        Goods potatoSaved = goodsRepository.save(potato);

        cheesesSaved.getGoods().add(cheddarSaved);
        cheesesSaved.getGoods().add(brieSaved);
        fruitsSaved.getGoods().add(appleSaved);
        fruitsSaved.getGoods().add(pearSaved);
        vegetablesSaved.getGoods().add(tomatoSaved);
        vegetablesSaved.getGoods().add(potatoSaved);

        Subcategory pants = new Subcategory("pants");
        Subcategory pantsSaved = subcategoryRepository.save(pants);
        Subcategory shirts = new Subcategory("shirts");
        Subcategory shirtsSaved = subcategoryRepository.save(shirts);

        Goods jean = new Goods("jean", 18.99, 4);
        Goods jeanSaved = goodsRepository.save(jean);
        Goods shirt = new Goods("shirt", 12.99, 4);
        Goods shirtSaved =  goodsRepository.save(shirt);

        pantsSaved.getGoods().add(jeanSaved);
        shirtsSaved.getGoods().add(shirtSaved);
    }
}
