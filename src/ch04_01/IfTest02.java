package ch04_01;

public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 81;
		
		if(score >= 90) {
			System.out.println("수");	
		}else if (score >= 80) {
			System.out.println("우");
		}else if (score >= 70) {
			System.out.println("미");
		}else if (score >= 60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
	}

}
