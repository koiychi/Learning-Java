public class PolyAbsIntTester {
    public static void main(String[] args) {
        Gadget g = new SmartGadget("Speaker");
        Gadget g2 = new Gadget("Basic Clock");

        System.out.println(g); //line A

        try {
            SmartGadget sg = (SmartGadget) g2; //line B
        } catch (ClassCastException exception) {
            System.out.println("Exception daw kay Line B: " + exception.getMessage());
        }
    }
}
