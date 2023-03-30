
class DirectorCasa {
    private ConstructorCasa constructorCasa;


    public DirectorCasa(ConstructorCasa constructorCasa) {
        this.constructorCasa = constructorCasa;
    }


    public void construiesteCasa() {
        constructorCasa.construiesteFundatie();
        constructorCasa.construiestePereti();
        constructorCasa.construiesteAcoperis();
    }


    public Casa getCasa() {
        return constructorCasa.getCasa();
    }
}





