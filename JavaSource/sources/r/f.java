package r;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: MyApplication */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f25738a;

    /* renamed from: b, reason: collision with root package name */
    private int f25739b;

    /* renamed from: c, reason: collision with root package name */
    private int f25740c;

    /* renamed from: d, reason: collision with root package name */
    private int f25741d;

    /* renamed from: e, reason: collision with root package name */
    private int f25742e;

    /* renamed from: f, reason: collision with root package name */
    private int f25743f;

    /* renamed from: g, reason: collision with root package name */
    private int f25744g;

    /* renamed from: h, reason: collision with root package name */
    private int f25745h;

    public f(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f25740c = i7;
        this.f25738a = new LinkedHashMap(0, 0.75f, true);
    }

    private int f(Object obj, Object obj2) {
        int g8 = g(obj, obj2);
        if (g8 >= 0) {
            return g8;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    protected Object a(Object obj) {
        return null;
    }

    public final Object c(Object obj) {
        Object put;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f25738a.get(obj);
                if (obj2 != null) {
                    this.f25744g++;
                    return obj2;
                }
                this.f25745h++;
                Object a8 = a(obj);
                if (a8 == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f25742e++;
                        put = this.f25738a.put(obj, a8);
                        if (put != null) {
                            this.f25738a.put(obj, put);
                        } else {
                            this.f25739b += f(obj, a8);
                        }
                    } finally {
                    }
                }
                if (put != null) {
                    b(false, obj, a8, put);
                    return put;
                }
                i(this.f25740c);
                return a8;
            } finally {
            }
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f25741d++;
                this.f25739b += f(obj, obj2);
                put = this.f25738a.put(obj, obj2);
                if (put != null) {
                    this.f25739b -= f(obj, put);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            b(false, obj, put, obj2);
        }
        i(this.f25740c);
        return put;
    }

    public final Object e(Object obj) {
        Object remove;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                remove = this.f25738a.remove(obj);
                if (remove != null) {
                    this.f25739b -= f(obj, remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            b(false, obj, remove, null);
        }
        return remove;
    }

    protected int g(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized Map h() {
        return new LinkedHashMap(this.f25738a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f25739b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap r0 = r4.f25738a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r4.f25739b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r5 = move-exception
            goto L74
        L14:
            int r0 = r4.f25739b     // Catch: java.lang.Throwable -> L12
            if (r0 <= r5) goto L53
            java.util.LinkedHashMap r0 = r4.f25738a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap r0 = r4.f25738a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r2 = r4.f25738a     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f25739b     // Catch: java.lang.Throwable -> L12
            int r3 = r4.f(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r3
            r4.f25739b = r2     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f25743f     // Catch: java.lang.Throwable -> L12
            r3 = 1
            int r2 = r2 + r3
            r4.f25743f = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L0
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r5     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f.i(int):void");
    }

    public final synchronized String toString() {
        int i7;
        int i8;
        try {
            i7 = this.f25744g;
            i8 = this.f25745h + i7;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f25740c), Integer.valueOf(this.f25744g), Integer.valueOf(this.f25745h), Integer.valueOf(i8 != 0 ? (i7 * 100) / i8 : 0));
    }

    protected void b(boolean z7, Object obj, Object obj2, Object obj3) {
    }
}
