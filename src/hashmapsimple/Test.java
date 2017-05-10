package hashmapsimple;
public abstract class Test implements ITest
{
    protected void check(boolean condition){
        if(condition){
            Console.println(Console.ANSI_GREEN, "Prueba superada con exito, resultado: " + condition);
        } else {
            Console.println(Console.ANSI_RED, "Prueba fallida, resultado: " + condition);
        }
    }
}
