package com.controlStatement;

public class SwitchCaseStatement {
	
	public static void main(String[] args) {
		
		int weekno=20;	
		switch(weekno)
		{
		case 1:System.out.println("Sunday");break;
		// if i'm not putting break command it will automatic execute the next statement without checking any case
		case 2:System.out.println("Monday");break;
		case 3:System.out.println("Tuesday");break;
		case 4:System.out.println("Wednesday");break;
		case 5:System.out.println("Thursday");break;
		case 6:System.out.println("Friday");break;
		case 7:System.out.println("Saturday");break;
		default:System.err.println(weekno+" is Invalid Week Number please provide a valid week number...");
		// this is the last statement thats why we did not mention the break 
		}
	}
}
