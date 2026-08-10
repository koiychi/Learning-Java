public class ShowcaseTester {
    public static void main (String[] Koiychi) {
        Performable[] list = {
            new Guitar("Koi", 5),
            new Piano("Kai", 24),
            new Dancer("Koi")
        };

        for(Performable show : list) {
            show.perform();
            System.out.println("Need Stage? " + show.needsStage() + "\n");

        }


    }
}
