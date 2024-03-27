package StringAssignment;

import java.util.Scanner;

public class StringQuestions {

	public static void main(String[] args) {
		//question 1
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb.capacity());
		
		//question2 
		  //2a
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		
		  //2b
		System.out.println(hannah.charAt(12));
		  //2c
		System.out.println(hannah.charAt(15));
		
		//question3
		"Was it a car or a cat I saw?".substring(9, 12);
		System.out.println("Was it a car or a cat I saw?".substring(9, 12));
		System.out.println("Was it a car or a cat I saw?".substring(9, 12).length());
		
		//question4
		String original = "software";

		StringBuffer result = new StringBuffer("hi");

		int index = original.indexOf('a');
		result.setCharAt(0, original.charAt(0)); //value of result is si
		System.out.println(result);
		result.setCharAt(1, original.charAt(original.length()-1)); //value of result is se
		System.out.println(result);
		result.insert(1, original.charAt(4)); //value of result is swe
		System.out.println(result);
		result.append(original.substring(1,4)); //value of result is sweoft
		System.out.println(result);
		result.insert(3, (original.substring(index, index+2) + " ")); //value of result is swear soft
		System.out.println(result);
		
		//EXERCISE 
		//Question1
		   //way 1
		String hi = "Hi, ";
        String mom = "mom.";
        String joined=hi.concat(mom); 
        System.out.println(joined);
          
           //way 2
        StringBuffer sbb=new StringBuffer("Hi, ");
        String sbb1="mom. ";
        sbb.append(sbb1);
        System.out.println(sbb);
        
        //Question2
        // program to compute initials from full name
        // this commented part prints initial from pre defined input
        
//         String fullname="Thirunilainayagi Thiruvirkolam";
//         StringBuffer initial=new StringBuffer("T");
//         System.out.println(initial);
//         initial.append(fullname.charAt(17));
//         System.out.println("Initial for the name Thirunilainayagi Thiruvirkolam is :"+initial);
               
        String fullname="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name");
        fullname=sc.nextLine();
        StringBuffer  initial= new StringBuffer();
        initial.append(fullname.charAt(0));
        for (int i=0;i<fullname.length();i++) {
        	if (fullname.charAt(i)==' ') {
        		initial.append(fullname.charAt(++i));
        	}
        }
        System.out.println("Initial is "+initial);
        
        
        //Question 3
        
        

	}

}
