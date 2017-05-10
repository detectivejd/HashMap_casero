package hashmapsimple;
public class ContainsKeyTest extends Test
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
        this.check(col.containsKey(1));
        this.check(col.containsKey(3));
        this.check(col.containsKey(5));
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
        System.out.println("\t ---PROBANDO VERIFICACIÓN CON CLAVES NULAS---");
        System.out.println(" ");
        this.check(col.containsKey(1));
        this.check(col.containsKey(null));
        this.check(col.containsKey(5));
        this.check(col.containsKey(null));
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
        System.out.println("\t ---PROBANDO VERIFICACIÓN CON CLAVES INEXISTENTES---");
        System.out.println(" ");
        this.check(col.containsKey(1));
        this.check(col.containsKey(7));
        this.check(col.containsKey(5));
        this.check(col.containsKey(9));
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