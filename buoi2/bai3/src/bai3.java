import java.util.Scanner;

public class bai3 {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    static int[] a = new int[n + 100];

    public static void main(String[] args) {
        do {
            System.out.printf("Enter n: ");
            n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.printf("A[" + i + "] = ");
                a[i] = scanner.nextInt();
            }

            System.out.println("Option: ");
            System.out.println("1. Show array");
            System.out.println("2. Insert element");
            System.out.println("3. Delete element");
            System.out.println("4. Reverse your array");
            System.out.println("5. Show A[1] and find number divisible A[1]");
            System.out.println("6. Exit");

            System.out.println("Enter your selection: ");
            int slection = scanner.nextInt();
            switch (slection) {
                case 1: {
                    System.out.printf("Your array: ");
                    show_array(a, n);
                    break;
                }
                case 2: {
                    insert_element(a, n);
                    break;
                }
                case 3: {
                    delete_element(a, n);
                    break;
                }
                case 4: {
                    reverse_array(a, n);
                    break;
                }
                case 5: {
                    a1_and_request(a, n);
                    break;
                }
                case 6:
                    return;
                default:
                    System.out.println("Oh no, enter number in Option!!!");
            }

        } while (true);
    }

    public static void show_array(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf(a[i] + "  ");
        }
        System.out.println();
    }

    public static void insert_element(int[] a, int n) {
        System.out.printf("Enter the location to insert: ");
        int index = scanner.nextInt();
        System.out.printf("Enter the value to insert: ");
        int x = scanner.nextInt();
        if (index >= 0 && index <= n) {
            n++;
            for (int i = n; i > index; i--)
                a[i] = a[i - 1];
            a[index] = x;
        }
        System.out.printf("Your array after insert: ");
        show_array(a, n);
    }

    public static void delete_element(int[] a, int n) {
        System.out.printf("Enter the location to delete: ");
        int index = scanner.nextInt();
        if (index >= 0 && index <= n) {
            for (int i = index; i < n; i++) {
                a[i] = a[i + 1];
                n--;
            }
        }
        System.out.printf("Your array after insert: ");
        show_array(a, n);
    }

    public static void reverse_array(int[] a, int n) {
        System.out.printf("Your array after reverse: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.printf(a[i] + "  ");
        }
        System.out.println();
    }

    public static void a1_and_request(int[] a, int n) {
        System.out.println("A[1] = " + a[1]);
        System.out.printf("Number divisible A[1]: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % a[1] == 0) {
                System.out.printf(a[i] + "  ");
            }
        }
        System.out.println();
    }
}