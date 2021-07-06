package day59_polymorphism_exceptions;

public class InputField implements WebElement {
    public static final String TAG_NAME = "input";

    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input field - " + txt);
    }

    @Override
    public void click() {
        System.out.println("");
    }

    @Override
    public String GetText() {
        System.out.println();
        return null;
    }
}
