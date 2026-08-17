package entities;

public class Alunos {

    private String nome;
    private Double peso;
    private Double altura;
    private String objetivo;

    public Alunos(String nome, Double peso, Double altura, String objetivo) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.objetivo = objetivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }


    public double calcularIMC() {
        return peso / (altura * altura);
    }

    @Override
    public String toString() {
        String n1 = System.lineSeparator();
        return "Aluno = " + nome + n1 +
                "Peso = " + peso + " kgs" +n1 +
                "Altura = " + altura + "m" + n1 +
                "Objetivo = " + objetivo;
    }
}
