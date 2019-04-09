package kalog.com.vn.polls.controller;

import kalog.com.vn.polls.models.Products;
import kalog.com.vn.polls.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/all")
    public Page<Products> getAllProducts(@RequestParam int page,@RequestParam int size) {
        Pageable firstPageWithTwoElements = PageRequest.of(page, size);
        return this.productRepository.findAll(firstPageWithTwoElements);
    }

    @GetMapping(value = "demo")
    @ResponseBody
    public String getContent(){
        return "demo";
    }
}
