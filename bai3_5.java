public class bai3_5 {
    private int year;
    private int month;
    private int day;

    private static final String[] MONTHS = {"Jan","Fed","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    private static final String[] DAYS = {"Sunday","Monday","Tuesday","Wednesday","Thurday","Friday","Saturday"};
    private static final int[] DAYS_IN_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};

    public bai3_5(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        return day >= 1 && day <= maxDay;
    }
    public static int getDayOfWeek(int year, int month, int day) {
        int[] monthTable = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int century = (year / 100) % 4;
        int yearOfCentury = year % 100;
        int leapYearCorrection = (yearOfCentury + (yearOfCentury / 4)) % 7;
        int monthCorrection = monthTable[month - 1];
        int leapDayCorrection = (isLeapYear(year) && (month == 1 || month == 2)) ? -1 : 0;

        return (day + leapYearCorrection + monthCorrection + leapDayCorrection + century) % 7;
    }
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    public void setYear(int year) {
        if (year < 1 || year > 9999) throw new IllegalArgumentException("Invalid year!");
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) throw new IllegalArgumentException("Invalid month!");
        this.month = month;
    }

    public void setDay(int day) {
        if (!isValidDate(year, month, day)) throw new IllegalArgumentException("Invalid day!");
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) throw new IllegalArgumentException("Invalid date!");
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return DAYS[dayOfWeek] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }
    public bai3_5 nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else if (month == 12 && day == 31) {
            year++;
            month = 1;
            day = 1;
        } else {
            month++;
            day = 1;
        }
        return this;
    }
    public bai3_5 previousDay() {
        if (day > 1) {
            day--;
        } else if (month == 1 && day == 1) {
            year--;
            month = 12;
            day = 31;
        } else {
            month--;
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        }
        return this;
    }
    public bai3_5 nextMonth() {
        if (month == 12) {
            year++;
            month = 1;
        } else {
            month++;
        }
        if (!isValidDate(year, month, day)) {
            day = DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }
    public bai3_5 previousMonth() {
        if (month == 1) {
            year--;
            month = 12;
        } else {
            month--;
        }
        if (!isValidDate(year, month, day)) {
            day = DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }
    public bai3_5 nextYear() {
        year++;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }
    public bai3_5 previousYear() {
        year--;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }
}

