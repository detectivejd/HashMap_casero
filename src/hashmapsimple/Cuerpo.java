package hashmapsimple;
public class Cuerpo {
    public static void main(String[] args) {
        ITest t1 = null;
        System.out.println("\t\t **PROBANDO CONSTRUCTORES**");
        System.out.println("");
        t1 = new ConstructorTest();
        t1.test();
        System.out.println("");
        System.out.println("\t\t **PROBANDO INSERCIÓN DE DATOS**");
        System.out.println("");
        t1 = new UpTest();
        t1.test();
        System.out.println("");
        System.out.println("\t\t **PROBANDO BÚSQUEDA DE DATOS POR CLAVE**");
        System.out.println("");
        t1 = new GetTest();
        t1.test();
        System.out.println("");
        System.out.println("\t\t **PROBANDO VERIFICACIÓN DE CLAVES**");
        System.out.println("");
        t1 = new ContainsKeyTest();
        t1.test();
        System.out.println("");
        System.out.println("\t\t **PROBANDO VERIFICACIÓN DE VALORES**");
        System.out.println("");
        t1 = new ContainsValueTest();
        t1.test();
        System.out.println("");
        System.out.println("\t\t **PROBANDO BORRADO Y LIMPIEZA DE DATOS**");
        System.out.println("");
        t1 = new DownTest();
        t1.test();
        System.out.println("");
        System.out.println("\t\t **PROBANDO TIPOS DE RECORRIDOS**");
        System.out.println("");
        t1 = new IteratorTest();
        t1.test();
    }
    
}
