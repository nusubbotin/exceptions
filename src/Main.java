import car.Bus;
import car.Car;
import car.CargoCar;
import car.Transport;

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