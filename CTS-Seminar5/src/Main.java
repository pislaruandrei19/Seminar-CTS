public class Main {
    public static void main(String[] args) {
        PizzaFactory.createPizza("cheese").descriere();
        PizzaFactory.createPizza("pepperoni").descriere();
        PizzaFactory.createPizza("bacon").descriere();
        CatFactory catFactory = new CatFactory();
        catFactory.createAnimal().descriere();
        DogFactory dogFactory = new DogFactory();
        dogFactory.createAnimal().descriere();
        GirafaFactory girafaFactory = new GirafaFactory();
        girafaFactory.createAnimal().descriere();

        WindowsGUIFactory windowsGUIFactory  = new WindowsGUIFactory();
        windowsGUIFactory.createButton().descriere();
        windowsGUIFactory.createMenu().descriere();

        MacGUYFactory macGUYFactory = new MacGUYFactory();
        macGUYFactory.createButton().descriere();
        macGUYFactory.createMenu().descriere();
    }
}