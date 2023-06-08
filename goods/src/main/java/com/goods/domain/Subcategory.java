package com.goods.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Subcategory {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subcategoryName;
    @OneToMany
    private Set<Goods> goods = new HashSet<>();
    @ManyToOne
    private Category categoryName;
    public Subcategory(){}

    public Subcategory(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public Set<Goods> getGoods() {
        return goods;
    }

    public void setGoods(Set<Goods> goods) {
        this.goods = goods;
    }

    public Category getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Category categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Subcategory{" +
                "id=" + id +
                ", subcategoryName='" + subcategoryName + '\'' +
                ", goods=" + goods +
                ", categoryName=" + categoryName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subcategory that = (Subcategory) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
