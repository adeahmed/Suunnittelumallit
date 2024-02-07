package factorymethod;

public class Opo extends AterioivaOtus {
    public Juoma createJuoma(){
           return new Juoma(){
                @Override
                public String toString(){
                     return "maito";
                }
              };
    };


}
