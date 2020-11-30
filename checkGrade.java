import java.util.Scanner;

	public class checkGrade{
		public static void main(String [] args){
	
		Scanner studentGrade = new Scanner(System.in);

		System.out.println("please input your score");
		int score = studentGrade.nextInt();

		if(score >= 90){
		System.out.println("Excellent your grade is an A.");
		}
		else
		if (score >= 65){
		System.out.println("Very good! your grade is an B");
		}
		else
		if(score >= 50){
		System.out.println("Good! your grade is s C");
		}
		else
		if(score >= 40){
		System.out.println("! wimp your grade is D");
		}
		else
		if (score < 40){
		System.out.println("ooops you failed your grade is E");
		}

	}


}