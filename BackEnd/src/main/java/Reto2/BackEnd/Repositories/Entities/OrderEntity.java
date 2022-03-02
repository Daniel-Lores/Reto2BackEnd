package Reto2.BackEnd.Repositories.Entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Order")
@Entity(name="Order")
public class OrderEntity {
    private @Id @GeneratedValue long id;
    private String Fecha_Creacion;
    private String Usuario;
    private String Estado;
    private ArrayList<OrderProductEntity> orderProduct = new ArrayList<>();

    public OrderEntity(){
       
    }

    public OrderEntity( String _fecha_Creacion, String _usuario, String _estado, ArrayList<OrderProductEntity> _orderProduct) {
        Fecha_Creacion = _fecha_Creacion;
        Usuario = _usuario;
        Estado = _estado;
        this.orderProduct = _orderProduct;
    }

    public ArrayList<OrderProductEntity> getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(ArrayList<OrderProductEntity> orderProduct) {
        this.orderProduct = orderProduct;
    }

    public long getId() {
        return id;
    }

    public String getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public void setFecha_Creacion(String fecha_Creacion) {
        Fecha_Creacion = fecha_Creacion;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
