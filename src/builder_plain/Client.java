//https://blog.csdn.net/jlu16/article/details/82685265
package builder_plain;

import java.nio.file.DirectoryStream;

public class Client {
    public static void main(String[] args) {
        Builder builder = new CheapBuilder();
        Director director = new Director(builder);
        director.producerCar();
        Car car = director.getCar();;
    }
}
