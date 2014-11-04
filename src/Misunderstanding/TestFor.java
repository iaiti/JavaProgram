package Misunderstanding;

public class TestFor {
	public static void main(String[] args) {
		int i = 1;
		//空白处无需再定义，i已经定义
		for (; i < 10; i++) {
			System.out.println(i);
		}
		for (i=2; i < 10; i++) {
			System.out.println(i);
		}
	}
}
