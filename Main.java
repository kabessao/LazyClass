import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

class Main {
  public static void main(String[] args) {
    Lazy<String> teste = Lazy.let(Main::getValue);
    print(teste.get());
    print(teste.get());
    print(teste.get());
    print(teste.get());
    print(teste.get());
    
  }

  public static String getValue() {
    print("Processo demorado...");
    delay(10000);
    return "teste";
  }

  public static void print(String msg) { 
    System.out.println(msg);
  }

  public static void delay (int millis ) {
    try { 
      Thread.sleep(millis);
    } catch(Throwable e ) {}
  }
}


