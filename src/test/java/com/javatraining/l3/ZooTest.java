package com.javatraining.l3;

import com.javatraining.l6.Animal;
import com.javatraining.l6.Dog;
import com.javatraining.l6.Lion;
import com.javatraining.l6.Tiger;
import com.javatraining.l6.Zoo;
import org.junit.jupiter.api.Test;

public class ZooTest {

    @Test
    public void shouldFeedAllAnimals() {
        Zoo zoo = new Zoo();
        Animal[] animals = {new Dog(), new Lion(), new Tiger()};

        zoo.feedAnimals(animals);
    }
}
