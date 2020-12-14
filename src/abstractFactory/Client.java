//https://blog.csdn.net/cui_yonghua/article/details/90722176
package abstractFactory;

public class Client {
    public static void main(String[] args) {
        BMWFactory bmwFactory = new BMWFactory();
        bmwFactory.installEngine();
        bmwFactory.installWhell();
    }
}
