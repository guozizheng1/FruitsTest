package com.imooc.fruits;

//Ҫ��Waxberry�಻����������
public final class Waxberry extends Fruits{
  // ˽�����ԣ���ɫ��color��
  private String color;
  

	//�������췽������ɵ��ø���Ĺ��췽����������Ը�ֵ
  public Waxberry(String shape, String taste){
      super(shape, taste);
      this.setColor(color);
  }
  
  public String getColor(){
      return color;
  }
  
  public void setColor(String color){
      this.color = color;
  }

  //������������д��face����������Ϊ����÷��**��**����ζ��������
  public final void face(){
      System.out.println("��÷��" + this.getColor() + "��" + this.getShape() + "����ζ��������");
  }
  
  
  //��д����eat����������Ϊ����÷�������У��ǳ��óԣ�
  public void eat(){
      System.out.println("��÷�������У��ǳ��óԣ�");
  }
  
  
  //��дtoString����������ı�����ʽ��ͬ�����shape,color,taste��
  public String toString(){
      return "��÷����Ϣ����ʵΪ" + this.getShape() + "��" + this.getColor() + "���������У��ǳ��ó�"; 
  }
}

