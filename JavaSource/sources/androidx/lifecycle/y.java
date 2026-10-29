package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: MyApplication */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f2551a = new HashMap();

    public final void a() {
        Iterator it = this.f2551a.values().iterator();
        while (it.hasNext()) {
            ((w) it.next()).a();
        }
        this.f2551a.clear();
    }

    final w b(String str) {
        return (w) this.f2551a.get(str);
    }

    Set c() {
        return new HashSet(this.f2551a.keySet());
    }

    final void d(String str, w wVar) {
        w wVar2 = (w) this.f2551a.put(str, wVar);
        if (wVar2 != null) {
            wVar2.d();
        }
    }
}
