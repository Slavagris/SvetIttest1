import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        String lastName, position, Retirement;
        int age, dailyWage, AnnualSalary;
 
        // запрос данных у пользователя
        String firstName = inputStr("Please provide your First Name: ");
        lastName = inputStr("Please provide your Last Name: ");
        age = inputInt("Please provide your age: ");
        dailyWage = inputInt("Please input your dayly wage: ");
        position = inputStr("Please provide position: ");
 
        // Немного расчётов
        AnnualSalary = Math.round((dailyWage * 250 * 0.8f)); // (100% - 20%) == 0,8
        if (age < 55)
            Retirement = "TermUnitRetirement: " + (55 - age) + " years.";
        else
            Retirement = "You Retirement already.";
 
        // Вывод информации
        System.out.println("\nFull name: " + firstName + " " + lastName
                    + ".\nAge: " + age
                    + " y.o.\n" + Retirement
                    + " \nAnnualSalary: " + AnnualSalary
                    + " tugrecs\nPosition: " + position + ".");
    }
 
    // Функция запрос ввода от пользователя с возвратом строки
    public static String inputStr(String Str) {
        Scanner scan = new Scanner(System.in);
        System.out.print(Str);
        return scan.nextLine();
    }
 
    // Функция запрос ввода от пользователя с возвратом целого числа (в т.ч. из строки)
    public static Integer inputInt(String Str) {
        Scanner scan = new Scanner(System.in);
        System.out.print(Str);
        return Integer.parseInt(scan.nextLine());
    }
}