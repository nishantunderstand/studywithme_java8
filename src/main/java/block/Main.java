package block;

class A {
    static{
        System.out.println("Static Block");
    }
    
    {
        System.out.println("Instance Block-1");

    }
    {
        System.out.println("Instance Block-2");

    }
    A(){
        System.out.println("Default");
    }

}

class Main{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }
}
