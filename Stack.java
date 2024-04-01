class object{
    int stack[] = new int[10];
    int top;

    object(){
        top = -1;
    }
    void push(int item){
        if(top == 9){
            System.out.println("Stack is full.");
        }
        else{
            stack[++top]=item;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack is empty.");
            return 0;
        }
        else{
            return stack[top--];
        }
    }
}
class Stack{
    public static void main(String[] args) {
        int i;
        object s1 = new object();
        object s2 = new object();
        for(i=0;i<10;i++)
        s1.push(i);
        for(i=0;i<10;i++)
        s2.push(i);
        System.out.println("First stack:\n");
        for(i=0;i<10;i++)
        System.out.println(s1.pop() + "\t");
        System.out.println("\nSecond Stack:\n");
        for(i=0;i<10;i++)
        System.out.println(s2.pop() + "\t");
    }
}