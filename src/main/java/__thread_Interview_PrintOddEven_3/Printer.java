package __thread_Interview_PrintOddEven_3;

// Print Odd and Even Numbers Using Two Threads
// https://www.youtube.com/watch?v=qd-xfcaNUmA
// I don't understand it.


// https://www.youtube.com/playlist?list=PLPtUyMfD0mNJG3KLm1Mqi8wdHNwZ9cwHM

class Printer {
    private int cnt = 0;

    public synchronized void printOdd(){
        while(cnt<=10){
            while(cnt%2==1){

            }
        }
    }

    public synchronized void printEven(){
        while(cnt<=10){
            if(cnt%2==0){
                System.out.println("Thread 2 : "+ cnt++);
            }
        }
    }
}

