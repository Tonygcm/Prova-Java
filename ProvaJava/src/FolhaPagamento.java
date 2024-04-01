public class FolhaPagamento {
    // salário bruto, descontos, contribuições e salário líquido

    private String nomefunc;
    private double horastrab;
    private double valorhora;
    private double bruto;
    private double ir;
    private double inss;
    private double liquido;
    private double fgts;

    public double getFgts() {
        return fgts;
    }

    public double getLiquido() {
        return liquido;
    }

    public double getBruto() {
        return bruto;
    }

    public double getIr() {
        return ir;
    }

    public double getInss() {
        return inss;
    }    

    public String getNomefunc() {
        return nomefunc;
    }

    public void setNomefunc(String nomefunc) {
        this.nomefunc = nomefunc;
    }

    public double getHorastrab() {
        return horastrab;
    }

    public void setHorastrab(double horastrab) {
        this.horastrab = horastrab;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public FolhaPagamento() {

    }

    public FolhaPagamento(String nomefunc, double horastrab, double valorhora){
        this.nomefunc = nomefunc;
        this.horastrab = horastrab;
        this.valorhora = valorhora;
    }

    public double salBruto() {
        bruto = (horastrab * valorhora);
        return bruto;
    }

    public double calcularIr() {

        /*• IR:
        o Até R$ 1.372,81: Isento
        o De R$ 1.372,82 até R$ 2.743,25: 15% de desconto, menos parcela a deduzir de R$ 205,92
        o Acima de R$ 2.743,25: 27,5% de desconto, menos parcela a deduzir de R$ 548,82    
        */

        if(bruto >= 2743.25){
            ir = bruto * (0.275 - 548.82);
        }
        else if(bruto >= 1372.82 || bruto <= 2743.25){
            ir = bruto * (0.15 - 205.92);
        }
        else{
            ir = 0;
        }
        return ir;

    }

    public double calcularInss() {

        /*INSS:
        o Até R$ 868,29: 8% de desconto
        o De R$ 868,30 até R$ 1.447,14: 9% de desconto
        o De R$ 1.447,15 até R$ 2.894,27: 11% de desconto
        o Acima de R$ 2.894,28: Valor fixo de R$ 318,37
        */

        if(bruto <= 868.29){
            inss = (bruto * 0.08);
        }
        else if(bruto >= 868.30 || bruto <= 1447.14){
            inss = (bruto * 0.09);
        }
        else if(bruto >= 1447.15 || bruto <= 2894.27){
            inss = (bruto * 0.11);
        }
        else{
            inss = bruto - 318.37;
        }
        return inss;

    }

    public double calcularFgts() {
       fgts = bruto * 0.08;
       return fgts;
    }

    public double calcularSalLiquido() {
        liquido = bruto - ( ir + inss);
        return liquido;
    }

}
