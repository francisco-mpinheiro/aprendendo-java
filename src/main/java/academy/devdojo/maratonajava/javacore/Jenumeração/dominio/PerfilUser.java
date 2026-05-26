package academy.devdojo.maratonajava.javacore.Jenumeração.dominio;

public enum PerfilUser {
    ADMIN{
        @Override
        public String mostrarPapel(String papel) {
            return papel;
        }
    }

    ,

    MOD{
        @Override
        public String mostrarPapel(String papel){
            return papel;
        }
    },

    PLAYER{
        @Override
        public String mostrarPapel(String papel){
            return papel;
        }

    };


    public abstract String mostrarPapel(String papel);
}
