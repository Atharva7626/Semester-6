import java.util.*;
import java.lang.*;

public class a2 implements Runnable {
    
    int a[]=new int[1000];


    public void run(){
        
    }
    public static void main(String args []){

        a2 t=new a2();
        Thread th=new Thread(t);
        th.start();

        a2 t1=new a2();
        Thread th1=new Thread(t1);
        th1.start();

        a2 t2=new a2();
        Thread th2=new Thread(t2);
        th2.start();

        a2 t3=new a2();
        Thread th3=new Thread(t3);
        th3.start();
        
        a2 t4=new a2();
        Thread th4=new Thread(t4);
        th4.start();

        a2 t5=new a2();
        Thread th5=new Thread(t5);
        th5.start();

        a2 t6=new a2();
        Thread th6=new Thread(t6);
        th6.start();

        a2 t7=new a2();
        Thread th7=new Thread(t7);
        th7.start();

        a2 t8=new a2();
        Thread th8=new Thread(t8);
        th8.start();

        a2 t9=new a2();
        Thread th9=new Thread(t9);
        th9.start();
/*
        a2 t=new a2();
        Thread th=new Thread(t);
        th.start();
 */
        


    }
}
