public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Leonardo", "88888888");
        Carro carro = new Carro("Chevrolet", "Corsa");

        ConsertoFacade facade = new ConsertoFacade(cliente, carro);
        facade.consertarCarro("direção emperrada");

    }

}
