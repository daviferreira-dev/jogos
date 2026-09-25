package caraoucoroa;

import java.util.Random;
public class Moeda {
    private final Random random;
    public Moeda(){
        this.random = new Random();
    }
    public Lado lancar(){
        return random.nextBoolean() ? Lado.CARA : Lado.COROA;
    }
    
}