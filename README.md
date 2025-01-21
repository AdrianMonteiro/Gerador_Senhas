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

### Algumas Funções Extras:
1. O programa estabelece um tamanho mínimo de 6 caracteres para a geração da senha, sendo 8 caracteres o valor recomendado. Isso ocorre por questões de segurança, pois senhas muito curtas podem ser mais suscetíveis a ataques. Caso o usuário tente criar uma senha com menos de 6 caracteres, um alerta será exibido na tela, impedindo a criação da senha e garantindo que a senha tenha um tamanho mínimo seguro.
   <p align="center">
    <img src="https://github.com/user-attachments/assets/e012c93f-fba8-48d3-8f2f-fa12832ae6b3" alt="image" />
  </p>
2. O programa também estabelece um valor máximo para o comprimento da senha, limitando-a a 25 caracteres. Isso é feito para garantir um equilíbrio entre segurança e praticidade, evitando senhas excessivamente longas que poderiam ser difíceis de gerenciar ou de utilizar. 
 <p align="center">
    <img src="https://github.com/user-attachments/assets/77279a8b-d561-4dad-b161-3b0729e3f4b5" alt="image" />
  </p>
3. Também garante que o usuário forneça apenas entradas válidas, ou seja, apenas números são permitidos. Letras e caracteres especiais não serão validados, e um alerta será exibido para informar o usuário sobre o erro, orientando-o a fornecer uma senha com os caracteres corretos.
  <p align="center">
    <img src="https://github.com/user-attachments/assets/4d9a826a-99c0-4f6e-a93c-047c7cdb160c" alt="image" />
  </p>
4. A função de copiar exibe um alerta informando que a senha foi copiada com sucesso e agora está na área de transferência do usuário, pronta para ser utilizada.
 <p align="center">
    <img src="https://github.com/user-attachments/assets/4ad6e920-bf3a-4e3b-befc-cdecee46c54a" alt="image" />
  </p>

## Requisitos:
- Java 11 ou superior.
- JavaFX (configuração manual necessária se estiver usando Java 11 ou superior).
  
