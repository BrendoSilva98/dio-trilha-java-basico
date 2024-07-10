public class Carro extends Veiculo{

    public void ligar(){
        confereCambio();
        confereCombostivel();
        System.out.println("Carro Ligado");
    }
    private void confereCombostivel(){
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }

}
