package pro.sky.course_2_lesson_11.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final ArrayList<Integer> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void add(Integer integer) {
        items.add(integer);
    }

    public List<Integer> getItems() {
        return new ArrayList<>(items);
    }
}
