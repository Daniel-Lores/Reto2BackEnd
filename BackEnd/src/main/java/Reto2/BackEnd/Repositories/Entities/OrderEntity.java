package Reto2.BackEnd.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Orders")
@Entity(name="Orders")
public class OrderEntity {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String creationDate;
    private String name;
    private String state;
    
    public OrderEntity(){
       
    }

    public OrderEntity(String _creationDate, String _name, String _state) {
        creationDate = _creationDate;
        name = _name;
        state = _state;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
