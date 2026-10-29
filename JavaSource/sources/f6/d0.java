package f6;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class d0 extends c0 {
    public static int a(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map b(e6.l lVar) {
        q6.i.e(lVar, "pair");
        Map singletonMap = Collections.singletonMap(lVar.c(), lVar.d());
        q6.i.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final Map c(Map map) {
        q6.i.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        q6.i.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
