package com.local.productService.service;


import com.local.productService.repo.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductService {

    private final static Logger log = LoggerFactory.getLogger(ProductService.class);
    @Autowired
    private ProductRepo productRepo;


    public String addtoDb(Map<String,String> productRequest){
        //productRepo.save(productRequest);
        return "Added";
    }

    /*public List<ProductResponse> getProducts() {


    }

    @KafkaListener(groupId = "Consumer-grp",topics = "Messaging-service")
    public void KafkaConsumer(String message){
        log.warn(message);
    }

    public String saveToInventory(ProductRequest productRequest) {


    }*/

    /*public ProductResponse mapToDto(Product product){
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        productResponse.setPrice(product.getPrice());
        return productResponse;
    }*/
}
