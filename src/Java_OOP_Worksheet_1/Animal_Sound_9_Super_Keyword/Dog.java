package Java_OOP_Worksheet_1.Animal_Sound_9_Super_Keyword;

class Dog extends Animal {
    // Overriding the makeSound() method
    @Override
    public void makeSound() {
        super.makeSound();  // Calling the base class method
        System.out.println("Woof!");  // Adding dog-specific sound
    }
}
