public class Singleton {
    private static Singleton singleInstance = null;

    private Singleton() {
        System.out.println("Instancia criada!");
    }

    public static Singleton obtemInfo() {
        if(singleInstance == null) {
            singleInstance = new Singleton();
        }

        return singleInstance;
    }

    public static void main(String[] args) {
        Singleton sgl = Singleton.obtemInfo();
        System.out.println(sgl);

        // System.out.println(Singleton.obtemInfo()); 

    }
}
