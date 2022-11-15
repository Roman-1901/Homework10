public class Task1_2 {
    public static void main(String[] args) {
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";

        // 1 задание
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // 2 задание
        System.out.println(fullName.toUpperCase());
    }
}
