package Facade;

class CPU {
    private long position;
    private Memory memory = Memory.getInstance();



public void Freeze(){
    System.out.println("Freeze CPU");
    }
public void Jump(long position ){

    System.out.println("Jump CPU");
    this.position = position;


}
public void Execute(){
    System.out.println("Execute CPU");
    String data = memory.read(position);
    for (int i = 0; i < data.length(); i++){
        System.out.printf("Executing instruction: %02x%n ", (int) data.charAt(i));
    }

}
}
