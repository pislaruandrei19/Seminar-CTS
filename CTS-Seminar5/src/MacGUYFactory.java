public class MacGUYFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
