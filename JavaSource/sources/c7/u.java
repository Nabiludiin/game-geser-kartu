package c7;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import x6.x1;

/* compiled from: MyApplication */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f3826a;

    /* renamed from: b, reason: collision with root package name */
    public static final x1 f3827b;

    static {
        u uVar = new u();
        f3826a = uVar;
        g0.f("kotlinx.coroutines.fast.service.loader", true);
        f3827b = uVar.a();
    }

    private u() {
    }

    private final x1 a() {
        Object next;
        x1 e8;
        try {
            List c8 = v6.c.c(v6.c.a(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator()));
            Iterator it = c8.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c9 = ((t) next).c();
                    do {
                        Object next2 = it.next();
                        int c10 = ((t) next2).c();
                        if (c9 < c10) {
                            next = next2;
                            c9 = c10;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            t tVar = (t) next;
            if (tVar != null && (e8 = v.e(tVar, c8)) != null) {
                return e8;
            }
            v.b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            v.b(th, null, 2, null);
            return null;
        }
    }
}
