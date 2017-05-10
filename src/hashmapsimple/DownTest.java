package hashmapsimple;
public class DownTest extends Test
{
    private void probando_borrado_normal(){
        col.remove(1);
        col.remove(3);
        col.remove(6);
        this.check(col.size() == 3);
    }
    private void probando_borrado_con_claves_nulas(){
        col.remove(null);
        this.check(col.size() == 3);
    }
    private void probando_borrado_con_claves_inexistentes(){
        col.remove(7);
        col.remove(9);
        this.check(col.size() == 3);
    }
    private void limpieza_total(){
        col.clear();
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