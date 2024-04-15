package ChainOfResponsibility;

class DepartmentHead extends Handler {
    @Override
    void handleRequest(double amount) {
        if (amount > 0.02 && amount <= 0.05) {
            System.out.println("Department Head approved the raise.");
        } else if (successor != null) {
            successor.handleRequest(amount);
        }
    }
}