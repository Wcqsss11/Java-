# Java-实验-1
##  计G202 王超琦 2020322087
## 一.实验内容
- 1.基本要求是完成教材p 110页的第四题关于PC、存储器、CPU及其他模拟的程序。
- 2.附加要求是：
 ①类中定义不少于两个构造方法；
 ②每个类定义不少于两个属性，且属性的类型应该多样化；
 ③根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性“的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断
 ④尝试把本次实验的多个类放置在不同的包中，体会修饰符的用法.

## 二.实验设计
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

## 三.核心方法
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
  
## 四.实验结果
    cpu.setSpeed(2200);
    cpu.setName("酷睿")
    HD.setAmount(200);

## 五.实验感想
- 通过这次实验学习到了public;private;default的区别。
- public（接口访问权限）：Java语言中访问限制最宽的修饰符，一般称之为“公共的”。被其修饰的类、属性以及方法不仅可以跨类访问，而且允许跨包（package）访问。
- private（你无法访问）：Java语言中对访问权限限制的最窄的修饰符，一般称之为“私有的”。被其修饰的类、属性以及方法只能被该类的对象访问，其子类不能访问，更不能允许跨包访问。
- default（包访问权限）：即不加任何访问修饰符，通常称为“默认访问模式“。该模式下，只允许在同一个包中进行访问。 
