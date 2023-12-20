class method{
     public static void main(String[] args) {
        System.out.println("from main");
        add();
        test();
        System.out.println("End main");
     }
     public static void add()
     {
        int a=10;
        int b=20;
        System.out.println(a+b);
     }
     public static void test()
     {
        System.out.println("from test");
     }
}