package hashmapsimple;
public class DownTest implements ITest
{
    @Override
    public void test() {
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*------------------------------------------------------*/
        System.out.println(" ");
        System.out.println("\t ---TODOS LOS DATOS---");
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
        /*------------------------------------------------------*/
        System.out.println("");
        System.out.println("\t ---ELIMINANDO DATOS---");
        System.out.println("");
        System.out.println("* Borrando clave existentes 2 y 6, e 7 que no existe");
        col.remove(2);
        col.remove(6);
        col.remove(7);
        System.out.println("");
        System.out.println("\t ---TODOS LOS DATOS---");
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
        /*------------------------------------------------------*/
        col.clear();
        System.out.println("");
        System.out.println("\t ---LIMPIANDO MAP---");
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