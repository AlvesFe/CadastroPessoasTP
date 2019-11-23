/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastropessoas;

/**
 *
 * @author Felipe
 */
public class PessoaFisica extends Pessoa {

    public void ObterDados(String nome, String email, String cpf) {
        this.identificacao = nome;
        this.email = email;
        this.nroDoc = cpf;
    }

    public String ExibirNome() {
        return this.identificacao;
    }

    public String ExibirEmail() {
        return this.email;
    }

    public String ExibirCpf() {
        return this.nroDoc;
    }
}
