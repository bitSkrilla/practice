Last login: Thu May  1 19:14:36 on ttys001
oghr:~ kaltrip$ ls
Desktop				homework0.class
Documents			homework0.java
Downloads			homework0backup
Library				homework1.class
Movies				homework1.java
Music				jav0
Pictures			repodep0t
Public				schoolStuff
VirtualBox VMs			statPiratesVSNinjas.java
git
oghr:~ kaltrip$ cd Documents/
oghr:Documents kaltrip$ ls
12123.pages
CH.5 Summary.docx
CH.5 Summary.pages
Math146
NAPR.txt
Photo on 5-1-14 at 4.06 AM #2.jpg
Photo on 5-1-14 at 5.09 AM.jpg
Takaki Chp 9_14 Summary Assignment 2 final.pdf
Takaki Chp 9_14 Summary Assignment 2.pages
Takaki Chp 9_14 Summary Assignment 2fina.docx
Takaki Chp2 Summary Assignment copy.pages
Takaki Chp2 Summary Assignment.pages
Takaki Chp2 Summary Assignment11.docx
Takaki Chp4 Summary Assignment (1).docx
Takaki Chp4 Summary Assignment (1).pages
Takaki Chp5 Summary Assignment (2).pages
Untitled.pages
chapter 3 questions.pages
cs142
homework0
homework121.docx
homework121social.docx
homework142
nativeAmericanPR.docx
sensoy and deangelo ch1.docx
sensoy and deangelo ch1.pages
takaki ch1.pages
workspace
workspace2
oghr:Documents kaltrip$ cd homework
-bash: cd: homework: No such file or directory
oghr:Documents kaltrip$ cd homework142
oghr:homework142 kaltrip$ ls
Employee.java	bin		homework2.java	src
oghr:homework142 kaltrip$ vi homework2.java 

import java.util.Scanner;
import java.io.*;
import java.util.IllegalFormatException;

public class homework2 {




        public static void main(String[] args) throws IOException {
                // TODO Auto-generated method stub
                int employeeCount;
                Scanner user_input = new Scanner(System.in);
                do {
                        System.out.println("How many Employees would you like to process?");
                        while (!user_input.hasNextInt()) {
                                System.out.println("That's not a number.");
                                user_input.next();
                        }
                        employeeCount = user_input.nextInt();
                } while (employeeCount <= 0);
                Employee Employees[] = new Employee[employeeCount];



                String employees[];

                Employee emp1 = new Employee();

        }




        //raiseSalary(double)

}


