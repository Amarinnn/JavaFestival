import java.util.Scanner;

public class molu {
	public static void main(String[] args) {
		String[] subject = { "java", "web ", "and"};

        int[] score = new int[3];

        int sum = 0;
        int avg = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {
            System.out.print(subject[i] +"점수: ");
            score[i] = sc.nextInt();
            sum += score[i];
        }
        for(int i = 0; i<subject.length; i++) {
            System.out.println(subject[i] +":"+ score[i]);
        }
        System.out.println("sum: " + sum);
        System.out.println("avg: " + sum / score.length);
		
	}
}
