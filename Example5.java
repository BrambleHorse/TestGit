public class Example5 { 
    public static void main(String[] s) { 
        A a = new B(); 
        a.b(); 
    } 
} 
 
class A { 
    void a() { 
        System.out.println("A-a"); 
    } 
     
    void b() { 
        System.out.println("A-b"); 
        a(); 
    } 
} 
 
class B extends A { 
    void a() { 
        System.out.println("B-a"); 
    } 
     
    void b() { 
        System.out.println("B-b"); 
        super.b(); 
    } 
} 