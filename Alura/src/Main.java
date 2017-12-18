public class Main {
    public static void main(String[] args){
        Data entrada = new Data(1,3,1960);

        Funcionario f = new Funcionario("Vlad", "humanos",3, entrada, "3456789");

        System.out.println(f.getNome());
    }
}
