class Box
{
 double w;
 double h;
 double d;

void SetDim()
{
  w=10;
 h=20;
 d=30;
}

 void SetDim2(double x,double y,double z)
{
  w=x;
  h=y;
  d=z;
}

 double calcVol()
{
 return (w*h*d);
}
}

class try1
{
 public static void main(String[] args)
{
  Box b3=new Box();
 Box b1=new Box();
Box b2=b1;
b1.SetDim();
b3.SetDim2(4,5,6);
System.out.println(b1.calcVol());
System.out.println(b3.calcVol()); 

}
}