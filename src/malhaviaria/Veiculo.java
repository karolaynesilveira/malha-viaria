package malhaviaria;

class Veiculo extends Thread {
    private int id;
    private Posicao posicao;
    private boolean executando = true;
    
    public Veiculo(int id, Posicao posicaoInicial) {
        this.id = id;
        this.posicao = posicaoInicial;
    }
    
    @Override
    public void run() {
        System.out.println("Veiculo " + id + " iniciado");
        
        while (executando) {
            try {
                Thread.sleep(1000);
                System.out.println("Veiculo " + id + " se movimentando...");
            } catch (InterruptedException e) {
                break;
            }
        }
        
        System.out.println("Veiculo " + id + " finalizado");
    }
    
    public void pararVeiculo() {
        executando = false;
    }
    
    public int getIdVeiculo() { 
        return id; 
    }
    
    public Posicao getPosicao() { 
        return posicao; 
    }
}
