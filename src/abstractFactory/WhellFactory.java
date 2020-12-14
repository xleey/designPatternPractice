package abstractFactory;

public interface WhellFactory {
    String createWhell();
}

class BMWWhellFactory implements WhellFactory{
    @Override
    public String createWhell() {
        System.out.println("宝马轮胎生产中");
        return "轮胎（由宝马轮胎厂提供）";
    }
}

class BenzWhellFactory implements WhellFactory{
    @Override
    public String createWhell() {
        System.out.println("奔驰轮胎生产中");
        return "轮胎（由奔驰轮胎厂提供）";
    }
}