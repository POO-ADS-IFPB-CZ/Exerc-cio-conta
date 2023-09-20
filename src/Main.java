public class Main {
    public static void main(String[] args) {

        Conta contaA = new Conta("Paulo", 1);
        Conta contaB = new Conta("João", 2);

        System.out.println("Saldo de A: "+contaA.getSaldo());

        System.out.println(contaA.depositar(200));
        System.out.println(contaA.sacar(500));
        System.out.println(contaA.sacar(100));
        System.out.println(contaA.getSaldo());


    }
}