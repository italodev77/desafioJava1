package Desafio1;

public class Desafio1 {
    public static void main(String[] args) {

        class Ninja {
            private String nome;
            private int idade;
            private String missao;
            private String rankMissao;
            private boolean statusMissao;

            public Ninja(String nome, int idade, String missao, String rankMissao, boolean statusMissao) {
                this.nome = nome;
                this.idade = idade;
                this.missao = missao;
                this.rankMissao = rankMissao;
                this.statusMissao = statusMissao;
            }

            public void concluirMissao() {
                if ((this.rankMissao.equals("C") || this.rankMissao.equals("D")) && this.idade < 15) {
                    this.statusMissao = true;
                    System.out.println("Missão concluída com sucesso por " + this.nome);
                } else if (!this.rankMissao.equals("C") && !this.rankMissao.equals("D") && this.idade >= 15) {
                    this.statusMissao = true;
                    System.out.println("Missão concluída por " + this.nome);
                } else {
                    this.statusMissao = false;
                    System.out.println("Missão não pode ser concluída por " + this.nome);
                }
            }
        }

        Ninja ninja1 = new Ninja("Naruto", 16, "Proteger Konoha", "D", false);
        Ninja ninja2 = new Ninja("Sasuke", 24, "Matar Danzo", "S", false);
        Ninja ninja3 = new Ninja("Hinata", 23, "Amar o naruto", "SS", false);

        ninja1.concluirMissao();
        ninja2.concluirMissao();
        ninja3.concluirMissao();
    }
}
