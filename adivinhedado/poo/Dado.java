package adivinhedado.poo;

import java.util.Random;

public class Dado {
    private final Random random;

    public Dado() {
        this.random = new Random();
    }

    public int lancar() {
        return random.nextInt(6) + 1;
    }
}
