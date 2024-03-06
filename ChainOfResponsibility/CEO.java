package ChainOfResponsibility;

class CEO extends Handler {
    @Override
    void handleRequest(double amount) {
        if (amount > 0.05) {
            System.out.println("CEO approved the raise.");
        } else if (successor != null) {
            successor.handleRequest(amount);
        }
    }
}