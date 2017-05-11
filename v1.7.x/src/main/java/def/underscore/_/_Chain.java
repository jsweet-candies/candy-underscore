package def.underscore._;
import def.js.Array;
import def.js.Function;
import jsweet.lang.Name;
@jsweet.lang.Interface
public abstract class _Chain<T> extends def.js.Object {
    native public _Chain<T> each(ListIterator<T,Void> iterator, Object context);
    native public _Chain<T> each(ObjectIterator<T,Void> iterator, Object context);
    native public _Chain<T> forEach(ListIterator<T,Void> iterator, Object context);
    native public _Chain<T> forEach(ObjectIterator<T,Void> iterator, Object context);
    native public <TArray> _ChainOfArrays<TArray> map(ListIteratorTTArrays<T,TArray> iterator, Object context);
    native public <TResult> _Chain<TResult> map(ListIteratorTTResult<T,TResult> iterator, Object context);
    native public <TArray> _ChainOfArrays<TArray> map(ObjectIteratorTTArrays<T,TArray> iterator, Object context);
    native public <TResult> _Chain<TResult> map(ObjectIteratorTTResult<T,TResult> iterator, Object context);
    native public <TResult> _Chain<TResult> collect(ListIterator<T,TResult> iterator, Object context);
    native public <TResult> _Chain<TResult> collect(ObjectIterator<T,TResult> iterator, Object context);
    native public <TResult> _ChainSingle<TResult> reduce(MemoIterator<T,TResult> iterator, TResult memo, Object context);
    native public <TResult> _ChainSingle<TResult> inject(MemoIterator<T,TResult> iterator, TResult memo, Object context);
    native public <TResult> _ChainSingle<TResult> foldl(MemoIterator<T,TResult> iterator, TResult memo, Object context);
    native public <TResult> _ChainSingle<TResult> reduceRight(MemoIterator<T,TResult> iterator, TResult memo, Object context);
    native public <TResult> _ChainSingle<TResult> foldr(MemoIterator<T,TResult> iterator, TResult memo, Object context);
    native public <T> _ChainSingle<T> find(ListIterator<T,Boolean> iterator, Object context);
    native public <T,U extends java.lang.Object> _ChainSingle<T> find(U interator);
    native public <T> _ChainSingle<T> find(String interator);
    native public <T> _ChainSingle<T> detect(ListIterator<T,Boolean> iterator, Object context);
    native public <T,U extends java.lang.Object> _ChainSingle<T> detect(U interator);
    native public <T> _ChainSingle<T> detect(String interator);
    native public _Chain<T> filter(ListIterator<T,Boolean> iterator, Object context);
    native public _Chain<T> select(ListIterator<T,Boolean> iterator, Object context);
    native public <U extends java.lang.Object> _Chain<T> where(U properties);
    native public <U extends java.lang.Object> _ChainSingle<T> findWhere(U properties);
    native public _Chain<T> reject(ListIterator<T,Boolean> iterator, Object context);
    native public _ChainSingle<Boolean> all(ListIterator<T,Boolean> iterator, Object context);
    native public _ChainSingle<Boolean> every(ListIterator<T,Boolean> iterator, Object context);
    native public _ChainSingle<Boolean> any(ListIterator<T,Boolean> iterator, Object context);
    native public _ChainSingle<Boolean> some(ListIterator<T,Boolean> iterator, Object context);
    native public _ChainSingle<Boolean> contains(T value, double fromIndex);
    native public _ChainSingle<Boolean> include(T value, double fromIndex);
    native public _ChainSingle<Boolean> includes(T value, double fromIndex);
    native public _Chain<T> invoke(String methodName, Object... args);
    native public _Chain<?> pluck(String propertyName);
    native public _ChainSingle<T> max();
    native public _ChainSingle<T> max(ListIteratorTDouble<T> iterator, Object context);
    native public _ChainSingle<T> max(ListIteratorTAny<T> iterator, Object context);
    native public _ChainSingle<T> min();
    native public _ChainSingle<T> min(ListIteratorTDouble<T> iterator, Object context);
    native public _ChainSingle<T> min(ListIteratorTAny<T> iterator, Object context);
    native public _Chain<T> sortBy(ListIterator<T,?> iterator, Object context);
    native public _Chain<T> sortBy(String iterator, Object context);
    native public _ChainOfArrays<T> groupBy(ListIterator<T,?> iterator, Object context);
    native public _ChainOfArrays<T> groupBy(String iterator, Object context);
    native public _Chain<T> indexBy(ListIterator<T,?> iterator, Object context);
    native public _Chain<T> indexBy(String iterator, Object context);
    native public _Chain<T> countBy(ListIterator<T,?> iterator, Object context);
    native public _Chain<T> countBy(String iterator, Object context);
    native public _Chain<T> shuffle();
    native public <T> _Chain<T> sample(double n);
    native public <T> _Chain<T> sample();
    native public _Chain<T> toArray();
    native public _ChainSingle<Double> size();
    native public _ChainSingle<T> first();
    native public _Chain<T> first(double n);
    native public _Chain<T> head();
    native public _Chain<T> head(double n);
    native public _Chain<T> take();
    native public _Chain<T> take(double n);
    native public _Chain<T> initial(double n);
    native public _ChainSingle<T> last();
    native public _Chain<T> last(double n);
    native public _Chain<T> rest(double n);
    native public _Chain<T> tail(double n);
    native public _Chain<T> drop(double n);
    native public _Chain<T> compact();
    native public _Chain<?> flatten(Boolean shallow);
    native public _Chain<T> without(@SuppressWarnings("unchecked") T... values);
    native public _Chain<T[]> partition(ListIterator<T,Boolean> iterator, Object context);
    native public _Chain<T> union(@SuppressWarnings("unchecked") List<T>... arrays);
    native public _Chain<T> intersection(@SuppressWarnings("unchecked") List<T>... arrays);
    native public _Chain<T> difference(@SuppressWarnings("unchecked") List<T>... others);
    native public _Chain<T> uniq(Boolean isSorted, ListIterator<T,?> iterator);
    native public <TSort> _Chain<T> uniq(ListIterator<T,TSort> iterator, Object context);
    native public <TSort> _Chain<T> unique(Boolean isSorted, ListIterator<T,TSort> iterator);
    native public <TSort> _Chain<T> unique(ListIterator<T,TSort> iterator, Object context);
    native public _Chain<T> zip(Object[]... arrays);
    native public _Chain<T> unzip(Object[]... arrays);
    native public _Chain<T> object(Object[]... keyValuePairs);
    native public _Chain<T> object(Object values);
    native public _ChainSingle<Double> indexOf(T value, Boolean isSorted);
    native public _ChainSingle<Double> indexOf(T value, double startFrom);
    native public _ChainSingle<Double> lastIndexOf(T value, double from);
    native public <T> _ChainSingle<Double> findIndex(ListIterator<T,Boolean> predicate, Object context);
    native public <T> _ChainSingle<Double> findLastIndex(ListIterator<T,Boolean> predicate, Object context);
    native public _ChainSingle<Double> sortedIndex(T value, java.util.function.Function<T,Object> iterator, Object context);
    native public _Chain<T> range(double stop, double step);
    native public _Chain<T> range();
    native public _Chain<T> chunk();
    native public _Chain<T> bind(Object object, Object... args);
    native public _Chain<T> bindAll(String... methodNames);
    native public _Chain<T> partial(Object... args);
    native public _Chain<T> memoize(java.util.function.Function<Object,String> hashFn);
    native public _Chain<T> defer(Object... args);
    native public _Chain<T> delay(double wait, Object... args);
    native public _Chain<T> delay(Object... args);
    native public _Chain<T> throttle(double wait, ThrottleSettings options);
    native public _Chain<T> debounce(double wait, Boolean immediate);
    native public _Chain<T> once();
    native public _Chain<T> restArgs(double startIndex);
    native public _Chain<T> after(Function func);
    native public _Chain<T> before(Function fn);
    native public java.util.function.Supplier<_Chain<T>> wrap(Function wrapper);
    native public _Chain<T> negate();
    native public _Chain<T> compose(Function... functions);
    native public _Chain<String> keys();
    native public _Chain<String> allKeys();
    native public _Chain<T> values();
    native public _Chain<T> pairs();
    native public _Chain<T> invert();
    native public _Chain<T> functions();
    native public _Chain<T> methods();
    native public _Chain<T> extend(Object... sources);
    native public _Chain<T> findKey(ObjectIterator<?,Boolean> predicate, Object context);
    native public _Chain<T> pick(Object[] keys);
    native public _Chain<T> pick(jsweet.util.function.TriFunction<Object,Object,Object,Object> fn);
    native public _Chain<T> omit(String[] keys);
    native public _Chain<T> omit(Function iteratee);
    native public _Chain<T> defaults(Object... defaults);
    @jsweet.lang.Name("clone")
    native public _Chain<T> Clone();
    native public _Chain<T> tap(java.util.function.Function<Object,Object> interceptor);
    native public _Chain<T> has(String key);
    native public <TResult> _Chain<T> matches();
    native public <TResult> _Chain<T> matcher();
    native public _Chain<T> property();
    native public _Chain<T> propertyOf();
    native public _Chain<T> isEqual(Object other);
    native public _Chain<T> isEmpty();
    native public _Chain<T> isMatch();
    native public _Chain<T> isElement();
    native public _Chain<T> isArray();
    native public _Chain<T> isSymbol();
    native public _Chain<T> isObject();
    native public _Chain<T> isArguments();
    native public _Chain<T> isFunction();
    native public _Chain<T> isError();
    native public _Chain<T> isString();
    native public _Chain<T> isNumber();
    native public _Chain<T> isFinite();
    native public _Chain<T> isBoolean();
    native public _Chain<T> isDate();
    native public _Chain<T> isRegExp();
    native public _Chain<T> isNaN();
    native public _Chain<T> isNull();
    native public _Chain<T> isUndefined();
    native public _Chain<T> identity();
    native public _Chain<T> constant();
    native public _Chain<T> noop();
    native public <TResult> _Chain<T> times(java.util.function.Function<Double,TResult> iterator, Object context);
    native public _Chain<T> random();
    native public _Chain<T> random(double max);
    native public _Chain<T> mixin();
    native public _Chain<T> iteratee(Object context);
    native public _Chain<T> uniqueId();
    native public _Chain<T> escape();
    native public _Chain<T> unescape();
    native public _Chain<T> result(String property, Object defaultValue);
    native public java.util.function.Function<Object,_Chain<T>> template(TemplateSettings settings);
    native public _Chain<T> concat(@SuppressWarnings("unchecked") Array<T[]>... arr);
    native public _ChainSingle<T> join(Object separator);
    native public _ChainSingle<T> pop();
    native public _Chain<T> push(@SuppressWarnings("unchecked") Array<T>... item);
    native public _Chain<T> reverse();
    native public _ChainSingle<T> shift();
    native public _Chain<T> slice(double start, double end);
    native public _Chain<T> sort(java.util.function.BiFunction<T,T,Boolean> compareFn);
    native public _Chain<T> splice(double index, double quantity, @SuppressWarnings("unchecked") Array<T>... items);
    @Name("toString")
    native public _ChainSingle<T> ToString();
    native public _Chain<T> unshift(@SuppressWarnings("unchecked") Array<T>... items);
    native public _Chain<T> chain();
    native public <TResult> T[] value();
    native public _Chain<T> each(ListIterator<T,Void> iterator);
    native public _Chain<T> each(ObjectIterator<T,Void> iterator);
    native public _Chain<T> forEach(ListIterator<T,Void> iterator);
    native public _Chain<T> forEach(ObjectIterator<T,Void> iterator);
    native public <TArray> _ChainOfArrays<TArray> map(ListIterator<T,TArray[]> iterator);
    native public <TArray> _ChainOfArrays<TArray> map(ObjectIterator<T,TArray[]> iterator);
    native public <TResult> _Chain<TResult> collect(ListIterator<T,TResult> iterator);
    native public <TResult> _Chain<TResult> collect(ObjectIterator<T,TResult> iterator);
    native public <TResult> _ChainSingle<TResult> reduce(MemoIterator<T,TResult> iterator, TResult memo);
    native public <TResult> _ChainSingle<TResult> reduce(MemoIterator<T,TResult> iterator);
    native public <TResult> _ChainSingle<TResult> inject(MemoIterator<T,TResult> iterator, TResult memo);
    native public <TResult> _ChainSingle<TResult> inject(MemoIterator<T,TResult> iterator);
    native public <TResult> _ChainSingle<TResult> foldl(MemoIterator<T,TResult> iterator, TResult memo);
    native public <TResult> _ChainSingle<TResult> foldl(MemoIterator<T,TResult> iterator);
    native public <TResult> _ChainSingle<TResult> reduceRight(MemoIterator<T,TResult> iterator, TResult memo);
    native public <TResult> _ChainSingle<TResult> reduceRight(MemoIterator<T,TResult> iterator);
    native public <TResult> _ChainSingle<TResult> foldr(MemoIterator<T,TResult> iterator, TResult memo);
    native public <TResult> _ChainSingle<TResult> foldr(MemoIterator<T,TResult> iterator);
    native public <T> _ChainSingle<T> find(ListIterator<T,Boolean> iterator);
    native public <T> _ChainSingle<T> detect(ListIterator<T,Boolean> iterator);
    native public _Chain<T> filter(ListIterator<T,Boolean> iterator);
    native public _Chain<T> select(ListIterator<T,Boolean> iterator);
    native public _Chain<T> reject(ListIterator<T,Boolean> iterator);
    native public _ChainSingle<Boolean> all(ListIterator<T,Boolean> iterator);
    native public _ChainSingle<Boolean> all();
    native public _ChainSingle<Boolean> every(ListIterator<T,Boolean> iterator);
    native public _ChainSingle<Boolean> every();
    native public _ChainSingle<Boolean> any(ListIterator<T,Boolean> iterator);
    native public _ChainSingle<Boolean> any();
    native public _ChainSingle<Boolean> some(ListIterator<T,Boolean> iterator);
    native public _ChainSingle<Boolean> some();
    native public _ChainSingle<Boolean> contains(T value);
    native public _ChainSingle<Boolean> include(T value);
    native public _ChainSingle<Boolean> includes(T value);
    native public _ChainSingle<T> max(ListIterator<T,Double> iterator);
    native public _ChainSingle<T> min(ListIterator<T,Double> iterator);
    native public _Chain<T> sortBy(ListIterator<T,?> iterator);
    native public _Chain<T> sortBy();
    native public _Chain<T> sortBy(String iterator);
    native public _ChainOfArrays<T> groupBy(ListIterator<T,?> iterator);
    native public _ChainOfArrays<T> groupBy();
    native public _ChainOfArrays<T> groupBy(String iterator);
    native public _Chain<T> indexBy(ListIterator<T,?> iterator);
    native public _Chain<T> indexBy(String iterator);
    native public _Chain<T> countBy(ListIterator<T,?> iterator);
    native public _Chain<T> countBy();
    native public _Chain<T> countBy(String iterator);
    native public _Chain<T> initial();
    native public _Chain<T> rest();
    native public _Chain<T> tail();
    native public _Chain<T> drop();
    native public _Chain<?> flatten();
    native public _Chain<T[]> partition(ListIterator<T,Boolean> iterator);
    native public _Chain<T> uniq(Boolean isSorted);
    native public _Chain<T> uniq();
    native public <TSort> _Chain<T> uniq(ListIterator<T,TSort> iterator);
    native public <TSort> _Chain<T> unique(Boolean isSorted);
    native public <TSort> _Chain<T> unique();
    native public <TSort> _Chain<T> unique(ListIterator<T,TSort> iterator);
    native public _Chain<T> object();
    native public _ChainSingle<Double> indexOf(T value);
    native public _ChainSingle<Double> lastIndexOf(T value);
    native public <T> _ChainSingle<Double> findIndex(ListIterator<T,Boolean> predicate);
    native public <T> _ChainSingle<Double> findLastIndex(ListIterator<T,Boolean> predicate);
    native public _ChainSingle<Double> sortedIndex(T value, java.util.function.Function<T,Object> iterator);
    native public _ChainSingle<Double> sortedIndex(T value);
    native public _Chain<T> range(double stop);
    native public _Chain<T> memoize();
    native public _Chain<T> throttle(double wait);
    native public _Chain<T> debounce(double wait);
    native public _Chain<T> restArgs();
    native public _Chain<T> findKey(ObjectIterator<?,Boolean> predicate);
    native public _Chain<T> create();
    native public <TResult> _Chain<T> times(java.util.function.Function<Double,TResult> iterator);
    native public _Chain<T> iteratee();
    native public _Chain<T> result(String property);
    native public java.util.function.Function<Object,_Chain<T>> template();
    native public _ChainSingle<T> join();
    native public _Chain<T> slice(double start);
    native public <T> _ChainSingle<T> find(ObjectIterator<T,Boolean> iterator, Object context);
    native public <T> _ChainSingle<T> detect(ObjectIterator<T,Boolean> iterator, Object context);
    native public <T> _ChainSingle<Double> findIndex(java.lang.Object predicate, Object context);
    native public <T> _ChainSingle<Double> findLastIndex(java.lang.Object predicate, Object context);
    native public <T> _ChainSingle<T> find(ObjectIterator<T,Boolean> iterator);
    native public <T> _ChainSingle<T> detect(ObjectIterator<T,Boolean> iterator);
    native public <T> _ChainSingle<Double> findIndex(java.lang.Object predicate);
    native public <T> _ChainSingle<Double> findLastIndex(java.lang.Object predicate);
    native public _Chain<T> concat(@SuppressWarnings("unchecked") T[]... arr);
    native public _Chain<T> push(@SuppressWarnings("unchecked") T... item);
    native public _Chain<T> splice(double index, double quantity, @SuppressWarnings("unchecked") T... items);
    native public _Chain<T> unshift(@SuppressWarnings("unchecked") T... items);
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ListIteratorTTArrays<T,TArray> extends def.js.Object {
        public ListIteratorTTArrays(ListIterator<T,TArray[]> iterator){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ListIteratorTTResult<T,TResult> extends def.js.Object {
        public ListIteratorTTResult(ListIterator<T,TResult> iterator){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ObjectIteratorTTArrays<T,TArray> extends def.js.Object {
        public ObjectIteratorTTArrays(ObjectIterator<T,TArray[]> iterator){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ObjectIteratorTTResult<T,TResult> extends def.js.Object {
        public ObjectIteratorTTResult(ObjectIterator<T,TResult> iterator){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ListIteratorTAny<T> extends def.js.Object {
        public ListIteratorTAny(ListIterator<T,?> iterator){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ListIteratorTDouble<T> extends def.js.Object {
        public ListIteratorTDouble(ListIterator<T,Double> iterator){}
    }
}

