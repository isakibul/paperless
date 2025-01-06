public class ConstructorOverloading {
    void greeting(){
        System.out.println("Hello!");
    }

    void greeting(String msg){
        System.out.println(msg);
    }

    public static void main(String args[]){
        ConstructorOverloading obj = new ConstructorOverloading();

        obj.greeting();
        String msg = "Hello!";
        obj.greeting(msg);
    }

}
