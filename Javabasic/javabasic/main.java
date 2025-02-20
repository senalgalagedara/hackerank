package javabasic;

public class main {
    public static void main(String[] args) {
        person person1 = new person();
        System.out.println("Default Constructor Output");
        person1.displayPersonInfo();

        System.out.println("\nCreating another person with parameterized constructor");
        person person2 = new person();
        person2.displayPersonInfo();
    }
}
