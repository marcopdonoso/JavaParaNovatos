public class AgeCalculator {
    private final int birthYear;
    private final int birthMonth;
    private final int birthDay;
    private final int currentYear;
    private final int currentMonth;
    private final int currentDay;

    AgeCalculator(int birthYear, int birthMonth, int birthDay, int currentYear, int currentMonth, int currentDay) {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.currentYear = currentYear;
        this.currentMonth = currentMonth;
        this.currentDay = currentDay;
    }

    public int ageCalc() {
        int ageInYears;
        ageInYears = currentYear - birthYear;
        if (currentMonth > birthMonth) {
           return ageInYears;
        } else if (currentMonth < birthMonth) {
            ageInYears--;
            return ageInYears;
        } else {
            if (currentDay > birthDay) {
                return ageInYears;
            } else if (currentDay < birthDay) {
                ageInYears--;
                return ageInYears;
            } else {
                return ageInYears;
            }
        }
    }
}
