public class Contato {

    private String nome;
    private String sobrenome;
    private String numero;
    private String numeroAlternativo;
    private String endereco;
    private String email;

    private Contato(){}

    public Contato(String nome, String sobrenome, String numero, String numeroAlternativo, String endereco, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
        this.numeroAlternativo = numeroAlternativo;
        this.endereco = endereco;
        this.email = email;
    }

    public static class Builder{

        private String nome;
        private String sobrenome;
        private String numero;
        private String numeroAlternativo;
        private String endereco;
        private String email;

        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }
        public Builder sobrenome(String sobrenome){
            this.sobrenome = sobrenome;
            return this;
        }
        public Builder numero(String numero){
            this.numero = numero;
            return this;
        }
        public Builder numeroAlternativo(String numeroAlternativo){
            this.numeroAlternativo = numeroAlternativo;
            return this;
        }
        public Builder endereco(String endereco){
            this.endereco = endereco;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Contato build(){
            return new Contato(nome, sobrenome, numero, numeroAlternativo, endereco, email);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumeroAlternativo() {
        return numeroAlternativo;
    }

    public void setNumeroAlternativo(String numeroAlternativo) {
        this.numeroAlternativo = numeroAlternativo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", numero='" + numero + '\'' +
                ", numeroAlternativo='" + numeroAlternativo + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
