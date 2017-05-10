package hashmapsimple;
public class DownTest extends Test
{
    private void probando_borrado_normal(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*---------------------------------------*/
        col.remove(1);
        col.remove(3);
        col.remove(6);
        /*---------------------------------------*/
        System.out.println("\t ---PROBANDO BORRADO NORMAL--");
        System.out.println(" ");
        this.check(col.size() == 3);
    }
    private void probando_borrado_con_claves_nulas(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*-------------------------------------------------*/
        col.remove(1);
        col.remove(null);
        col.remove(3);
        col.remove(null);
        /*-------------------------------------------------*/
        System.out.println("\t ---PROBANDO BORRADO CON CLAVES NULAS--");
        System.out.println(" ");
        this.check(col.size() == 4);
    }
    private void probando_borrado_con_claves_inexistentes(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*-------------------------------------------------*/
        col.remove(1);
        col.remove(7);
        col.remove(3);
        col.remove(9);
        /*-------------------------------------------------*/
        System.out.println("\t ---PROBANDO BORRADO CON CLAVES INEXISTENTES--");
        System.out.println(" ");
        this.check(col.size() == 4);
    }
    private void limpieza_total(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*-------------------------------------------------*/
        col.clear();
        /*-------------------------------------------------*/
        System.out.println("\t ---PROBANDO LIMPIEZA DE INFORMACIÓN---");
        System.out.println(" ");
        this.check(col.isEmpty());
    }
    @Override
    public void test() {
        probando_borrado_normal();
        System.out.println("");
        probando_borrado_con_claves_nulas();
        System.out.println("");
        probando_borrado_con_claves_inexistentes();
        System.out.println("");
        limpieza_total();
    }    
}