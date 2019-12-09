//package bank;

import java.util.Scanner;

public class PromptBank {

public static void main(String[] args) {

while(true){

Scanner s=new Scanner(System.in);

System.out.println("ELIZA: Hello, my name is Eliza. What is your name? ");

System.out.print("USER: ");

String name=s.next();

System.out.println("ELIZA: Hello, "+name+". Tell me what is on your mind today in 1 sentence.");

String sentence="";

while(!sentence.equals("EXIT")){

System.out.print("USER: ");

sentence=s.next();

sentence += s.nextLine();

if(!sentence.equals("EXIT")){

String[] words = sentence.split("\\s+");

if (sentence.charAt(sentence.length() - 1)=='?'){

System.out.println("ELIZA: "+logicclass.question1(words));

}else if (sentence.charAt(sentence.length() - 1)=='!'){

sentence = sentence.substring(0,sentence.length()-1);

words = sentence.split("\\s+");

System.out.println("ELIZA: "+logicclass.question3(words));

}else{

System.out.println("ELIZA: "+logicclass.question2(words));

}

}

}

System.out.println("ELIZA: Do you want to run the session again?");

System.out.println("USER: ");

String yn=s.next().toLowerCase();

if(yn.equals("yes")){

}else{

System.out.println("ELIZA: Goodbye, until next time");

break;

}

}

}

  

}