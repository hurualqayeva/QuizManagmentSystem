/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizwithoutui;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


/**
 *
 * @author hurua
 */
 

public class questions{
String prompt;
String answer;
 static String  name;



    questions(String prompt,String answer) {
        this.prompt=prompt;
    this.answer=answer;
   
    }

  public void StudentName(){
       Scanner myObj = new Scanner(System.in);
 name= myObj.nextLine();
      System.out.println(name+",Let's get started. GOOD LUCK!");
  }
    
  public void Test() {
String q1 = "1.Java was originally developed by: \n"
          + "(a)Linus Torvalds\n(b)James Gosling\n(c)Dennis Ritchie\n";

    String q2 = "2.C programming language was developed in:?\n"
          + "(a)1969\n(b)1972\n(c)1984\n";

    String q3 = "3.How can we declare variable in JavaScript ?\n"
          + "(a)var\n(b)int\n(c)String\n";
    String q4 = "4.One of them is not programming language?\n"
          + "(a)Jquery\n(b)Java\n(c)JavaScript\n";

String q5 = "5.One of them is Java IDE:\n"
          + "(a)PyCharm\n(b)DevC++\n(c)IntelliJ\n";




    questions [] questions = {
            new questions(q1, "b"),
            new questions(q2, "b"),
            new questions(q3, "a"),
            new questions(q4, "a"),
            new questions(q5, "c"),
            
    };
    

    takeTest(questions);}
    
   public static void takeTest(questions [] questions){
    int score = 0;
   
Scanner keyboardInput= new Scanner(System.in);

        for (questions question : questions) {
            System.out.println(question.prompt);
            String answer = keyboardInput.nextLine();
            if (answer.equalsIgnoreCase(question.answer)) {  
         
                score++;
            }
        }
    System.out.println("You got " + score + "/" + questions.length);
    if(score==4 || score==5 ){
        System.out.println(toUpperCase(name)+" ,Perfect job!You passed the exam.");
    }

   if(score<=3 && score>=0){
     System.out.println(toUpperCase(name)+" , You didn't pass the exam. Take the test one more time!");
}

   }

  
  
    }




 
    
    

