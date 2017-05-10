package hashmapsimple;
public abstract class Test implements ITest
{
    MyMap<Integer,String>col= new MyMap();
    public Test() {
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
    }    
    protected void check(boolean condition){        
        if(condition){
            Console.println(Console.ANSI_GREEN, "Prueba superada con exito, resultado: " + condition);
        } else {
            Console.println(Console.ANSI_RED, "Prueba fallida, resultado: " + condition);
        }
    }
}
