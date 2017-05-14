package hashmapsimple;
public class DownTest extends Test
{
    private void limpieza_total() throws Exception{
        col.clear();
        this.comprobar_que(col.isEmpty());
    }
    private void probando_borrado(Object[][]arreglo, Object[]criterio) throws Exception{
        col.clear();
        for (Object[] arreglo1 : arreglo) {
            col.put(Integer.valueOf(arreglo1[0].toString()), arreglo1[1].toString());
        }
        for(Object c : criterio){
            col.remove(Integer.valueOf(c.toString()));
            this.comprobar_que(col.get(Integer.valueOf(c.toString())) == null);
        }
    }
    @Override
    public void test() {
        try { 
            probando_borrado(restart1(), new Object[]{1,3,6});
            System.out.println("");
            probando_borrado(restart1(), new Object[]{null});
            System.out.println("");
            probando_borrado(restart1(), new Object[]{7,9});
            System.out.println("");
            probando_borrado(elem_1(), new Object[]{1});
            System.out.println("");
            probando_borrado(elem_2(), new Object[]{1});
            System.out.println("");
            probando_borrado(elem_3(), new Object[]{1});
            System.out.println("");
            limpieza_total();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }    
}