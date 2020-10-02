import java.util.function.Supplier;

public class Lazy<T> implements Supplier  {
  final private Supplier<T> supplier; 
  private Boolean supplied = false;
  private T value ;

  private Lazy (Supplier supplier )  {
    this.supplier = supplier;
  }

  public static Lazy let(Supplier supplier) {
    return new Lazy (supplier);
  }

  @Override 
  public T get() {
    if (supplied) 
      return value ;

    supplied = true;
    return value = supplier.get();
  }
}