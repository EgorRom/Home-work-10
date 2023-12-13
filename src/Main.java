import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();}
        public static void task1() {
            System.out.println("Hello world!");
            System.out.println("Задание №1");
            String firstName = "Ivan ";
            String middleName = "Ivanovich";
            String lastName = "Ivanov ";
            String fullName = lastName + firstName + middleName;
            System.out.println("Ф.И.О. сотрудника - " + fullName);
            System.out.println("Задание №2");
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase(Locale.ROOT));
        }
    public static void task2() {
        System.out.println("Задание №3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}
