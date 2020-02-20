public class Complex
{
   double x, y;
   Complex(double r, double i)
   {
	this.x = r;
	this.y = i;
   }
	
   public static Complex sum(Complex c1, Complex c2)
   {
	
        Complex temp = new Complex(0, 0);

        temp.x = c1.x + c2.x;
        temp.y = c1.y + c2.y;
        return temp;
    }
   public static Complex product(Complex c1,Complex c2)
    {
	Complex temp2 = new Complex(0,0);
	
	temp2.x = (c1.x*c2.x)-(c1.y*c2.y);
        temp2.y = (c1.x*c2.y)+(c1.y*c2.x);

	return temp2;
    }
    public String toString()
    {
	return x+"+"+y+"i";
    }
    public static void main(String args[]) {
	Complex c1 = new Complex(5.5, 4);
	Complex c2 = new Complex(1.2, 3.5);
        Complex temp = sum(c1, c2);
	Complex temp2 = product(c1,c2);
        System.out.println("Sum is: "+ temp);
	System.out.println("Product is: "+temp2);
    }
}