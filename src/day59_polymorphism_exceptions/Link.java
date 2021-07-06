package day59_polymorphism_exceptions;

public class Link implements WebElement {
    public static final String TAG_NAME = "a";

    public  void getLinkHref(){
        System.out.println("https://www.java.com");
    }
    @Override
    public void sendKeys(String txt) {
        System.out.println("not supported");
    }

    @Override
    public void click() {
        System.out.println("clicking the link");
    }

    @Override
    public String GetText() {
        System.out.println("getting link text");
        return "Oracle java";
    }
}
