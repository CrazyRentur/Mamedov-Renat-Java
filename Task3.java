import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        //Повторяющихся чисел не будет)
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        ArrayList<Integer> indexArray = new ArrayList<Integer>();
        System.out.print("Ведите размер массива: ");
        Integer n=scanner.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print("Ведите число" + "("+ (i) +"): " );
            intArray.add(scanner.nextInt());
            if (intArray.get(i) % 3 == 0){
                indexArray.add(i);
            }
        }
        for (int i = 0; i< indexArray.size(); i++){
            System.out.println(intArray.get(indexArray.get(i)));
        }
    }
}
