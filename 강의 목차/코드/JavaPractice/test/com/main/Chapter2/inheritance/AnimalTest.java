package com.main.Chapter2.inheritance;

import com.main.Chapter2.inheritance.animal.Animal;
import com.main.Chapter2.inheritance.animal.Human;
import com.main.Chapter2.inheritance.animal.Tiger;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    static class WrapperAnimal{

        static void moveAllAnimals() {
            WrapperAnimal.moveAnimal(new Human());
            WrapperAnimal.moveAnimal(new Tiger());
            WrapperAnimal.moveAnimal(new Animal());
        }

        static void moveAnimal(Animal animal) {
            // 다형성, 코드는 1줄인데 가상 메서드의 도움으로 기능 추가된 객체들도 같은 메서드를 사용하고, 인터페이스의 메서드를 동일하게 취급할 수 있음
            animal.move();
        }
    }

    @Test
    void callAllAnimals() {

        WrapperAnimal.moveAllAnimals();
    }



}

