public class Controller {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.initialisieren();
    }

    private void initialisieren() {
        Model model = new Model();
        new View(model);
    }
}