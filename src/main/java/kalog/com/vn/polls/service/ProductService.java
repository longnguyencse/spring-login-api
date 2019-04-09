package kalog.com.vn.polls.service;

import kalog.com.vn.polls.dto.PageWrapDto;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public interface ProductService {
    PageWrapDto findAllProduct(Pageable pageable);
}
