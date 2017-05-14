package hashmapsimple;
import java.util.Map;
public class UpTest extends Test
{        
    private void probando_insercion_con_claves_existentes_que_deberia_cambiar_sus_valores() throws Exception{
        probando_insercion(restart1());        
        col.put(1, "Micaela");
        col.put(3, "Serafín");
        col.put(5, "Agustin");
        comprobar_que(col.get(1)!= null);
        comprobar_que(col.get(3)!= null);
        comprobar_que(col.get(5)!= null);
    }
    private void probando_insercion_repetida() throws Exception {
        probando_insercion(restart1());
        col.put(1, "Deborah");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        comprobar_que(col.size() == 6);
    } 
    private void probando_insercion(Object[][] arreglo) throws Exception{
        col.clear();
        for (Object[] arreglo1 : arreglo) {
            col.put(Integer.valueOf(arreglo1[0].toString()), arreglo1[1].toString());
        }
        for(Map.Entry<Integer,String>e : col.entrySet()){
            this.comprobar_que(col.get(e.getKey()) != null);
        }
    }
    @Override
    public void test() {
        try {
            this.probando_insercion(nullKey());
            System.out.println(" ");
            probando_insercion_con_claves_existentes_que_deberia_cambiar_sus_valores();
            System.out.println(" ");
            this.probando_insercion(negativeKey());
            System.out.println("");
            probando_insercion_repetida();
            System.out.println("");
            this.probando_insercion(reverse1());
            System.out.println("");
            this.probando_insercion(giantKey());
            System.out.println("");
            this.probando_insercion(pares1());
            System.out.println("");
            this.probando_insercion(zero());
            System.out.println("");
            this.probando_insercion(primos1());
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }    
}