package hashmapsimple;
public class UpTest implements ITest
{
    private void probando_insercion_normal(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        java.util.HashMap<Integer, String> m = new java.util.HashMap();
        col.putAll(m);
        System.out.println("\t ---PROBANDO INSERCIÓN NORMAL---"); 
        System.out.println(" ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    private void probando_inserción_con_claves_nulas_que_no_debería_funcionar(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");        
        System.out.println("\t ---PROBANDO INSERCIÓN CON CLAVES NULAS---"); 
        System.out.println(" ");
        System.out.println("* antes: ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
        col.put(null, "Ramiro");
        col.put(null, "Felipe");
        col.put(null, "Valentino");
        col.put(null, "Joaquin");
        System.out.println(" ");
        System.out.println("* después: ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    private void probando_insercion_con_claves_existentes_que_deberia_cambiar_sus_valores(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Martin");        
        col.put(6, "Miltón");
        System.out.println("\t ---PROBANDO INSERCIÓN CON CLAVES EXISTENTES---"); 
        System.out.println(" ");
        System.out.println("* antes: ");
        col.entrySet().stream().forEach((e)->{
            if(e.getKey() == 1 || e.getKey() == 3 || e.getKey() == 5){
                Console.println(Console.ANSI_RED,"clave -> "+ e.getKey() +" valor -> "+e.getValue());
            } else {
                System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
            }
        });
        System.out.println(" ");        
        col.put(1, "Micaela");
        col.put(3, "Serafín");
        col.put(5, "Agustin");
        System.out.println("* después: ");
        col.entrySet().stream().forEach((e)->{
            if(e.getKey() == 1 || e.getKey() == 3 || e.getKey() == 5){
                Console.println(Console.ANSI_BLUE,"clave -> "+ e.getKey() +" valor -> "+e.getValue());
            } else {
                System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
            }
        });
    }
    @Override
    public void test() {
        probando_insercion_normal();
        System.out.println(" ");
        probando_inserción_con_claves_nulas_que_no_debería_funcionar();
        System.out.println(" ");
        probando_insercion_con_claves_existentes_que_deberia_cambiar_sus_valores();       
    }    
}