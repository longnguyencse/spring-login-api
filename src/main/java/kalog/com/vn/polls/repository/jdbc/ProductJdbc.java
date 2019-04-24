package kalog.com.vn.polls.repository.jdbc;

import kalog.com.vn.polls.models.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductJdbc {
    List<Product> findPeoductDistinctName(int offset, int limit);
}
