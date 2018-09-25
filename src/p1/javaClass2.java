package p1;

/**
 * Created by Msaxena on 21-09-2018.
 */
public class javaClass2 extends javaClass1 {
    int num = 10;
int z;
    // display method of sub class
    public void display() {
        System.out.println("This is the display method of subclass");
    }
    public void addition(int x,int y)
    {
        z=2*x+y;
        System.out.println("Overloaded method's result "+z);
    }
    public void my_method() {
        // Instantiating subclass
        javaClass2 sub = new javaClass2();

        // Invoking the display() method of sub class
        sub.display();

        // Invoking the display() method of superclass
        super.display();
        super.addition(20,5);
        // printing the value of variable num of subclass
        System.out.println("value of the variable named num in sub class:" + sub.num);

        // printing the value of variable num of superclass
        System.out.println("value of the variable named num in super class:" + super.num);
    }

    public static void main(String args[]) {
        javaClass2 obj = new javaClass2();
        obj.my_method();

        obj.substraction(20,5);
        obj.addition(20,5);
    }
}