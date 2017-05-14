package hashmapsimple;
public abstract class Test implements ITest
{
    protected void comprobar_que(boolean condition) throws Exception{        
        if(!condition){           
            throw new Exception();
        }
    }
}
