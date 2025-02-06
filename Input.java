import java.util.Scanner;

public class Input {
    int num;
    
    public static void main(String[] args){
        Input numberInput = new Input();

        Scanner input = new Scanner(System.in);

        numberInput.num = input.nextInt();

        System.out.println("Number is: " + numberInput.num);

        input.close();
    }
}
