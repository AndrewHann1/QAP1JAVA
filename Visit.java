import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double discountRate = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double totalExpense = (1 - discountRate) * serviceExpense + (1 - DiscountRate.getProductDiscountRate(customer.getMemberType())) * productExpense;
        return totalExpense;
    }

    @Override
    public String toString() {
        return "Visit Details:\n" +
                "Customer: " + customer.getName() +
                "\nDate: " + date +
                "\nService Expense: $" + serviceExpense +
                "\nProduct Expense: $" + productExpense +
                "\nTotal Expense: $" + getTotalExpense();
    }
}
