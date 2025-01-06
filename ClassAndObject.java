// creating a class
class Lamp {
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

public class ClassAndObject{
    public static void main(String args[]){
        // creating object from the class
        Lamp led = new Lamp();

        led.turnOn();
        led.turnOff();
    }
}
