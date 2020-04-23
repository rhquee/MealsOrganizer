package pl.kfrak.dao;

import pl.kfrak.domain.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DishDao implements Dao<Dish> {

    private List<Dish> dishes = new ArrayList<>();

    public DishDao() {
        dishes.add(new Dish(1, "kanapka", Arrays.asList("chleb", "masło", "ser")));
        dishes.add(new Dish(2, "owsianka", Arrays.asList("mleko", "płatki owsiane")));
        dishes.add(new Dish(3, "kotlety", Arrays.asList("chleb", "masło", "ser")));
    }

    @Override
    public Optional<Dish> get(int id) {
        return Optional.ofNullable(dishes.get(id));
    }

    @Override
    public List<Dish> getAll() {
        return dishes;
    }

    @Override
    public void save(Dish dish) {
        dishes.add(dish);
    }

    @Override
    public void delete(int id) {
        dishes.remove(dishes.get(id));
    }

}
