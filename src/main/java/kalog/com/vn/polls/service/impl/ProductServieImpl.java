package kalog.com.vn.polls.service.impl;

import kalog.com.vn.polls.dto.PageWrapDto;
import kalog.com.vn.polls.repository.ProductRepository;
import kalog.com.vn.polls.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ProductServieImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public PageWrapDto findAllProduct(Pageable pageable) {
        return PageWrapDto.pagable(productRepository.findAll(pageable));
//        return null;
    }
}
