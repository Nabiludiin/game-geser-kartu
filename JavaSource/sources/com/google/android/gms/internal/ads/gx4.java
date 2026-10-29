package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
public final class gx4 extends AbstractMap implements Serializable {

    /* renamed from: y, reason: collision with root package name */
    private static final Comparator f9244y = new zw4();

    /* renamed from: q, reason: collision with root package name */
    private final Comparator f9245q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f9246r;

    /* renamed from: s, reason: collision with root package name */
    fx4 f9247s;

    /* renamed from: t, reason: collision with root package name */
    int f9248t;

    /* renamed from: u, reason: collision with root package name */
    int f9249u;

    /* renamed from: v, reason: collision with root package name */
    final fx4 f9250v;

    /* renamed from: w, reason: collision with root package name */
    private bx4 f9251w;

    /* renamed from: x, reason: collision with root package name */
    private dx4 f9252x;

    public gx4(Comparator comparator, boolean z7) {
        this.f9248t = 0;
        this.f9249u = 0;
        this.f9245q = comparator;
        this.f9246r = z7;
        this.f9250v = new fx4(z7);
    }

    private final void f(fx4 fx4Var, fx4 fx4Var2) {
        fx4 fx4Var3 = fx4Var.f8528q;
        fx4Var.f8528q = null;
        if (fx4Var2 != null) {
            fx4Var2.f8528q = fx4Var3;
        }
        if (fx4Var3 == null) {
            this.f9247s = fx4Var2;
        } else if (fx4Var3.f8529r == fx4Var) {
            fx4Var3.f8529r = fx4Var2;
        } else {
            fx4Var3.f8530s = fx4Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r10 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(com.google.android.gms.internal.ads.fx4 r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            com.google.android.gms.internal.ads.fx4 r0 = r9.f8529r
            com.google.android.gms.internal.ads.fx4 r1 = r9.f8530s
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.f8536y
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.f8536y
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            com.google.android.gms.internal.ads.fx4 r0 = r1.f8529r
            com.google.android.gms.internal.ads.fx4 r3 = r1.f8530s
            if (r3 == 0) goto L22
            int r3 = r3.f8536y
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.f8536y
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.i(r1)
            r8.h(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.h(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            com.google.android.gms.internal.ads.fx4 r1 = r0.f8529r
            com.google.android.gms.internal.ads.fx4 r3 = r0.f8530s
            if (r3 == 0) goto L4e
            int r3 = r3.f8536y
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.f8536y
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.h(r0)
            r8.i(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.i(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.f8536y = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.f8536y = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            com.google.android.gms.internal.ads.fx4 r9 = r9.f8528q
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx4.g(com.google.android.gms.internal.ads.fx4, boolean):void");
    }

    private final void h(fx4 fx4Var) {
        fx4 fx4Var2 = fx4Var.f8529r;
        fx4 fx4Var3 = fx4Var.f8530s;
        fx4 fx4Var4 = fx4Var3.f8529r;
        fx4 fx4Var5 = fx4Var3.f8530s;
        fx4Var.f8530s = fx4Var4;
        if (fx4Var4 != null) {
            fx4Var4.f8528q = fx4Var;
        }
        f(fx4Var, fx4Var3);
        fx4Var3.f8529r = fx4Var;
        fx4Var.f8528q = fx4Var3;
        int max = Math.max(fx4Var2 != null ? fx4Var2.f8536y : 0, fx4Var4 != null ? fx4Var4.f8536y : 0) + 1;
        fx4Var.f8536y = max;
        fx4Var3.f8536y = Math.max(max, fx4Var5 != null ? fx4Var5.f8536y : 0) + 1;
    }

    private final void i(fx4 fx4Var) {
        fx4 fx4Var2 = fx4Var.f8529r;
        fx4 fx4Var3 = fx4Var.f8530s;
        fx4 fx4Var4 = fx4Var2.f8529r;
        fx4 fx4Var5 = fx4Var2.f8530s;
        fx4Var.f8529r = fx4Var5;
        if (fx4Var5 != null) {
            fx4Var5.f8528q = fx4Var;
        }
        f(fx4Var, fx4Var2);
        fx4Var2.f8530s = fx4Var;
        fx4Var.f8528q = fx4Var2;
        int max = Math.max(fx4Var3 != null ? fx4Var3.f8536y : 0, fx4Var5 != null ? fx4Var5.f8536y : 0) + 1;
        fx4Var.f8536y = max;
        fx4Var2.f8536y = Math.max(max, fx4Var4 != null ? fx4Var4.f8536y : 0) + 1;
    }

    final fx4 a(Object obj, boolean z7) {
        int i7;
        fx4 fx4Var;
        Comparator comparator = this.f9245q;
        fx4 fx4Var2 = this.f9247s;
        if (fx4Var2 != null) {
            Comparable comparable = comparator == f9244y ? (Comparable) obj : null;
            while (true) {
                i7 = comparable != null ? comparable.compareTo(fx4Var2.f8533v) : comparator.compare(obj, fx4Var2.f8533v);
                if (i7 == 0) {
                    return fx4Var2;
                }
                fx4 fx4Var3 = i7 < 0 ? fx4Var2.f8529r : fx4Var2.f8530s;
                if (fx4Var3 == null) {
                    break;
                }
                fx4Var2 = fx4Var3;
            }
        } else {
            i7 = 0;
        }
        int i8 = i7;
        if (!z7) {
            return null;
        }
        fx4 fx4Var4 = this.f9250v;
        if (fx4Var2 != null) {
            fx4 fx4Var5 = fx4Var2;
            fx4Var = new fx4(this.f9246r, fx4Var5, obj, fx4Var4, fx4Var4.f8532u);
            if (i8 < 0) {
                fx4Var5.f8529r = fx4Var;
            } else {
                fx4Var5.f8530s = fx4Var;
            }
            g(fx4Var5, true);
        } else {
            if (comparator == f9244y && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            fx4Var = new fx4(this.f9246r, null, obj, fx4Var4, fx4Var4.f8532u);
            this.f9247s = fx4Var;
        }
        this.f9248t++;
        this.f9249u++;
        return fx4Var;
    }

    final fx4 b(Object obj) {
        if (obj != null) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    final fx4 c(Map.Entry entry) {
        fx4 b8 = b(entry.getKey());
        if (b8 == null || !Objects.equals(b8.f8535x, entry.getValue())) {
            return null;
        }
        return b8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f9247s = null;
        this.f9248t = 0;
        this.f9249u++;
        fx4 fx4Var = this.f9250v;
        fx4Var.f8532u = fx4Var;
        fx4Var.f8531t = fx4Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    final void d(fx4 fx4Var, boolean z7) {
        fx4 fx4Var2;
        fx4 fx4Var3;
        int i7;
        if (z7) {
            fx4 fx4Var4 = fx4Var.f8532u;
            fx4Var4.f8531t = fx4Var.f8531t;
            fx4Var.f8531t.f8532u = fx4Var4;
        }
        fx4 fx4Var5 = fx4Var.f8529r;
        fx4 fx4Var6 = fx4Var.f8530s;
        fx4 fx4Var7 = fx4Var.f8528q;
        int i8 = 0;
        if (fx4Var5 == null || fx4Var6 == null) {
            if (fx4Var5 != null) {
                f(fx4Var, fx4Var5);
                fx4Var.f8529r = null;
            } else if (fx4Var6 != null) {
                f(fx4Var, fx4Var6);
                fx4Var.f8530s = null;
            } else {
                f(fx4Var, null);
            }
            g(fx4Var7, false);
            this.f9248t--;
            this.f9249u++;
            return;
        }
        if (fx4Var5.f8536y > fx4Var6.f8536y) {
            do {
                fx4Var3 = fx4Var5;
                fx4Var5 = fx4Var5.f8530s;
            } while (fx4Var5 != null);
        } else {
            do {
                fx4Var2 = fx4Var6;
                fx4Var6 = fx4Var6.f8529r;
            } while (fx4Var6 != null);
            fx4Var3 = fx4Var2;
        }
        d(fx4Var3, false);
        fx4 fx4Var8 = fx4Var.f8529r;
        if (fx4Var8 != null) {
            i7 = fx4Var8.f8536y;
            fx4Var3.f8529r = fx4Var8;
            fx4Var8.f8528q = fx4Var3;
            fx4Var.f8529r = null;
        } else {
            i7 = 0;
        }
        fx4 fx4Var9 = fx4Var.f8530s;
        if (fx4Var9 != null) {
            i8 = fx4Var9.f8536y;
            fx4Var3.f8530s = fx4Var9;
            fx4Var9.f8528q = fx4Var3;
            fx4Var.f8530s = null;
        }
        fx4Var3.f8536y = Math.max(i7, i8) + 1;
        f(fx4Var, fx4Var3);
    }

    final fx4 e(Object obj) {
        fx4 b8 = b(obj);
        if (b8 != null) {
            d(b8, true);
        }
        return b8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        bx4 bx4Var = this.f9251w;
        if (bx4Var != null) {
            return bx4Var;
        }
        bx4 bx4Var2 = new bx4(this);
        this.f9251w = bx4Var2;
        return bx4Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        fx4 b8 = b(obj);
        if (b8 != null) {
            return b8.f8535x;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        dx4 dx4Var = this.f9252x;
        if (dx4Var != null) {
            return dx4Var;
        }
        dx4 dx4Var2 = new dx4(this);
        this.f9252x = dx4Var2;
        return dx4Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f9246r) {
            throw new NullPointerException("value == null");
        }
        fx4 a8 = a(obj, true);
        Object obj3 = a8.f8535x;
        a8.f8535x = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        fx4 e8 = e(obj);
        if (e8 != null) {
            return e8.f8535x;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9248t;
    }

    public gx4(boolean z7) {
        this(f9244y, false);
    }
}
