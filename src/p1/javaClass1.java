package p1;
class javaClass1 extends javaClass3 {
    int num = 20;
int z;
    // display method of superclass
    public void display() {
        super.display();
        System.out.println("This is the display method of superclass");
    }
    public void addition(int x,int y)
    {
        z=x+y;
        System.out.println("addition of 2 numbers is "+z);
    }
    public void substraction(int x,int y)
    {
        z=x-y;
        System.out.println("substraction of 2 numbers is "+z);
    }
}

