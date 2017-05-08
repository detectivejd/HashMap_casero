package hashmapsimple;
public class ConstructorTest implements ITest
{
    @Override
    public void test() {
        MyMap<Integer,String>m1= new MyMap();
        m1.put(1, "Deborah");
        m1.put(2, "Tommy");
        m1.put(3, "Franco");
        m1.put(4, "Manuela");
        System.out.println(" ");
        System.out.println("\t ---PROBANDO MAP1---");
        System.out.println(" ");
        System.out.println("* prueba normal");
        System.out.println(" ");
        System.out.println("tamaño -> " + m1.size());        
        System.out.println(" ");         
        System.out.println(" --valores-- ");
        m1.values().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --claves-- ");
        m1.keySet().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --entradas-- ");
        m1.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
        /*------------------------------------------------------*/
        System.out.println("");
        MyMap<Integer,String>m2= new MyMap(2);
        m2.put(1, "Paula");
        m2.put(2, "Pedro");
        m2.put(3, "Fabio");
        m2.put(4, "John");
        m2.put(5, "Manuela");
        m2.put(6, "Andrea");
        m2.put(7, "Luisa");
        System.out.println(" ");
        System.out.println("\t ---PROBANDO MAP2---");
        System.out.println(" ");
        System.out.println("* probando con una capacidad de 2 elementos");
        System.out.println(" ");
        System.out.println("tamaño -> " + m2.size());        
        System.out.println(" ");         
        System.out.println(" --valores-- ");
        m2.values().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --claves-- ");
        m2.keySet().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --entradas-- ");
        m2.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
        /*------------------------------------------------------*/
        java.util.HashMap<Integer, String> m = new java.util.HashMap();
        m.put(1, "Agustin");
        m.put(2, "Amanda");
        m.put(3, "Olivia");
        m.put(4, "Maite");
        MyMap<Integer,String> m3 = new MyMap(1);
        m3.putAll(m);
        System.out.println(" ");
        System.out.println("\t ---PROBANDO MAP3---");
        System.out.println(" ");
        System.out.println("* probando transferencia de un hashmap a nuestro map");
        System.out.println(" ");
        System.out.println("tamaño -> " + m3.size());        
        System.out.println(" ");         
        System.out.println(" --valores-- ");
        m3.values().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --claves-- ");
        m3.keySet().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --entradas-- ");
        m3.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
        /*------------------------------------------------------*/
        System.out.println(" ");
        MyMap<Integer,String> m4 = new MyMap(1);
        m4.put(1, "Luis");
        m4.put(2, "Edelma");
        m4.put(3, "Arnoldno");
        m4.put(4, "Edinson");
        System.out.println("\t ---PROBANDO MAP4---");
        System.out.println(" ");
        System.out.println("* probando con una capacidad de 1 elemento");
        System.out.println(" ");
        System.out.println("tamaño -> " + m4.size());        
        System.out.println(" ");         
        System.out.println(" --valores-- ");
        m4.values().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --claves-- ");
        m4.keySet().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --entradas-- ");
        m4.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
        /*------------------------------------------------------*/
    }    
}