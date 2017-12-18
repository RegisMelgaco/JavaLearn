public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private Data entradaNoBanco;
    private String rg;
    private static int incremental = 1;
    private int identificador;

    public Funcionario(String nome, String departamento, double salario, Data entradaNoBanco, String rg){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.entradaNoBanco = entradaNoBanco;
        this.rg = rg;
        this.identificação();
    }

    public Funcionario() {

    }

    private void identificação(){
        this.identificador = incremental;
        incremental++;
    }

    public void recebeAumento(double aumento){
        this.salario += aumento;
    }

    public double calculaGanhoAnual(){
        return this.salario*12;
    }

    public void mostra(){
        System.out.println("nome: " + this.nome +"\n" +
                           "departamento: " + this.departamento + "\n" +
                           "salario: " + this.salario + "\n" +
                           "entrada no banco: " + this.entradaNoBanco.getData() + "\n" +
                           "RG: " + this.rg + "\n");
    }

    public String getNome(){
        return this.nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String novoDepartamento){
        this.departamento = novoDepartamento;
    }

    public String getRg() {
        return rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEntradaNoBanco(Data entradaNoBanco) {
        this.entradaNoBanco = entradaNoBanco;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdentificador() {
        return this.identificador;
    }
}
