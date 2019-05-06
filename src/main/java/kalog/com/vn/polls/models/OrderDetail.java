package kalog.com.vn.polls.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_orders")
@Data
public class OrderDetail {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
