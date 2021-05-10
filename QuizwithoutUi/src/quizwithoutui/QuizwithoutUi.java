/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
;

package quizwithoutui;




/**
 *
 * @author hurua
 */
public class QuizwithoutUi  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       
     String prompt="",answer="";

      System.out.println("------Test created by Huru Alqayeva,ALL RIGHT RESERVED------\n");
       System.out.println("Enter your Name and Surname\n");
     questions Q=new questions(prompt,answer);
     Q.StudentName();
      Q.Test();
        
       }}
    

