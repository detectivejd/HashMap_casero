package hashmapsimple;
public class ContainsValueTest implements ITest
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
        System.out.println("Verificando clave Deborah: " + col.containsValue("Deborah"));
        System.out.println("Verificando clave Franco: " + col.containsValue("Franco"));
        System.out.println("Verificando clave Miguel: " + col.containsValue("Miguel"));
    }
    private void probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO VERIFICACIÓN CON VALORES NULOS---");
        System.out.println(" ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());            
        });
        System.out.println("");
        System.out.println("Verificando valor Deborah: " + col.containsValue("Deborah"));
        System.out.println("Verificando valor nula 1: " + col.containsKey(null));
        System.out.println("Verificando valor Miguel: " + col.containsValue("Miguel"));
        System.out.println("Verificando valor nula 2: " + col.containsKey(null));
    }
    private void probando_verificacion_con_claves_inexistentes_que_debería_dar_falso(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO VERIFICACIÓN CON VALORES INEXISTENTES---");
        System.out.println(" ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());            
        });
        System.out.println("");
        System.out.println("Verificando valor Deborah: " + col.containsValue("Deborah"));
        System.out.println("Verificando valor Pepe (no existe): " + col.containsValue("Pepe"));
        System.out.println("Verificando clave Miguel: " + col.containsValue("Miguel"));
        System.out.println("Verificando clave Luis (no existe): " + col.containsValue("Luis"));
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