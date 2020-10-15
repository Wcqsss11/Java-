Java-实验-1
一.实验内容
1.基本要求是完成教材p 110页的第四题关于PC、存储器、CPU及其他模拟的程序。
2.附加要求是：
    类中定义不少于两个构造方法；
    每个类定义不少于两个属性，且属性的类型应该多样化；
    根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性“的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断
    尝试把本次实验的多个类放置在不同的包中，体会修饰符的用法.

二.实验设计
    1.设置硬盘对象，设置amount方法，运用public方法。
    public class HardDisk {
    	int amount;
     	int getAmount(){
    		return amount;
    			}
    	public void setAmount(int amount){
	      	this.amount=amount;
	    		}
       }
    2.设置CPU对象，运用public方法。public class CPU {int speed;String name;}
     	
   	int getSpeed(){
   		return speed;		
  	}
  	String getName(){
	  	return name;
	  }

三.核心方法
   void setCPU(CPU cpu){
		this.cpu=cpu;		
	}
	void setHardDisk(HardDisk HD){
		this.HD=HD;
	}
	void show(){
		System.out.println("CPUËÙ¶È:"+cpu.getSpeed());
		System.out.println("Ó²ÅÌÈÝÁ¿:"+HD.getAmount());
		System.out.println("CPUÃû×Ö:"+cpu.getName());
	}
  
四.实验结果
  cpu.setSpeed(2200);
  cpu.setName("酷睿")
  HD.setAmount(200);

五.实验感想
  1.通过这次实验学习到了public;private;default的的不同.
  2.练习了重构
  3.学习了构建方法
