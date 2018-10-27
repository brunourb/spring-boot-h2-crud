package br.com.crud.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Product extends DefaultModel{

    protected String codBarra;
    protected String name;
    protected String description;
    protected BigDecimal value;

    public Product() {
    }


    public Product(Integer id, String codBarra,
                   String name, String description,
                   BigDecimal value) {
        this.id = id;
        this.codBarra = codBarra;
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codBarra='" + codBarra + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", value=" + value +
                ", id=" + id +
                '}';
    }
}
