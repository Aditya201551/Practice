import java.util.Scanner;
class Detail {
    int roll;
    String name;
    static String college = "AEC";

    static void change() {
        college = "ASANSOL ENGINEERING COLLEGE";
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter roll: ");
        roll = sc.nextInt();

    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("College Name: " + college);
        System.out.println();
    }
}

public class College_Students {
    public static void main(String[] args) {
        Detail ob = new Detail();
        ob.input();
        ob.show();
        ob.change();
        ob.show();
    }
}
