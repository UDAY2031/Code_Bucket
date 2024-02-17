interface shape{
    double area();
}
class rectangle implements shape{
    int length;
    int breadth;
    rectangle(int l,int b){
        length = l;
        breadth = b;

    }
    @Override
    public double area(){
        return length*breadth;
    }
}
class triangle implements shape{
    int base;
    int height;
    triangle(int ba,int h){
        base=ba;
        height=h;
    }
    @Override
       public double area(){
            return 0.5*base*height;
        }
    
}
class interface_area{
    public static void main(String[] args) {
        rectangle r = new rectangle(5,5 );
        triangle t = new triangle(5, 5);
        System.out.println("Area of rectangle:"+r.area());
        System.out.println("Area of triangle"+t.area());

    }
}