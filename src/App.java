import java.util.Scanner;

class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return "\nName: " + name + " \nGrade: " + grade;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int num = scan.nextInt();
        scan.nextLine(); 

        Student[] students = new Student[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter student " + (i + 1) + " name: ");
            String name = scan.nextLine();

            System.out.println("Enter student " + (i + 1) + " grade: ");
            double grade = scan.nextDouble();
            scan.nextLine(); 

            students[i] = new Student(name, grade);
        }

        bubbleSort(students);

        System.out.println("\nSorted students (Ascending by grade): ");
        for (Student student : students) {
            System.out.println(student);
        }
        scan.close();
    }

    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].grade > students[j + 1].grade) {
                   
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}