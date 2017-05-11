package hashmapsimple;
public class GetTest extends Test
{   
    private void probando_busqueda_normal(){
        this.restart();
        this.check(col.get(1) != null);
        this.check(col.get(3) != null);
        this.check(col.get(5) != null);        
    }
    private void probando_busqueda_con_claves_nulas_que_no_debería_obtener_nada(){
        this.restart();
        this.check(col.get(null) != null);        
    }
    private void probando_busqueda_con_claves_inexistentes_que_no_debería_obtener_nada(){
        this.restart();
        this.check(col.get(7) != null);
        this.check(col.get(9) != null);
    }
    private void probando_busqueda_con_claves_negativas_que_no_debería_obtener_nada(){
        this.restart();
        this.check(col.get(-1) != null);
        this.check(col.get(-7) != null);
        this.check(col.get(-5) != null);
        this.check(col.get(-9) != null);
    }
    private void probando_busqueda_vacia(){
        col.clear();
        this.check(col.get(1) != null);
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