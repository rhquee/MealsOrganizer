package pl.kfrak;

import pl.kfrak.dao.DishDao;
import pl.kfrak.domain.Dish;

import java.util.Arrays;
import java.util.Optional;

public class App {

    private static DishDao dishDao;

    public static void main(String[] args) {
        dishDao = new DishDao();

        System.out.println("getAll = " + dishDao.getAll());

        dishDao.delete(0);
        System.out.println("getAll after deleted 0 = " + dishDao.getAll());

        dishDao.save(new Dish(4, "kaczka", Arrays.asList("kaczka", "siekiera...")));
        System.out.println("getAll after added id 4 = " + dishDao.getAll());
    }

        private static Dish getDish(int id) {
            Optional<Dish> dish = dishDao.get(id);
            return dish.orElseGet(
                    () -> new Dish(0, "no existing dish", ""));
        }
    }
