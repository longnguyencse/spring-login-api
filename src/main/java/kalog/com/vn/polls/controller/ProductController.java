package kalog.com.vn.polls.controller;

import kalog.com.vn.polls.dto.PageWrapDto;
import kalog.com.vn.polls.models.Products;
import kalog.com.vn.polls.repository.ProductRepository;
import kalog.com.vn.polls.service.ProductService;
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
    private ProductService productService;

    @GetMapping(value = "/all")
    public PageWrapDto getAllProducts(@RequestParam int page, @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return this.productService.findAllProduct(pageable);
    }

    @GetMapping(value = "demo")
    @ResponseBody
    public String getContent(){
        return "demo";
    }
}
