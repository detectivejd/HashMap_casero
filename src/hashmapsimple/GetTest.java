package hashmapsimple;
public class GetTest extends Test
{   
    private void probando_busqueda_normal() throws Exception {
        this.comprobar_que(col.get(1) != null);
        this.comprobar_que(col.get(3) != null);
        this.comprobar_que(col.get(5) != null);                
    }
    private void probando_busqueda_con_claves_nulas_que_no_debería_obtener_nada() throws Exception {
        this.comprobar_que(col.get(null) == null);                
    }
    private void probando_busqueda_con_claves_inexistentes_que_no_debería_obtener_nada() throws Exception {
        this.comprobar_que(col.get(7) == null);
        this.comprobar_que(col.get(9) == null);        
    }
    private void probando_busqueda_con_claves_negativas_que_no_debería_obtener_nada() throws Exception {
        this.comprobar_que(col.get(-1) == null);
        this.comprobar_que(col.get(-7) == null);
        this.comprobar_que(col.get(-5) == null);
        this.comprobar_que(col.get(-9) == null);        
    }
    private void probando_busqueda_vacia() throws Exception {
        this.comprobar_que(col.get(1) == null);        
    }
    @Override
    public void test() {
        try {
            System.out.println("\t\t **PROBANDO BÚSQUEDA DE DATOS POR CLAVE**");
            System.out.println("");
            probando_busqueda_normal();
            System.out.println("");
            probando_busqueda_con_claves_nulas_que_no_debería_obtener_nada();
            System.out.println("");
            probando_busqueda_con_claves_inexistentes_que_no_debería_obtener_nada();
            System.out.println("");
            probando_busqueda_con_claves_negativas_que_no_debería_obtener_nada();
            System.out.println("");
            probando_busqueda_vacia();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }    
}