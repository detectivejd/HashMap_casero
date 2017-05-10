package hashmapsimple;
public class ContainsValueTest extends Test
{
    private void probando_verificacion_normal(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*---------------------------------------*/
        System.out.println("\t ---PROBANDO VERIFICACIÓN NORMAL---");
        System.out.println(" ");
        this.check(col.containsValue("Deborah"));
        this.check(col.containsValue("Franco"));
        this.check(col.containsValue("Miguel"));
    }
    private void probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*---------------------------------------*/
        System.out.println("\t ---PROBANDO VERIFICACIÓN CON VALORES NULOS---");
        System.out.println(" ");
        this.check(col.containsValue("Deborah"));
        this.check(col.containsValue(null));
        this.check(col.containsValue("Miguel"));
        this.check(col.containsValue(null));
    }
    private void probando_verificacion_con_claves_inexistentes_que_debería_dar_falso(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*---------------------------------------*/
        System.out.println("\t ---PROBANDO VERIFICACIÓN CON VALORES INEXISTENTES---");
        System.out.println(" ");
        this.check(col.containsValue("Deborah"));
        this.check(col.containsValue("Pepe"));
        this.check(col.containsValue("Miguel"));
        this.check(col.containsValue("Luis"));
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