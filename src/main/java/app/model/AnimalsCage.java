package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {


    private Animal animal;
    private Timer timer;
    @Autowired
    public AnimalsCage(@Qualifier("dogBean") Animal animal, Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new AnimalsCage(animal,timer).getTimer().getTime());
        System.out.println("________________________");
    }
}
