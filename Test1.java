package Test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập số thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int secondNumber = scanner.nextInt();
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);

	}

}
