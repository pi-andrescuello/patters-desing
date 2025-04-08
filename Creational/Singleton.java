public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        // Constructor privado para evitar instanciación externa
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("¡Singleton en acción!");
    }
}

