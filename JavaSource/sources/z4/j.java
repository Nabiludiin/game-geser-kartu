package z4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import z4.h;

/* compiled from: MyApplication */
public abstract class j implements Map, Serializable {

    /* renamed from: t, reason: collision with root package name */
    static final Map.Entry[] f27860t = new Map.Entry[0];

    /* renamed from: q, reason: collision with root package name */
    private transient k f27861q;

    /* renamed from: r, reason: collision with root package name */
    private transient k f27862r;

    /* renamed from: s, reason: collision with root package name */
    private transient h f27863s;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Comparator f27864a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f27865b;

        /* renamed from: c, reason: collision with root package name */
        int f27866c;

        /* renamed from: d, reason: collision with root package name */
        boolean f27867d;

        /* renamed from: e, reason: collision with root package name */
        C0161a f27868e;

        /* compiled from: MyApplication */
        /* renamed from: z4.j$a$a, reason: collision with other inner class name */
        static final class C0161a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f27869a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f27870b;

            /* renamed from: c, reason: collision with root package name */
            private final Object f27871c;

            C0161a(Object obj, Object obj2, Object obj3) {
                this.f27869a = obj;
                this.f27870b = obj2;
                this.f27871c = obj3;
            }

            IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f27869a);
                String valueOf2 = String.valueOf(this.f27870b);
                String valueOf3 = String.valueOf(this.f27869a);
                String valueOf4 = String.valueOf(this.f27871c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a() {
            this(4);
        }

        private j b(boolean z7) {
            Object[] objArr;
            C0161a c0161a;
            C0161a c0161a2;
            if (z7 && (c0161a2 = this.f27868e) != null) {
                throw c0161a2.a();
            }
            int i7 = this.f27866c;
            if (this.f27864a == null) {
                objArr = this.f27865b;
            } else {
                if (this.f27867d) {
                    this.f27865b = Arrays.copyOf(this.f27865b, i7 * 2);
                }
                objArr = this.f27865b;
                if (!z7) {
                    objArr = e(objArr, this.f27866c);
                    if (objArr.length < this.f27865b.length) {
                        i7 = objArr.length >>> 1;
                    }
                }
                j(objArr, i7, this.f27864a);
            }
            this.f27867d = true;
            u n7 = u.n(i7, objArr, this);
            if (!z7 || (c0161a = this.f27868e) == null) {
                return n7;
            }
            throw c0161a.a();
        }

        private void d(int i7) {
            int i8 = i7 * 2;
            Object[] objArr = this.f27865b;
            if (i8 > objArr.length) {
                this.f27865b = Arrays.copyOf(objArr, h.a.a(objArr.length, i8));
                this.f27867d = false;
            }
        }

        private Object[] e(Object[] objArr, int i7) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i8 = i7 - 1; i8 >= 0; i8--) {
                Object obj = objArr[i8 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i8);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i7 - bitSet.cardinality()) * 2];
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7 * 2) {
                if (bitSet.get(i9 >>> 1)) {
                    i9 += 2;
                } else {
                    int i11 = i10 + 1;
                    int i12 = i9 + 1;
                    Object obj2 = objArr[i9];
                    Objects.requireNonNull(obj2);
                    objArr2[i10] = obj2;
                    i10 += 2;
                    i9 += 2;
                    Object obj3 = objArr[i12];
                    Objects.requireNonNull(obj3);
                    objArr2[i11] = obj3;
                }
            }
            return objArr2;
        }

        static void j(Object[] objArr, int i7, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = i8 * 2;
                Object obj = objArr[i9];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i9 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i8] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i7, r.a(comparator).b(o.c()));
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = i10 * 2;
                objArr[i11] = entryArr[i10].getKey();
                objArr[i11 + 1] = entryArr[i10].getValue();
            }
        }

        public j a() {
            return c();
        }

        public j c() {
            return b(true);
        }

        public a f(Object obj, Object obj2) {
            d(this.f27866c + 1);
            d.a(obj, obj2);
            Object[] objArr = this.f27865b;
            int i7 = this.f27866c;
            objArr[i7 * 2] = obj;
            objArr[(i7 * 2) + 1] = obj2;
            this.f27866c = i7 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f27866c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        public a i(Map map) {
            return h(map.entrySet());
        }

        a(int i7) {
            this.f27865b = new Object[i7 * 2];
            this.f27866c = 0;
            this.f27867d = false;
        }
    }

    j() {
    }

    public static a a() {
        return new a();
    }

    public static j b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static j h() {
        return u.f27881x;
    }

    public static j i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        d.a(obj, obj2);
        d.a(obj3, obj4);
        d.a(obj5, obj6);
        d.a(obj7, obj8);
        return u.m(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static j j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        d.a(obj, obj2);
        d.a(obj3, obj4);
        d.a(obj5, obj6);
        d.a(obj7, obj8);
        d.a(obj9, obj10);
        return u.m(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static j k(Map.Entry... entryArr) {
        return b(Arrays.asList(entryArr));
    }

    abstract k c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract k d();

    abstract h e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return o.a(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public k entrySet() {
        k kVar = this.f27861q;
        if (kVar != null) {
            return kVar;
        }
        k c8 = c();
        this.f27861q = c8;
        return c8;
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public k keySet() {
        k kVar = this.f27862r;
        if (kVar != null) {
            return kVar;
        }
        k d8 = d();
        this.f27862r = d8;
        return d8;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return w.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public h values() {
        h hVar = this.f27863s;
        if (hVar != null) {
            return hVar;
        }
        h e8 = e();
        this.f27863s = e8;
        return e8;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return o.b(this);
    }
}
