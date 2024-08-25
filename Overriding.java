/*
 * method overriding and super to call super class method
 */
 class Animal {
    public void display(){
        System.out.println("I am a animal");
    }
}

class Dog extends Animal{
    @Override
    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){
        super.display();
        display();
    }
}

class Overriding{
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.printMessage();
    }
}