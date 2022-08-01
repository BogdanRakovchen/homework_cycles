public class Main {
    public static void main(String[] args) {

        // excersice 1

        System.out.println("");

        System.out.println("Задание №1");

        int idx = 1;

        while (idx <= 10) {
            System.out.println(idx);
            idx++;
        }

        System.out.println("");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);

        }

        // excersice 2

        System.out.println("");

        System.out.println("Задание №2");

        int numberDayOfFriday = 5;
        int daysOfTheWeek = 7;

        System.out.println("Сегодня пятница " + numberDayOfFriday + " число. Необходимо подготовить отчет");
        while ( numberDayOfFriday <= 31 ) {
            numberDayOfFriday += daysOfTheWeek;
            if(numberDayOfFriday == 33) {
                break;
            }
            System.out.println("Сегодня пятница " + numberDayOfFriday + " число. Необходимо подготовить отчет");
        }

        // excersice 3

        System.out.println("");

        System.out.println("Задание №3");


        int flightСometWithEarth = 79;
        int currentYear = 2022;

        int lastYearFlightCommet = 200;


        int computedYear = currentYear - lastYearFlightCommet;

        while (computedYear <= currentYear) {
            computedYear += flightСometWithEarth;
            System.out.println(computedYear);
        }


//        -----------------------------
    }
}