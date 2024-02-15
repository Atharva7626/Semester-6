import java.util.*;
import java.lang.*;
import java.lang.management.ThreadInfo;



class a1 implements Runnable{

    String msg;
    int n;
    a1(String msg,int n){
        this.msg=msg;
        this.n=n;
    }


    public void run(){
        
        for (int i=0;i<n;++i)
        {  
             System.out.print("\n Iteration : "+(i+1)+" Message : "+msg);


        }
    }

    public static  void main (String a[]){
        
        Scanner sc=new Scanner(System.in);

       /*
        System.out.print("\n Enter how many times Thread Run : ");
        int n=sc.nextInt();

        System.out.print("\n Enter text for  Thread  : ");
        String msg=sc.next();
        */

        a1 t=new a1("COVID19",10);
        Thread th=new Thread(t);
         th.start();
        System.out.print("\n ThreadId : "+(th.getId()));
        
        a1 t2=new a1("LOCKDOWN2020",20);
        Thread th2=new Thread(t2);
         th2.start();
        System.out.print("\n ThreadId : "+(th2.getId()));

        a1 t3=new a1("VACCINATED2021",30);
        Thread th3=new Thread(t3);
         th3.start();
        System.out.print("\n ThreadId : "+(th3.getId()));




    }
}