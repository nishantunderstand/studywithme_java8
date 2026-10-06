package constructor_chaining;

class A {
    A(){
        System.out.println("0 Parameter");
    }

    A(int a){
        this();
        System.out.println("1 Parameter");
    }
    A(int a, int b){
        this(a);
        System.out.println("2 Parameter");
    }

    A(int a,int b, int c){
        this(a,b);
        System.out.println("3 Paramter");
    }
}

class Main{
    public static void main(String[] args) {
        A a1 = new A(10,20,30);
        A a2 = new A(10,20,30);
    }
}
