//Importações
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class Main extends Application {
    @Override
    public void start(Stage palco){
        //Elementos
        Label lbtamSenha = new Label("Digite O Comprimento Da Senha Que Deseja: ");
        lbtamSenha.getStyleClass().add("lbltext");

        TextField camptamSenha = new TextField();
        camptamSenha.getStyleClass().add("txtf");
        camptamSenha.setText("8");//Sugestão para o tamanho de senha

        Button btn0 = new Button("Gerar");
        btn0.getStyleClass().add("btn1");

        Label lbgerSenha = new Label("Senha Gerada:");
        lbgerSenha.getStyleClass().add("lbltext");

        TextField campgerSenha = new TextField();
        campgerSenha.getStyleClass().add("txtf");
        campgerSenha.setEditable(false);//Não permitir editar

        Button btncopy = new Button("Copiar");
        btncopy.getStyleClass().add("btn1");

        //Ações para gerar a senha
        btn0.setOnAction(e -> {
            try {
                int tamanhoSenha = Integer.parseInt(camptamSenha.getText()); // Recebe o tamanho desejado
                //Validações de tamanho
                if (tamanhoSenha <=6) {
                    // Criar e mostrar a caixa de diálogo de erro
                    Alert alerta = new Alert(Alert.AlertType.ERROR, "Insira um valor válido (maior que 5).", ButtonType.OK);
                    alerta.setTitle("Erro");
                    alerta.setHeaderText("Tamanho inválido");
                    alerta.showAndWait();
                }
                else if (tamanhoSenha > 100) {
                Alert alerta = new Alert(Alert.AlertType.ERROR, "O comprimento máximo da senha é 100 caracteres.", ButtonType.OK);
                alerta.setTitle("Erro");
                alerta.setHeaderText("Tamanho excessivo");
                alerta.showAndWait(); }
                else {
                    String senha = GeradorDeSenhas.gerarSenha(tamanhoSenha); // Gera a senha
                    campgerSenha.setText(senha); // Mostrar a senha gerada
                    camptamSenha.clear();//Limpa o campo após gerar
                }
            } catch (NumberFormatException ex) {
                // Caso o usuário insira algo que não seja um número
                Alert alerta = new Alert(Alert.AlertType.ERROR, "Por favor, insira um número válido.", ButtonType.OK);
                alerta.setTitle("Erro");
                alerta.setHeaderText("Entrada Inválida");
                alerta.showAndWait();
            }
        });
        btncopy.setOnAction(e -> {
            // Pega o texto do campo 'campgerSenha'
            String texto = campgerSenha.getText();

            if (texto != null && !texto.isEmpty()) {
                // Copia para a área de transferência
                Clipboard clipboard = Clipboard.getSystemClipboard();
                ClipboardContent content = new ClipboardContent();
                content.putString(texto);
                clipboard.setContent(content);
                //Mostra mensagem de sucesso
                Alert alerta = new Alert(Alert.AlertType.INFORMATION, "Senha copiada para a área de transferência!", ButtonType.OK);
                alerta.setTitle("Sucesso");
                alerta.setHeaderText(null);
                alerta.showAndWait();
            } else{
                // Emite um alerta caso não haja texto
                Alert alerta = new Alert(Alert.AlertType.WARNING, "Não há senha para copiar.", ButtonType.OK);
                alerta.setTitle("Aviso");
                alerta.setHeaderText(null);
                alerta.showAndWait();
            }
        });
        //Criando e definindo o gridpane
        GridPane gp1 = new GridPane();
        gp1.setHgap(10);
        gp1.setVgap(10);
        gp1.setPadding(new Insets(20));
        gp1.setAlignment(Pos.CENTER);

        // Adicionando componentes com  o alinhamento
        gp1.addRow(0, lbtamSenha);
        gp1.addRow(1, camptamSenha,btn0);
        gp1.addRow(2, lbgerSenha);
        gp1.addRow(3, campgerSenha,btncopy);

        gp1.getStyleClass().add("gp1");

        Scene cena = new Scene(gp1,600,400);
        cena.getStylesheets().add(getClass().getResource("/Css/style.css").toExternalForm());//Acessar a folha css
        palco.setScene(cena);
        palco.setTitle("Password-Generator");
        palco.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}