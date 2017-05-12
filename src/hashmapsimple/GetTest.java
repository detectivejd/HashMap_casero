package hashmapsimple;
public class GetTest extends Test
{   
    private void probando_busqueda_normal(){
        try { 
            this.restart();
            col.get(1);
            col.get(3);
            col.get(5);
        } catch(Exception ex){
            ex.printStackTrace();
        }        
    }
    private void probando_busqueda_con_claves_nulas_que_no_debería_obtener_nada(){
        try {
            this.restart();
            col.get(null);
        } catch(Exception ex){
            ex.printStackTrace();
        }        
    }
    private void probando_busqueda_con_claves_inexistentes_que_no_debería_obtener_nada(){
        try {
            this.restart();
            col.get(7);
            col.get(9);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_busqueda_con_claves_negativas_que_no_debería_obtener_nada(){
        try {
            this.restart();
            col.get(-1);
            col.get(-7);
            col.get(-5);
            col.get(-9);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_busqueda_vacia(){
        try {
            col.clear();
            col.get(1);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void test() {
        probando_busqueda_normal();
        System.out.println("");
        probando_busqueda_con_claves_nulas_que_no_debería_obtener_nada();
        System.out.println("");
        probando_busqueda_con_claves_inexistentes_que_no_debería_obtener_nada();
        System.out.println("");
        probando_busqueda_con_claves_negativas_que_no_debería_obtener_nada();
        System.out.println("");
        probando_busqueda_vacia();
    }    
}