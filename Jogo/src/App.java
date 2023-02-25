public class App {
    public static void main(String[] args) throws Exception {
       var jogador = new Jogador("Leonardo");
       jogador.receberDano(100);
       System.out.println(jogador.getNome());
        System.out.println(jogador.getHp());
    }
}
