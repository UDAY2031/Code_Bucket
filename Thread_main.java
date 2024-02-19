class demo1 implements Runnable{
    public void run(){
        System.out.println("Thread1:");
        {
            for(int i=1;i<=50;i++){
                int counter=0;{
                    for(int j=i;j>=1;j--){
                        if(i%j==0){
                            counter++;
                        }
                    }
                    if(counter==2){
                        System.out.println("Prime Numbers(1-50):"+i);

                    
                    try{
                        Thread.sleep(500);
                    }
                    catch(InterruptedException e){
                        System.out.println("Catch:"+e);
                    }
                }
            }
        }
    }
}
}
class demo2 implements Runnable{
    public void run(){
        System.out.println("Thread2:");{
            for(int i=100;i<=150;i++){
                int counter=0;
                {
                    for(int j=i;j>=1;j--){
                        if(i%j==0){
                            counter++;
                        }
                    }
                    if(counter==2){
                        System.out.println("Prime Numbers(100-150):"+i);
                    }
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException e){
                        System.out.println("Catch:"+e);
                    }
                }
            }
        }
    }
}
public class Thread_main{
    public static void main(String[] args) {
        demo1 d1 = new demo1();
        Thread threadd1 = new Thread(d1);
        demo2 d2 = new demo2();
        Thread threadd2 = new Thread(d2);
        threadd1.start();
        threadd2.start();
    }
}