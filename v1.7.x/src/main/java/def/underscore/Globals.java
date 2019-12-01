package def.underscore;

import def.underscore.__.Dictionary;
import def.underscore.__.Underscore;
import def.underscore.__.UnderscoreStatic;
import jsweet.lang.Name;

/**
 * This class holds all the global functions and variables of the def.underscore
 * package.
 */
public final class Globals {
	private Globals() {
	}

	@Name("_")
	public static UnderscoreStatic __;

	@Name("_")
	native public static <T> Underscore<T> __(Dictionary<T> value);

	@Name("_")
	native public static <T> Underscore<T> __(def.js.Array<T> value);

	@Name("_")
	native public static <T> Underscore<T> __(T value);

	@Name("_")
	native public static <T> Underscore<T> __(T[] value);
}
