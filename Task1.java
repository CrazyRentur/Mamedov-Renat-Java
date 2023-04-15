import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        //Составить алгоритм: если веденное число больше 7, то вывести "Привет"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите число: ");
        String SAnsver = (scanner.nextInt() > 7) ? "Привет":"";
        System.out.println(SAnsver);
    }
}
