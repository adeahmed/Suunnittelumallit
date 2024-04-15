package factorymethod;

public class Opiskelija extends AterioivaOtus {

        public Juoma createJuoma(){
            return new Juoma() {
                @Override
                public String toString() {
                    return "Mehu";
                }
        };
};
}
