package com.imooc.fruits;

public class Test {
	public static void main(String[] args) {
		// 实例化2个父类对象，传入两组相同的参数值
		Fruits f1 = new Fruits("圆形", "酸甜适中");
		Fruits f2 = new Fruits("圆形", "酸甜适中");
		// 调用父类eat方法
		f1.eat();
		// 测试重写equals方法，判断两个对象是否相等
		boolean flag = f1.equals(f2);
		System.out.println("fru1和fru2的引用比较" + flag);

	System.out.println("————————————————————————————————————————");
		// 实例化子类对象，并传入相关参数值
		Waxberry w1 = new Waxberry("圆形", "酸甜适中", "紫红色");

		// 调用子类face方法和eat方法
		w1.face();
		w1.eat();

		// 测试重写toString方法，输出子类对象的信息
		System.out.println(w1.toString());

		System.out.println("——————————————————————————————————————————————");
		// 实例化Banana类对象，并传入相关参数值
		Banana b1 = new Banana("短而稍圆", "香甜", "仙人蕉");

		// 调用子类的advantage和它的重载方法
		b1.advantage();
		b1.advantage("黄色");
	}

}
