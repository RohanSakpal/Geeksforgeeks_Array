import java.util.*;
import java.lang.*;
import java.io.*;

class LongestName {
	public static void main (String[] args) {
	    
		Scanner s= new Scanner(System.in);
		String[] name = new String[5];
		System.out.print("enter 5 name");
		name[0] = s.nextLine();
		name[1] = s.nextLine();
		name[2] = s.nextLine();
		name[3] = s.nextLine();
		name[4] = s.nextLine();
		String lengthyName = "";
		for(String name : names){
			if(name != null && name.trim().length() > lengthyName.length()){
				lengthyName = name;
			}
		}
		System.out.println("Longest name is "+lengthyName);
	}
}