package app;

import model.*;
import manager.SecurityManager;
import scanner.*;

public class Program
{
	public static void main(String args[]) 
    {
        KeyCardScanner keyCardScanner = new KeyCardScanner();
        PinCodeScanner pinCodeScanner = new PinCodeScanner();
        KeyCardCheck keyCardCheck = new KeyCardCheck(keyCardScanner);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(pinCodeScanner);
        SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
        manager.Check();
    }
}
