/**
 * Created by igoro on 10/25/2016.
 */

public class ComplexNumber {

    //declare local variables
    private double re, im;

    //declare a class Complex Number
    public ComplexNumber(double re, double im){
        this.re = re;
        this.im = im;
    }

    //declare methods of the class
    public double getRe() {return re;}
    public double getIm() {return im;}
    public void setRe(double re){this.re = re;}
    public void setIm(double im) {this.im = im;}


    // Override equals function
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == this || getClass() != o.getClass()) return false;

        ComplexNumber complexNum = (ComplexNumber) o;

        if (im != complexNum.im) return false;
        return re == complexNum.re;
    }

    // Override hashCode function
    @Override
    public int hashCode(){
        double result = im;
        result = 31 * result + re;
        return (int)result;
    }

    // main function entrance to the program
    public static void main(String[] args){
        // test equality
        ComplexNumber a = new ComplexNumber(1,1);
        ComplexNumber b = new ComplexNumber(1,1);
        System.out.println("a == b "+a.equals(b));
        System.out.println("a hashCode = "+a.hashCode());

        //test inequality
        ComplexNumber c = new ComplexNumber(1,2);
        ComplexNumber d = new ComplexNumber(2,1);
        System.out.println("c == d "+c.equals(d));
        System.out.println("c hashCode = "+c.hashCode());

    }

}
