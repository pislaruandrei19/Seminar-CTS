
class ConstructorCasaModerna implements ConstructorCasa {
    private Casa casa = new Casa(); // Obiectul Casa ce va fi construit


    public void construiesteFundatie() {
        casa.setFundatie("Beton armat");
    }


    public void construiestePereti() {
        casa.setPereti("Sticlă și beton");
    }


    public void construiesteAcoperis() {
        casa.setAcoperis("Acoperiș plat");
    }


    public Casa getCasa() {
        return casa;
    }
}