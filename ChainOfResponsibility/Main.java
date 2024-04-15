package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        DepartmentHead departmentHead = new DepartmentHead();
        CEO ceo = new CEO();

        supervisor.setSuccessor(departmentHead);
        departmentHead.setSuccessor(ceo);

        supervisor.handleRequest(0.34);
        supervisor.handleRequest(0.02);
        supervisor.handleRequest(0.01);

    }
}

