package Reto2.BackEnd.Services.Models;

public class OrderProductDTO {
    private int quantity;
    private long product;
    private long order;

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
