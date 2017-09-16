package week8.laba39;

public class TryWithResource {
    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {
        AutoCloseable a = null;
        AutoCloseable b = null;
        a =factoryA.create();
        b = factoryB.create();
        try{
            body.runBody();
        }catch(Throwable bodyE){
            try {
                a.close();
            }catch(Throwable closeE){
                bodyE.addSuppressed(closeE);
            }
            try {
                b.close();
            }catch(Throwable closeB){
                bodyE.addSuppressed(closeB);
            }
            throw bodyE;
        }
        finally{
            b.close();
            a.close();
        }
    }
}

interface AutoCloseableFactory {
    public AutoCloseable create() throws Throwable;
}

interface TryBody {
    public void runBody() throws Throwable;
}
