public class Main {
    public static void main(String[] args) {
//задание 1-2
    String firstName = "Ivan ";
    String middleName = "Ivanovich ";
    String lastName = "Ivanov ";
    String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    String result = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + result);
    zadanie3();}
//задание 3
public static void zadanie3(){
        String fullName = "Иванов Семён Семёнович";
    fullName = fullName.replace("ё", "е");
    System.out.println("Данные ФИО сотрудника — " + fullName);
    boolean got = fullName.contains("е");
    System.out.println("реестр изменен 'е' : " + got);
}
}