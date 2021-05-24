package day45_OOP;

public class CoffeTest {
    public static void main(String[] args) {
        Coffe myCoffee= new Coffe();
        System.out.println("coffe amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " +myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
        myCoffee.setType("Turkish coffe");
        System.out.println(myCoffee.toString());

        Coffe coffe1 = new Coffe();
        coffe1.setType("cappuccino");
        System.out.println("coffe1 type = " + coffe1.getType());

        Coffe coffe2 = coffe1;

    }
}
