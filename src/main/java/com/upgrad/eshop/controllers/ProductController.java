package com.upgrad.eshop.controllers;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ProductController {

    @GetMapping("/products")
    public ResponseEntity getProducts(@RequestParam("category") String category,@RequestParam("direction") String direction, @RequestParam("name") String name,
                                      @RequestParam("pageNumber") int pageNumber, @RequestParam("pageSize") int pageSize,@RequestParam("sortBy") String sortBy){
        ResponseEntity responseEntity = null;
        try{

        }
    }
}
