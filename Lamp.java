// creating a class
class Lamping {
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("Light on?" + " " + isOn);
    }

    void turnOff(){
        isOn = false;
        System.out.println("Light on?" + " " + isOn);
    }
}

public class Lamp{
    public static void main(String args[]){
        // creating object from the class
        Lamping led = new Lamping();

        led.turnOn();
        led.turnOff();
    }
}
