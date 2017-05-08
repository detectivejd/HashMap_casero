package hashmapsimple;
public class ContainsValueTest implements ITest
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
        System.out.println(" ");
        System.out.println("con containsValue: " + col.containsValue("Franco"));
        System.out.println("con containsValue: " + col.containsValue("Rodrigo"));
        System.out.println("con containsValue: " + col.containsValue(null));
        /*------------------------------------------------------*/
        System.out.println(" ");
        System.out.println("\t ---TODOS LOS DATOS---");
        System.out.println("tamaño -> " + col.size());        
        System.out.println(" ");         
        System.out.println(" --valores-- ");
        col.values().stream().forEach((s) -> {
            if(s.equals("Deborah") || s.equals("Franco") || s.equals("Miguel")){ 
                Console.println(Console.ANSI_PURPLE,s);
            } else {
                System.out.println(s);
            }
        });
        System.out.println(" ");
        System.out.println(" --claves-- ");
        col.keySet().stream().forEach((s) -> {
            System.out.println(s);            
        });
        System.out.println(" ");
        System.out.println(" --entradas-- ");
        col.entrySet().stream().forEach((e)->{
            if(e.getKey() == 1 || e.getKey() == 3 || e.getKey() == 5){
                Console.println(Console.ANSI_PURPLE,"clave -> "+ e.getKey() +" valor -> "+e.getValue());
            } else {
                System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
            }
        });
    }    
}