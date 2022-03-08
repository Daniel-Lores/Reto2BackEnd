package Reto2.BackEnd.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="OrderProduct")
@Entity(name="OrderProduct")
public class OrderProductEntity {
    private @Id @GeneratedValue Long id;
    private int quantity;
    private Long idProduct;
    private Long idOrder;

    public OrderProductEntity(){

    }
    public OrderProductEntity(Long _idProduct, Long _idOrder, int _quantity) {
        idProduct = _idProduct;
        idOrder = _idOrder;
        quantity = _quantity;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Long getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
    public Long getIdOrder() {
        return idOrder;
    }
    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    } 
}
