package pro.sky.course_2_lesson_11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course_2_lesson_11.service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") List<Integer> item) {
        storeService.add(item);
        return "Товар добавлен в корзину";
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return storeService.getItems();
    }
}
