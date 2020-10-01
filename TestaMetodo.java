public class TestaMetodo {

    public static void main(String[] args) {
        /*
        Primeira conta bancária
         */

        Conta contaDaVyc = new Conta();

        contaDaVyc.saldo = 100;
        contaDaVyc.deposita(50);

        System.out.println("Conta da vyc: " + contaDaVyc.saldo);
        boolean conseguiuRetirar = contaDaVyc.saca(300);
        System.out.println(contaDaVyc.saldo);
        System.out.println(conseguiuRetirar);

        /*
        Segunda conta bancária
         */

        Conta contaDaLia = new Conta();
        contaDaLia.saldo = 50;
        contaDaLia.deposita(50);
        System.out.println("Conta da Lia: " + contaDaLia.saldo);
        conseguiuRetirar = contaDaLia.saca(50);
        System.out.println(contaDaLia.saldo);
        System.out.println(conseguiuRetirar);

    }

}
