package def.underscore.__;
@jsweet.lang.Interface
public abstract class Dictionary<T> extends Collection<T> {
    native public T $get(String index);
}

