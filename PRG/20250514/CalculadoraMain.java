import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class CalculadoraMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            String fxml = "vista/Calculadora.fxml";
            
            // Cargar la ventana desde el archivo FXML
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(fxml));
            
            // Crear la escena
            Scene scene = new Scene(root);
            
            // Configurar el escenario (Stage)
            primaryStage.setTitle("Calculadora FX");
            primaryStage.setResizable(false);
            
            // Asignar el ícono de la aplicación
            primaryStage.getIcons().add(
                new Image(getClass().getResource("/vista/img/icon.png").toExternalForm())
            );
            
            // Asignar la escena y mostrar
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
