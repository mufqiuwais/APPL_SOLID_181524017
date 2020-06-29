package app;

import java.util.ArrayList;

import model.*;
import station.RechargeStation;

public class Program {
	public static void main(String args[])
    {
        Employee employee1 = new Employee("0203132");
        Employee employee2 = new Employee("0392103");
        Robot robot1 = new Robot("1232344", 5000);
        RechargeStation rechargeStation = new RechargeStation();
        
        employee1.Work(15);
        employee2.Work(20);
        robot1.Work(24);
        
        employee1.sleep();
        employee2.sleep();
        rechargeStation.Recharge(robot1);
    }
}
