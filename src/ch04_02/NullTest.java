package ch04_02;

public class NullTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null;
		
		System.out.println(str);
		
		int[] arr = null;
		
		//System.out.println(arr[0]);
		
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동");
		
		if (a == c) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		
	}

}
