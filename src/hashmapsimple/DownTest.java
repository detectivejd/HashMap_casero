package hashmapsimple;
public class DownTest extends Test
{
    private void probando_borrado_normal(){
        try {
            restart();
            col.remove(1);
            col.remove(3);
            col.remove(6);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_borrado_con_claves_nulas(){
        try { 
            restart();
            col.remove(null);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_borrado_con_claves_inexistentes(){
        try {
            restart();
            col.remove(7);
            col.remove(9);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_borrado_un_elemento(){
        try {
            elem1();
            col.remove(1);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_borrado_un_elemento_en_2(){
        try {
            elem2();
            col.remove(1);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_borrado_un_elemento_en_3(){
        try {
            elem3();
            col.remove(1);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void limpieza_total(){
        try {
            restart();
            col.clear();
        } catch(Exception ex){
            ex.printStackTrace();
        }
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