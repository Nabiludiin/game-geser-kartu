package z4;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import z4.j;

/* compiled from: MyApplication */
final class u extends j {

    /* renamed from: x, reason: collision with root package name */
    static final j f27881x = new u(null, new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    private final transient Object f27882u;

    /* renamed from: v, reason: collision with root package name */
    final transient Object[] f27883v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f27884w;

    /* compiled from: MyApplication */
    static class a extends k {

        /* renamed from: s, reason: collision with root package name */
        private final transient j f27885s;

        /* renamed from: t, reason: collision with root package name */
        private final transient Object[] f27886t;

        /* renamed from: u, reason: collision with root package name */
        private final transient int f27887u;

        /* renamed from: v, reason: collision with root package name */
        private final transient int f27888v;

        /* compiled from: MyApplication */
        /* renamed from: z4.u$a$a, reason: collision with other inner class name */
        class C0163a extends i {
            C0163a() {
            }

            @Override // java.util.List
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i7) {
                y4.h.f(i7, a.this.f27888v);
                int i8 = i7 * 2;
                Object obj = a.this.f27886t[a.this.f27887u + i8];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f27886t[i8 + (a.this.f27887u ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f27888v;
            }
        }

        a(j jVar, Object[] objArr, int i7, int i8) {
            this.f27885s = jVar;
            this.f27886t = objArr;
            this.f27887u = i7;
            this.f27888v = i8;
        }

        @Override // z4.h
        int c(Object[] objArr, int i7) {
            return i().c(objArr, i7);
        }

        @Override // z4.h, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f27885s.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // z4.k
        i l() {
            return new C0163a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: n */
        public z iterator() {
            return i().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f27888v;
        }
    }

    /* compiled from: MyApplication */
    static final class b extends k {

        /* renamed from: s, reason: collision with root package name */
        private final transient j f27890s;

        /* renamed from: t, reason: collision with root package name */
        private final transient i f27891t;

        b(j jVar, i iVar) {
            this.f27890s = jVar;
            this.f27891t = iVar;
        }

        @Override // z4.h
        int c(Object[] objArr, int i7) {
            return i().c(objArr, i7);
        }

        @Override // z4.h, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f27890s.get(obj) != null;
        }

        @Override // z4.k
        public i i() {
            return this.f27891t;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: n */
        public z iterator() {
            return i().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f27890s.size();
        }
    }

    /* compiled from: MyApplication */
    static final class c extends i {

        /* renamed from: s, reason: collision with root package name */
        private final transient Object[] f27892s;

        /* renamed from: t, reason: collision with root package name */
        private final transient int f27893t;

        /* renamed from: u, reason: collision with root package name */
        private final transient int f27894u;

        c(Object[] objArr, int i7, int i8) {
            this.f27892s = objArr;
            this.f27893t = i7;
            this.f27894u = i8;
        }

        @Override // java.util.List
        public Object get(int i7) {
            y4.h.f(i7, this.f27894u);
            Object obj = this.f27892s[(i7 * 2) + this.f27893t];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f27894u;
        }
    }

    private u(Object obj, Object[] objArr, int i7) {
        this.f27882u = obj;
        this.f27883v = objArr;
        this.f27884w = i7;
    }

    static u m(int i7, Object[] objArr) {
        return n(i7, objArr, null);
    }

    static u n(int i7, Object[] objArr, j.a aVar) {
        if (i7 == 0) {
            return (u) f27881x;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            d.a(obj, obj2);
            return new u(null, objArr, 1);
        }
        y4.h.j(i7, objArr.length >> 1);
        Object o7 = o(objArr, i7, k.j(i7), 0);
        if (o7 instanceof Object[]) {
            Object[] objArr2 = (Object[]) o7;
            j.a.C0161a c0161a = (j.a.C0161a) objArr2[2];
            if (aVar == null) {
                throw c0161a.a();
            }
            aVar.f27868e = c0161a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            o7 = obj3;
            i7 = intValue;
        }
        return new u(o7, objArr, i7);
    }

    private static Object o(Object[] objArr, int i7, int i8, int i9) {
        int i10;
        j.a.C0161a c0161a = null;
        int i11 = 1;
        if (i7 == 1) {
            Object obj = objArr[i9];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj2);
            d.a(obj, obj2);
            return null;
        }
        int i12 = i8 - 1;
        if (i8 <= 128) {
            byte[] bArr = new byte[i8];
            Arrays.fill(bArr, (byte) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i7; i14++) {
                int i15 = (i14 * 2) + i9;
                int i16 = (i13 * 2) + i9;
                Object obj3 = objArr[i15];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj4);
                d.a(obj3, obj4);
                int a8 = g.a(obj3.hashCode());
                while (true) {
                    int i17 = a8 & i12;
                    int i18 = bArr[i17] & 255;
                    if (i18 == 255) {
                        bArr[i17] = (byte) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj3;
                            objArr[i16 ^ 1] = obj4;
                        }
                        i13++;
                    } else {
                        if (obj3.equals(objArr[i18])) {
                            int i19 = i18 ^ 1;
                            Object obj5 = objArr[i19];
                            Objects.requireNonNull(obj5);
                            c0161a = new j.a.C0161a(obj3, obj4, obj5);
                            objArr[i19] = obj4;
                            break;
                        }
                        a8 = i17 + 1;
                    }
                }
            }
            return i13 == i7 ? bArr : new Object[]{bArr, Integer.valueOf(i13), c0161a};
        }
        if (i8 <= 32768) {
            short[] sArr = new short[i8];
            Arrays.fill(sArr, (short) -1);
            int i20 = 0;
            for (int i21 = 0; i21 < i7; i21++) {
                int i22 = (i21 * 2) + i9;
                int i23 = (i20 * 2) + i9;
                Object obj6 = objArr[i22];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj7);
                d.a(obj6, obj7);
                int a9 = g.a(obj6.hashCode());
                while (true) {
                    int i24 = a9 & i12;
                    int i25 = sArr[i24] & 65535;
                    if (i25 == 65535) {
                        sArr[i24] = (short) i23;
                        if (i20 < i21) {
                            objArr[i23] = obj6;
                            objArr[i23 ^ 1] = obj7;
                        }
                        i20++;
                    } else {
                        if (obj6.equals(objArr[i25])) {
                            int i26 = i25 ^ 1;
                            Object obj8 = objArr[i26];
                            Objects.requireNonNull(obj8);
                            c0161a = new j.a.C0161a(obj6, obj7, obj8);
                            objArr[i26] = obj7;
                            break;
                        }
                        a9 = i24 + 1;
                    }
                }
            }
            return i20 == i7 ? sArr : new Object[]{sArr, Integer.valueOf(i20), c0161a};
        }
        int[] iArr = new int[i8];
        Arrays.fill(iArr, -1);
        int i27 = 0;
        int i28 = 0;
        while (i27 < i7) {
            int i29 = (i27 * 2) + i9;
            int i30 = (i28 * 2) + i9;
            Object obj9 = objArr[i29];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i29 ^ i11];
            Objects.requireNonNull(obj10);
            d.a(obj9, obj10);
            int a10 = g.a(obj9.hashCode());
            while (true) {
                int i31 = a10 & i12;
                int i32 = iArr[i31];
                if (i32 == -1) {
                    iArr[i31] = i30;
                    if (i28 < i27) {
                        objArr[i30] = obj9;
                        objArr[i30 ^ 1] = obj10;
                    }
                    i28++;
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (obj9.equals(objArr[i32])) {
                        int i33 = i32 ^ 1;
                        Object obj11 = objArr[i33];
                        Objects.requireNonNull(obj11);
                        c0161a = new j.a.C0161a(obj9, obj10, obj11);
                        objArr[i33] = obj10;
                        break;
                    }
                    a10 = i31 + 1;
                    i11 = i10;
                }
            }
            i27++;
            i11 = i10;
        }
        int i34 = i11;
        if (i28 == i7) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i34] = Integer.valueOf(i28);
        objArr2[2] = c0161a;
        return objArr2;
    }

    static Object p(Object obj, Object[] objArr, int i7, int i8, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i7 == 1) {
            Object obj3 = objArr[i8];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i8 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int a8 = g.a(obj2.hashCode());
            while (true) {
                int i9 = a8 & length;
                int i10 = bArr[i9] & 255;
                if (i10 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i10])) {
                    return objArr[i10 ^ 1];
                }
                a8 = i9 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int a9 = g.a(obj2.hashCode());
            while (true) {
                int i11 = a9 & length2;
                int i12 = sArr[i11] & 65535;
                if (i12 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i12])) {
                    return objArr[i12 ^ 1];
                }
                a9 = i11 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int a10 = g.a(obj2.hashCode());
            while (true) {
                int i13 = a10 & length3;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                a10 = i13 + 1;
            }
        }
    }

    @Override // z4.j
    k c() {
        return new a(this, this.f27883v, 0, this.f27884w);
    }

    @Override // z4.j
    k d() {
        return new b(this, new c(this.f27883v, 0, this.f27884w));
    }

    @Override // z4.j
    h e() {
        return new c(this.f27883v, 1, this.f27884w);
    }

    @Override // z4.j, java.util.Map
    public Object get(Object obj) {
        Object p7 = p(this.f27882u, this.f27883v, this.f27884w, 0, obj);
        if (p7 == null) {
            return null;
        }
        return p7;
    }

    @Override // java.util.Map
    public int size() {
        return this.f27884w;
    }
}
