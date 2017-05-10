package hashmapsimple;
public class ConstructorTest extends Test
{
    private void creando_map_normal(){
        MyMap<Integer,String>m1= new MyMap();
        m1.put(1, "Deborah");
        m1.put(2, "Tommy");
        m1.put(3, "Franco");
        m1.put(4, "Manuela");
        this.check(m1.size() == 4);
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
        this.check(m2.size() == 7);
    }
    private void pasar_datos_de_hashmap_a_nuestro_map(){
        java.util.HashMap<Integer, String> m = new java.util.HashMap();
        m.put(1, "Agustin");
        m.put(2, "Amanda");
        m.put(3, "Olivia");
        m.put(4, "Maite");
        /*---------------------------------------*/
        MyMap<Integer,String> m3 = new MyMap();
        m3.putAll(m);
        /*---------------------------------------*/
        this.check(m3.size() == 4);
    }
    private void creando_map_con_capacidad_de_un_elemento(){
        MyMap<Integer,String> m4 = new MyMap(1);
        m4.put(1, "Luis");
        m4.put(2, "Edelma");
        m4.put(3, "Arnoldno");
        m4.put(4, "Edinson");
        /*---------------------------------------*/
        this.check(m4.size() == 4);
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