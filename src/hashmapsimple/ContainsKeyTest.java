package hashmapsimple;
public class ContainsKeyTest extends Test
{  
    private void probando_verificacion_normal() throws Exception {
        this.comprobar_que(col.containsKey(1));
        this.comprobar_que(col.containsKey(3));
        this.comprobar_que(col.containsKey(5));        
    }
    private void probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada() throws Exception {
        this.comprobar_que(!col.containsKey(null));       
    }
    private void probando_verificacion_con_claves_inexistentes_que_debería_dar_falso() throws Exception {
        this.comprobar_que(!col.containsKey(7));
        this.comprobar_que(!col.containsKey(8));
        this.comprobar_que(!col.containsKey(9));        
    }
    private void probando_verificacion_con_claves_negativas_que_debería_dar_falso() throws Exception {
        this.comprobar_que(!col.containsKey(-7));
        this.comprobar_que(!col.containsKey(-8));
        this.comprobar_que(!col.containsKey(-9));            
    }
    @Override
    public void test() {
        try {
            System.out.println("\t\t **PROBANDO VERIFICACIÓN DE CLAVES**");
            System.out.println("");
            probando_verificacion_normal();
            System.out.println("");
            probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada();
            System.out.println("");
            probando_verificacion_con_claves_inexistentes_que_debería_dar_falso();
            System.out.println("");
            probando_verificacion_con_claves_negativas_que_debería_dar_falso();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }    
}