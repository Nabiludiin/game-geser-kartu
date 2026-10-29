package z4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class k extends h implements Set {

    /* renamed from: r, reason: collision with root package name */
    private transient i f27872r;

    k() {
    }

    static int j(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            y4.h.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    private static k k(int i7, Object... objArr) {
        if (i7 == 0) {
            return o();
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return p(obj);
        }
        int j7 = j(i7);
        Object[] objArr2 = new Object[j7];
        int i8 = j7 - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object a8 = q.a(objArr[i11], i11);
            int hashCode = a8.hashCode();
            int a9 = g.a(hashCode);
            while (true) {
                int i12 = a9 & i8;
                Object obj2 = objArr2[i12];
                if (obj2 == null) {
                    objArr[i10] = a8;
                    objArr2[i12] = a8;
                    i9 += hashCode;
                    i10++;
                    break;
                }
                if (obj2.equals(a8)) {
                    break;
                }
                a9++;
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new x(obj3);
        }
        if (j(i10) < j7 / 2) {
            return k(i10, objArr);
        }
        if (r(i10, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new v(objArr, i9, objArr2, i8, i10);
    }

    public static k o() {
        return v.f27896y;
    }

    public static k p(Object obj) {
        return new x(obj);
    }

    public static k q(Object obj, Object obj2, Object obj3) {
        return k(3, obj, obj2, obj3);
    }

    private static boolean r(int i7, int i8) {
        return i7 < (i8 >> 1) + (i8 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k) && m() && ((k) obj).m() && hashCode() != obj.hashCode()) {
            return false;
        }
        return w.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return w.b(this);
    }

    public i i() {
        i iVar = this.f27872r;
        if (iVar != null) {
            return iVar;
        }
        i l7 = l();
        this.f27872r = l7;
        return l7;
    }

    i l() {
        return i.i(toArray());
    }

    boolean m() {
        return false;
    }

    /* renamed from: n */
    public abstract z iterator();
}
