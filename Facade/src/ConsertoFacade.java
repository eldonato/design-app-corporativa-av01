public class ConsertoFacade {

    Cliente cliente;
    Carro carro;

    public ConsertoFacade(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
    }

    public void consertarCarro(String problema){

        String marca = carro.getMarca();
        String nome = cliente.getNome();;
        String contato = cliente.getContato();

        System.out.println("Recebendo o carro "+marca+" do cliente "+ nome);

        System.out.println("Levando o carro " + marca+" para o conserto....");

        System.out.println("Resolvendo o problema de " + problema);
        System.out.println("Problema consertado");

        System.out.println("Contatando o cliente "+ nome + " através do número: "+contato);
    }


}
