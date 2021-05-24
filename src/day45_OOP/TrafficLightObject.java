package day45_OOP;

public class TrafficLightObject {
    public static void main(String[] args) {
        //create traffic light object
        trafficLight trafficLight=new trafficLight();
        trafficLight.collar="red";
        trafficLight.changeColar("red");
        trafficLight.showCollar();
        trafficLight.collar="green";
        trafficLight.changeColar("green");
        trafficLight.showCollar();

        trafficLight trafficLight2= new trafficLight();
        trafficLight2.collar="black";
        trafficLight2.changeColar("black");
        trafficLight2.showCollar();

    }


}
