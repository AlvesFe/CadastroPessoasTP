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
public class PessoaJuridica extends Pessoa {

    //Criação do método que recebe os dados para os atributos da classe mãe
    public void ObterDados(String razaoSocial, String email, String cnpj) {
        this.identificacao = razaoSocial;
        this.email = email;
        this.nroDoc = cnpj;
    }
    
    //Criação da classe que exibe o atributo identificação quando chamado
    public String ExibirRazaoSocial() {
        return this.identificacao;
    }

    //Criação da classe que exibe o atributo e-mail quando chamado
    public String ExibirEmail() {
        return this.email;
    }

    //Criação da classe que exibe o atributo de numero de documento quando chamado
    public String ExibirCnpj() {
        return this.nroDoc;
    }
}
