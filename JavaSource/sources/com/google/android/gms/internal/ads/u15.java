package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: MyApplication */
abstract class u15 extends AbstractMap {

    /* renamed from: q, reason: collision with root package name */
    private Object[] f16541q;

    /* renamed from: r, reason: collision with root package name */
    private int f16542r;

    /* renamed from: s, reason: collision with root package name */
    private Map f16543s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f16544t;

    /* renamed from: u, reason: collision with root package name */
    private volatile t15 f16545u;

    /* renamed from: v, reason: collision with root package name */
    private Map f16546v;

    /* synthetic */ u15(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f16543s = map;
        this.f16546v = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object g(int i7) {
        h();
        Object value = ((r15) this.f16541q[i7]).getValue();
        Object[] objArr = this.f16541q;
        System.arraycopy(objArr, i7 + 1, objArr, i7, (this.f16542r - i7) - 1);
        this.f16542r--;
        if (!this.f16543s.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            Object[] objArr2 = this.f16541q;
            int i8 = this.f16542r;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i8] = new r15(this, (Comparable) entry.getKey(), entry.getValue());
            this.f16542r++;
            it.remove();
        }
        return value;
    }

    private final int m(Comparable comparable) {
        int i7 = this.f16542r;
        int i8 = i7 - 1;
        int i9 = 0;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((r15) this.f16541q[i8]).c());
            if (compareTo > 0) {
                return -(i7 + 1);
            }
            if (compareTo == 0) {
                return i8;
            }
        }
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo(((r15) this.f16541q[i10]).c());
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        return -(i9 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void h() {
        if (this.f16544t) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap o() {
        h();
        if (this.f16543s.isEmpty() && !(this.f16543s instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16543s = treeMap;
            this.f16546v = treeMap.descendingMap();
        }
        return (SortedMap) this.f16543s;
    }

    public void a() {
        if (this.f16544t) {
            return;
        }
        this.f16543s = this.f16543s.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f16543s);
        this.f16546v = this.f16546v.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f16546v);
        this.f16544t = true;
    }

    public final boolean b() {
        return this.f16544t;
    }

    public final int c() {
        return this.f16542r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f16542r != 0) {
            this.f16541q = null;
            this.f16542r = 0;
        }
        if (this.f16543s.isEmpty()) {
            return;
        }
        this.f16543s.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m(comparable) >= 0 || this.f16543s.containsKey(comparable);
    }

    public final Map.Entry d(int i7) {
        if (i7 < this.f16542r) {
            return (r15) this.f16541q[i7];
        }
        throw new ArrayIndexOutOfBoundsException(i7);
    }

    public final Iterable e() {
        return this.f16543s.isEmpty() ? Collections.EMPTY_SET : this.f16543s.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f16545u == null) {
            this.f16545u = new t15(this, null);
        }
        return this.f16545u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u15)) {
            return super.equals(obj);
        }
        u15 u15Var = (u15) obj;
        int size = size();
        if (size != u15Var.size()) {
            return false;
        }
        int i7 = this.f16542r;
        if (i7 != u15Var.f16542r) {
            return entrySet().equals(u15Var.entrySet());
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!d(i8).equals(u15Var.d(i8))) {
                return false;
            }
        }
        if (i7 != size) {
            return this.f16543s.equals(u15Var.f16543s);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int m7 = m(comparable);
        if (m7 >= 0) {
            return ((r15) this.f16541q[m7]).setValue(obj);
        }
        h();
        if (this.f16541q == null) {
            this.f16541q = new Object[16];
        }
        int i7 = -(m7 + 1);
        if (i7 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.f16542r == 16) {
            r15 r15Var = (r15) this.f16541q[15];
            this.f16542r = 15;
            o().put(r15Var.c(), r15Var.getValue());
        }
        Object[] objArr = this.f16541q;
        int length = objArr.length;
        System.arraycopy(objArr, i7, objArr, i7 + 1, 15 - i7);
        this.f16541q[i7] = new r15(this, comparable, obj);
        this.f16542r++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m7 = m(comparable);
        return m7 >= 0 ? ((r15) this.f16541q[m7]).getValue() : this.f16543s.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i7 = this.f16542r;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += this.f16541q[i9].hashCode();
        }
        return this.f16543s.size() > 0 ? i8 + this.f16543s.hashCode() : i8;
    }

    final /* synthetic */ Object[] i() {
        return this.f16541q;
    }

    final /* synthetic */ int j() {
        return this.f16542r;
    }

    final /* synthetic */ Map k() {
        return this.f16543s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int m7 = m(comparable);
        if (m7 >= 0) {
            return g(m7);
        }
        if (this.f16543s.isEmpty()) {
            return null;
        }
        return this.f16543s.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16542r + this.f16543s.size();
    }
}
