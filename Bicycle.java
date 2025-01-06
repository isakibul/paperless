public class Bicycle {
    boolean running;

    void cycling(){
        running = true;
        System.out.println("Cycle running?" + " " + running);
    }

    public static void main(String args[]){
        Bicycle sportCycle = new Bicycle();

        sportCycle.cycling();
    }
}
