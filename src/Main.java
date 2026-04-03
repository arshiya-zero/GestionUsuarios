public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario("Arshia", "arshiyam753357@gmail.com", 2000.0);

        System.out.println("Initial user data:");
        user.showUserInfo();

        user.setName("Arshia");
        user.setEmail("arshiyam753357@gmail.com");
        user.setGrossSalary(2500.0);

        System.out.println("\nUpdated user data:");
        user.showUserInfo();

        IncomeCalculator calculator = new IncomeCalculator();

        double netSalary = calculator.calculateNetSalary(user.getGrossSalary());
        double totalIncome = calculator.calculateTotalIncome(user.getGrossSalary(), 500.0, 300.0);

        System.out.println("\nIncome information:");
        System.out.println("Net salary: " + netSalary);
        System.out.println("Total income: " + totalIncome);
    }
}