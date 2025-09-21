//Eunice Chan
//2025-09-17

import java.util.*;
public class Exercise {
    public static void main(String[] args) {

        //question 1
        //while (condition) {
        //(code);
        //}

        //question 2
        //do {
        //(code)
        //} while (condition)

        //question 3
        int m = 97, k = 0, p = 0;
        while (m<=195) {
            k = k * k + 3 * m;
            p = p + m + 1;
            m++;
        }
        System.out.println(k);
        System.out.println(p);

        //question 4
       int v = 2, kk = 0;
       double q = 3.0;
        do {
            kk = kk * kk + 3 * v;
            q = Math.sqrt(q + v +1);
            v*=3;
        } while (v<=195);
        System.out.println(kk);
        System.out.println(q);

        //question 5
        //once !done is false, or done is true, the loop ends hence making it the loop control expression

        //question 6
        //do should not have a semicolon after but a brace instead, semicolons closes the statement

        //question 7
        //infinite times as there is no update code so j will forever stay 0 and the expression will always stay true becoming an infinite loop

        //question 8
        //infinite times because 25 incremented will always be equal or greater than 25 so the expression will always stay true becoming an infinite loop

        //question 9
        //there needs to be a semicolon after assigning variable to integer, declare done as boolean, cannot have a semicolon after the brace

        //question 10 
        int i = 0, j = 0;
        while(i <= 3) {
            for(j = 0; j <=2; j++) {
        System.out.print(i + "," + j + " ");
            }
            i++;
        } //print out 0,0 0,1 0,2 1,0 1,1 1,2 2,0 2,1 2,2 3,0 3,1 3,2

        //question 11
        //break

        //question 12
        //while-loop

        //question 13
        double a = 92.801;
        int b = 0;
        do {
            b = b + 2;
            if (b>-100)
                continue;
            a+=3;
        }while(b < 6);
        System.out.println(a); //print out 92.801 because once b is added to 2 you get 2 which is greater than -100 so the loop continues skipping the following code

        //question 14 
        Scanner c = new Scanner(System.in);
        int in;
        do{
            System.out.println("Enter an integer.");
            in = c.nextInt();
            if (in!=0) {
                System.out.println(in*=in); //// print(in * in) needs to be an expression, not an assignment
            }
        }while(in!=0);


    }
}

//// missing MCQ
