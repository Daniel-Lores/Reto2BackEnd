package Reto2.BackEnd.Services.Models;

public class ProductDTO {
    private Long id;
    private String name;
    private double price;
    private String imgUrl;
    private int quantity;
    

    public ProductDTO() {
    }

    public ProductDTO(ProductDTO productDTO, int _quantity){
        name = productDTO.getName();
        price = productDTO.getPrice();
        imgUrl = productDTO.getImgUrl();
        quantity = _quantity;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
