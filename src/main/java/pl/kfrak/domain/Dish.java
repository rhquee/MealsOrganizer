package pl.kfrak.domain;

import java.util.List;

public class Dish {

    private Integer id;
    private String name;
    private List<String> ingredients;

    public Dish(Integer id, String name, List<String> ingredients) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
    }

    public Dish(Integer id, String name, String s) {
    }

    @Override
    public String toString() {
        return "Dish id = " + id +
                ", name = " + name + '\'' +
                ", ingredients = " + ingredients;
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

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
