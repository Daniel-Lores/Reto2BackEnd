package Reto2.BackEnd.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.Order;

@Table(name="OrderProduct")
@Entity(name="OrderProduct")
public class OrderProductEntity {
    private @Id @GeneratedValue long id;
    private int quantity;
    private long product;
    private long order;
    public OrderProductEntity(){

    }
    public OrderProductEntity(long _Product, long _Order, int _quantity) {
        product = _Product;
        order = _Order;
        quantity = _quantity;
    }

    public long getId() {
        return id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public long getProduct() {
        return product;
    }
    public void setProduct(long product) {
        this.product = product;
    }
    public long getOrder() {
        return order;
    }
    public void setOrder(long order) {
        this.order = order;
    }
   
}
