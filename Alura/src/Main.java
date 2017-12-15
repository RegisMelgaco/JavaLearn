public class Main {
    public static void main(String[] args){
        Data entrada = new Data(1,3,1960);

        Funcionario f1 = new Funcionario("Joses Valdo",
                "Publicidade",
                1000.00,
                 entrada,
                "333.33");

        f1.mostra();
    }
}
