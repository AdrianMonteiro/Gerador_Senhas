//Importações
import java.security.SecureRandom;

public class GeradorDeSenhas {
    //Definindo os caracteres que poderam ser usados na senha
    private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*()_+=-[]{}:;.,<>0123456789";

    //Metódo para gerar a senha com o comprimento desejado
    public static String gerarSenha(int comprimento){
        SecureRandom valorRandom = new SecureRandom();//cria o gerador de números aleatórios
        StringBuilder senha = new StringBuilder(comprimento);//string builder para contruír a senha

        for(int i =0; i < comprimento; i++){
            int indice = valorRandom.nextInt(CARACTERES.length());//gera um indice aleatório
            senha.append(CARACTERES.charAt(indice));//->adiona o caracter escolhido para o StringBuilder
        }
        return senha.toString();//transformando o stringbuilder em uma string
    }
}
