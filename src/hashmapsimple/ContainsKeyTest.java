package hashmapsimple;
public class ContainsKeyTest implements ITest
{
    private void probando_verificacion_normal(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO VERIFICACIÓN NORMAL---");
        System.out.println(" ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());            
        });
        System.out.println("");
        System.out.println("Verificando clave 1: " + col.containsKey(1));
        System.out.println("Verificando clave 3: " + col.containsKey(3));
        System.out.println("Verificando clave 5: " + col.containsKey(5));
    }
    private void probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO VERIFICACIÓN CON CLAVES NULAS---");
        System.out.println(" ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());            
        });
        System.out.println("");
        System.out.println("Verificando clave 1: " + col.containsKey(1));
        System.out.println("Verificando clave nula 1: " + col.containsKey(null));
        System.out.println("Verificando clave 5: " + col.containsKey(5));
        System.out.println("Verificando clave nula 2: " + col.containsKey(null));
    }
    private void probando_verificacion_con_claves_inexistentes_que_debería_dar_falso(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO VERIFICACIÓN CON CLAVES INEXISTENTES---");
        System.out.println(" ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());            
        });
        System.out.println("");
        System.out.println("Verificando clave 1: " + col.containsKey(1));
        System.out.println("Verificando clave 7 (no existe): " + col.containsKey(7));
        System.out.println("Verificando clave 5: " + col.containsKey(5));
        System.out.println("Verificando clave 9 (no existe): " + col.containsKey(9));
    }
    @Override
    public void test() {
        probando_verificacion_normal();
        System.out.println("");
        probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada();
        System.out.println("");
        probando_verificacion_con_claves_inexistentes_que_debería_dar_falso();
    }    
}