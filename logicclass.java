//package bank;

public class logicclass {

public static String get(){

return "gopal";

}

public static String question1(String[] words){

String result= "Does "+words[0]+" bother you? How about "+words[(words.length)-1];

return result;

}

public static String question2(String[] words){

String result= words[0]+" seems important to you, so does "+words[(words.length)-1]+" Please tell me more";

return result;

}

public static String question3(String[] words){

String result= "WOW! Dramatic! "+words[0]+" and "+words[(words.length)-1]+" seems to be on your mind. Let's talk about it";

return result;

}

}