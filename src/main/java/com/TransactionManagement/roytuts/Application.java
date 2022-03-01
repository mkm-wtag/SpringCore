package com.TransactionManagement.roytuts;

import com.TransactionManagement.roytuts.config.Config;
import com.TransactionManagement.roytuts.model.Item;
import com.TransactionManagement.roytuts.service.ItemService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        ItemService service = context.getBean(ItemService.class);
        System.out.println("----Available Items----");
        List<Item> items = service.getItems();
        items.forEach(i -> System.out.println(i));
        context.close();
    }
}
