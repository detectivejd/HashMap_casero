package hashmapsimple;
public class Cuerpo {
    public static void main(String[] args) {
        ITest t1 = null;
        t1 = new ConstructorTest();
        t1.test();
        System.out.println("");
        t1 = new UpTest();
        t1.test();
        System.out.println("");        
        t1 = new GetTest();
        t1.test();
        System.out.println("");        
        t1 = new ContainsKeyTest();
        t1.test();
        System.out.println("");        
        t1 = new ContainsValueTest();
        t1.test();
        System.out.println("");
        t1 = new DownTest();
        t1.test();       
    }    
}