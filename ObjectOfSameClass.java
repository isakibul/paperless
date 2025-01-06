public class ObjectOfSameClass {
    boolean running;

    void cycling(){
        running = true;
        System.out.println("Cycle running?" + " " + running);
    }

    public static void main(String args[]){
        ObjectOfSameClass sportCycle = new ObjectOfSameClass();

        sportCycle.cycling();
    }
}
