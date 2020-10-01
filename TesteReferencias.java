public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraconta = new Conta();
        primeiraconta.saldo = 300;

        System.out.println("saldo da primeira conta : " + primeiraconta.saldo);

        Conta segundaConta = primeiraconta;

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);
        segundaConta.saldo += 100;
        System.out.println(primeiraconta.saldo);
        System.out.println(segundaConta.saldo);

        if(primeiraconta == segundaConta) {
            System.out.println("São a mesma conta");
        }

        System.out.println(primeiraconta);
        System.out.println(segundaConta);
    }
}
