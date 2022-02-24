package web.model;

import org.springframework.stereotype.Controller;

@Controller
public class Car {

    private String model;
    private String engine;
    private int power;

    public Car() {
    }

    public Car(String model, String engine, int power) {
        this.model = model;
        this.engine = engine;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
