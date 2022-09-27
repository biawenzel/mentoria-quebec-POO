public class Vendedor extends Funcionario {
    private Double comissao;
    private int numeroDeVendas;

    public Vendedor(String nome, String cpf, Double comissao, int numeroDeVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroDeVendas = numeroDeVendas;
    }

    @Override
    public double calcularSalario() {
        return super.getSALARIO_MINIMO() + (this.comissao * this.numeroDeVendas);
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public int getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }
}
