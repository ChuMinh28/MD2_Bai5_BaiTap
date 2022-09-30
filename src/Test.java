import baitap5.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student st1 = new Student();
        st1.setName(scanner.nextLine());
        st1.setClasses(scanner.nextLine());
    }
}
