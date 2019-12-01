package def.underscore.__;
@jsweet.lang.Interface
@jsweet.lang.SyntacticIterable
public abstract class List<T> extends Collection<T> implements Iterable<T> {
    native public T $get(double index);
    public double length;
    /** From Iterable, to allow foreach loop (do not use directly). */
    @jsweet.lang.Erased
    native public java.util.Iterator<T> iterator();
}

