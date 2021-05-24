package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        String app = "uber";
        App app2;
        System.out.println("app = " + app);
        App uberApp=new App();
        uberApp.open();
    }
}
