package def.underscore._;
import def.js.Array;
import def.js.Function;
@jsweet.lang.Interface
public abstract class UnderscoreStatic extends def.js.Object {
    native public <T> Underscore<T> $apply(Dictionary<T> value);
    native public <T> Underscore<T> $apply(Array<T> value);
    native public <T> Underscore<T> $apply(T value);
    native public <T> List<T> each(List<T> list, ListIterator<T,Void> iterator, Object context);
    native public <T> Dictionary<T> each(Dictionary<T> object, ObjectIterator<T,Void> iterator, Object context);
    native public <T> List<T> forEach(List<T> list, ListIterator<T,Void> iterator, Object context);
    native public <T> Dictionary<T> forEach(Dictionary<T> object, ObjectIterator<T,Void> iterator, Object context);
    native public <T,TResult> TResult[] map(List<T> list, Object iterator, Object context);
    native public <T,TResult> TResult[] map(Dictionary<T> object, ObjectIterator<T,TResult> iterator, Object context);
    native public <T,TResult> TResult[] collect(List<T> list, Object iterator, Object context);
    native public <T,TResult> TResult[] collect(Dictionary<T> object, ObjectIterator<T,TResult> iterator, Object context);
    native public <T,TResult> TResult reduce(Collection<T> list, MemoIterator<T,TResult> iterator, TResult memo, Object context);
    native public <T,TResult> TResult reduce(Dictionary<T> list, MemoObjectIterator<T,TResult> iterator, TResult memo, Object context);
    native public <T,TResult> TResult inject(Collection<T> list, MemoIterator<T,TResult> iterator, TResult memo, Object context);
    native public <T,TResult> TResult foldl(Collection<T> list, MemoIterator<T,TResult> iterator, TResult memo, Object context);
    native public <T,TResult> TResult reduceRight(Collection<T> list, MemoIterator<T,TResult> iterator, TResult memo, Object context);
    native public <T,TResult> TResult foldr(Collection<T> list, MemoIterator<T,TResult> iterator, TResult memo, Object context);
    native public <T> T find(List<T> list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> T find(Dictionary<T> object, ObjectIterator<T,Boolean> iterator, Object context);
    native public <T,U extends java.lang.Object> T find(List<T> object, U iterator);
    native public <T> T find(List<T> object, String iterator);
    native public <T> T detect(List<T> list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> T detect(Dictionary<T> object, ObjectIterator<T,Boolean> iterator, Object context);
    native public <T,U extends java.lang.Object> T detect(List<T> object, U iterator);
    native public <T> T detect(List<T> object, String iterator);
    native public <T> T[] filter(List<T> list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> T[] filter(Dictionary<T> object, ObjectIterator<T,Boolean> iterator, Object context);
    native public <T> T[] select(List<T> list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> T[] select(Dictionary<T> object, ObjectIterator<T,Boolean> iterator, Object context);
    native public <T,U extends java.lang.Object> T[] where(List<T> list, U properties);
    native public <T,U extends java.lang.Object> T findWhere(List<T> list, U properties);
    native public <T> T[] reject(List<T> list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> T[] reject(Dictionary<T> object, ObjectIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean every(List<T> list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean every(Dictionary<T> list, ObjectIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean all(List<T> list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean all(Dictionary<T> list, ObjectIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean some(List<T> list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean some(Dictionary<T> object, ObjectIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean any(List<T> list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean any(Dictionary<T> object, ObjectIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean any(List<T> list, T value);
    native public <T> Boolean contains(List<T> list, T value, double fromIndex);
    native public <T> Boolean contains(Dictionary<T> object, T value);
    native public <T> Boolean include(Collection<T> list, T value, double fromIndex);
    native public <T> Boolean include(Dictionary<T> object, T value);
    native public <T> Boolean includes(Collection<T> list, T value, double fromIndex);
    native public <T> Boolean includes(Dictionary<T> object, T value);
    native public <T extends java.lang.Object> Object invoke(List<T> list, String methodName, Object... args);
    native public <T extends java.lang.Object> Object[] pluck(List<T> list, String propertyName);
    native public double max(List<Double> list);
    /**
        * @see _.max
        */
    native public double max(Dictionary<Double> object);
    native public <T> T max(List<T> list, ListIterator<T,?> iterator, Object context);
    /**
        * @see _.max
        */
    native public <T> T max(Dictionary<T> list, ObjectIterator<T,?> iterator, Object context);
    native public double min(List<Double> list);
    /**
         * @see _.min
         */
    native public double min(Dictionary<Double> o);
    native public <T> T min(List<T> list, ListIterator<T,?> iterator, Object context);
    /**
        * @see _.min
        */
    native public <T> T min(Dictionary<T> list, ObjectIterator<T,?> iterator, Object context);
    native public <T,TSort> T[] sortBy(List<T> list, ListIterator<T,TSort> iterator, Object context);
    native public <T> T[] sortBy(List<T> list, String iterator, Object context);
    native public <T> Dictionary<T[]> groupBy(List<T> list, ListIterator<T,?> iterator, Object context);
    native public <T> Dictionary<T[]> groupBy(List<T> list, String iterator, Object context);
    native public <T> Dictionary<T> indexBy(List<T> list, ListIterator<T,?> iterator, Object context);
    native public <T> Dictionary<T> indexBy(List<T> list, String iterator, Object context);
    native public <T> Dictionary<Double> countBy(List<T> list, ListIterator<T,?> iterator, Object context);
    native public <T> Dictionary<Double> countBy(List<T> list, String iterator, Object context);
    native public <T> T[] shuffle(Collection<T> list);
    native public <T> T[] sample(Collection<T> list, double n);
    native public <T> T sample(Collection<T> list);
    native public <T> T[] toArray(Collection<T> list);
    native public <T> double size(Collection<T> list);
    native public <T> T[][] partition(Array<T> array, ListIterator<T,Boolean> iterator, Object context);
    native public <T> T first(List<T> array);
    native public <T> T[] first(List<T> array, double n);
    native public <T> T head(List<T> array);
    native public <T> T[] head(List<T> array, double n);
    native public <T> T take(List<T> array);
    native public <T> T[] take(List<T> array, double n);
    native public <T> T[] initial(List<T> array, double n);
    native public <T> T last(List<T> array);
    native public <T> T[] last(List<T> array, double n);
    native public <T> T[] rest(List<T> array, double n);
    native public <T> T[] tail(List<T> array, double n);
    native public <T> T[] drop(List<T> array, double n);
    native public <T> T[] compact(List<T> array);
    native public Object[] flatten(List<?> array, Boolean shallow);
    native public <T> T[] without(List<T> array, @SuppressWarnings("unchecked") T... values);
    native public <T> T[] union(@SuppressWarnings("unchecked") List<T>... arrays);
    native public <T> T[] intersection(@SuppressWarnings("unchecked") List<T>... arrays);
    native public <T> T[] difference(List<T> array, @SuppressWarnings("unchecked") List<T>... others);
    native public <T,TSort> T[] uniq(List<T> array, Boolean isSorted, ListIterator<T,TSort> iterator, Object context);
    native public <T,TSort> T[] uniq(List<T> array, ListIterator<T,TSort> iterator, Object context);
    native public <T,TSort> T[] unique(List<T> array, ListIterator<T,TSort> iterator, Object context);
    native public <T,TSort> T[] unique(List<T> array, Boolean isSorted, ListIterator<T,TSort> iterator, Object context);
    native public Object[][] zip(Object[]... arrays);
    native public Object[] zip(Object... arrays);
    native public Object[][] unzip(Object[]... arrays);
    native public <TResult extends java.lang.Object> TResult object(List<String> keys, List<?> values);
    native public <TResult extends java.lang.Object> TResult object(Object[]... keyValuePairs);
    native public <TResult extends java.lang.Object> TResult object(List<?> list, Object values);
    native public <T> double indexOf(List<T> array, T value, Boolean isSorted);
    native public <T> double indexOf(List<T> array, T value, double startFrom);
    native public <T> double lastIndexOf(List<T> array, T value, double from);
    native public <T> double findIndex(List<T> array, ListIterator<T,Boolean> predicate, Object context);
    native public <T> double findLastIndex(List<T> array, ListIterator<T,Boolean> predicate, Object context);
    native public <T,TSort> double sortedIndex(List<T> list, T value, java.util.function.Function<T,TSort> iterator, Object context);
    native public double[] range(double start, double stop, double step);
    native public double[] range(double stop);
    /**
        * Split an **array** into several arrays containing **count** or less elements
        * of initial array.
        * @param array The array to split
        * @param count The maximum size of the inner arrays.
        */
    native public java.util.function.Supplier<Object> bind(Function func, Object context, Object... args);
    native public Object bindAll(Object object, String... methodNames);
    native public <T1,T2> Partial<T2> partial(Fn<T2,T1> fn, T1 p1);
    native public <T1,T2,T3> PartialData<T3,T2> partial(FnData<T3,T1,T2> fn, T1 p1);
    native public <T1,T2,T3> Partial<T3> partial(FnData<T3,T1,T2> fn, T1 p1, T2 p2);
    native public <T1,T2,T3> PartialDto<T3,T1> partial(FnData<T3,T1,T2> fn, UnderscoreStatic stub1, T2 p2);
    native public <T1,T2,T3,T4> PartialStructure<T4,T2,T3> partial(FnDto<T4,T1,T2,T3> fn, T1 p1);
    native public <T1,T2,T3,T4> PartialInfo<T4,T3> partial(FnDto<T4,T1,T2,T3> fn, T1 p1, T2 p2);
    native public <T1,T2,T3,T4> Partial1<T4,T1,T3> partial(FnDto<T4,T1,T2,T3> fn, UnderscoreStatic stub1, T2 p2);
    native public <T1,T2,T3,T4> Partial<T4> partial(FnDto<T4,T1,T2,T3> fn, T1 p1, T2 p2, T3 p3);
    native public <T1,T2,T3,T4> PartialDto<T4,T1> partial(FnDto<T4,T1,T2,T3> fn, UnderscoreStatic stub1, T2 p2, T3 p3);
    native public <T1,T2,T3,T4> PartialData<T4,T2> partial(FnDto<T4,T1,T2,T3> fn, T1 p1, UnderscoreStatic stub2, T3 p3);
    native public <T1,T2,T3,T4> Partial2<T4,T1,T2> partial(FnDto<T4,T1,T2,T3> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3);
    native public <T1,T2,T3,T4,T5> Partial3<T5,T2,T3,T4> partial(FnStructure<T5,T1,T2,T3,T4> fn, T1 p1);
    native public <T1,T2,T3,T4,T5> Partial4<T5,T3,T4> partial(FnStructure<T5,T1,T2,T3,T4> fn, T1 p1, T2 p2);
    native public <T1,T2,T3,T4,T5> Partial5<T5,T1,T3,T4> partial(FnStructure<T5,T1,T2,T3,T4> fn, UnderscoreStatic stub1, T2 p2);
    native public <T1,T2,T3,T4,T5> Partial6<T5,T4> partial(FnStructure<T5,T1,T2,T3,T4> fn, T1 p1, T2 p2, T3 p3);
    native public <T1,T2,T3,T4,T5> Partial7<T5,T1,T4> partial(FnStructure<T5,T1,T2,T3,T4> fn, UnderscoreStatic stub1, T2 p2, T3 p3);
    native public <T1,T2,T3,T4,T5> Partial8<T5,T2,T4> partial(FnStructure<T5,T1,T2,T3,T4> fn, T1 p1, UnderscoreStatic stub2, T3 p3);
    native public <T1,T2,T3,T4,T5> Partial9<T5,T1,T2,T4> partial(FnStructure<T5,T1,T2,T3,T4> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3);
    native public <T1,T2,T3,T4,T5> Partial<T5> partial(FnStructure<T5,T1,T2,T3,T4> fn, T1 p1, T2 p2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5> PartialDto<T5,T1> partial(FnStructure<T5,T1,T2,T3,T4> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5> PartialData<T5,T2> partial(FnStructure<T5,T1,T2,T3,T4> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5> Partial2<T5,T1,T2> partial(FnStructure<T5,T1,T2,T3,T4> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5> PartialInfo<T5,T3> partial(FnStructure<T5,T1,T2,T3,T4> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5> Partial1<T5,T1,T3> partial(FnStructure<T5,T1,T2,T3,T4> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5> PartialStructure<T5,T2,T3> partial(FnStructure<T5,T1,T2,T3,T4> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5> Partial10<T5,T1,T2,T3> partial(FnStructure<T5,T1,T2,T3,T4> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6> Partial11<T6,T2,T3,T4,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1);
    native public <T1,T2,T3,T4,T5,T6> Partial12<T6,T3,T4,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, T2 p2);
    native public <T1,T2,T3,T4,T5,T6> Partial13<T6,T1,T3,T4,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, T2 p2);
    native public <T1,T2,T3,T4,T5,T6> Partial14<T6,T4,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, T2 p2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6> Partial15<T6,T1,T4,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, T2 p2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6> Partial16<T6,T2,T4,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, UnderscoreStatic stub2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6> Partial17<T6,T1,T2,T4,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6> Partial18<T6,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, T2 p2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6> Partial19<T6,T1,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6> Partial20<T6,T2,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6> Partial21<T6,T1,T2,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6> Partial22<T6,T3,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6> Partial23<T6,T1,T3,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6> Partial24<T6,T2,T3,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6> Partial25<T6,T1,T2,T3,T5> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6> Partial<T6> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, T2 p2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> PartialDto<T6,T1> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> PartialData<T6,T2> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> Partial2<T6,T1,T2> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> PartialInfo<T6,T3> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> Partial1<T6,T1,T3> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> PartialStructure<T6,T2,T3> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> Partial10<T6,T1,T2,T3> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> Partial6<T6,T4> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> Partial7<T6,T1,T4> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> Partial8<T6,T2,T4> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> Partial9<T6,T1,T2,T4> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> Partial4<T6,T3,T4> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> Partial5<T6,T1,T3,T4> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> Partial3<T6,T2,T3,T4> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6> Partial26<T6,T1,T2,T3,T4> partial(FnInfo<T6,T1,T2,T3,T4,T5> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial27<T7,T2,T3,T4,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial28<T7,T3,T4,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial29<T7,T1,T3,T4,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial30<T7,T4,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial31<T7,T1,T4,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial32<T7,T2,T4,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial33<T7,T1,T2,T4,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial34<T7,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial35<T7,T1,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial36<T7,T2,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial37<T7,T1,T2,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial38<T7,T3,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial39<T7,T1,T3,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial40<T7,T2,T3,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial41<T7,T1,T2,T3,T5,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial42<T7,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial43<T7,T1,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial44<T7,T2,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial45<T7,T1,T2,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial46<T7,T3,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial47<T7,T1,T3,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial48<T7,T2,T3,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial49<T7,T1,T2,T3,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial50<T7,T4,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial51<T7,T1,T4,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial52<T7,T2,T4,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial53<T7,T1,T2,T4,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial54<T7,T3,T4,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial55<T7,T1,T3,T4,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial56<T7,T2,T3,T4,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial57<T7,T1,T2,T3,T4,T6> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial<T7> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> PartialDto<T7,T1> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> PartialData<T7,T2> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial2<T7,T1,T2> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> PartialInfo<T7,T3> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial1<T7,T1,T3> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> PartialStructure<T7,T2,T3> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial10<T7,T1,T2,T3> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial6<T7,T4> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial7<T7,T1,T4> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial8<T7,T2,T4> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial9<T7,T1,T2,T4> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial4<T7,T3,T4> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial5<T7,T1,T3,T4> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial3<T7,T2,T3,T4> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial26<T7,T1,T2,T3,T4> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial18<T7,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial19<T7,T1,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial20<T7,T2,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial21<T7,T1,T2,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial22<T7,T3,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial23<T7,T1,T3,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial24<T7,T2,T3,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial25<T7,T1,T2,T3,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial14<T7,T4,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial15<T7,T1,T4,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial16<T7,T2,T4,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial17<T7,T1,T2,T4,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial12<T7,T3,T4,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial13<T7,T1,T3,T4,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial11<T7,T2,T3,T4,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7> Partial58<T7,T1,T2,T3,T4,T5> partial(Fn1<T7,T1,T2,T3,T4,T5,T6> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial59<T8,T2,T3,T4,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial60<T8,T3,T4,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial61<T8,T1,T3,T4,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial62<T8,T4,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial63<T8,T1,T4,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial64<T8,T2,T4,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial65<T8,T1,T2,T4,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial66<T8,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial67<T8,T1,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial68<T8,T2,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial69<T8,T1,T2,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial70<T8,T3,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial71<T8,T1,T3,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial72<T8,T2,T3,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial73<T8,T1,T2,T3,T5,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial74<T8,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial75<T8,T1,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial76<T8,T2,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial77<T8,T1,T2,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial78<T8,T3,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial79<T8,T1,T3,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial80<T8,T2,T3,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial81<T8,T1,T2,T3,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial82<T8,T4,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial83<T8,T1,T4,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial84<T8,T2,T4,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial85<T8,T1,T2,T4,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial86<T8,T3,T4,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial87<T8,T1,T3,T4,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial88<T8,T2,T3,T4,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial89<T8,T1,T2,T3,T4,T6,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial90<T8,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial91<T8,T1,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial92<T8,T2,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial93<T8,T1,T2,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial94<T8,T3,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial95<T8,T1,T3,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial96<T8,T2,T3,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial97<T8,T1,T2,T3,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial98<T8,T4,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial99<T8,T1,T4,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial100<T8,T2,T4,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial101<T8,T1,T2,T4,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial102<T8,T3,T4,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial103<T8,T1,T3,T4,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial104<T8,T2,T3,T4,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial105<T8,T1,T2,T3,T4,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial106<T8,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial107<T8,T1,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial108<T8,T2,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial109<T8,T1,T2,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial110<T8,T3,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial111<T8,T1,T3,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial112<T8,T2,T3,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial113<T8,T1,T2,T3,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial114<T8,T4,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial115<T8,T1,T4,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial116<T8,T2,T4,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial117<T8,T1,T2,T4,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial118<T8,T3,T4,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial119<T8,T1,T3,T4,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial120<T8,T2,T3,T4,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial121<T8,T1,T2,T3,T4,T5,T7> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial<T8> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> PartialDto<T8,T1> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> PartialData<T8,T2> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial2<T8,T1,T2> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> PartialInfo<T8,T3> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial1<T8,T1,T3> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> PartialStructure<T8,T2,T3> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial10<T8,T1,T2,T3> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial6<T8,T4> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial7<T8,T1,T4> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial8<T8,T2,T4> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial9<T8,T1,T2,T4> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial4<T8,T3,T4> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial5<T8,T1,T3,T4> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial3<T8,T2,T3,T4> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial26<T8,T1,T2,T3,T4> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial18<T8,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial19<T8,T1,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial20<T8,T2,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial21<T8,T1,T2,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial22<T8,T3,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial23<T8,T1,T3,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial24<T8,T2,T3,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial25<T8,T1,T2,T3,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial14<T8,T4,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial15<T8,T1,T4,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial16<T8,T2,T4,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial17<T8,T1,T2,T4,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial12<T8,T3,T4,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial13<T8,T1,T3,T4,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial11<T8,T2,T3,T4,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial58<T8,T1,T2,T3,T4,T5> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, T6 p6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial42<T8,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial43<T8,T1,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial44<T8,T2,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial45<T8,T1,T2,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial46<T8,T3,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial47<T8,T1,T3,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial48<T8,T2,T3,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial49<T8,T1,T2,T3,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial50<T8,T4,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial51<T8,T1,T4,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, UnderscoreStatic stub4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial52<T8,T2,T4,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial53<T8,T1,T2,T4,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial54<T8,T3,T4,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial55<T8,T1,T3,T4,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial56<T8,T2,T3,T4,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial57<T8,T1,T2,T3,T4,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, T5 p5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial34<T8,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, T4 p4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial35<T8,T1,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, T4 p4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial36<T8,T2,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, T4 p4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial37<T8,T1,T2,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, T4 p4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial38<T8,T3,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial39<T8,T1,T3,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial40<T8,T2,T3,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial41<T8,T1,T2,T3,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, T4 p4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial30<T8,T4,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial31<T8,T1,T4,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial32<T8,T2,T4,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial33<T8,T1,T2,T4,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, T3 p3, UnderscoreStatic stub4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial28<T8,T3,T4,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial29<T8,T1,T3,T4,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, T2 p2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial27<T8,T2,T3,T4,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, T1 p1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public <T1,T2,T3,T4,T5,T6,T7,T8> Partial122<T8,T1,T2,T3,T4,T5,T6> partial(Fn2<T8,T1,T2,T3,T4,T5,T6,T7> fn, UnderscoreStatic stub1, UnderscoreStatic stub2, UnderscoreStatic stub3, UnderscoreStatic stub4, UnderscoreStatic stub5, UnderscoreStatic stub6, T7 p7);
    native public Function memoize(Function fn, java.util.function.Function<Object,String> hashFn);
    native public Object delay(Function func, double wait, Object... args);
    native public Object delay(Function func, Object... args);
    native public void defer(Function fn, Object... args);
    native public <T extends Function> jsweet.util.union.Union<T,Cancelable> throttle(T func, double wait, ThrottleSettings options);
    native public <T extends Function> jsweet.util.union.Union<T,Cancelable> debounce(T fn, double wait, Boolean immediate);
    native public <T extends Function> T once(T fn);
    native public Function restArgs(Function func, double starIndex);
    native public Function after(double count, Function fn);
    native public Function before(double count, Function fn);
    native public Function wrap(Function fn, java.util.function.BiFunction<Function,Object,Object> wrapper);
    native public java.util.function.Function<Object,Boolean> negate(java.util.function.Function<Object,Boolean> predicate);
    native public Function compose(Function... functions);
    native public String[] allKeys(Object object);
    native public <T> T[] values(Dictionary<T> object);
    native public Object[] values(Object object);
    /**
         * Like map, but for objects. Transform the value of each property in turn.
         * @param object The object to transform
         * @param iteratee The function that transforms property values
         * @param context The optional context (value of `this`) to bind to
         * @return a new _.Dictionary of property values
         */
    native public <T,U> Dictionary<U> mapObject(Dictionary<T> object, jsweet.util.function.TriFunction<T,String,Dictionary<T>,U> iteratee, Object context);
    /**
         * Like map, but for objects. Transform the value of each property in turn.
         * @param object The object to transform
         * @param iteratee The function that tranforms property values
         * @param context The optional context (value of `this`) to bind to
         */
    native public <T> Dictionary<T> mapObject(Object object, jsweet.util.function.TriFunction<Object,String,Object,T> iteratee, Object context);
    /**
         * Like map, but for objects. Retrieves a property from each entry in the object, as if by _.property
         * @param object The object to transform
         * @param iteratee The property name to retrieve
         * @param context The optional context (value of `this`) to bind to
         */
    native public Dictionary<?> mapObject(Object object, String iteratee, Object context);
    native public Object[][] pairs(Object object);
    native public Object invert(Object object);
    native public String[] functions(Object object);
    native public String[] methods(Object object);
    native public Object extend(Object destination, Object... sources);
    /**
        * Like extend, but only copies own properties over to the destination object. (alias: assign)
        */
    native public Object extendOwn(Object destination, Object... source);
    /**
        * Like extend, but only copies own properties over to the destination object. (alias: extendOwn)
        */
    native public Object assign(Object destination, Object... source);
    /**
        * Returns the first key on an object that passes a predicate test.
        * @param obj the object to search in
        * @param predicate Predicate function.
        * @param context `this` object in `iterator`, optional.
        */
    native public <T> String findKey(Dictionary<T> obj, ObjectIterator<T,Boolean> predicate, Object context);
    native public Object pick(Object object, Object... keys);
    native public Object pick(Object object, jsweet.util.function.TriFunction<Object,Object,Object,Object> fn);
    native public Object omit(Object object, String[] keys);
    native public Object omit(Object object, Function iteratee);
    native public Object defaults(Object object, Object... defaults);
    native public Object create(Object prototype, Object props);
    native public <T> T clone(T object);
    native public <T> T tap(T object, Function intercepter);
    native public Boolean has(Object object, String key);
    native public <T,TResult> ListIterator<T,TResult> matches(T attrs);
    native public <T,TResult> ListIterator<T,TResult> matcher(T attrs);
    native public java.util.function.Function<Object,Object> property(String key);
    native public java.util.function.Function<String,Object> propertyOf(Object object);
    native public Boolean isEqual(Object object, Object other);
    native public Boolean isEmpty(Object object);
    native public Boolean isMatch(Object object, Object properties);
    native public Boolean isElement(Object object);
    native public <T> Boolean isArray(Object object);
    native public Boolean isSymbol(Object object);
    native public Boolean isObject(Object object);
    native public Boolean isArguments(Object object);
    native public Boolean isFunction(Object object);
    native public Boolean isError(Object object);
    native public Boolean isString(Object object);
    native public Boolean isNumber(Object object);
    native public Boolean isFinite(Object object);
    native public Boolean isBoolean(Object object);
    native public Boolean isDate(Object object);
    native public Boolean isRegExp(Object object);
    native public Boolean isNaN(Object object);
    native public Boolean isNull(Object object);
    native public Boolean isUndefined(Object value);
    native public Object noConflict();
    native public <T> T identity(T value);
    native public <T> java.util.function.Supplier<T> constant(T value);
    native public void noop();
    native public <TResult> TResult[] times(double n, java.util.function.Function<Double,TResult> iterator, Object context);
    native public double random(double max);
    native public double random(double min, double max);
    native public void mixin(Object object);
    native public Function iteratee(String value);
    native public Function iteratee(Function value, Object context);
    native public Function iteratee(Object value);
    native public String uniqueId(String prefix);
    native public String escape(String str);
    native public String unescape(String str);
    native public Object result(Object object, String property, Object defaultValue);
    native public java.util.function.Function<Object,String> template(String templateString, TemplateSettings settings);
    public TemplateSettings templateSettings;
    native public double now();
    native public <T> _Chain<T> chain(T[] obj);
    native public <T> _Chain<T> chain(Dictionary<T> obj);
    native public <T extends java.lang.Object> _Chain<T> chain(T obj);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial<T2> extends def.js.Object {
        native public T2 apply();
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Fn<T2,T1> extends def.js.Object {
        native public T2 apply(T1 p1);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class PartialData<T3,T2> extends def.js.Object {
        native public T3 apply(T2 p2);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class FnData<T3,T1,T2> extends def.js.Object {
        native public T3 apply(T1 p1, T2 p2);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class PartialDto<T3,T1> extends def.js.Object {
        native public T3 apply(T1 p1);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class PartialStructure<T4,T2,T3> extends def.js.Object {
        native public T4 apply(T2 p2, T3 p3);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class FnDto<T4,T1,T2,T3> extends def.js.Object {
        native public T4 apply(T1 p1, T2 p2, T3 p3);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class PartialInfo<T4,T3> extends def.js.Object {
        native public T4 apply(T3 p3);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial1<T4,T1,T3> extends def.js.Object {
        native public T4 apply(T1 p1, T3 p3);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial2<T4,T1,T2> extends def.js.Object {
        native public T4 apply(T1 p1, T2 p2);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial3<T5,T2,T3,T4> extends def.js.Object {
        native public T5 apply(T2 p2, T3 p3, T4 p4);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class FnStructure<T5,T1,T2,T3,T4> extends def.js.Object {
        native public T5 apply(T1 p1, T2 p2, T3 p3, T4 p4);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial4<T5,T3,T4> extends def.js.Object {
        native public T5 apply(T3 p3, T4 p4);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial5<T5,T1,T3,T4> extends def.js.Object {
        native public T5 apply(T1 p1, T3 p3, T4 p4);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial6<T5,T4> extends def.js.Object {
        native public T5 apply(T4 p4);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial7<T5,T1,T4> extends def.js.Object {
        native public T5 apply(T1 p1, T4 p4);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial8<T5,T2,T4> extends def.js.Object {
        native public T5 apply(T2 p2, T4 p4);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial9<T5,T1,T2,T4> extends def.js.Object {
        native public T5 apply(T1 p1, T2 p2, T4 p4);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial10<T5,T1,T2,T3> extends def.js.Object {
        native public T5 apply(T1 p1, T2 p2, T3 p3);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial11<T6,T2,T3,T4,T5> extends def.js.Object {
        native public T6 apply(T2 p2, T3 p3, T4 p4, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class FnInfo<T6,T1,T2,T3,T4,T5> extends def.js.Object {
        native public T6 apply(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial12<T6,T3,T4,T5> extends def.js.Object {
        native public T6 apply(T3 p3, T4 p4, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial13<T6,T1,T3,T4,T5> extends def.js.Object {
        native public T6 apply(T1 p1, T3 p3, T4 p4, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial14<T6,T4,T5> extends def.js.Object {
        native public T6 apply(T4 p4, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial15<T6,T1,T4,T5> extends def.js.Object {
        native public T6 apply(T1 p1, T4 p4, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial16<T6,T2,T4,T5> extends def.js.Object {
        native public T6 apply(T2 p2, T4 p4, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial17<T6,T1,T2,T4,T5> extends def.js.Object {
        native public T6 apply(T1 p1, T2 p2, T4 p4, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial18<T6,T5> extends def.js.Object {
        native public T6 apply(T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial19<T6,T1,T5> extends def.js.Object {
        native public T6 apply(T1 p1, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial20<T6,T2,T5> extends def.js.Object {
        native public T6 apply(T2 p2, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial21<T6,T1,T2,T5> extends def.js.Object {
        native public T6 apply(T1 p1, T2 p2, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial22<T6,T3,T5> extends def.js.Object {
        native public T6 apply(T3 p3, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial23<T6,T1,T3,T5> extends def.js.Object {
        native public T6 apply(T1 p1, T3 p3, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial24<T6,T2,T3,T5> extends def.js.Object {
        native public T6 apply(T2 p2, T3 p3, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial25<T6,T1,T2,T3,T5> extends def.js.Object {
        native public T6 apply(T1 p1, T2 p2, T3 p3, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial26<T6,T1,T2,T3,T4> extends def.js.Object {
        native public T6 apply(T1 p1, T2 p2, T3 p3, T4 p4);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial27<T7,T2,T3,T4,T5,T6> extends def.js.Object {
        native public T7 apply(T2 p2, T3 p3, T4 p4, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Fn1<T7,T1,T2,T3,T4,T5,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial28<T7,T3,T4,T5,T6> extends def.js.Object {
        native public T7 apply(T3 p3, T4 p4, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial29<T7,T1,T3,T4,T5,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T3 p3, T4 p4, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial30<T7,T4,T5,T6> extends def.js.Object {
        native public T7 apply(T4 p4, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial31<T7,T1,T4,T5,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T4 p4, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial32<T7,T2,T4,T5,T6> extends def.js.Object {
        native public T7 apply(T2 p2, T4 p4, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial33<T7,T1,T2,T4,T5,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T2 p2, T4 p4, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial34<T7,T5,T6> extends def.js.Object {
        native public T7 apply(T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial35<T7,T1,T5,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial36<T7,T2,T5,T6> extends def.js.Object {
        native public T7 apply(T2 p2, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial37<T7,T1,T2,T5,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T2 p2, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial38<T7,T3,T5,T6> extends def.js.Object {
        native public T7 apply(T3 p3, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial39<T7,T1,T3,T5,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T3 p3, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial40<T7,T2,T3,T5,T6> extends def.js.Object {
        native public T7 apply(T2 p2, T3 p3, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial41<T7,T1,T2,T3,T5,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T2 p2, T3 p3, T5 p5, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial42<T7,T6> extends def.js.Object {
        native public T7 apply(T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial43<T7,T1,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial44<T7,T2,T6> extends def.js.Object {
        native public T7 apply(T2 p2, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial45<T7,T1,T2,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T2 p2, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial46<T7,T3,T6> extends def.js.Object {
        native public T7 apply(T3 p3, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial47<T7,T1,T3,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T3 p3, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial48<T7,T2,T3,T6> extends def.js.Object {
        native public T7 apply(T2 p2, T3 p3, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial49<T7,T1,T2,T3,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T2 p2, T3 p3, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial50<T7,T4,T6> extends def.js.Object {
        native public T7 apply(T4 p4, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial51<T7,T1,T4,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T4 p4, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial52<T7,T2,T4,T6> extends def.js.Object {
        native public T7 apply(T2 p2, T4 p4, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial53<T7,T1,T2,T4,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T2 p2, T4 p4, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial54<T7,T3,T4,T6> extends def.js.Object {
        native public T7 apply(T3 p3, T4 p4, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial55<T7,T1,T3,T4,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T3 p3, T4 p4, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial56<T7,T2,T3,T4,T6> extends def.js.Object {
        native public T7 apply(T2 p2, T3 p3, T4 p4, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial57<T7,T1,T2,T3,T4,T6> extends def.js.Object {
        native public T7 apply(T1 p1, T2 p2, T3 p3, T4 p4, T6 p6);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial58<T7,T1,T2,T3,T4,T5> extends def.js.Object {
        native public T7 apply(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial59<T8,T2,T3,T4,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T3 p3, T4 p4, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Fn2<T8,T1,T2,T3,T4,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial60<T8,T3,T4,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T3 p3, T4 p4, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial61<T8,T1,T3,T4,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T3 p3, T4 p4, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial62<T8,T4,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T4 p4, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial63<T8,T1,T4,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T4 p4, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial64<T8,T2,T4,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T4 p4, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial65<T8,T1,T2,T4,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T4 p4, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial66<T8,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial67<T8,T1,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial68<T8,T2,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial69<T8,T1,T2,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial70<T8,T3,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T3 p3, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial71<T8,T1,T3,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T3 p3, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial72<T8,T2,T3,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T3 p3, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial73<T8,T1,T2,T3,T5,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T3 p3, T5 p5, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial74<T8,T6,T7> extends def.js.Object {
        native public T8 apply(T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial75<T8,T1,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial76<T8,T2,T6,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial77<T8,T1,T2,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial78<T8,T3,T6,T7> extends def.js.Object {
        native public T8 apply(T3 p3, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial79<T8,T1,T3,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T3 p3, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial80<T8,T2,T3,T6,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T3 p3, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial81<T8,T1,T2,T3,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T3 p3, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial82<T8,T4,T6,T7> extends def.js.Object {
        native public T8 apply(T4 p4, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial83<T8,T1,T4,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T4 p4, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial84<T8,T2,T4,T6,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T4 p4, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial85<T8,T1,T2,T4,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T4 p4, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial86<T8,T3,T4,T6,T7> extends def.js.Object {
        native public T8 apply(T3 p3, T4 p4, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial87<T8,T1,T3,T4,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T3 p3, T4 p4, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial88<T8,T2,T3,T4,T6,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T3 p3, T4 p4, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial89<T8,T1,T2,T3,T4,T6,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T3 p3, T4 p4, T6 p6, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial90<T8,T7> extends def.js.Object {
        native public T8 apply(T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial91<T8,T1,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial92<T8,T2,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial93<T8,T1,T2,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial94<T8,T3,T7> extends def.js.Object {
        native public T8 apply(T3 p3, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial95<T8,T1,T3,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T3 p3, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial96<T8,T2,T3,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T3 p3, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial97<T8,T1,T2,T3,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T3 p3, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial98<T8,T4,T7> extends def.js.Object {
        native public T8 apply(T4 p4, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial99<T8,T1,T4,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T4 p4, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial100<T8,T2,T4,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T4 p4, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial101<T8,T1,T2,T4,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T4 p4, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial102<T8,T3,T4,T7> extends def.js.Object {
        native public T8 apply(T3 p3, T4 p4, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial103<T8,T1,T3,T4,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T3 p3, T4 p4, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial104<T8,T2,T3,T4,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T3 p3, T4 p4, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial105<T8,T1,T2,T3,T4,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T3 p3, T4 p4, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial106<T8,T5,T7> extends def.js.Object {
        native public T8 apply(T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial107<T8,T1,T5,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial108<T8,T2,T5,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial109<T8,T1,T2,T5,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial110<T8,T3,T5,T7> extends def.js.Object {
        native public T8 apply(T3 p3, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial111<T8,T1,T3,T5,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T3 p3, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial112<T8,T2,T3,T5,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T3 p3, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial113<T8,T1,T2,T3,T5,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T3 p3, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial114<T8,T4,T5,T7> extends def.js.Object {
        native public T8 apply(T4 p4, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial115<T8,T1,T4,T5,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T4 p4, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial116<T8,T2,T4,T5,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T4 p4, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial117<T8,T1,T2,T4,T5,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T4 p4, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial118<T8,T3,T4,T5,T7> extends def.js.Object {
        native public T8 apply(T3 p3, T4 p4, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial119<T8,T1,T3,T4,T5,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T3 p3, T4 p4, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial120<T8,T2,T3,T4,T5,T7> extends def.js.Object {
        native public T8 apply(T2 p2, T3 p3, T4 p4, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial121<T8,T1,T2,T3,T4,T5,T7> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, T7 p7);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Partial122<T8,T1,T2,T3,T4,T5,T6> extends def.js.Object {
        native public T8 apply(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5, T6 p6);
    }
    native public <T> List<T> each(List<T> list, ListIterator<T,Void> iterator);
    native public <T> Dictionary<T> each(Dictionary<T> object, ObjectIterator<T,Void> iterator);
    native public <T> List<T> forEach(List<T> list, ListIterator<T,Void> iterator);
    native public <T> Dictionary<T> forEach(Dictionary<T> object, ObjectIterator<T,Void> iterator);
    native public <T,TResult> TResult[] map(List<T> list, Object iterator);
    native public <T,TResult> TResult[] map(Dictionary<T> object, ObjectIterator<T,TResult> iterator);
    native public <T,TResult> TResult[] collect(List<T> list, Object iterator);
    native public <T,TResult> TResult[] collect(Dictionary<T> object, ObjectIterator<T,TResult> iterator);
    native public <T,TResult> TResult reduce(Collection<T> list, MemoIterator<T,TResult> iterator, TResult memo);
    native public <T,TResult> TResult reduce(Collection<T> list, MemoIterator<T,TResult> iterator);
    native public <T,TResult> TResult reduce(Dictionary<T> list, MemoObjectIterator<T,TResult> iterator, TResult memo);
    native public <T,TResult> TResult reduce(Dictionary<T> list, MemoObjectIterator<T,TResult> iterator);
    native public <T,TResult> TResult inject(Collection<T> list, MemoIterator<T,TResult> iterator, TResult memo);
    native public <T,TResult> TResult inject(Collection<T> list, MemoIterator<T,TResult> iterator);
    native public <T,TResult> TResult foldl(Collection<T> list, MemoIterator<T,TResult> iterator, TResult memo);
    native public <T,TResult> TResult foldl(Collection<T> list, MemoIterator<T,TResult> iterator);
    native public <T,TResult> TResult reduceRight(Collection<T> list, MemoIterator<T,TResult> iterator, TResult memo);
    native public <T,TResult> TResult reduceRight(Collection<T> list, MemoIterator<T,TResult> iterator);
    native public <T,TResult> TResult foldr(Collection<T> list, MemoIterator<T,TResult> iterator, TResult memo);
    native public <T,TResult> TResult foldr(Collection<T> list, MemoIterator<T,TResult> iterator);
    native public <T> T find(List<T> list, ListIterator<T,Boolean> iterator);
    native public <T> T find(Dictionary<T> object, ObjectIterator<T,Boolean> iterator);
    native public <T> T detect(List<T> list, ListIterator<T,Boolean> iterator);
    native public <T> T detect(Dictionary<T> object, ObjectIterator<T,Boolean> iterator);
    native public <T> T[] filter(List<T> list, ListIterator<T,Boolean> iterator);
    native public <T> T[] filter(Dictionary<T> object, ObjectIterator<T,Boolean> iterator);
    native public <T> T[] select(List<T> list, ListIterator<T,Boolean> iterator);
    native public <T> T[] select(Dictionary<T> object, ObjectIterator<T,Boolean> iterator);
    native public <T> T[] reject(List<T> list, ListIterator<T,Boolean> iterator);
    native public <T> T[] reject(Dictionary<T> object, ObjectIterator<T,Boolean> iterator);
    native public <T> Boolean every(List<T> list, ListIterator<T,Boolean> iterator);
    native public <T> Boolean every(List<T> list);
    native public <T> Boolean every(Dictionary<T> list, ObjectIterator<T,Boolean> iterator);
    native public <T> Boolean every(Dictionary<T> list);
    native public <T> Boolean all(List<T> list, ListIterator<T,Boolean> iterator);
    native public <T> Boolean all(List<T> list);
    native public <T> Boolean all(Dictionary<T> list, ObjectIterator<T,Boolean> iterator);
    native public <T> Boolean all(Dictionary<T> list);
    native public <T> Boolean some(List<T> list, ListIterator<T,Boolean> iterator);
    native public <T> Boolean some(List<T> list);
    native public <T> Boolean some(Dictionary<T> object, ObjectIterator<T,Boolean> iterator);
    native public <T> Boolean some(Dictionary<T> object);
    native public <T> Boolean any(List<T> list, ListIterator<T,Boolean> iterator);
    native public <T> Boolean any(List<T> list);
    native public <T> Boolean any(Dictionary<T> object, ObjectIterator<T,Boolean> iterator);
    native public <T> Boolean any(Dictionary<T> object);
    native public <T> Boolean contains(List<T> list, T value);
    native public <T> Boolean include(Collection<T> list, T value);
    native public <T> Boolean includes(Collection<T> list, T value);
    native public <T> T max(List<T> list, ListIterator<T,?> iterator);
    /**
        * @see _.max
        */
    native public <T> T max(Dictionary<T> list, ObjectIterator<T,?> iterator);
    native public <T> T min(List<T> list, ListIterator<T,?> iterator);
    /**
        * @see _.min
        */
    native public <T> T min(Dictionary<T> list, ObjectIterator<T,?> iterator);
    native public <T,TSort> T[] sortBy(List<T> list, ListIterator<T,TSort> iterator);
    native public <T,TSort> T[] sortBy(List<T> list);
    native public <T> T[] sortBy(List<T> list, String iterator);
    native public <T> Dictionary<T[]> groupBy(List<T> list, ListIterator<T,?> iterator);
    native public <T> Dictionary<T[]> groupBy(List<T> list);
    native public <T> Dictionary<T[]> groupBy(List<T> list, String iterator);
    native public <T> Dictionary<T> indexBy(List<T> list, ListIterator<T,?> iterator);
    native public <T> Dictionary<T> indexBy(List<T> list, String iterator);
    native public <T> Dictionary<Double> countBy(List<T> list, ListIterator<T,?> iterator);
    native public <T> Dictionary<Double> countBy(List<T> list);
    native public <T> Dictionary<Double> countBy(List<T> list, String iterator);
    native public <T> T[][] partition(Array<T> array, ListIterator<T,Boolean> iterator);
    native public <T> T[] initial(List<T> array);
    native public <T> T[] rest(List<T> array);
    native public <T> T[] tail(List<T> array);
    native public <T> T[] drop(List<T> array);
    native public Object[] flatten(List<?> array);
    native public <T,TSort> T[] uniq(List<T> array, Boolean isSorted, ListIterator<T,TSort> iterator);
    native public <T,TSort> T[] uniq(List<T> array, Boolean isSorted);
    native public <T,TSort> T[] uniq(List<T> array);
    native public <T,TSort> T[] uniq(List<T> array, ListIterator<T,TSort> iterator);
    native public <T,TSort> T[] unique(List<T> array, ListIterator<T,TSort> iterator);
    native public <T,TSort> T[] unique(List<T> array);
    native public <T,TSort> T[] unique(List<T> array, Boolean isSorted, ListIterator<T,TSort> iterator);
    native public <T,TSort> T[] unique(List<T> array, Boolean isSorted);
    native public <TResult extends java.lang.Object> TResult object(List<?> list);
    native public <T> double indexOf(List<T> array, T value);
    native public <T> double lastIndexOf(List<T> array, T value);
    native public <T> double findIndex(List<T> array, ListIterator<T,Boolean> predicate);
    native public <T> double findLastIndex(List<T> array, ListIterator<T,Boolean> predicate);
    native public <T,TSort> double sortedIndex(List<T> list, T value, java.util.function.Function<T,TSort> iterator);
    native public <T,TSort> double sortedIndex(List<T> list, T value);
    native public double[] range(double start, double stop);
    native public Function memoize(Function fn);
    native public <T extends Function> jsweet.util.union.Union<T,Cancelable> throttle(T func, double wait);
    native public <T extends Function> jsweet.util.union.Union<T,Cancelable> debounce(T fn, double wait);
    native public Function restArgs(Function func);
    /**
         * Like map, but for objects. Transform the value of each property in turn.
         * @param object The object to transform
         * @param iteratee The function that transforms property values
         * @param context The optional context (value of `this`) to bind to
         * @return a new _.Dictionary of property values
         */
    native public <T,U> Dictionary<U> mapObject(Dictionary<T> object, jsweet.util.function.TriFunction<T,String,Dictionary<T>,U> iteratee);
    /**
         * Like map, but for objects. Transform the value of each property in turn.
         * @param object The object to transform
         * @param iteratee The function that tranforms property values
         * @param context The optional context (value of `this`) to bind to
         */
    native public <T> Dictionary<T> mapObject(Object object, jsweet.util.function.TriFunction<Object,String,Object,T> iteratee);
    /**
         * Like map, but for objects. Retrieves a property from each entry in the object, as if by _.property
         * @param object The object to transform
         * @param iteratee The property name to retrieve
         * @param context The optional context (value of `this`) to bind to
         */
    native public Dictionary<?> mapObject(Object object, String iteratee);
    /**
        * Returns the first key on an object that passes a predicate test.
        * @param obj the object to search in
        * @param predicate Predicate function.
        * @param context `this` object in `iterator`, optional.
        */
    native public <T> String findKey(Dictionary<T> obj, ObjectIterator<T,Boolean> predicate);
    native public <TResult> TResult[] times(double n, java.util.function.Function<Double,TResult> iterator);
    native public Function iteratee(Function value);
    native public String uniqueId();
    native public Object result(Object object, String property);
    native public java.util.function.Function<Object,String> template(String templateString);
    native public <T,U extends java.lang.Object> T find(Dictionary<T> object, U iterator);
    native public <T> T find(Dictionary<T> object, String iterator);
    native public <T,U extends java.lang.Object> T detect(Dictionary<T> object, U iterator);
    native public <T> T detect(Dictionary<T> object, String iterator);
    native public <T,TSort> T[] uniq(List<T> array, Boolean isSorted, java.lang.String iterator, Object context);
    native public <T,TSort> T[] uniq(List<T> array, Boolean isSorted, double iterator, Object context);
    native public <T,TSort> T[] unique(List<T> array, double iterator, Object context);
    native public <T,TSort> T[] unique(List<T> array, java.lang.String iterator, Object context);
    native public <T> double findIndex(List<T> array, java.lang.Object predicate, Object context);
    native public <T> double findLastIndex(List<T> array, java.lang.Object predicate, Object context);
    native public <T,TSort> T[] uniq(List<T> array, Boolean isSorted, double iterator);
    native public <T,TSort> T[] uniq(List<T> array, Boolean isSorted, java.lang.String iterator);
    native public <T,TSort> T[] unique(List<T> array, java.lang.String iterator);
    native public <T,TSort> T[] unique(List<T> array, double iterator);
    native public <T> double findIndex(List<T> array, java.lang.Object predicate);
    native public <T> double findLastIndex(List<T> array, java.lang.Object predicate);
    native public <T> Underscore<T> apply(T[] value);
    native public <T> List<T> each(T[] list, ListIterator<T,Void> iterator, Object context);
    native public <T> List<T> forEach(T[] list, ListIterator<T,Void> iterator, Object context);
    native public <T,TResult> TResult[] map(T[] list, Object iterator, Object context);
    native public <T,TResult> TResult[] collect(T[] list, Object iterator, Object context);
    native public <T> T find(T[] list, ListIterator<T,Boolean> iterator, Object context);
    native public <T,U extends java.lang.Object> T find(T[] object, U iterator);
    native public <T> T find(T[] object, String iterator);
    native public <T> T detect(T[] list, ListIterator<T,Boolean> iterator, Object context);
    native public <T,U extends java.lang.Object> T detect(T[] object, U iterator);
    native public <T> T detect(T[] object, String iterator);
    native public <T> T[] filter(T[] list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> T[] select(T[] list, ListIterator<T,Boolean> iterator, Object context);
    native public <T,U extends java.lang.Object> T[] where(T[] list, U properties);
    native public <T,U extends java.lang.Object> T findWhere(T[] list, U properties);
    native public <T> T[] reject(T[] list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean every(T[] list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean all(T[] list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean some(T[] list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean any(T[] list, ListIterator<T,Boolean> iterator, Object context);
    native public <T> Boolean any(T[] list, T value);
    native public <T> Boolean contains(T[] list, T value, double fromIndex);
    native public <T extends java.lang.Object> Object invoke(T[] list, String methodName, Object... args);
    native public <T extends java.lang.Object> Object[] pluck(T[] list, String propertyName);
    native public double max(Double[] list);
    native public <T> T max(T[] list, ListIterator<T,?> iterator, Object context);
    native public double min(Double[] list);
    native public <T> T min(T[] list, ListIterator<T,?> iterator, Object context);
    native public <T,TSort> T[] sortBy(T[] list, ListIterator<T,TSort> iterator, Object context);
    native public <T> T[] sortBy(T[] list, String iterator, Object context);
    native public <T> Dictionary<T[]> groupBy(T[] list, ListIterator<T,?> iterator, Object context);
    native public <T> Dictionary<T[]> groupBy(T[] list, String iterator, Object context);
    native public <T> Dictionary<T> indexBy(T[] list, ListIterator<T,?> iterator, Object context);
    native public <T> Dictionary<T> indexBy(T[] list, String iterator, Object context);
    native public <T> Dictionary<Double> countBy(T[] list, ListIterator<T,?> iterator, Object context);
    native public <T> Dictionary<Double> countBy(T[] list, String iterator, Object context);
    native public <T> T[][] partition(T[] array, ListIterator<T,Boolean> iterator, Object context);
    native public <T> T first(T[] array);
    native public <T> T[] first(T[] array, double n);
    native public <T> T head(T[] array);
    native public <T> T[] head(T[] array, double n);
    native public <T> T take(T[] array);
    native public <T> T[] take(T[] array, double n);
    native public <T> T[] initial(T[] array, double n);
    native public <T> T last(T[] array);
    native public <T> T[] last(T[] array, double n);
    native public <T> T[] rest(T[] array, double n);
    native public <T> T[] tail(T[] array, double n);
    native public <T> T[] drop(T[] array, double n);
    native public <T> T[] compact(T[] array);
    native public Object[] flatten(Object[] array, Boolean shallow);
    native public <T> T[] without(T[] array, @SuppressWarnings("unchecked") T... values);
    native public <T> T[] difference(T[] array, @SuppressWarnings("unchecked") List<T>... others);
    native public <T,TSort> T[] uniq(T[] array, Boolean isSorted, ListIterator<T,TSort> iterator, Object context);
    native public <T,TSort> T[] uniq(T[] array, ListIterator<T,TSort> iterator, Object context);
    native public <T,TSort> T[] unique(T[] array, ListIterator<T,TSort> iterator, Object context);
    native public <T,TSort> T[] unique(T[] array, Boolean isSorted, ListIterator<T,TSort> iterator, Object context);
    native public <TResult extends java.lang.Object> TResult object(List<String> keys, Object[] values);
    native public <TResult extends java.lang.Object> TResult object(String[] keys, List<?> values);
    native public <TResult extends java.lang.Object> TResult object(Object[] list, Object values);
    native public <T> double indexOf(T[] array, T value, Boolean isSorted);
    native public <T> double indexOf(T[] array, T value, double startFrom);
    native public <T> double lastIndexOf(T[] array, T value, double from);
    native public <T> double findIndex(T[] array, ListIterator<T,Boolean> predicate, Object context);
    native public <T> double findLastIndex(T[] array, ListIterator<T,Boolean> predicate, Object context);
    native public <T,TSort> double sortedIndex(T[] list, T value, java.util.function.Function<T,TSort> iterator, Object context);
    native public <T> List<T> each(T[] list, ListIterator<T,Void> iterator);
    native public <T> List<T> forEach(T[] list, ListIterator<T,Void> iterator);
    native public <T,TResult> TResult[] map(T[] list, Object iterator);
    native public <T,TResult> TResult[] collect(T[] list, Object iterator);
    native public <T> T find(T[] list, ListIterator<T,Boolean> iterator);
    native public <T> T detect(T[] list, ListIterator<T,Boolean> iterator);
    native public <T> T[] filter(T[] list, ListIterator<T,Boolean> iterator);
    native public <T> T[] select(T[] list, ListIterator<T,Boolean> iterator);
    native public <T> T[] reject(T[] list, ListIterator<T,Boolean> iterator);
    native public <T> Boolean every(T[] list, ListIterator<T,Boolean> iterator);
    native public <T> Boolean every(T[] list);
    native public <T> Boolean all(T[] list, ListIterator<T,Boolean> iterator);
    native public <T> Boolean all(T[] list);
    native public <T> Boolean some(T[] list, ListIterator<T,Boolean> iterator);
    native public <T> Boolean some(T[] list);
    native public <T> Boolean any(T[] list, ListIterator<T,Boolean> iterator);
    native public <T> Boolean any(T[] list);
    native public <T> Boolean contains(T[] list, T value);
    native public <T> T max(T[] list, ListIterator<T,?> iterator);
    native public <T> T min(T[] list, ListIterator<T,?> iterator);
    native public <T,TSort> T[] sortBy(T[] list, ListIterator<T,TSort> iterator);
    native public <T,TSort> T[] sortBy(T[] list);
    native public <T> T[] sortBy(T[] list, String iterator);
    native public <T> Dictionary<T[]> groupBy(T[] list, ListIterator<T,?> iterator);
    native public <T> Dictionary<T[]> groupBy(T[] list);
    native public <T> Dictionary<T[]> groupBy(T[] list, String iterator);
    native public <T> Dictionary<T> indexBy(T[] list, ListIterator<T,?> iterator);
    native public <T> Dictionary<T> indexBy(T[] list, String iterator);
    native public <T> Dictionary<Double> countBy(T[] list, ListIterator<T,?> iterator);
    native public <T> Dictionary<Double> countBy(T[] list);
    native public <T> Dictionary<Double> countBy(T[] list, String iterator);
    native public <T> T[][] partition(T[] array, ListIterator<T,Boolean> iterator);
    native public <T> T[] initial(T[] array);
    native public <T> T[] rest(T[] array);
    native public <T> T[] tail(T[] array);
    native public <T> T[] drop(T[] array);
    native public Object[] flatten(Object[] array);
    native public <T,TSort> T[] uniq(T[] array, Boolean isSorted, ListIterator<T,TSort> iterator);
    native public <T,TSort> T[] uniq(T[] array, Boolean isSorted);
    native public <T,TSort> T[] uniq(T[] array);
    native public <T,TSort> T[] uniq(T[] array, ListIterator<T,TSort> iterator);
    native public <T,TSort> T[] unique(T[] array, ListIterator<T,TSort> iterator);
    native public <T,TSort> T[] unique(T[] array);
    native public <T,TSort> T[] unique(T[] array, Boolean isSorted, ListIterator<T,TSort> iterator);
    native public <T,TSort> T[] unique(T[] array, Boolean isSorted);
    native public <TResult extends java.lang.Object> TResult object(Object[] list);
    native public <T> double indexOf(T[] array, T value);
    native public <T> double lastIndexOf(T[] array, T value);
    native public <T> double findIndex(T[] array, ListIterator<T,Boolean> predicate);
    native public <T> double findLastIndex(T[] array, ListIterator<T,Boolean> predicate);
    native public <T,TSort> double sortedIndex(T[] list, T value, java.util.function.Function<T,TSort> iterator);
    native public <T,TSort> double sortedIndex(T[] list, T value);
    native public <T,TSort> T[] uniq(T[] array, Boolean isSorted, java.lang.String iterator, Object context);
    native public <T,TSort> T[] uniq(T[] array, Boolean isSorted, double iterator, Object context);
    native public <T,TSort> T[] unique(T[] array, double iterator, Object context);
    native public <T,TSort> T[] unique(T[] array, java.lang.String iterator, Object context);
    native public <T> double findIndex(T[] array, java.lang.Object predicate, Object context);
    native public <T> double findLastIndex(T[] array, java.lang.Object predicate, Object context);
    native public <T,TSort> T[] uniq(T[] array, Boolean isSorted, double iterator);
    native public <T,TSort> T[] uniq(T[] array, Boolean isSorted, java.lang.String iterator);
    native public <T,TSort> T[] unique(T[] array, java.lang.String iterator);
    native public <T,TSort> T[] unique(T[] array, double iterator);
    native public <T> double findIndex(T[] array, java.lang.Object predicate);
    native public <T> double findLastIndex(T[] array, java.lang.Object predicate);
}

