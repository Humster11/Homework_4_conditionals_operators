public class Task5 {
    public static void main(String[] args) {
        int age_child = 3;
        if (age_child < 5) {
            System.out.println("Если возраст ребенка равен " + age_child + " то ему нельзя кататься на аттракционе");
        }
        if (age_child >= 5 && age_child < 14) {
            System.out.println("Если возраст ребенка равен " + age_child + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age_child > 14) {
            System.out.println("Если возраст ребенка равен " + age_child + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
}
