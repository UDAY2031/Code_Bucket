class car{
    int speed;
    double regularprice;
    String color;
    car(int s,double r,String c){
        speed=s;
        regularprice=r;
        color=c;
    }
    double getSalePrice(){
        return regularprice;

    }
}
class truck extends car{
    int weight;
    truck(int s,double r,String c,int w){
        super(s,r,c);
        weight=w;
    }
    double getSalePrice(){
        if(weight>2000){
            regularprice=regularprice*0.9;
            return regularprice;
        }
        else{
            regularprice = regularprice*0.8;
            return regularprice;
        }
    }
}
class Ford extends car{
    int  year;
    int manufacture_discount;
    Ford(int s,double r,String c,int y,int md){
        super(s, r, c);
        year=y;
        manufacture_discount=md;
    }
    double getSalePrice(){
        regularprice -=manufacture_discount;
        return regularprice;

    }
}
class Sedan extends car{
    int length;
    Sedan(int s,double r,String c,int l){
        super(s, r, c);
        length=l;
    }
    double getSalePrice(){
        if(length>5){
            regularprice = regularprice*0.95;
            return regularprice;

        }
        else{
            regularprice = regularprice*0.9;
            return regularprice;
        }
    }
}
class MyOwnAutoShop{
    public static void main(String[] args) {
        car c = new car(400,9999999,"black");
        truck t = new truck(230,200000,"red",1999);
        Ford f = new Ford(410,8999999,"white",1967,1950);
        Sedan s = new Sedan(130, 300000, "blue", 6);
        System.out.println("THE SALES PRICE OF CAR:"+c.getSalePrice());
        System.out.println("THE SALES PRICE OF TRUCK:"+t.getSalePrice());
        System.out.println("THE SALES PRICE OF FORD:"+f.getSalePrice());
        System.out.println("THE SALES PRICE OF SEDAN:"+s.getSalePrice());
        
    }
}