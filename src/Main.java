
public class Main {
    public static void main(String[] args) {
        task0();
        task1();
        //       task3();
        //       task4();

    }


    public static void task0() {
        System.out.println("Задачa 0");
        String phone = "+906-035-41 50";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");

        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный!");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий.");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Номер некорректный!");
        }
        System.out.println("phone = " + phone);
        String normNomer = "79060354150";
        if (phone.equals(normNomer)) {
            System.out.println("Успех.");
        } else {
            System.out.println("Неудача =(");
        }


    }

    public static void task1() {
        System.out.println("Задачa 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);

        System.out.println("Задачa 2");
        System.out.println(fullName.toUpperCase());

        System.out.println("Задачa 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName);
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
//    public static void task2() {
//    }

}