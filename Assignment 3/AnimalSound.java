/*
9. Animal Sound
Scenario: You are building a zoo management system to play animal sounds.
Problem Statement:
Create a superclass Animal with method makeSound(). Subclass Dog and Cat override makeSound().
Classes/Fields:
● Animal → makeSound()
● Dog → “Bark”
● Cat → “Meow”
*/
class Animal {
   public void makeSound() {
   }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
       System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
       System.out.println("Meow");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
      Dog dog = new Dog();
      Cat cat = new Cat();

      System.out.print("Dog = ");
      dog.makeSound();

      System.out.print("Cat = ");
      cat.makeSound();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac  AnimalSound.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java AnimalSound
Dog = Bark
Cat = Meow
*/