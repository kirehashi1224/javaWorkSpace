import java.util.function.*;
public class Main6_2{
	public static int sub(int a, int b){
		return a - b;
	}
	public static void main(String[] args){
		IntBinaryOperator func = Main6_2::sub;
		int a = func.applyAsInt(5, 3);
		System.out.println("5-3��" + a);
	}
}