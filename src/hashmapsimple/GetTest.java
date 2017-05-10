package hashmapsimple;
public class GetTest extends Test
{
    private void probando_busqueda_normal(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*-------------------------------------------------*/
        System.out.println("\t ---PROBANDO BÚSQUEDA NORMAL---");
        System.out.println(" ");
        this.check(col.get(1) != null);
        this.check(col.get(3) != null);
        this.check(col.get(5) != null);        
    }
    private void probando_busqueda_con_claves_nulas_que_no_debería_obtener_nada(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*-------------------------------------------------*/
        System.out.println("\t ---PROBANDO BÚSQUEDA CON CLAVES NULAS---");
        System.out.println(" ");
        this.check(col.get(1) != null);
        this.check(col.get(null) != null);
        this.check(col.get(5) != null);
        this.check(col.get(null) != null);
        
    }
    private void probando_busqueda_con_claves_inexistentes_que_no_debería_obtener_nada(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*-------------------------------------------------*/
        System.out.println("\t ---PROBANDO BÚSQUEDA CON CLAVES INEXISTENTES---");
        System.out.println(" ");
        this.check(col.get(1) != null);
        this.check(col.get(7) != null);
        this.check(col.get(5) != null);
        this.check(col.get(9) != null);
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