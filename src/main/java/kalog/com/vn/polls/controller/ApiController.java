package kalog.com.vn.polls.controller;

import kalog.com.vn.polls.dto.PageWrapDto;
import kalog.com.vn.polls.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(name = "/api")
public class ApiController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    MessageSource messageSource;
    @Autowired
    private HttpServletRequest requestInject;

    @GetMapping(name = "/product")
    public PageWrapDto getProducts() {
        Pageable pageable = PageRequest.of(0, 1000);
        return PageWrapDto.pagable(productRepository.findAll(pageable));
    }
}
