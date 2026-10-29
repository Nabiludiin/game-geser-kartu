package com.google.android.gms.internal.drive;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

abstract class x1 extends AbstractMap {

    /* renamed from: q, reason: collision with root package name */
    private final int f20772q;

    /* renamed from: r, reason: collision with root package name */
    private List f20773r;

    /* renamed from: s, reason: collision with root package name */
    private Map f20774s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20775t;

    /* renamed from: u, reason: collision with root package name */
    private volatile g2 f20776u;

    /* renamed from: v, reason: collision with root package name */
    private Map f20777v;

    /* renamed from: w, reason: collision with root package name */
    private volatile a2 f20778w;

    private x1(int i7) {
        this.f20772q = i7;
        this.f20773r = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f20774s = map;
        this.f20777v = map;
    }

    private final int b(Comparable comparable) {
        int i7;
        int size = this.f20773r.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((e2) this.f20773r.get(i8)).getKey());
            if (compareTo > 0) {
                i7 = size + 1;
                return -i7;
            }
            if (compareTo == 0) {
                return i8;
            }
        }
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo((Comparable) ((e2) this.f20773r.get(i10)).getKey());
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        i7 = i9 + 1;
        return -i7;
    }

    static x1 f(int i7) {
        return new y1(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(int i7) {
        p();
        Object value = ((e2) this.f20773r.remove(i7)).getValue();
        if (!this.f20774s.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f20773r.add(new e2(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        if (this.f20775t) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap q() {
        p();
        if (this.f20774s.isEmpty() && !(this.f20774s instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f20774s = treeMap;
            this.f20777v = treeMap.descendingMap();
        }
        return (SortedMap) this.f20774s;
    }

    public final boolean a() {
        return this.f20775t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        p();
        if (!this.f20773r.isEmpty()) {
            this.f20773r.clear();
        }
        if (this.f20774s.isEmpty()) {
            return;
        }
        this.f20774s.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f20774s.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        p();
        int b8 = b(comparable);
        if (b8 >= 0) {
            return ((e2) this.f20773r.get(b8)).setValue(obj);
        }
        p();
        if (this.f20773r.isEmpty() && !(this.f20773r instanceof ArrayList)) {
            this.f20773r = new ArrayList(this.f20772q);
        }
        int i7 = -(b8 + 1);
        if (i7 >= this.f20772q) {
            return q().put(comparable, obj);
        }
        int size = this.f20773r.size();
        int i8 = this.f20772q;
        if (size == i8) {
            e2 e2Var = (e2) this.f20773r.remove(i8 - 1);
            q().put((Comparable) e2Var.getKey(), e2Var.getValue());
        }
        this.f20773r.add(i7, new e2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f20776u == null) {
            this.f20776u = new g2(this, null);
        }
        return this.f20776u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return super.equals(obj);
        }
        x1 x1Var = (x1) obj;
        int size = size();
        if (size != x1Var.size()) {
            return false;
        }
        int m7 = m();
        if (m7 != x1Var.m()) {
            return entrySet().equals(x1Var.entrySet());
        }
        for (int i7 = 0; i7 < m7; i7++) {
            if (!g(i7).equals(x1Var.g(i7))) {
                return false;
            }
        }
        if (m7 != size) {
            return this.f20774s.equals(x1Var.f20774s);
        }
        return true;
    }

    public final Map.Entry g(int i7) {
        return (Map.Entry) this.f20773r.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b8 = b(comparable);
        return b8 >= 0 ? ((e2) this.f20773r.get(b8)).getValue() : this.f20774s.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m7 = m();
        int i7 = 0;
        for (int i8 = 0; i8 < m7; i8++) {
            i7 += ((e2) this.f20773r.get(i8)).hashCode();
        }
        return this.f20774s.size() > 0 ? i7 + this.f20774s.hashCode() : i7;
    }

    public void j() {
        if (this.f20775t) {
            return;
        }
        this.f20774s = this.f20774s.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f20774s);
        this.f20777v = this.f20777v.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f20777v);
        this.f20775t = true;
    }

    public final int m() {
        return this.f20773r.size();
    }

    public final Iterable n() {
        return this.f20774s.isEmpty() ? b2.a() : this.f20774s.entrySet();
    }

    final Set o() {
        if (this.f20778w == null) {
            this.f20778w = new a2(this, null);
        }
        return this.f20778w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int b8 = b(comparable);
        if (b8 >= 0) {
            return h(b8);
        }
        if (this.f20774s.isEmpty()) {
            return null;
        }
        return this.f20774s.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f20773r.size() + this.f20774s.size();
    }

    /* synthetic */ x1(int i7, y1 y1Var) {
        this(i7);
    }
}
