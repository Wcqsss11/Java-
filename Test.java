
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu = new CPU();
		HardDisk HD=new HardDisk();
		cpu.setName("ø·Ó£");
		cpu.setSpeed(2200);
		HD.setAmount(200);
		Pc pc =new Pc();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
	}

}
