package def.underscore._;
public interface MemoObjectIterator<T,TResult> {
    public TResult apply(TResult prev, T curr, String key, Dictionary<T> list);
}

