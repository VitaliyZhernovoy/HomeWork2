package modul1.home.wok2;
import java.util.Arrays;
import java.util.Scanner;
/*
 Консольное приложение:
 - ввод размера массива int
 - ввод элементов массива

 - меню с возможными операциями над ним:
 - поиск чила по значению
 - сортировка
 */
public class ArrayHolder {
    int[] massiv;
    int i, a;
    Scanner input = new Scanner(System.in);

    public ArrayHolder() {
        massiv = new int[enterSizeOfArray()];
        fillArray();
    }

    public void fillArray() {
        printEnterElements();
        for (int j = 0; j < massiv.length; j++) {
            massiv[j] = enterElements();
        }
        System.out.println("Your array is: " + Arrays.toString(massiv));
    }

    public int enterSizeOfArray() {
        System.out.println("Enter size of array: ");
        if (input.hasNextInt()) {
            int i1 = input.nextInt();
            if (i1 > 0) {
                i = i1;
            } else {
                toBeginning();
                enterSizeOfArray();
            }
        } else {
            toBeginning();
            input.next();
            enterSizeOfArray();
        }
        return i;
    }

    public void printEnterElements() {
        System.out.println("Enter elements of array: ");
    }

    public int enterElements() {
        if (input.hasNextInt()) {
            a = input.nextInt();
        } else {
            toBeginning();
            input.next();
            enterElements();
        }
        return a;
    }

    public void toBeginning() {
        System.out.println("Enter the correct integer number");
    }

    public int[] sortArray(int[] massiv) {
        Arrays.sort(massiv);
        System.out.println("Sorted array: " + Arrays.toString(massiv));
        return massiv;
    }
}