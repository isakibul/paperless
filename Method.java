public class Method {
    int addNumber(int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        Method obj = new Method();

        int a = 10;
        int b = 20;

        int result = obj.addNumber(a, b);

        System.out.println(result);
    }
}
