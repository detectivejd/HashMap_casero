package hashmapsimple;
public class GetTest implements ITest
{
    private void probando_busqueda_normal(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO BÚSQUEDA NORMAL---");
        System.out.println(" ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());            
        });
        System.out.println("");
        System.out.println("Buscando info. de la clave 1: " + col.get(1));
        System.out.println("Buscando info. de la clave 3: " + col.get(3));
        System.out.println("Buscando info. de la clave 5: " + col.get(5));
    }
    private void probando_busqueda_con_claves_nulas_que_no_debería_obtener_nada(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO BÚSQUEDA CON CLAVES NULAS---");
        System.out.println(" ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());            
        });
        System.out.println("");
        System.out.println("Buscando info. de la clave 1: " + col.get(1));
        System.out.println("Buscando info. de la clave nula 1: " + col.get(null));
        System.out.println("Buscando info. de la clave 5: " + col.get(5));
        System.out.println("Buscando info. de la clave nula 2: " + col.get(null));
    }
    private void probando_busqueda_con_claves_inexistentes_que_no_debería_obtener_nada(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO BÚSQUEDA CON CLAVES INEXISTENTES---");
        System.out.println(" ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());            
        });
        System.out.println("");
        System.out.println("Buscando info. de la clave 1: " + col.get(1));
        System.out.println("Buscando info. de la clave 7 (no existe): " + col.get(7));
        System.out.println("Buscando info. de la clave 5: " + col.get(5));
        System.out.println("Buscando info. de la clave 9 (no existe): " + col.get(9));
    }
    @Override
    public void test() {
        probando_busqueda_normal();
        System.out.println("");
        probando_busqueda_con_claves_nulas_que_no_debería_obtener_nada();
        System.out.println("");
        probando_busqueda_con_claves_inexistentes_que_no_debería_obtener_nada();
    }    
}