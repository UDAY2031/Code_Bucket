class student_details {
    String Name;
    String USN;
    int marks1;
    int marks2;
    int marks3;
    student_details(String n,String u,int m1,int m2,int m3){
        Name=n;
        USN=u;
        marks1=m1;
        marks2=m2;
        marks3=m3;
        
    }
}
 class UG extends student_details{
    int sem;
    UG(String n,String u,int m1,int m2,int m3,int s){
        super(n,u,m1,m2,m3);
        sem=s;
    }
    void display(){
        System.out.println("Name:"+super.Name+"\nUSN:"+super.USN+"\nMarks1:"+super.marks1+"\nMarks2:"+super.marks2+"\nMarks3:"+super.marks3+"\nSem:"+sem);
    }
    void avg()
    {
        System.out.println("The average marks :"+(marks1+marks2+marks3)/3);
    }
}
class PG extends student_details{
    int sem;
    PG(String n,String u,int m1,int m2,int m3,int s){
        super(n,u,m1,m2,m3);
        sem=s;
    }
    void display(){
        System.out.println("Name:"+super.Name+"\nUSN:"+super.USN+"\nMarks1:"+super.marks1+"\nMarks2"+super.marks2+"\nMarks3:"+super.marks3+"\nSem:"+sem);
    }
    void avg(){
        System.out.println("The average marks :"+(marks1+marks2+marks3)/3);
    }
}
class student {
    public static void main(String[] args) {
        UG stu1 = new UG("Naruto","1ms22",20,22,29,3);
        PG stu2 = new PG("Minato","1ms24",22,26,30,6);
        stu1.display();
        stu1.avg();
        stu2.display();
        stu2.avg();


    }
}