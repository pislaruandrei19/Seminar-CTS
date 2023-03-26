public class FabricaDeMasini {

    private static FabricaDeMasini instance;

    private FabricaDeMasini() {
        // constructor privat pentru a preveni instantierea obiectelor din exteriorul clasei
    }

    public static synchronized FabricaDeMasini getInstance() {
        if (instance == null) {
            instance = new FabricaDeMasini();
        }
        return instance;
    }

    public void adaugaDateMasina(Masina masina) {
        // implementare adaugare date in sistemul centralizat
    }

    public void modificaDateMasina(Masina masina) {
        // implementare modificare date in sistemul centralizat
    }

    // alte metode necesare pentru gestionarea sistemului de monitorizare

}