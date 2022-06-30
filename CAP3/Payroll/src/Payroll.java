public class Payroll {
    private final double hourly;
    private final double workedHours1;
    private final double workedHours2;
    private final double workedHours3;
    private final double workedHours4;

    Payroll(double hourly, double workedHours1, double workedHours2, double workedHours3, double workedHours4) {
        this.hourly = hourly;
        this.workedHours1 = workedHours1;
        this.workedHours2 = workedHours2;
        this.workedHours3 = workedHours3;
        this.workedHours4 = workedHours4;
    }
    public double weekPay(double workedHours) {
        if (workedHours > 40 && workedHours < 46) {
            return workedHours * 1.5 * hourly;
        } else if (workedHours > 45) {
            return workedHours * 2 * hourly;
        } else {
            return workedHours * hourly;
        }
    }

    public double monthGrossPay() {
        double week1 = weekPay(workedHours1);
        double week2 = weekPay(workedHours2);
        double week3 = weekPay(workedHours3);
        double week4 = weekPay(workedHours4);
        return week1 + week2 + week3 + week4;
    }

    public double discountByTaxes() {
        if(monthGrossPay() < 1000) {
            return monthGrossPay() * 0.1;
        } else {
            return monthGrossPay() * 0.15;
        }
    }

    public double netEarnings() {
        return monthGrossPay() - discountByTaxes();
    }
}
