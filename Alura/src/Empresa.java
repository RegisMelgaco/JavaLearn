public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int numeroDeFuncionarios){
        this.nome = nome;
        this.cnpj = cnpj;

        funcionarios = new Funcionario[numeroDeFuncionarios];
    }

    public void adicionaFuncionario(String nome, String departamento, double salario, Data entradaNoBanco, String rg){
        boolean temEspaço = false;
        for(int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] == null) {
                funcionarios[i] = new Funcionario(nome, departamento, salario, entradaNoBanco, rg);
                temEspaço = true;
                break;
            }
        }
        if(!temEspaço) {
            System.out.println("Não há espaço para um novo funcionário na array!");
        }
    }

    public String getNomeDosFuncionarios() {
        String nomes = "";
        for(int i = 0; i < funcionarios.length; i++){
            nomes += funcionarios[i].getNome() + " ";
        }
        return nomes;
    }

    public String getTodasAsInformaçõesDosFuncionarios() {
        String informações = "";
        for(int i = 0; i < funcionarios.length; i++){
            informações += funcionarios[i].getNome() + "\n";
            informações += funcionarios[i].getDepartamento() + "\n";
            informações += funcionarios[i].getRg() + "\n";
            informações += funcionarios[i].getSalario() + "\n";
            informações += "\n";
        }
        return informações;
    }

    public boolean temEsseFuncionário(String nome) {
        boolean tem = false;
        for(int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i].getNome() == nome) {
                tem = true;
                break;
            }
        }
        return tem;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }
}
