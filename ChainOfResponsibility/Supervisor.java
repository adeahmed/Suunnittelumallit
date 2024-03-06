package ChainOfResponsibility;

class Supervisor extends Handler {
    @Override
    void handleRequest(double amount) {
        if (amount <= 0.02) {
            System.out.println("Supervisor approved the raise.");
        } else if (successor != null) {
            successor.handleRequest(amount);
        }
    }
}

