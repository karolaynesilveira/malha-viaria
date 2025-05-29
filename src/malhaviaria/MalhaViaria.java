package malhaviaria;

class MalhaViaria {
    private int[][] grade;
    private int linhas, colunas;
    
    public MalhaViaria(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.grade = new int[linhas][colunas];
    }
    
    public void definirCelula(int linha, int coluna, int valor) {
        grade[linha][coluna] = valor;
    }
    
    public int obterCelula(int linha, int coluna) {
        return grade[linha][coluna];
    }
    
    public int getLinhas() { return linhas; }
    public int getColunas() { return colunas; }
}
