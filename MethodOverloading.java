public class MethodOverloading {
    public static void display(int a){
        System.out.println(a);
    }

    public static void display(String b){
        System.out.println(b);
    }

    public static void main(String args[]){
        int a = 5;
        String b = "lorem ipsum";

        display(a);
        display(b);
    }
}
