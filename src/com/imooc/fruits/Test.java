package com.imooc.fruits;

public class Test {
	public static void main(String[] args) {
		// ʵ����2��������󣬴���������ͬ�Ĳ���ֵ
		Fruits f1 = new Fruits("Բ��", "��������");
		Fruits f2 = new Fruits("Բ��", "��������");
		// ���ø���eat����
		f1.eat();
		// ������дequals�������ж����������Ƿ����
		boolean flag = f1.equals(f2);
		System.out.println("fru1��fru2�����ñȽ�" + flag);

	System.out.println("��������������������������������������������������������������������������������");
		// ʵ����������󣬲�������ز���ֵ
		Waxberry w1 = new Waxberry("Բ��", "��������", "�Ϻ�ɫ");

		// ��������face������eat����
		w1.face();
		w1.eat();

		// ������дtoString�������������������Ϣ
		System.out.println(w1.toString());

		System.out.println("��������������������������������������������������������������������������������������������");
		// ʵ����Banana����󣬲�������ز���ֵ
		Banana b1 = new Banana("�̶���Բ", "����", "���˽�");

		// ���������advantage���������ط���
		b1.advantage();
		b1.advantage("��ɫ");
	}

}
