public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.setAno(ano);
        this.setMes(mes);
        this.setDia(dia);
    }

    public String getData() {
        return(this.dia + "/" + this.mes + "/" + this.ano);
    }

    public void setDia(int dia) {
        if(this.mes % 2 == 1){
            if(dia <= 31 && dia >= 1){
                this.dia = dia;
            }
            else {
                System.out.printf("Entre com um dia válido");
            }
        }
        else {
            if (this.mes == 2) {
                if (dia <= 29 && dia >= 1) {
                    this.dia = dia;
                } else {
                    System.out.printf("Entre com um dia válido");
                }
            } else {
                if (dia <= 30 && dia >= 1) {
                    this.dia = dia;
                } else {
                    System.out.printf("Entre com um dia válido");
                }
            }
        }
    }

    public void setMes(int mes) {
        if(mes <= 12 && mes >= 1) {
            this.mes = mes;
        }
        else {
            System.out.printf("Mês inválido");
        }
    }

    public void setAno (int ano) {
        this.ano = ano;
    }
}
