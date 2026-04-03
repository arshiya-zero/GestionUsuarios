public class IncomeCalculator {

    public double calculateNetSalary(double grossSalary) {
        return grossSalary - (grossSalary * 0.21);
    }

    public double calculateTotalIncome(double grossSalary, double inheritance, double wallapopSales) {
        double netSalary = calculateNetSalary(grossSalary);
        return netSalary + inheritance + wallapopSales;
    }
}