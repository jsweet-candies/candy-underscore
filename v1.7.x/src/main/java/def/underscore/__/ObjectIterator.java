package def.underscore.__;
public interface ObjectIterator<T,TResult> {
    public TResult $apply(T element, String key, Dictionary<T> list);
}

