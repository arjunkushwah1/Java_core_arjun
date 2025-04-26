package Java_OOP_Worksheet_1.calculator_lockdown_7_final_keyword;

public class Main
{
    public static void main(String[] args)
    {
//        BasicCalculator b=new BasicCalculator();
//        BasicCalculator b2=new SmartCalculator();
//        System.out.println(b.add(10,20));
// System.out.println(b2.subtract(102,20));// gives error also !

        // Create an object of SmartCalculator
        SmartCalculator sc = new SmartCalculator();

        // Using the add method from the parent class (BasicCalculator)
        int sum = sc.add(10, 5);
        System.out.println("Sum: " + sum);

        // Using the subtract method from the SmartCalculator class
        int difference = sc.subtract(10, 5);
        System.out.println("Difference: " + difference);

    }
}
