package hashmapsimple;
public class ConstructorTest implements ITest
{
    private void creando_map_normal(){
        MyMap<Integer,String>m1= new MyMap();
        m1.put(1, "Deborah");
        m1.put(2, "Tommy");
        m1.put(3, "Franco");
        m1.put(4, "Manuela");
        System.out.println("\t ---PROBANDO CONSTRUCTOR NORMAL---");
        System.out.println(" ");
        m1.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    private void creando_map_con_capacidad_de_dos_elementos(){
        MyMap<Integer,String>m2= new MyMap(2);
        m2.put(1, "Paula");
        m2.put(2, "Pedro");
        m2.put(3, "Fabio");
        m2.put(4, "John");
        m2.put(5, "Manuela");
        m2.put(6, "Andrea");
        m2.put(7, "Luisa");
        System.out.println("\t ---PROBANDO CONSTRUCTOR CON CAPACIDAD DEFINIDA DE 2 ELEMENTOS---");        
        System.out.println(" ");         
        m2.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    private void pasar_datos_de_hashmap_a_nuestro_map(){
        java.util.HashMap<Integer, String> m = new java.util.HashMap();
        m.put(1, "Agustin");
        m.put(2, "Amanda");
        m.put(3, "Olivia");
        m.put(4, "Maite");
        MyMap<Integer,String> m3 = new MyMap();
        m3.putAll(m);
        System.out.println("\t ---PROBANDO TRANSFERENCIA DE DATOS DE UN HASHMAP AL NUESTRO---"); 
        System.out.println(" ");         
        m3.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    private void creando_map_con_capacidad_de_un_elemento(){
        MyMap<Integer,String> m4 = new MyMap(1);
        m4.put(1, "Luis");
        m4.put(2, "Edelma");
        m4.put(3, "Arnoldno");
        m4.put(4, "Edinson");
        System.out.println("\t ---PROBANDO CONSTRUCTOR CON CAPACIDAD DEFINIDA DE UN ELEMENTO---"); 
        System.out.println(" ");         
        m4.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    @Override
    public void test() {
        creando_map_normal();
        System.out.println("");
        creando_map_con_capacidad_de_dos_elementos();
        System.out.println("");
        pasar_datos_de_hashmap_a_nuestro_map();
        System.out.println(" ");
        creando_map_con_capacidad_de_un_elemento();
    }    
}