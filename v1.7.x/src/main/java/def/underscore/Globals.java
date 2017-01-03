package def.underscore;
/** This class holds all the global functions and variables of the def.underscore package. */
public final class Globals {
    private Globals(){}
    public static def.underscore._.UnderscoreStatic _;
    native public static <T> def.underscore._.Underscore<T> _(def.underscore._.Dictionary<T> value);
    native public static <T> def.underscore._.Underscore<T> _(def.js.Array<T> value);
    native public static <T> def.underscore._.Underscore<T> _(T value);
    native public static <T> def.underscore._.Underscore<T> _(T[] value);
}

