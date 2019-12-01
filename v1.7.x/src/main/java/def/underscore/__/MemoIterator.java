package def.underscore.__;
public interface MemoIterator<T,TResult> {
    public TResult $apply(TResult prev, T curr, double index, List<T> list);
}

