public class Date {
    private int day;         // instance variable
    private int month;         // -do-
    private int year;       // -do-

    void setDay(int day) {    // parameter (local variables)
        this.day = day;
    }

    int getDay() {
        return day;
    }

    void setMonth(int month) {
        this.month = month;
    }

    int getMonth() {
        return month;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getYear() {
        return year;
    }
}

// The above code generates a user-defined data type
// this keyword for ambiguity resolution
// Sanitization & validation