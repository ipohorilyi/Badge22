package day46_encapculation;

public class dealerShip {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.setModel("Nissan Altima");
        System.out.println("car1 Model = " + car1.getModel());
        
        car1.setYear(2020);
        System.out.println("car1.getYear() = " + car1.getYear());

        car1.setMilege(43333);
        System.out.println("car1 milege = "+car1.getMilege());


        System.out.println(car1.toString());

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Ti");
        alfaRomeo.setMilege(16000);
        alfaRomeo.setYear(2018);
        System.out.println("Model = " + alfaRomeo.getModel());

    }
}
