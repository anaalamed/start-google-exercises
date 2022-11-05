package startAtGoogle.p1_javaBestPracties.ch7_enums;

public class BirdClass {
    public enum Bird {
        EAGLE("sc eagle") {
            @Override
            public void sing() {
                System.out.println("kleek-kleek");
            }
        },
        PUFFIN("sc puffin") {
            @Override
            public void sing() {
                System.out.println("soft-soft");
            }
        },
        ROBIN("sc robin") {
            @Override
            public void sing() {
                System.out.println("kooo-kooo");
            }
        },
        KOEL("sc koel") {
            @Override
            public void sing() {
                System.out.println("cheerup");
            }
        };

        Bird(String scientificName) {
            this.scientificName = scientificName;
        }

        public final String scientificName;
        public abstract void sing();
    }



    public static void main(String[] args) {
        System.out.println( Bird.EAGLE + " - " + Bird.EAGLE.scientificName );
        Bird.EAGLE.sing();

        System.out.println( Bird.KOEL + " - " + Bird.KOEL.scientificName );
        Bird.KOEL.sing();

        System.out.println( Bird.PUFFIN + " - " + Bird.PUFFIN.scientificName );
        Bird.PUFFIN.sing();

        System.out.println( Bird.ROBIN + " - " + Bird.ROBIN.scientificName );
        Bird.ROBIN.sing();
    }
}
