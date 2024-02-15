import java.util.*;
import java.lang.*;


public class a2 implements Runnable {
    
    String nm;

    a2(String nm){
        this.nm=nm;

    }
    
    public void run(){

        System.out.print("\n");
        for (int i=100;i>0;--i){

            System.out.print("   "+i+"  ");

        }
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
         
            
            e.printStackTrace();
        }
        System.out.print("\n  Thread old name : "+Thread.currentThread().getName());

        Thread.currentThread().setName(nm);
        System.out.print("\n Thread new name : "+Thread.currentThread().getName());

    }

    

    public static void main (String a[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("\n Enter new Thread  name : ");
        String s=sc.next();

        a2 t=new a2(s);
        Thread th=new Thread(t);
        th.start();
    }
    
}
