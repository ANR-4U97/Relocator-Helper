package com.local.productService.controller;


import com.local.productService.exception.GenericException;
import com.local.productService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/save")
    public ResponseEntity<String> addProduct(@RequestBody Map<String,String> product){
        try{
            return new ResponseEntity<>(productService.addtoDb(product), HttpStatus.CREATED);
        }
        catch(Exception ex){
            throw new GenericException("INTERNAL_SERVER_ERROR",HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    /*@GetMapping("/getProducts")
    public ResponseEntity<List<ProductResponse>> getProducts(){
        return new ResponseEntity<>(productService.getProducts(),HttpStatus.OK);
    }

    @PostMapping("/saveToInventory")
    public ResponseEntity<String> savetoInventory(@RequestBody ProductRequest productRequest){
        return new ResponseEntity<>(productService.saveToInventory(productRequest),HttpStatus.CREATED);
    }*/
}
