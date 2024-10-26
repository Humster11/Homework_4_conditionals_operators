public class task_7 {
    public static void main(String[] args) {
        int one = 12;
        int two = 1;
        int three = 2;

        if (one > two && one > three) {
            System.out.println("Число one равное " + one + " большее из трёх");
        }
        if ((two > one && two > three)) {
            System.out.println("Число two равное " + two + " большее из трёх");
        }
        if ((three > one && three > two)) {
            System.out.println("Число three равное " + three + " большее из трёх");
        }
    }
}
