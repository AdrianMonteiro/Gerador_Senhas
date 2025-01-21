# Gerador de Senhas Seguras
<p align="center">
  <img src="https://github.com/user-attachments/assets/174cd999-1f8f-4833-9a53-bfa837ceae64" alt="image" />
</p>

Gerador de Senhas Seguras é um aplicativo desenvolvido em Java que permite ao usuário gerar senhas aleatórias e seguras com um comprimento personalizado. Utilizando a classe SecureRandom para garantir a aleatoriedade segura, o aplicativo oferece uma interface gráfica simples e intuitiva construída com JavaFX. 
Este aplicativo Java utiliza duas bibliotecas principais:  
## 1. SecureRandom: 
É uma classe da biblioteca padrão do Java (pacote java.security) responsável por gerar valores aleatórios de forma segura, utilizando fontes confiáveis de entropia, como o sistema operacional ou hardware especializado. Por ser nativa do Java, não é necessário adicionar dependências externas. Ela já está sendo importada no código a partir do pacote adequado e pode ser utilizada diretamente no projeto.

## 2. JavaFX:
JavaFX é uma biblioteca open-source para criação de interfaces gráficas em Java, oferecendo ferramentas para gráficos, animações e controles interativos. A partir do Java 11, o JavaFX foi removido da JDK e se tornou um projeto separado, OpenJFX. Portanto, é necessário configurar o SDK do JavaFX no ambiente de desenvolvimento para usá-lo.

### Configurando o JavaFX:
1. Baixar o SDK:
- Acesse https://gluonhq.com/products/javafx/ e baixe o SDK adequado para seu sistema operacional(Recomendado a versão 23.0.1, a utilizada no projeto).
2. Adicionar o JavaFX ao seu projeto:
- No seu IDE (como IntelliJ IDEA, Eclipse, etc.), adicione o JavaFX nas configurações de dependências do seu projeto.
- Observação: O próprio site do JavaFX oferece documentação detalhada que ensina como configurar o JavaFX na sua IDE. Você pode acessar a documentação em https://openjfx.io/.
3. Configuração de módulo:
- Será necessário configurar o module-path para incluir o JavaFX. Para isso, adicione o caminho do SDK do JavaFX ao compilar e executar o seu projeto.
- Exemplo: --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
- Observação: O próprio site do JavaFX oferece documentação detalhada que ensina como configurar o módulo JavaFX na sua IDE. Você pode acessar a documentação em https://openjfx.io/.

## Requisitos:
- Java 11 ou superior.
- JavaFX (configuração manual necessária se estiver usando Java 11 ou superior).
  
