package hashmapsimple;
public class DownTest implements ITest
{
    private void probando_borrado_normal(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO BORRADO NORMAL--");
        System.out.println(" ");
        System.out.println("* antes: ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
        System.out.println(" ");
        System.out.println("* después: ");
        col.remove(1);
        col.remove(3);
        col.remove(6);
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    private void probando_borrado_con_claves_nulas(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO BORRADO CON CLAVES INEXISTENTES--");
        System.out.println(" ");
        System.out.println("* antes: ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
        System.out.println(" ");
        System.out.println("* después: ");
        col.remove(1);
        col.remove(null);
        col.remove(3);
        col.remove(null);
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    private void probando_borrado_con_claves_inexistentes(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO BORRADO CON CLAVES INEXISTENTES--");
        System.out.println(" ");
        System.out.println("* antes: ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
        System.out.println(" ");
        System.out.println("* después: ");
        col.remove(1);
        col.remove(7);
        col.remove(3);
        col.remove(9);
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    private void limpieza_total(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        System.out.println("\t ---PROBANDO LIMPIEZA DE INFORMACIÓN---");
        System.out.println(" ");
        System.out.println("* antes: ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
        System.out.println(" ");
        System.out.println("* después: ");
        col.clear();
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    @Override
    public void test() {
        probando_borrado_normal();
        System.out.println("");
        probando_borrado_con_claves_nulas();
        System.out.println("");
        probando_borrado_con_claves_inexistentes();
        System.out.println("");
        limpieza_total();
    }    
}