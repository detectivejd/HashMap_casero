package hashmapsimple.interfaz;
import hashmapsimple.test.ContainsKeyTest;
import hashmapsimple.test.ConstructorTest;
import hashmapsimple.test.UpTest;
import hashmapsimple.test.DownTest;
import hashmapsimple.test.ContainsValueTest;
import hashmapsimple.test.GetTest;
import hashmapsimple.test.Test;
public class Cuerpo {
    public static void main(String[] args) {
        Test t1 = null;
        t1 = new ConstructorTest();
        t1.test();
        t1 = new UpTest();
        t1.test();
        t1 = new GetTest();
        t1.test();
        t1 = new ContainsKeyTest();
        t1.test();
        t1 = new ContainsValueTest();
        t1.test();
        t1 = new DownTest();
        t1.test();
    }    
}