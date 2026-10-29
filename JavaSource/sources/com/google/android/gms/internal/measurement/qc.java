package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: MyApplication */
abstract class qc extends AbstractMap {

    /* renamed from: q, reason: collision with root package name */
    private Object[] f21255q;

    /* renamed from: r, reason: collision with root package name */
    private int f21256r;

    /* renamed from: s, reason: collision with root package name */
    private Map f21257s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21258t;

    /* renamed from: u, reason: collision with root package name */
    private volatile pc f21259u;

    /* renamed from: v, reason: collision with root package name */
    private Map f21260v;

    /* synthetic */ qc(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f21257s = map;
        this.f21260v = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object g(int i7) {
        h();
        Object value = ((nc) this.f21255q[i7]).getValue();
        Object[] objArr = this.f21255q;
        System.arraycopy(objArr, i7 + 1, objArr, i7, (this.f21256r - i7) - 1);
        this.f21256r--;
        if (!this.f21257s.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            Object[] objArr2 = this.f21255q;
            int i8 = this.f21256r;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i8] = new nc(this, (Comparable) entry.getKey(), entry.getValue());
            this.f21256r++;
            it.remove();
        }
        return value;
    }

    private final int m(Comparable comparable) {
        int i7 = this.f21256r;
        int i8 = i7 - 1;
        int i9 = 0;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((nc) this.f21255q[i8]).c());
            if (compareTo > 0) {
                return -(i7 + 1);
            }
            if (compareTo == 0) {
                return i8;
            }
        }
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo(((nc) this.f21255q[i10]).c());
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
        if (this.f21258t) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap o() {
        h();
        if (this.f21257s.isEmpty() && !(this.f21257s instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f21257s = treeMap;
            this.f21260v = treeMap.descendingMap();
        }
        return (SortedMap) this.f21257s;
    }

    public void a() {
        if (this.f21258t) {
            return;
        }
        this.f21257s = this.f21257s.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f21257s);
        this.f21260v = this.f21260v.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f21260v);
        this.f21258t = true;
    }

    public final boolean b() {
        return this.f21258t;
    }

    public final int c() {
        return this.f21256r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f21256r != 0) {
            this.f21255q = null;
            this.f21256r = 0;
        }
        if (this.f21257s.isEmpty()) {
            return;
        }
        this.f21257s.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m(comparable) >= 0 || this.f21257s.containsKey(comparable);
    }

    public final Map.Entry d(int i7) {
        if (i7 < this.f21256r) {
            return (nc) this.f21255q[i7];
        }
        throw new ArrayIndexOutOfBoundsException(i7);
    }

    public final Iterable e() {
        return this.f21257s.isEmpty() ? Collections.EMPTY_SET : this.f21257s.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f21259u == null) {
            this.f21259u = new pc(this, null);
        }
        return this.f21259u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc)) {
            return super.equals(obj);
        }
        qc qcVar = (qc) obj;
        int size = size();
        if (size != qcVar.size()) {
            return false;
        }
        int i7 = this.f21256r;
        if (i7 != qcVar.f21256r) {
            return entrySet().equals(qcVar.entrySet());
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!d(i8).equals(qcVar.d(i8))) {
                return false;
            }
        }
        if (i7 != size) {
            return this.f21257s.equals(qcVar.f21257s);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int m7 = m(comparable);
        if (m7 >= 0) {
            return ((nc) this.f21255q[m7]).setValue(obj);
        }
        h();
        if (this.f21255q == null) {
            this.f21255q = new Object[16];
        }
        int i7 = -(m7 + 1);
        if (i7 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.f21256r == 16) {
            nc ncVar = (nc) this.f21255q[15];
            this.f21256r = 15;
            o().put(ncVar.c(), ncVar.getValue());
        }
        Object[] objArr = this.f21255q;
        int length = objArr.length;
        System.arraycopy(objArr, i7, objArr, i7 + 1, 15 - i7);
        this.f21255q[i7] = new nc(this, comparable, obj);
        this.f21256r++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m7 = m(comparable);
        return m7 >= 0 ? ((nc) this.f21255q[m7]).getValue() : this.f21257s.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i7 = this.f21256r;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += this.f21255q[i9].hashCode();
        }
        return this.f21257s.size() > 0 ? i8 + this.f21257s.hashCode() : i8;
    }

    final /* synthetic */ Object[] i() {
        return this.f21255q;
    }

    final /* synthetic */ int j() {
        return this.f21256r;
    }

    final /* synthetic */ Map k() {
        return this.f21257s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int m7 = m(comparable);
        if (m7 >= 0) {
            return g(m7);
        }
        if (this.f21257s.isEmpty()) {
            return null;
        }
        return this.f21257s.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21256r + this.f21257s.size();
    }
}
