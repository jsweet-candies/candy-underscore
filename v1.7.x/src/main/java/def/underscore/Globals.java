package def.underscore;

import def.underscore._.Dictionary;
import def.underscore._.Underscore;
import def.underscore._.UnderscoreStatic;

/** This class holds all the global functions and variables of the def.underscore package. */
public final class Globals {
    private Globals(){}
    public static UnderscoreStatic _;
    native public static <T> Underscore<T> _(Dictionary<T> value);
    native public static <T> Underscore<T> _(def.js.Array<T> value);
    native public static <T> Underscore<T> _(T value);
    native public static <T> Underscore<T> _(T[] value);
}

