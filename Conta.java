class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Você adicionou " + valor + " na sua conta!");
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de " + saldo + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Você não tem saldo suficiente para esse saque!");
            return false;
        }
    }

}
