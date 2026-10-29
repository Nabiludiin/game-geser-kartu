package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private final Map f2547a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f2548b = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    final void a() {
        this.f2548b = true;
        Map map = this.f2547a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f2547a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        d();
    }

    Object c(String str) {
        Object obj;
        Map map = this.f2547a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f2547a.get(str);
        }
        return obj;
    }

    protected void d() {
    }
}
