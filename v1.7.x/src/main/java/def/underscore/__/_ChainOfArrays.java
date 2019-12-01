package def.underscore.__;
@jsweet.lang.Interface
public abstract class _ChainOfArrays<T> extends _Chain<T[]> {
    native public _Chain<T> flatten(Boolean shallow);
    native public _ChainOfArrays<T> mapObject(ListIterator<T,?> fn);
    native public _Chain<T> flatten();
}

