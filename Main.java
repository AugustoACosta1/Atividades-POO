
public class Main {

    public static void main(String[] args) {

        // FATURA

        System.out.println("=== ATIVIDADE - FATURA ===");

        Fatura fatura = new Fatura(1, "Teclado", 2, 150.00);

        System.out.println("Numero do item: " + fatura.getNumeroItem());
        System.out.println("Descricao: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preco unitario: R$ " + fatura.getPrecoUnitario());
        System.out.println("Valor da fatura: R$ " + fatura.calcular_valor_fatura());


        // ELEVADOR

        System.out.println("\n=== ATIVIDADE - ELEVADOR ===");

        Elevador elevador = new Elevador(5, 10);

        elevador.entrar();
        elevador.entrar();
        elevador.subir();

        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas no elevador: " + elevador.getPessoasPresentes());


        // EXERCICIO 1 - PESSOA

        System.out.println("\n=== EXERCICIO 1 - PESSOA ===");

        Pessoa pessoa = new Pessoa("Carlos", 25, "12345678900");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());


        // PRODUTO

        System.out.println("\n=== EXERCICIO - PRODUTO ===");

        Produto produto = new Produto("Mouse", 80.00, 10);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor total: R$ " + produto.calcularValorTotal());


        //  CONTA BANCARIA

        System.out.println("\n=== EXERCICIO - CONTA BANCARIA ===");

        ContaBancaria conta = new ContaBancaria(123, "Joao");

        conta.depositar(500);
        conta.sacar(100);

        System.out.println("Numero: " + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$ " + conta.getSaldo());


        // CARRO

        System.out.println("\n=== EXERCICIO - CARRO ===");

        Carro carro = new Carro("Toyota", "Corolla", 2024);

        carro.acelerar(60);
        carro.frear(20);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual());


        // LIVRO

        System.out.println("\n=== EXERCICIO - LIVRO ===");

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        livro.emprestar();

        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano: " + livro.getAnoPublicacao());
        System.out.println("Disponivel: " + livro.isDisponivel());


        // FUNCIONARIO

        System.out.println("\n=== EXERCICIO - FUNCIONARIO ===");

        Funcionario funcionario = new Funcionario("Pedro", 3000, "Analista");

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salario base: R$ " + funcionario.getSalarioBase());
        System.out.println("Salario liquido: R$ " + funcionario.calcularSalarioLiquido());


        // RETANGULO

        System.out.println("\n=== EXERCICIO - RETANGULO ===");

        Retangulo retangulo = new Retangulo(5, 10);

        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Area: " + retangulo.calcularArea());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());


        // ALUNO

        System.out.println("\n=== EXERCICIO - ALUNO ===");

        Aluno aluno = new Aluno(1001, "Maria", 8.5);

        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Media final: " + aluno.getMediaFinal());

        if (aluno.verificarAprovacao()) {
            System.out.println("Situacao: APROVADO");
        } else {
            System.out.println("Situacao: REPROVADO");
        }


        // FILME

        System.out.println("\n=== EXERCICIO - FILME ===");

        Filme filme = new Filme("Interestelar", "Christopher Nolan", 2014, 169);

        filme.exibirInformacoes();


        // CELULAR

        System.out.println("\n=== EXERCICIO - CELULAR ===");

        Celular celular = new Celular("Samsung", "Galaxy S25", 4500, 256);

        celular.exibirResumo();

    }
}
