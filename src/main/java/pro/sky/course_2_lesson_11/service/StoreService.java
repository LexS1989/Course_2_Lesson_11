package pro.sky.course_2_lesson_11.service;

import pro.sky.course_2_lesson_11.component.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public void add(List<Integer> id) {
        id.forEach(i -> {
            basket.add(i);
        });
    }

    public List<Integer> getItems() {
        return basket.getItems();
    }
}
