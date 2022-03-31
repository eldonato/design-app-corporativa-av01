public class Main {

    public static void main(String[] args) {

        Contato c = new Contato.Builder()
                .nome("Leonardo")
                .sobrenome("Donato")
                .email("leonardo@email.com")
                .numero("88888888")
                .numeroAlternativo("988888888")
                .endereco("casa")
                .build();

        System.out.println(c);
    }

}
