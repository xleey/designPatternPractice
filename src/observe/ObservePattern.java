//http://c.biancheng.net/view/1390.html
package observe;

import java.util.ArrayList;
import java.util.List;
//import java.util.Observer;

public class ObservePattern {
    public static void main(String[] args) {
        Subject subject = new concreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObservers();
    }
}

abstract class Subject{
    protected List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public  void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObservers();

}
interface Observer{
    void response();
}
class concreteSubject extends Subject{
    @Override
    public void notifyObservers() {
        System.out.println("目标发生改变");
        System.out.println("-----------");

        for(Object obs:observers){
            ((Observer) obs).response();
        }
    }
}

class ConcreteObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者1做出反应");
    }
}

class ConcreteObserver2 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者2做出反应");
    }
}