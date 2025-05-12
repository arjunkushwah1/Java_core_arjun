package Java_OOP_Worksheet_1.Animal_Sound_9_Super_Keyword;

class Cat extends Animal {
    // Overriding the makeSound() method

    @Override
    public void makeSound() {
        super.makeSound();  // Calling the base class method
        System.out.println("Meow!");  // Adding cat-specific sound
    }
}
