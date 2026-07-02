package academy.devdojo.maratonajava.javacore.Jenumeração.dominio;

public enum Level {
    HIGH{
        @Override
        public  String toLowerCase(){
            return HIGH.toString().toLowerCase();
        }
    },
    MEDIUM{
        @Override
        public String toLowerCase() {
            return MEDIUM.toString().toLowerCase();
        }
    },
    LOW{
        @Override
        public String toLowerCase() {
            return LOW.toString().toLowerCase();
        }
    };




    public abstract String toLowerCase();
}
