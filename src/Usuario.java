public class Usuario {
    private String name;
    private String email;
    private double grossSalary;

    public Usuario(String name, String email, double grossSalary) {
        this.name = name;
        this.email = email;
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void showUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gross salary: " + grossSalary);
    }
}