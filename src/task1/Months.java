package task1;

public enum Months {
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5),
    JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10),
    NOVEMBER(11), DECEMBER(12);
    private int monthNumber;

    Months(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    //getting the month by number
    public Months getMonthByNumber(int monthNumber) {
        this.monthNumber = monthNumber;
        return Months.values()[monthNumber - 1];
    }

    //getting the number by month
    public static int getNumberByMonth(String nameMonth) {
        int counter = 0;
        for (Months month : Months.values()) {
            counter++;
            if (month.toString().equalsIgnoreCase(nameMonth)) {
                break;
            } else if (counter == 12) {
                counter = 0;
            }
        }
        return counter;
    }

}
