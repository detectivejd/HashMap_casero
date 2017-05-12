package hashmapsimple;
public class ContainsValueTest extends Test
{
    private void probando_verificacion_normal(){
        try {
            col.containsValue("Deborah");
            col.containsValue("Franco");
            col.containsValue("Miguel");
        } catch(Exception ex){
            ex.printStackTrace();
        }    
    }
    private void probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada(){
        try {
            col.containsValue(null);
        } catch(Exception ex){
            ex.printStackTrace();
        }    
    }
    private void probando_verificacion_con_claves_inexistentes_que_debería_dar_falso(){
        try {
            col.containsValue("Pepe");
            col.containsValue("Luis");
        } catch(Exception ex){
            ex.printStackTrace();
        }    
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