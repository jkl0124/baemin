package exercise.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Taxi());
        cars.add(new Bus());
        cars.add(new ElecCar());
        for(int i=0;i<cars.size();i++){
            cars.get(i).bbang();
        }

        CarList<Car> carList = new CarList<>();
        carList.add(new ElecCar());
        carList.add(new Taxi());
        carList.add(new Bus());
        for(int i=0;i< carList.size();i++){
            carList.get(i).bbang();
        }
    }
}

class CarList<T>{
    ArrayList<T> arrayList = new ArrayList<>();
    int size=0;
    void add(T car){
        arrayList.add(car);
        size++;
    }

    int size(){
       return size;
    }

    T get(int id){
        return arrayList.get(id);
    }
}

abstract class Car{
     void bbang(){
        System.out.println("경적소리");
     }
}
class Taxi extends Car{
    @Override
    void bbang() {
        System.out.println("bbangbbang");
    }
}

class Bus extends Car{
    void bbang(){
        System.out.println("booaang");
    }

}

class ElecCar extends Car{
    void bbang(){
        System.out.println("bibbic");
    }
}