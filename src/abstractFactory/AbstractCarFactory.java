package abstractFactory;

import java.io.ObjectStreamException;

public interface AbstractCarFactory {
    void installWhell();
    void installEngine();
}

class BMWFactory implements AbstractCarFactory{
    @Override
    public void installWhell() {
        BMWWhellFactory bmwWhellFactory = new BMWWhellFactory();
        String whell = bmwWhellFactory.createWhell();
        System.out.println("轮胎安装中："+whell);
    }

    @Override
    public void installEngine() {
        BMWEngineFactory bmwEngineFactory = new BMWEngineFactory();
        String engine = bmwEngineFactory.createEngine();
        System.out.println("引擎生产中"+engine);
    }
}

class BenzFactory implements AbstractCarFactory{
    @Override
    public void installWhell() {
        BenzWhellFactory benzWhellFactory = new BenzWhellFactory();
        String whell = benzWhellFactory.createWhell();
        System.out.println("轮胎生产中："+whell);
    }

    @Override
    public void installEngine() {
        BenzEngineFactory benzEngineFactory = new BenzEngineFactory();
        String engine = benzEngineFactory.createEngine();
        System.out.println("引擎生产中："+engine);
    }
}
