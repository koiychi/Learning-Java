public class Gadget {
    private String label;

    public Gadget(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Gadget: " + label;
    }
}
