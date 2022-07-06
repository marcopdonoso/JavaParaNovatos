public class AgeCalculator {
    public int yearsCalc(int birthYear, int currYear, int birthMonth, int currMonth, int birthDay, int currDay) {
        int ageInYears = currYear - birthYear;
        if (currMonth < birthMonth) {
            ageInYears--;
        } else if (currMonth == birthMonth && currDay < birthDay) {
            ageInYears--;
        }
        return ageInYears;
    }

    public int monthsCalc(int birthYear, int currYear, int birthMonth, int currMonth, int birthDay, int currDay) {
        int ageInYears = yearsCalc(birthYear,currYear,birthMonth,currMonth,birthDay,currDay);
        int ageInMonths = ageInYears * 12;

        if (currMonth > birthMonth) {
            ageInMonths += (currMonth - birthMonth);
        } else if (currMonth < birthMonth) {
            ageInMonths -= (birthMonth - currMonth);
        } else {
            if (currDay < birthDay) {
                ageInMonths--;
            }
        }
        return ageInMonths;
    }

    public int daysCalc(int birthYear, int currYear, int birthMonth, int currMonth, int birthDay, int currDay) {
        int ageInDays = 0;
        int[] dayPerMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = birthYear; i <= currYear; i++) {
            if (leapYear(i)) {
                ageInDays += 366;
            } else {
                ageInDays += 365;
            }
        }

        for (int i = 0; i < birthMonth - 1; i++) {
            ageInDays -= dayPerMonth[i];
            if (leapYear(birthYear) && i == 1){
                ageInDays--;
            }
        }
        ageInDays -= birthDay;

        for (int i = currMonth; i < 12; i++) {
            ageInDays -= dayPerMonth[i];
            if (leapYear(currYear) && i == 1) {
                ageInDays--;
            }
        }
        ageInDays -= (dayPerMonth[currMonth - 1] - currDay);

        return ageInDays;
    }

    public int hoursCalc(int birthYear, int currYear, int birthMonth, int currMonth, int birthDay, int currDay) {
        return daysCalc(birthYear,currYear,birthMonth,currMonth,birthDay,currDay) * 24;
    }

    public int minutesCalc(int birthYear, int currYear, int birthMonth, int currMonth, int birthDay, int currDay) {
        return hoursCalc(birthYear,currYear,birthMonth,currMonth,birthDay,currDay) * 60;
    }

    public int secondsCalc(int birthYear, int currYear, int birthMonth, int currMonth, int birthDay, int currDay) {
        return minutesCalc(birthYear,currYear,birthMonth,currMonth,birthDay,currDay) * 60;
    }

    public boolean leapYear(int year) {
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                leap = true;
            } else if (year % 400 == 0) {
                leap = true;
            }
        }
        return leap;
    }


}
