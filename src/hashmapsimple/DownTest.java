package hashmapsimple;
public class DownTest extends Test
{
    private void probando_borrado_normal(){
        restart();
        col.remove(1);
        col.remove(3);
        col.remove(6);
        this.check(col.size() == 3);
    }
    private void probando_borrado_con_claves_nulas(){
        restart();
        col.remove(null);
        this.check(col.size() == 6);
    }
    private void probando_borrado_con_claves_inexistentes(){
        restart();
        col.remove(7);
        col.remove(9);
        this.check(col.size() == 6);
    }
    private void probando_borrado_un_elemento(){
        elem1();
        col.remove(1);
        this.check(col.isEmpty());
    }
    private void probando_borrado_un_elemento_en_2(){
        elem2();
        col.remove(1);
        this.check(col.size() == 1);
    }
    private void probando_borrado_un_elemento_en_3(){
        elem3();
        col.remove(1);
        this.check(col.size() == 2);
    }
    private void limpieza_total(){
        restart();
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
        probando_borrado_un_elemento();
        System.out.println("");
        probando_borrado_un_elemento_en_2();
        System.out.println("");
        probando_borrado_un_elemento_en_3();
        System.out.println("");
        limpieza_total();
    }    
}