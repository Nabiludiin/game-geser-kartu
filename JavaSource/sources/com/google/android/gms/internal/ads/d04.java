package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
final class d04 extends AbstractMap implements Serializable {

    /* renamed from: z, reason: collision with root package name */
    private static final Object f6893z = new Object();

    /* renamed from: q, reason: collision with root package name */
    private transient Object f6894q;

    /* renamed from: r, reason: collision with root package name */
    transient int[] f6895r;

    /* renamed from: s, reason: collision with root package name */
    transient Object[] f6896s;

    /* renamed from: t, reason: collision with root package name */
    transient Object[] f6897t;

    /* renamed from: u, reason: collision with root package name */
    private transient int f6898u;

    /* renamed from: v, reason: collision with root package name */
    private transient int f6899v;

    /* renamed from: w, reason: collision with root package name */
    private transient Set f6900w;

    /* renamed from: x, reason: collision with root package name */
    private transient Set f6901x;

    /* renamed from: y, reason: collision with root package name */
    private transient Collection f6902y;

    d04() {
        d(3);
    }

    private final int A(int i7, int i8, int i9, int i10) {
        int i11 = i8 - 1;
        Object a8 = e04.a(i8);
        if (i10 != 0) {
            e04.c(a8, i9 & i11, i10 + 1);
        }
        Object obj = this.f6894q;
        Objects.requireNonNull(obj);
        int[] o7 = o();
        for (int i12 = 0; i12 <= i7; i12++) {
            int b8 = e04.b(obj, i12);
            while (b8 != 0) {
                int i13 = b8 - 1;
                int i14 = o7[i13];
                int i15 = ((~i7) & i14) | i12;
                int i16 = i15 & i11;
                int b9 = e04.b(a8, i16);
                e04.c(a8, i16, b8);
                o7[i13] = ((~i11) & i15) | (b9 & i11);
                b8 = i14 & i7;
            }
        }
        this.f6894q = a8;
        y(i11);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final int l(Object obj) {
        if (e()) {
            return -1;
        }
        int b8 = n04.b(obj);
        int k7 = k();
        Object obj2 = this.f6894q;
        Objects.requireNonNull(obj2);
        int b9 = e04.b(obj2, b8 & k7);
        if (b9 != 0) {
            int i7 = ~k7;
            int i8 = b8 & i7;
            do {
                int i9 = b9 - 1;
                int i10 = o()[i9];
                if ((i10 & i7) == i8 && Objects.equals(obj, p()[i9])) {
                    return i9;
                }
                b9 = i10 & k7;
            } while (b9 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final Object m(Object obj) {
        if (!e()) {
            int k7 = k();
            Object obj2 = this.f6894q;
            Objects.requireNonNull(obj2);
            int e8 = e04.e(obj, null, k7, obj2, o(), p(), null);
            if (e8 != -1) {
                Object obj3 = q()[e8];
                h(e8, k7);
                this.f6899v--;
                g();
                return obj3;
            }
        }
        return f6893z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int[] o() {
        int[] iArr = this.f6895r;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object[] p() {
        Object[] objArr = this.f6896s;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object[] q() {
        Object[] objArr = this.f6897t;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private final void y(int i7) {
        this.f6898u = ((32 - Integer.numberOfLeadingZeros(i7)) & 31) | (this.f6898u & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final int k() {
        return (1 << (this.f6898u & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (e()) {
            return;
        }
        g();
        Map f8 = f();
        if (f8 != null) {
            this.f6898u = m44.c(size(), 3, 1073741823);
            f8.clear();
            this.f6894q = null;
            this.f6899v = 0;
            return;
        }
        Arrays.fill(p(), 0, this.f6899v, (Object) null);
        Arrays.fill(q(), 0, this.f6899v, (Object) null);
        Object obj = this.f6894q;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(o(), 0, this.f6899v, 0);
        this.f6899v = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map f8 = f();
        return f8 != null ? f8.containsKey(obj) : l(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map f8 = f();
        if (f8 != null) {
            return f8.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f6899v; i7++) {
            if (Objects.equals(obj, q()[i7])) {
                return true;
            }
        }
        return false;
    }

    final void d(int i7) {
        this.f6898u = m44.c(i7, 1, 1073741823);
    }

    final boolean e() {
        return this.f6894q == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f6901x;
        if (set != null) {
            return set;
        }
        yz3 yz3Var = new yz3(this, null);
        this.f6901x = yz3Var;
        return yz3Var;
    }

    final Map f() {
        Object obj = this.f6894q;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void g() {
        this.f6898u += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map f8 = f();
        if (f8 != null) {
            return f8.get(obj);
        }
        int l7 = l(obj);
        if (l7 == -1) {
            return null;
        }
        return q()[l7];
    }

    final void h(int i7, int i8) {
        Object obj = this.f6894q;
        Objects.requireNonNull(obj);
        int[] o7 = o();
        Object[] p7 = p();
        Object[] q7 = q();
        int size = size();
        int i9 = size - 1;
        if (i7 >= i9) {
            p7[i7] = null;
            q7[i7] = null;
            o7[i7] = 0;
            return;
        }
        int i10 = i7 + 1;
        Object obj2 = p7[i9];
        p7[i7] = obj2;
        q7[i7] = q7[i9];
        p7[i9] = null;
        q7[i9] = null;
        o7[i7] = o7[i9];
        o7[i9] = 0;
        int b8 = n04.b(obj2) & i8;
        int b9 = e04.b(obj, b8);
        if (b9 == size) {
            e04.c(obj, b8, i10);
            return;
        }
        while (true) {
            int i11 = b9 - 1;
            int i12 = o7[i11];
            int i13 = i12 & i8;
            if (i13 == size) {
                o7[i11] = (i12 & (~i8)) | (i8 & i10);
                return;
            }
            b9 = i13;
        }
    }

    final int i() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final int j(int i7) {
        int i8 = i7 + 1;
        if (i8 < this.f6899v) {
            return i8;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f6900w;
        if (set != null) {
            return set;
        }
        a04 a04Var = new a04(this, null);
        this.f6900w = a04Var;
        return a04Var;
    }

    final /* synthetic */ Object n() {
        Object obj = this.f6894q;
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i7;
        if (e()) {
            rx3.i(e(), "Arrays already allocated");
            int i8 = this.f6898u;
            int max = Math.max(i8 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f6894q = e04.a(max2);
            y(max2 - 1);
            this.f6895r = new int[i8];
            this.f6896s = new Object[i8];
            this.f6897t = new Object[i8];
        }
        Map f8 = f();
        if (f8 != null) {
            return f8.put(obj, obj2);
        }
        int[] o7 = o();
        Object[] p7 = p();
        Object[] q7 = q();
        int i9 = this.f6899v;
        int i10 = i9 + 1;
        int b8 = n04.b(obj);
        int k7 = k();
        int i11 = b8 & k7;
        Object obj3 = this.f6894q;
        Objects.requireNonNull(obj3);
        int b9 = e04.b(obj3, i11);
        if (b9 == 0) {
            if (i10 > k7) {
                k7 = A(k7, e04.d(k7), b8, i9);
            } else {
                Object obj4 = this.f6894q;
                Objects.requireNonNull(obj4);
                e04.c(obj4, i11, i10);
            }
            i7 = 1;
        } else {
            int i12 = ~k7;
            int i13 = b8 & i12;
            int i14 = 0;
            while (true) {
                int i15 = b9 - 1;
                int i16 = o7[i15];
                i7 = 1;
                int i17 = i16 & i12;
                if (i17 == i13 && Objects.equals(obj, p7[i15])) {
                    Object obj5 = q7[i15];
                    q7[i15] = obj2;
                    return obj5;
                }
                int i18 = i16 & k7;
                i14++;
                if (i18 != 0) {
                    b9 = i18;
                } else {
                    if (i14 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(k() + 1, 1.0f);
                        int i19 = i();
                        while (i19 >= 0) {
                            linkedHashMap.put(p()[i19], q()[i19]);
                            i19 = j(i19);
                        }
                        this.f6894q = linkedHashMap;
                        this.f6895r = null;
                        this.f6896s = null;
                        this.f6897t = null;
                        g();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i10 > k7) {
                        k7 = A(k7, e04.d(k7), b8, i9);
                    } else {
                        o7[i15] = (i10 & k7) | i17;
                    }
                }
            }
        }
        int length = o().length;
        if (i10 > length) {
            int i20 = i7;
            int min = Math.min(1073741823, (Math.max(i20, length >>> 1) + length) | i20);
            if (min != length) {
                this.f6895r = Arrays.copyOf(o(), min);
                this.f6896s = Arrays.copyOf(p(), min);
                this.f6897t = Arrays.copyOf(q(), min);
            }
        }
        o()[i9] = (~k7) & b8;
        p()[i9] = obj;
        q()[i9] = obj2;
        this.f6899v = i10;
        g();
        return null;
    }

    final /* synthetic */ Object r(int i7) {
        return p()[i7];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map f8 = f();
        if (f8 != null) {
            return f8.remove(obj);
        }
        Object m7 = m(obj);
        if (m7 == f6893z) {
            return null;
        }
        return m7;
    }

    final /* synthetic */ Object s(int i7) {
        return q()[i7];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map f8 = f();
        return f8 != null ? f8.size() : this.f6899v;
    }

    final /* synthetic */ void t(int i7, Object obj) {
        q()[i7] = obj;
    }

    final /* synthetic */ int v() {
        return this.f6898u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f6902y;
        if (collection != null) {
            return collection;
        }
        c04 c04Var = new c04(this, null);
        this.f6902y = c04Var;
        return c04Var;
    }

    final /* synthetic */ int w() {
        return this.f6899v;
    }

    final /* synthetic */ void x(int i7) {
        this.f6899v = i7;
    }

    d04(int i7) {
        d(8);
    }
}
