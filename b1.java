import java.util.*;
import java.lang.*;

public class b1 {
    
    

   public class word implements Runnable{

    int array[]=new int[1000];

    int sum1,avg,st,en;

    word(int st,int en){
        this.st=st;
        this.en=en;

    }

     
    public int sum(int array[],int st,int en){
        
        int s=0;
        for (int i=st;i<en;i++)
            s+=array[i];
        return s;
    }


    public void run(){
        // int it=0;
        // int chunk=100;
        // sum1=sum(array,);
    }

   } 


    public static void main(String[] args) throws InterruptedException {
        int array[]=new int[1000];
        Thread[]  t=new Thread[10];








        for (int i=0;i<1000;i++){
            Random random = new Random();
            array[i]=random.nextInt(100);
        } 


        for (int i=0;i<10;i++){

            int it=0;
        int chunk=100;
            t[i]=new Thread(new word(it+chunk,(it+1)*chunk));
            t[i].start();

        }

        for (Thread t1:t){
            t1.join();
        }
    }
}


/*
 * 
 * 
 * 
 * 
 * import java.util.Random;

public class SumAverageMultiThread {

    private static final int ARRAY_SIZE = 1000;
    private static final int THREAD_COUNT = 10;
    private static final int CHUNK_SIZE = ARRAY_SIZE / THREAD_COUNT;

    private static int[] randomArray = generateRandomArray(ARRAY_SIZE);
    private static int totalSum = 0;

    public static void main(String[] args) throws InterruptedException {
        // Creating an array to hold the threads
        Thread[] threads = new Thread[THREAD_COUNT];

        // Creating and starting the threads
        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * CHUNK_SIZE;
            int endIndex = (i + 1) * CHUNK_SIZE;
            threads[i] = new Thread(new Worker(startIndex, endIndex));
            threads[i].start();
        }

        // Waiting for all threads to finish using join
        for (Thread thread : threads) {
            thread.join();
        }

        // Calculating the average
        double average = (double) totalSum / ARRAY_SIZE;

        // Displaying the results
        System.out.println("Total Sum: " + totalSum);
        System.out.println("Average: " + average);
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Adjust the bound as needed
        }
        return array;
    }

    static class Worker implements Runnable {
        private final int startIndex;
        private final int endIndex;

        public Worker(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            int localSum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                localSum += randomArray[i];
            }
            synchronized (SumAverageMultiThread.class) {
                totalSum += localSum;
            }
        }
    }
}

 */