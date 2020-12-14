package abstractFactory;

public interface EngineFactory {
    String createEngine();
}

class BMWEngineFactory implements EngineFactory{
    @Override
    public String createEngine() {
        System.out.println("宝马引擎生产中");
        return "引擎（由宝马公司提供）";
    }
}

class BenzEngineFactory implements EngineFactory{
    @Override
    public String createEngine() {
        System.out.println("奔驰引擎生产中");
        return "引擎（由奔驰公司提供）";
    }
}