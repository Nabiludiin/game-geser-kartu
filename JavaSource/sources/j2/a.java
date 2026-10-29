package j2;

import android.util.SparseArray;
import java.util.HashMap;
import w1.d;

/* compiled from: MyApplication */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray f24243a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f24244b;

    static {
        HashMap hashMap = new HashMap();
        f24244b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f24244b.put(d.VERY_LOW, 1);
        f24244b.put(d.HIGHEST, 2);
        for (d dVar : f24244b.keySet()) {
            f24243a.append(((Integer) f24244b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f24244b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) f24243a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i7);
    }
}
