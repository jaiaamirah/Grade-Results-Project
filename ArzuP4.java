//import statement
import java.util.Scanner;

//class and method header
public class ArzuP4{
public static void main (String args[]){

//keyboard object
Scanner kb = new Scanner(System.in);

//student objects
CourseGrades student1 = new CourseGrades();
CourseGrades student2 = new CourseGrades();

//try catch block

try {
// Student 1 graded activity input
System.out.println("-----Student 1-----");
            
System.out.print("Enter lab activity score: ");
double score1 = kb.nextDouble();
GradedActivity lab1 = new GradedActivity();
lab1.setScore(score1);
student1.setLab(lab1);

//student 1 pass fail input           
System.out.print("Enter number of questions missed on pass/fail exam: ");
int pass1 = kb.nextInt();
PassFailExam pf1 = new PassFailExam(pass1);
student1.setPassFailExam(pf1);

//student 1 essay input
System.out.print("Enter essay grammar score: ");
int g1 = kb.nextInt();

System.out.print("Enter essay spelling score: ");
int s1 = kb.nextInt();

System.out.print("Enter essay correct length score: ");
int cL1 = kb.nextInt();

System.out.print("Enter essay content score: ");
int c1 = kb.nextInt();

Essay essay1 = new Essay(g1, s1, cL1, c1);
student1.setEssay(essay1);
                                                                                                 
//student 1 final exam input
            
System.out.print("Enter number of questions missed on final exam: ");
int final1 = kb.nextInt();
FinalExam exam1 = new FinalExam(final1);
student1.setFinalExam(exam1);
            
            
 
//student 2 label      
System.out.println("\n-----Student 2-----");
 
//student 2 graded activity input           
System.out.print("Enter lab activity score: ");
double score2 = kb.nextDouble();
GradedActivity lab2 = new GradedActivity();
lab2.setScore(score2);
student2.setLab(lab2);

//student 2 pass fail input
System.out.print("Enter number of questions missed on pass/fail exam: ");
int pass2 = kb.nextInt();
PassFailExam pf2 = new PassFailExam(pass2);
student2.setPassFailExam(pf2);

//student 2 essay input           
System.out.print("Enter essay grammar score: ");
int g2 = kb.nextInt();

System.out.print("Enter essay spelling score: ");
int s2 = kb.nextInt();

System.out.print("Enter essay correct length score: ");
int cL2 = kb.nextInt();

System.out.print("Enter essay content score: ");
int c2 = kb.nextInt();

Essay essay2 = new Essay(g2, s2, cL2, c2);
student2.setEssay(essay2);

//student 2 final exam input 
System.out.print("Enter number of questions missed on final exam: ");
int final2 = kb.nextInt();

FinalExam exam2 = new FinalExam(final2);
student2.setFinalExam(exam2);
            
// Print results
System.out.println("\n-----Student 1 Results-----");
System.out.println(student1.toString());
            
System.out.println("\n-----Student 2 Results-----");
System.out.println(student2.toString());
            
        } catch (Exception e) 
        {
            System.out.println("Invalid input entered: " + e.getMessage());
        }
        
        
    }
}

























