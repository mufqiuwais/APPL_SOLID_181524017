package scanner;

import java.util.Scanner;

import securityInterface.IRequestPinCode;

public class PinCodeScanner implements IRequestPinCode{
	
	Scanner scan = new Scanner(System.in);
	@Override
	public int RequestPinCode() {
		System.out.print("Enter your pin code : ");
        return scan.nextInt();
	}

}
