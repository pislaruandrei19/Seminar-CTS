public class Main {

    public static void main(String[] args) {
        FabricaDeMasini fabricaDeMasini = FabricaDeMasini.getInstance();

        // adauga o masina
        Masina masina1 = new Masina("Ford", "Fiesta", "Rosu");
        fabricaDeMasini.adaugaDateMasina(masina1);

        // modifica o masina
        Masina masina2 = new Masina("Audi", "A4", "Alb");
        fabricaDeMasini.modificaDateMasina(masina2);

        // alte operatii pe sistemul de monitorizare a productiei
        // ...
    }

}