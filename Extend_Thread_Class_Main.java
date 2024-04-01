class Thread1 extends Thread{
    boolean isprime(long num){
        for(long i = 2 ; i<=(num/2);++i){
            if((num%2)==0){
                return false;
            }
        }
        return true;
    }
    public void run(){
        try{
            for(int i=1;i<=100;++i){
                if(isprime(i)){
                    System.out.println("Prime Number of T1:"+i);
                    Thread.sleep(500);
                }
            }
        }
        catch(InterruptedException e){

        }
    }
}
class Thread2 extends Thread{
    boolean is_divisible_by_2(long num){
        if((num%2)==0 || (num%4)==0 || (num%6)==0){
            return true;
        }
        return false;
    }
    public void run(){
        try{
            for(int i=1;i<=100;++i){
                if(is_divisible_by_2(i)){
                    System.out.println("Number of T2:"+i);
                    Thread.sleep(500);
                }
            }
        }
        catch(InterruptedException e){

        }
    }
}
class Extend_Thread_Class_Main{
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}