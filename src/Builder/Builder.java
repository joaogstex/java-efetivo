package Builder;

import java.math.BigDecimal;

public class Builder {
    public static void main(String[] args) {
        Pessoa pessoa = Pessoa
    .builder()
    .nome("João")
    .altura(BigDecimal.valueOf(1.80))
    .bairro("Boulevard")
    .telefone("1381283213")
    .cidade("Salvador")
    .casado(false)
    .email("joao@GMAIL.com")
    .idade(21)
    .peso(BigDecimal.valueOf(80))
    .profissao("programador")
    .build();

    System.out.println(pessoa);

    }
}

interface PessoaBuilder {
    PessoaBuilder nome(String nome);
    PessoaBuilder idade(Integer idade);
    PessoaBuilder cidade(String cidade);
    PessoaBuilder bairro(String bairro);
    PessoaBuilder telefone(String telefone);
    PessoaBuilder email(String email);
    PessoaBuilder peso(BigDecimal peso);
    PessoaBuilder altura(BigDecimal altura);
    PessoaBuilder casado(boolean casado);
    PessoaBuilder profissao(String profissao);
    Pessoa build();
}

class PessoaBuilderImpl implements PessoaBuilder {
    private String nome;
    private Integer idade;
    private String cidade;
    private String bairro;
    private String telefone;
    private String email;
    private BigDecimal peso;
    private BigDecimal altura;
    private boolean casado;
    private String profissao;

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder idade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public PessoaBuilder cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public PessoaBuilder bairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public PessoaBuilder telefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public PessoaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PessoaBuilder peso(BigDecimal peso) {
        this.peso = peso;
        return this;
    }

    public PessoaBuilder altura(BigDecimal altura) {
        this.altura = altura;
        return this;
    }

    public PessoaBuilder casado(boolean casado) {
        this.casado = casado;
        return this;
    }

    public PessoaBuilder profissao(String profissao) {
        this.profissao = profissao;
        return this;
    }

    public Pessoa build() {
        var pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setAltura(altura);
        pessoa.setBairro(bairro);
        pessoa.setCasado(casado);
        pessoa.setCidade(cidade);
        pessoa.setEmail(email);
        pessoa.setPeso(peso);
        pessoa.setProfissao(profissao);
        pessoa.setTelefone(telefone);
        return pessoa;
    }
}

class Pessoa {
private String nome;
    private Integer idade;
    private String cidade;
    private String bairro;
    private String telefone;
    private String email;
    private BigDecimal peso;
    private BigDecimal altura;
    private boolean casado;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public BigDecimal getPeso() {
        return peso;
    }
    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }
    public BigDecimal getAltura() {
        return altura;
    }
    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }
    public boolean isCasado() {
        return casado;
    }
    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public static PessoaBuilder builder() {
        return new PessoaBuilderImpl();
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", cidade=" + cidade + ", bairro=" + bairro + ", telefone="
                + telefone + "\n, email=" + email + ", peso=" + peso + ", altura=" + altura + ", casado=" + casado
                + ", profissao=" + profissao + "]";
    }
}
