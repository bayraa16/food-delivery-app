package com.fooddelivery.food_delivery_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodDeliveryController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Food Delivery App");
        return "home";
    }

    @GetMapping("/menu")
    public String menu(Model model) {
        // You can populate food items from the database or static data
        model.addAttribute("message", "Explore our Menu!");
        return "menu";
    }

    @GetMapping("/order")
    public String order(Model model) {
        // Logic to place an order can go here
        model.addAttribute("message", "Place your order here!");
        return "order";
    }
}
