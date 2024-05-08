import java.util.Scanner;

class Livrodenotas {
    Scanner scanner = new Scanner(System.in);
    private int numeroAlunos;
    private double[] medias;

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
        this.medias = new double[numeroAlunos];
    }

    public void calcularMediaDeCadaAluno() {
        System.out.println("\nDigite a quantidade de alunos de alunos: ");
        numeroAlunos = scanner.nextInt();
        while (numeroAlunos <= 0) {
            System.out.println("Número de alunos inválido. Digite um número válido maior que 0:");
            numeroAlunos = scanner.nextInt();
        }
        setNumeroAlunos(numeroAlunos);

        for (int i = 0; i < numeroAlunos; i++) {
            double somaNotas = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.println("Digite a nota da A" + j + " para o " + (i + 1) + " aluno: ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }
            double media = somaNotas / 3;
            medias[i] = media;
            System.out.println("A média do " + (i + 1) + " aluno foi: " + medias[i]);
        }
    }

    public void calcularMediaDaTurma() {
        double soma = 0;
        for (double media : medias) {
            soma += media;
        }

        double mediaGeral = soma / numeroAlunos;
        System.out.println("A média geral da turma é: " + mediaGeral);
    }

    public static void main(String[] args) {
        Livrodenotas livroDeNotas = new Livrodenotas();

        livroDeNotas.calcularMediaDeCadaAluno();
        livroDeNotas.calcularMediaDaTurma();

        livroDeNotas.scanner.close();
    }
}
