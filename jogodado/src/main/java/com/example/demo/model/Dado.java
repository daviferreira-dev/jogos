package com.example.demo.model;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class Dado {
    private final Random random;

    public Dado() {
        this.random = new Random();
    }

    public int lancar() {
        return random.nextInt(6) + 1;
    }
}
