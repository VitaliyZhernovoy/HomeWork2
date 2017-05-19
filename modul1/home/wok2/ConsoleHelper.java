package modul1.home.wok2;
import java.util.Scanner;

/**
 * Консольное приложение:
 * - ввод размера массива int
 * - ввод элементов массива

 * - меню с возможными операциями над ним:
 * - поиск чила по значению
 * - сортировка
 */

public class ConsoleHelper {
    Scanner input = new Scanner(System.in);
    ArrayHolder arrayHolder = new ArrayHolder();

    public void makingChoice() {
        System.out.println("Enter the number you chose \n1) searching the value by the element's number \n2) sorting the array \n3) searching the value in the array \n4)nothing");
        if (input.hasNextInt()) {
            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter the number of the element: ");
                    if (input.hasNextInt()) {
                        int value = input.nextInt();
                        if (value < arrayHolder.massiv.length && value >= 0) {
                            System.out.println("The value of the element " + value + " is " + arrayHolder.massiv[value]);
                        } else {
                            System.out.println("Enter the correct number!");
                            input.next();
                            makingChoice();
                        }
                    } else {
                        System.out.println("Please enter the correct number!");
                        input.next();
                        makingChoice();
                    }
                    break;
                case 2:
                    arrayHolder.sortArray(arrayHolder.massiv);
                    break;
                case 3:
                    System.out.println("Enter the number:");
                    if (input.hasNextInt()) {
                        int num = input.nextInt();
                        int test = arrayHolder.massiv.length;
                        for (int k = 0; k < arrayHolder.massiv.length; k++)
                            if (arrayHolder.massiv[k] == num) {
                                test = arrayHolder.massiv[k];
                                System.out.println("The element" + k + " has value " + num);
                            }

                        if (test == arrayHolder.massiv.length)
                            System.out.println("There is not such number in the array");
                    }else {
                        System.out.println("Please enter the correct integer number");
                        input.hasNext();
                        makingChoice();
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter the correct choice");
                    makingChoice();
                    break;
            }

        }else {
            System.out.println("Enter the correct choice");
            input.next();
            makingChoice();
        }
    }

}