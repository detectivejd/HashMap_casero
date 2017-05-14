package hashmapsimple;
public class ContainsValueTest extends Test
{
    private void probando_verificacion_normal() throws Exception{
        this.comprobar_que(col.containsValue("Deborah"));
        this.comprobar_que(col.containsValue("Franco"));
        this.comprobar_que(col.containsValue("Miguel"));            
    }
    private void probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada() throws Exception{
        this.comprobar_que(!col.containsValue(null));            
    }
    private void probando_verificacion_con_claves_inexistentes_que_debería_dar_falso() throws Exception{
        this.comprobar_que(!col.containsValue("Pepe"));
        this.comprobar_que(!col.containsValue("Luis"));            
    }
    @Override
    public void test() {
        try {
            System.out.println("\t\t **PROBANDO VERIFICACIÓN DE VALORES**");
            System.out.println("");
            probando_verificacion_normal();
            System.out.println("");
            probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada();
            System.out.println("");
            probando_verificacion_con_claves_inexistentes_que_debería_dar_falso();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }    
}