
class Fatura {

    private int numeroItem;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Fatura(int numeroItem, String descricao, int quantidade, double precoUnitario) {

        this.numeroItem = numeroItem;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    public double calcular_valor_fatura() {
        return quantidade * precoUnitario;
    }
}


class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int capacidade, int totalAndares) {

        this.andarAtual = 0;
        this.totalAndares = Math.max(0, totalAndares);
        this.capacidade = Math.max(0, capacidade);
        this.pessoasPresentes = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        if (andarAtual >= 0 && andarAtual <= totalAndares) {
            this.andarAtual = andarAtual;
        }
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        if (totalAndares >= andarAtual) {
            this.totalAndares = totalAndares;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade >= pessoasPresentes && capacidade >= 0) {
            this.capacidade = capacidade;
        }
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        if (pessoasPresentes >= 0 && pessoasPresentes <= capacidade) {
            this.pessoasPresentes = pessoasPresentes;
        }
    }

    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
        }
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }
}


class Pessoa {

    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {

        this.nome = nome;
        this.idade = Math.max(0, idade);
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}


class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {

        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }
}


class ContaBancaria {

    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular) {

        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }
}


class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(double valor) {
        if (valor > 0) {
            velocidadeAtual += valor;
        }
    }

    public void frear(double valor) {
        if (valor > 0) {
            velocidadeAtual -= valor;

            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }
    }
}


class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao) {

        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
        }
    }
}


class Funcionario {

    private String nome;
    private double salarioBase;
    private String cargo;

    public Funcionario(String nome, double salarioBase, String cargo) {

        this.nome = nome;
        setSalarioBase(salarioBase);
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double calcularSalarioLiquido() {
        return salarioBase * 0.90;
    }
}


class Retangulo {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {

        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}


class Aluno {

    private int matricula;
    private String nome;
    private double mediaFinal;

    public Aluno(int matricula, String nome, double mediaFinal) {

        this.matricula = matricula;
        this.nome = nome;
        this.mediaFinal = mediaFinal;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public boolean verificarAprovacao() {
        return mediaFinal >= 6;
    }
}


class Filme {

    private String titulo;
    private String diretor;
    private int anoLancamento;
    private int duracao;

    public Filme(String titulo, String diretor, int anoLancamento, int duracao) {

        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibirInformacoes() {

        System.out.println("Titulo: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Duracao: " + duracao + " minutos");
    }
}


class Celular {

    private String marca;
    private String modelo;
    private double preco;
    private int armazenamento;

    public Celular(String marca, String modelo, double preco, int armazenamento) {

        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.armazenamento = armazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        if (armazenamento > 0) {
            this.armazenamento = armazenamento;
        }
    }

    public void exibirResumo() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Armazenamento: " + armazenamento + " GB");
    }
}

