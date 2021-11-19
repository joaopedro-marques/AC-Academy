package com.joao.string;

public class StringConcat {
    public static void main(String[] args) {
        String string1 = "o céu é azul";
        System.out.println("Será que " + string1);

        //Também pode ser concatenado com o método concat:

        System.out.println(string1.concat("? Não o céu é rosa"));

        //Sempre lembrar que ao executar um método, a referência  ao objeto não irá mudar, apenas será executado.
        // PAra printar, seria necessário fazer a referência a esse objeto novamente, como abaixo:

        string1 = string1.concat(". Mentira, agora o céu é verde.");
        System.out.println(string1);


    }
}
