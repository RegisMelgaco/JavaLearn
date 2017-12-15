public class Main {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Joses Valdo",
                "Publicidade",
                1000.00,
                "01/02/1960",
                "333.33");

        Funcionario f2 = f1;

        System.out.println(f1.getSalario());

        f2.recebeAumento(100.00);

        System.out.println(f1.getSalario());
        System.out.println(f2.getSalario());

        if(f1 == f2) {
            System.out.println("merma coisa");
        }
        else {
            System.out.println("naum e a merma coisa nao");
        }
    }
}
