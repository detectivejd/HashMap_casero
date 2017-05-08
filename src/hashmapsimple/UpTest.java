package hashmapsimple;
public class UpTest implements ITest
{
    @Override
    public void test() {
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        System.out.println("\t ---TODOS LOS DATOS---");
        System.out.println(" ");
        System.out.println("* Insertamos 4 elementos a nuestro map");
        System.out.println(" ");
        System.out.println("tamaño -> " + col.size());        
        System.out.println(" ");         
        System.out.println(" --valores-- ");
        col.values().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --claves-- ");
        col.keySet().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --entradas-- ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
        System.out.println(" ");
        /*------------------------------------------------------*/
        // probamos una clave duplicada para ver que pasa con la estructura
        col.put(1, "Micaela");
        // probamos claves nulas para ver que no sean agregadas en el map
        col.put(null,"pepe");
        // agregaremos probando putAll para que ver que sucede
        java.util.HashMap<Integer, String> m = new java.util.HashMap();
        col.putAll(m);
        System.out.println(" ");
        System.out.println("\t ---INSERTANDO MÁS DATOS---");
        System.out.println(" ");
        System.out.println("* verificamos lo que pasa al insertar una entrada con una \n clave nula y una clave existente (1)");
        System.out.println(" ");
        System.out.println("tamaño -> " + col.size());        
        System.out.println(" ");         
        System.out.println(" --valores-- ");
        col.values().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --claves-- ");
        col.keySet().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --entradas-- ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }    
}