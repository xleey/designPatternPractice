package builder_plain;

public interface CarPlan {
    void setFrame(String frame);
    void setWindows(String windows);
    void setEngine(String engine);
    void setWhell(String whell);
}

class Car implements CarPlan{
    private String frame;
    private String windows;
    private String engine;
    private String whell;

    @Override
    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public void setWindows(String windows) {
        this.windows = windows;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setWhell(String whell) {
        this.whell = whell;
    }
}

interface Builder{
    void buildFrame();
    void buildWindows();
    void buildEngine();
    void buildWhell();
    Car getCar();
}

class CheapBuilder implements Builder{
    private Car cheapCar = new Car();

    @Override
    public Car getCar() {
        return cheapCar;
    }

    @Override
    public void buildFrame() {
        cheapCar.setFrame("cheap frame");
    }

    @Override
    public void buildWhell() {
        cheapCar.setWhell("cheap whell");
    }

    @Override
    public void buildEngine() {
        cheapCar.setEngine("cheap engine");
    }

    @Override
    public void buildWindows() {
        cheapCar.setWindows("cheap windows");
    }
}

class EconomicCar implements Builder{
    private Car car = new Car();

    @Override
    public Car getCar() {
        return car;
    }

    @Override
    public void buildWindows() {
        car.setWindows("ecoWindows");
    }

    @Override
    public void buildEngine() {
        car.setEngine("ecoEngine");
    }

    @Override
    public void buildWhell() {
        car.setWhell("ecoWhell");
    }

    @Override
    public void buildFrame() {
        car.setFrame("ecoFrame");
    }
}

class Director{
    private Builder builder;
    Director(Builder builder){
        this.builder = builder;
    }
    void producerCar(){
        builder.buildEngine();
        builder.buildFrame();
        builder.buildWhell();
        builder.buildWindows();
    }
    Car getCar(){
        return builder.getCar();
    }
}
