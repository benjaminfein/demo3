package com.example.demo;

import com.example.demo.model.Product.CyclingProducts;
import com.example.demo.model.Product.Product;
import com.example.demo.model.Product.RunningProducts;
import com.example.demo.model.Product.SwimmingProducts;
import com.example.demo.model.Transoprt.CargoPlane;
import com.example.demo.model.Transoprt.Fighter;
import com.example.demo.model.Transoprt.PassengerPlane;
import com.example.demo.model.Transoprt.Vehicle;
import com.example.demo.service.BookService;
import org.springframework.boot.SpringApplication;

public class Demo3Application {

    public static void main(String[] args) {
        Product bicycle = new CyclingProducts("Bicycle", "500$", 11,
                150, 20, 100, "Aluminium",
                false, "Road Bike");

        Product swimmingGlasses = new SwimmingProducts("Swimming glasses", "100$", 2,
                3, 5, 2, "Complex shape", true);

        Product tapes = new RunningProducts("Tapes", "50$", 3,
                1, 5, 5, true, true);

        Vehicle an225 = new CargoPlane(850, "216,000kg", 6, "3,000,000,000$",
                1, 250, "88,4m");

        Vehicle a318 = new PassengerPlane(828, "39,500kg", 132, "65,000,000$",
                2, 2, "White");

        Vehicle f35 = new Fighter(1930, "13,300kg", 1, "83,400,000$",
                3, 5, "25-mm gun GAU-22/A");

        //Методы выводил в переопределенном методе toString()

        System.out.println(bicycle);
        System.out.println(swimmingGlasses);
        System.out.println(tapes);
        System.out.println(an225);
        System.out.println(a318);
        System.out.println(f35);

        BookService.doSomething();
        BookService.everybodyNeedsToReadBooks();

        SpringApplication.run(Demo3Application.class, args);
    }

}
