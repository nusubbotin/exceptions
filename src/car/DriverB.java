package car;

import java.util.Objects;

public class DriverB<T extends Car> extends Driver{
    private final char driverCategory = 'B';

    public DriverB(String fullName, int experience) {
        super(fullName, experience);
    }

    public void toRule(T car){
        System.out.println("Как обычно - включаем драйв и педаль в пол");

        car.pitStop();
        car.bestCircleTime();
        car.maximumSpeed();
    }

    @Override
    public String toString() {
        return "DriverB{" +
                "driverCategory=" + driverCategory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverB<?> driverB = (DriverB<?>) o;
        return driverCategory == driverB.driverCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), driverCategory);
    }
}
