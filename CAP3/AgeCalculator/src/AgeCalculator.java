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

    public int monthCalc(int birthYear, int currYear, int birthMonth, int currMonth, int birthDay, int currDay) {
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


}
