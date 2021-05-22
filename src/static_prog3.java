import java.util.Scanner;
class static_progg {
    int roll;
    String name;
    static String cllg_name = "AEC";

    static void change() {
        cllg_name = "ASANSOL ENGINEERING COLLEGE";
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name=");
        name = sc.nextLine();

        System.out.println("Enter roll=");
        roll = sc.nextInt();

    }

    void show() {
        System.out.println("NAME=" + name);
        System.out.println("ROLL=" + roll);
        System.out.println("cllg_name=" + cllg_name);
    }
}

    public class static_prog3 {

        public static void main(String[] args) {
            static_progg s1 = new static_progg();
            s1.input();
            s1.show();
            s1.change();
            s1.show();
        }
    }