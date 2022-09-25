public class HomeWorkStrings {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Урок Строки. Задание 1.");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = firstName+ " " + middleName + " " + lastName;

        System.out.println(fullName);

        System.out.println();
        System.out.println("Урок Строки. Задание 2.");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullNameUpper);

        System.out.println();
        System.out.println("Урок Строки. Задание 3.");
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName);

    }
}
