public class CriaConta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaconta = new Conta();
        segundaconta.saldo = 50;
        System.out.println(segundaconta.saldo);

        System.out.println("Primeira conta tem " + primeiraConta.saldo);
        System.out.println("Segunda conta tem " + segundaconta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaconta.agencia);

        segundaconta.agencia = 146;
        System.out.println("agora a segunda conta esta" +
                " na agencia " + segundaconta.agencia);

        if(primeiraConta == segundaconta) {
            System.out.println("São a mesma conta!");
        } else {
            System.out.println("Contas diferentes!");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaconta);


    }

}
