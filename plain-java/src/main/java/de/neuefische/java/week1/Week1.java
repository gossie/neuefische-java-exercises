package de.neuefische.java.week1;

public class Week1 {

    private static final String WARNING_MESSAGE = "Zu viele Personen";
    private static final String OK_MESSAGE = "Maximale Personenzahl nicht überschritten";

    public static void main(String... args) {
        System.out.println("Hallo Kurs!");

        int number1 = 7;
        var number2 = 17;

        var result = number1 + number2;
        System.out.println(result);
        System.out.println("Summe: " + result);

        var biggerNumber = 13;
        var smallerNumber = 2;
        var equalNumber = 13;

        if (biggerNumber > smallerNumber) {
            System.out.println(biggerNumber + " ist größer als " + smallerNumber);
        }

        if (smallerNumber < biggerNumber) {
            System.out.println(smallerNumber + " ist kleiner als " + biggerNumber);
        }

        if (biggerNumber == equalNumber) {
            System.out.println(biggerNumber + " und " + equalNumber + " sind gleich");
        }

        if (smallerNumber != equalNumber) {
            System.out.println(smallerNumber + " und " + equalNumber + " sind nicht gleich");
        }

        System.out.println(convertSum(sum(50, 50)));
    }

    public static int sum(int value1, int value2) {
        return value1 + value2;
    }

    public static String convertSum(int sum) {
        return "Summe : " + sum;
    }

    public static boolean checkValue(int value) {
        return value > 100;
    }

    public static String checkNumberOfCustomers(int numberOfCustomers, String alarmLevel) {
        if ("rot".equals(alarmLevel)) {
            if (numberOfCustomers > 0) {
                return WARNING_MESSAGE;
            } else {
                return OK_MESSAGE;
            }
        }

        if ("gelb".equals(alarmLevel)) {
            if (numberOfCustomers <= 30) {
                return OK_MESSAGE;
            } else {
                return WARNING_MESSAGE;
            }
        }

        if ("grün".equals(alarmLevel)) {
            if (numberOfCustomers <= 60) {
                return OK_MESSAGE;
            } else {
                return WARNING_MESSAGE;
            }
        }

        throw new IllegalArgumentException();
    }

    /*
    public static int fac(int number) {
        int result = 1;
        for (int i=1; i<=number; i++) {
            result *= i;
        }
        return result;
    }
     */

    /*
    public static int fac(int number) {
        int result = 1;
        while (number > 0) {
            result *= number;
            --number;
        }
        return result;
    }
     */

    public static int fac(int number) {
        if (number == 0) {
            return 1;
        }
        return fac(number - 1) * number;
    }

    public static String[] createStudents(int numberOfStudents) {
        var students = new String[100];
        for (int i=0; i<students.length; i++) {
            students[i] = "Student " + i;
        }
        return students;
    }

    public boolean checkSize(String input) {
        return input.length() > 20 && input.contains("fancy");
    }
}
