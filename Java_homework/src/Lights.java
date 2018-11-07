public class Lights {

    public static void main(String[] args) {

        Bulb bulb1 = new Bulb();
        System.out.println("State of Bulb1 is : "+bulb1.getState());
        
        bulb1.TurnOn();
        System.out.println("State of Bulb1 is : "+bulb1.getState());
        
    }
    
}