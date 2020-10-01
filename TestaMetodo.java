public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDaVyc = new Conta();

        contaDaVyc.saldo = 100;
        contaDaVyc.deposita(50);

        System.out.println(contaDaVyc.saldo);

        Conta contaDaLia = new Conta();
        contaDaLia.saldo = 50;
        contaDaLia.deposita(50);

        System.out.println(contaDaLia.saldo);

    }

}
