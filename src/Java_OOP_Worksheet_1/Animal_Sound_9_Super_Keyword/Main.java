package Java_OOP_Worksheet_1.Animal_Sound_9_Super_Keyword;

public class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        System.out.println("Cat Sound:");
        myCat.makeSound();  // Calls Cat's makeSound()

//        System.out.println("\nDog Sound:");
//        myDog.makeSound();  // Calls Dog's makeSound()
    }
}
