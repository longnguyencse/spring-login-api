package kalog.com.vn.polls.repository.jdbc.impl;

import kalog.com.vn.polls.models.Product;
import kalog.com.vn.polls.repository.jdbc.ProductJdbc;
import kalog.com.vn.polls.repository.jdbc.RowMapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductImpl implements ProductJdbc {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> findPeoductDistinctName(int offset, int limit) {
        return jdbcTemplate.query("SELECT * FROM products GROUP BY products.name LIMIT ? OFFSET ? ",
                new Object[] {offset, limit}, new ProductRowMapper());
    }
}
