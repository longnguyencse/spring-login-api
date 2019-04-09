package kalog.com.vn.polls.repository;

import kalog.com.vn.polls.models.Products;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
    Page<Products> findAll(Pageable pageable);
}
