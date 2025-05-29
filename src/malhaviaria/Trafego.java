package malhaviaria;

class Trafego {
    private MalhaViaria malha;
    private int maxVeiculos = 5;
    
    public Trafego() {
        malha = new MalhaViaria(10, 10);
    }
    
    public void iniciarSimulacao() {
        System.out.println("Simulacao de trafego iniciada");
        
        for (int i = 1; i <= 3; i++) {
            Veiculo veiculo = new Veiculo(i, new Posicao(0, 0));
            veiculo.start();
        }
    }
    
    public void definirMaxVeiculos(int max) {
        this.maxVeiculos = max;
    }
    
    public MalhaViaria getMalha() {
        return malha;
    }
}
