package f6;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class e0 extends d0 {
    public static final Map d() {
        y yVar = y.f23806q;
        q6.i.c(yVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return yVar;
    }

    public static final Map e(Map map) {
        q6.i.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : d0.c(map) : d();
    }

    public static final void f(Map map, Iterable iterable) {
        q6.i.e(map, "<this>");
        q6.i.e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            e6.l lVar = (e6.l) it.next();
            map.put(lVar.a(), lVar.b());
        }
    }

    public static Map g(Iterable iterable) {
        q6.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return e(h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return h(iterable, new LinkedHashMap(d0.a(collection.size())));
        }
        return d0.b((e6.l) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map h(Iterable iterable, Map map) {
        q6.i.e(iterable, "<this>");
        q6.i.e(map, "destination");
        f(map, iterable);
        return map;
    }
}
