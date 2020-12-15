//https://www.cnblogs.com/yxm2020/p/12821797.html
//这个实例不够明确
package buidler;

import java.nio.file.DirectoryStream;

public class Client {
    public static void main(String[] args) {
        System.out.println("=======套餐A========");
        Builder mealA = new ConcreteBuilder1();
        Director director = new Director();
        KFC myFood = director.build(mealA);
        System.out.println(myFood);
    }
}
