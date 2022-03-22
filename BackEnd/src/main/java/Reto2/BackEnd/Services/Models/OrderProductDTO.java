package Reto2.BackEnd.Services.Models;

public class OrderProductDTO {
    private Long id;
    private int quantity;
    private Long idProduct;
    private Long idOrder;
    
    public OrderProductDTO() {
    }

    public OrderProductDTO(int quantity, Long idProduct, Long idOrder) {
        this.quantity = quantity;
        this.idProduct = idProduct;
        this.idOrder = idOrder;
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
