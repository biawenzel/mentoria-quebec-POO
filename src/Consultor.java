public class Consultor extends Funcionario {
    private Double valorHora;
    private long horasTrabalhadas;

    public Consultor(String nome, String cpf, Double valorHora, long horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return this.valorHora * this.horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public long getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(long horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }


}
