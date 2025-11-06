package com.heranca.app;

import com.heranca.models.PessoaJuridica;
import com.heranca.models.PessoaFisica;
public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        usuario.nome = "Carlos da Rocha";
        usuario.email = "carlosbob@gmail.com";
        usuario.telefone = "(061) 992996171";
        usuario.idade = 37;

        empresa.razaoSocial = "Carlos LTDA";
        empresa.nomeFantasia = "Cyber café Systems";
        empresa.cnpj = " 55.076.551/0001-20";
        empresa.email = "carlosbob27@gmail.com";



        System.out.println("Nome do usuário: " + usuario.nome);
        System.out.println("CPF do usuario:" + usuario.cpf);
        System.out.println("E-mail do usuário: " + usuario.email );
        System.out.println("Telefone do usuário: " + usuario.telefone);
        System.out.println("idade do usuario: " + usuario.idade + "anos");

        System.out.println("----------");

        System.out.println("Razão Social da empresa " + empresa.razaoSocial);
        System.out.println("nome da empresa: " + empresa.nomeFantasia);
        System.out.println("CNPJ da empresa: " + empresa.cnpj);
        System.out.println("E-mail da empresa: " + empresa.email);
        System.out.println("Telefone da empresa: " + empresa.telefone);

    }
}
