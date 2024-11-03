public class bai3_4 {
    private int hour;
    private int minute;
    private int second;

    public bai3_4() {
        hour = 0;
        minute = 0;
        second = 0;
    }
    public bai3_4(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }
    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", hour , minute, second);
    }
    public bai3_4 nextSecond() {
        if (second == 59) {
            second = 0;
            return nextMinute();
        } else {
            second ++;
        }
        return this;
    }
    public bai3_4 nextMinute() {
        if (minute == 59) {
            minute = 0;
            return nextHour();
        } else {
            minute ++;
        }
        return this;
    }
    public bai3_4 nextHour() {
        if (hour == 23) {
            hour = 0;
        } else {
            hour ++;
        }
        return this;
    }
    public bai3_4 previousSecond() {
        if (second == 0) {
            second = 59;
            return previousMinute();
        } else {
            second --;
        }
        return this;
    }
    public bai3_4 previousMinute() {
        if (minute == 0) {
            minute = 59;
            return previousHour();
        } else {
            minute --;
        }
        return this;
    }
    public bai3_4 previousHour() {
        if (hour == 0) {
            hour = 23;
        } else {
            hour --;
        }
        return this;
    }
}
