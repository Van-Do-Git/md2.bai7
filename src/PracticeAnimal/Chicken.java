package PracticeAnimal;


public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Cuc ta cuc tac!";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
