package u5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MyApplication */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f26575b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f26576a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar;
        d dVar2 = f26575b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f26575b;
                if (dVar == null) {
                    dVar = new d();
                    f26575b = dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    Set b() {
        Set unmodifiableSet;
        synchronized (this.f26576a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f26576a);
        }
        return unmodifiableSet;
    }
}
