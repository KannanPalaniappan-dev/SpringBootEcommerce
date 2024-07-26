package com.ecommerce.sb_ecom.model;

public class Category {

    private Long categoryId;
    private Long categoryName;

    public Category(Long categoryId, Long categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Long categoryName) {
        this.categoryName = categoryName;
    }
}
