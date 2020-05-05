package pl.kfrak.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dish")
public class Dish {

    //jaka różnica czy sie robi te adnotacje ad id na polach czy na geterach.
    //Defaultowo hibernate bierze pod uwage adnotacje z pól
    @Id
    @GeneratedValue(generator = "incr")
    @GenericGenerator(name = "incr", strategy = "increment")
    private Integer id;
    private String name;
    private String ingredients;

    public Dish(Integer id, String name, String ingredients) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
    }

    /** Hibernate needs it */
    @SuppressWarnings("unused")
    Dish() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Dish id = " + id +
                ", name = " + name + '\'' +
                ", ingredients = " + ingredients;
    }

}
