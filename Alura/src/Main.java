public class Main {
    public static void main(String[] args){
        Data entrada = new Data(1,3,1960);

        Empresa rra = new Empresa("RRA", "1234567890", 2);

        rra.adicionaFuncionario("Joses Vlado", "humanas", 2, entrada, "3456789");
        rra.adicionaFuncionario("Joses Vlado Segundo", "humanas", 2, entrada, "3456789");
        rra.adicionaFuncionario("Joses Vlado Terceiro", "humanas", 2, entrada, "3456789");

        System.out.println(rra.temEsseFuncionário("Joses Vlado Segundo"));
    }
}
