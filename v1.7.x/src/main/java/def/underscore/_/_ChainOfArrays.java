package def.underscore._;
@jsweet.lang.Interface
public abstract class _ChainOfArrays<T> extends _Chain<T[]> {
    native public _Chain<T> flatten(Boolean shallow);
    native public _ChainOfArrays<T> mapObject(def.underscore._.ListIterator<T,?> fn);
    native public _Chain<T> flatten();
}
