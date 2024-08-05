package com.ecommerce.sb_ecom.controller;


import com.ecommerce.sb_ecom.model.Product;
import com.ecommerce.sb_ecom.payload.ProductDTO;
import com.ecommerce.sb_ecom.payload.ProductResponse;
import com.ecommerce.sb_ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;
    @RequestMapping("/admin/categories/{categoryId}/product")
    public ResponseEntity<ProductDTO> addProduct(@RequestBody Product product,
                                                 @PathVariable Long categoryId){
        ProductDTO productDTO = productService.addProduct(categoryId,product);
        return new ResponseEntity<>(productDTO, HttpStatus.CREATED);
    }

    @RequestMapping("/public/products")
    public ResponseEntity<ProductResponse> getAllProducts(){
        ProductResponse productResponse = productService.getAllProducts();
        return new ResponseEntity<>(productResponse,HttpStatus.OK);
    }
}
