import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    Car car = new Car(123, 6677);
    Car car1 = new Car(456, 8899);
    DateCar dateCar = new DateCar(LocalDate.of(2022,6,2),"Kamaz","orange", BigDecimal.valueOf(10000));
    DateCar dateCar1 = new DateCar(LocalDate.of(2021,3,12),"Tractor","pink", BigDecimal.valueOf(12000));

        Map<Car, DateCar> cars = new LinkedHashMap<>();
        cars.put(car, dateCar);
        cars.put(car1,dateCar1);

        Iterator<Map.Entry<Car, DateCar>> iterator = cars.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}