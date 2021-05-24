package day46_encapculation;

public class Car {
    private String model;
    private int year;
    private int milege;

    public void setModel(String carModel){
        model = carModel;
    }

    public String getModel(){
        return model;
    }

    public void setYear(int year){
        this.year=year;

    }

    public int getYear(){
        return year;
    }
    public int getMilege(){
        return milege;
    }
    public void setMilege(int milege){
        this.milege=milege;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", milege=" + milege +
                '}';
    }



}
