package kalog.com.vn.polls.models;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customers")
@Data
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private Long Id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private Set<OrderDetail> orderDetails = new HashSet<>();
}
