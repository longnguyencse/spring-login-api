package kalog.com.vn.polls.models;

import javax.persistence.*;


@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private double price;
}
