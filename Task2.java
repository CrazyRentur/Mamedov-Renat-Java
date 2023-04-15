import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите имя: ");
        String name = scanner.nextLine();
        //Сравнение через оператор switch case
        switch (name){
            case ("Вячеслав"):
                System.out.println("Привет "+ name);
                break;
            default:
                System.out.println("Нет такого имени");
                break;
        }
        //Сравнение через оператор тернарный оператор
        String SAnsver = (name.equals("Вячеслав")) ? ("Привет "+ name) : "Нет такого имени";
        System.out.println(SAnsver);
    }
}
