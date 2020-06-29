package scanner;

import java.util.Scanner;

import securityInterface.IRequestKeyCard;

public class KeyCardScanner implements IRequestKeyCard{
	
	Scanner scan = new Scanner(System.in);
	@Override
	public String RequestKeyCard() {
		System.out.println("Slide your key card");
        return scan.nextLine();
	}

}
