public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("Задача 1");
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Задача 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println("Задача 3");
    }
}