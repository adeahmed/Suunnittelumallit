package Facade;

public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    private long  BootAddress = 0;
    private long BootSector = 0;
    private int SectorSize = 200;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = Memory.getInstance();
        this.hardDrive = new HardDrive();

    }

    public void start(){
        cpu.Freeze();
        memory.Load(BootAddress, hardDrive.Read(BootSector, SectorSize));
        cpu.Jump(BootAddress);
        cpu.Execute();
    }

}
