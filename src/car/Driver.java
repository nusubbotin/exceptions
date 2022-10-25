package car;

import java.util.Objects;

public abstract class Driver implements DriverInterface{
    private String fullName;
    private int experience;

    public Driver(String fullName, int experience) {
        this.fullName = fullName;
        this.experience = experience;
    }

    public void startMoving(){
        System.out.println("Начать движение");
    }

    public void stopMoving(){
        System.out.println("Завершить гонку");
    }

    public void carRefuel(){
        System.out.println("Заправить машину");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, experience);
    }
}
