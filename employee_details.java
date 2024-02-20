import java.util.*;
class employee{
    String name;
    int id;
    int age;
    double salary;
    employee(String n,int i,int a,double s){
        name=n;
        id=i;
        age=a;
        salary=s;
    }
}
class employee_details{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee[] e=new employee[3];
    
    for(int i=0;i<3;i++){
        System.out.println("Enter name:");
        String name=sc.next();
        System.out.println("Enter id:");
        int id = sc.nextInt();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println("Enter salary:");
        double salary = sc.nextDouble();
        e[i]=new employee(name,id,age,salary);
    }
    for(int i=0;i<3;i++){
        for(int j=i+1;j<3;j++){
            if(e[i].age>e[j].age){
                employee temp=e[i];
                e[i]=e[j];
                e[j]=temp;
            }
        }
    }
    System.out.println("The employee details:");
    for(int i=0;i<3;i++){
        System.out.println("Name:"+e[i].name+"\nID:"+e[i].id+"\nAge:"+e[i].age+"\nSalary:"+e[i].salary);
    }
}
}