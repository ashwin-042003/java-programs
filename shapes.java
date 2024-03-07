public class shapes {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5,6);
        r.area();
        Circle c=new Circle(5);
        c.area();
        Square s=new Square(10);
        s.area();
    }
}
class shapess{
    int l,b,h,r,s;
}
class Rectangle extends shapess{
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    void area(){
        System.out.println("Area of rectangle:"+l*b);
    }
}

class Circle extends shapess{
    Circle(int r){
        this.r=r;
    }
    void area(){
        System.out.println("Area of circle:"+3.14*r*r);
    }
}
class Square extends shapess{
    Square(int s){
        this.s=s;
    }
    void area(){
        System.out.println("Area of Square:"+s*s);
    }
}