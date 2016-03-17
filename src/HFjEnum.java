public class HFjEnum {
    enum Names {
        JERRY("solo-guitar") { public String sings() {
                return "sad";}
        },
        BOBBY("rythm-guitar") {
            public String sings() {
                return "rough";
            }
        },
        PHIL("bass-guitar");

        private String instrument;

        Names(String instrument) {
            this.instrument = instrument;
        }

        public String getInstrument() {
            return this.instrument;
        }
        public String sings(){
            return "rare";
        }
    }

    public static void main(String[] args) {
        for (Names n : Names.values()) {
            System.out.print(n);
            System.out.print(", instrument is " + n.getInstrument());
            System.out.println(", sounds " + n.sings());
        }
    }
}