public class Task6 {
    public static void main(String[] args) {
        int trainCapacity = 102;
        int numberPassenger = 50;
        int seatingPlaces = 60;

        if (numberPassenger > trainCapacity) {
            System.out.println("Вагон забит, пассаижру небходимо дождаться следуюущего поезда");
        } else {
            if (numberPassenger <= seatingPlaces) {
                System.out.println("Пассажир может занять сидячее место");
            } else {
                System.out.println("Пассажир может занять только стоячее место");
            }

        }
    }
}
