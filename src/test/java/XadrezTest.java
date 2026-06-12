
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class XadrezTest {
 @Test
 public void testarCriacaoObjetos(){
   assertNotNull(new Tabuleiro());
   assertNotNull(new Rei());
   assertNotNull(new JogoDeXadrez());
   assertNotNull(new JogadorHumano('b'));
 }
}
