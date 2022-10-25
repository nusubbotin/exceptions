import car.*;

public class Main {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    private static void task2() {
        System.out.println("Домашка 2");
        Transport[] cars = new Transport [3];
        cars[0] = new Car("лада", "гранта", 1.5f);
        cars[1] = new Bus("Скания", "Скания модель", 5.6f);
        cars[2] = new CargoCar("Самосвал", "Камаз", 6);

        for (Transport car : cars) {
            System.out.println(car);
        }

        DriverB schumacherB = new DriverB("Шумахер", 30);
        Car cur = (Car) cars[0];

        DriverC schumacherC = new DriverC("Чемптон мира Дакар", 15);
        CargoCar cargoCar = (CargoCar) cars[6];

        DriverD schumacherD = new DriverD("Лучший шоссейный водитель года", 10);
        Bus bus = (Bus) cars[3];

        for (Transport car : cars) {
            //...
        }
    }

    private static void task1() {
        Authorization auth = new Authorization("AlexPerm1988", "12345678!Q", "12345678!q");

        try {
            Data.checkAuthorization(auth);
        }catch (WrongLoginException e) {
            System.out.println(e.getMessage() + " login(" + e.getLogin() + ")");
        }catch (WrongPasswordException e) {
            System.out.println(e.getMessage() + " password(" + e.getPassword() + " confirmPassword(" + e.getConfirmPassword() + ")");
        }finally {
            System.out.println("Провели проверку авторизации для попытки доступа: " + auth);
        }
    }
}