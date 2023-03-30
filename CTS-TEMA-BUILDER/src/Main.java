
public class Main {
        public static void main(String[] args) {

                ConstructorCasa constructorCasa = new ConstructorCasaModerna();

                DirectorCasa directorCasa = new DirectorCasa(constructorCasa);
                directorCasa.construiesteCasa();
                Casa casaModerna = directorCasa.getCasa();


                System.out.println("Casa modernă are următoarele elemente:");
                System.out.println("Fundație: " + casaModerna.getFundatie());
                System.out.println("Pereți: " + casaModerna.getPereti());
                System.out.println("Acoperiș: " + casaModerna.getAcoperis());
        }
}