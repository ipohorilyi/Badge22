package day47_constuctors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("350 Nathan Ln N");
        cybertekAddress.setCity("Plymouth");
        cybertekAddress.setState("MN");
        cybertekAddress.setZipCode("55441");

        System.out.println("cybertekAddress = " + cybertekAddress.toString());
        cybertekAddress.setStreet("20 Shev4enka");
        System.out.println("cybertekAddress after update = " + cybertekAddress);

        Address newAddress = new Address();
        System.out.println(newAddress.toString());
    }
}
