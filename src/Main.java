public class Main {
    public static void main(String[] args) {
        task1();
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