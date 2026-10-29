package r;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: MyApplication */
public class h {

    /* renamed from: t, reason: collision with root package name */
    static Object[] f25761t;

    /* renamed from: u, reason: collision with root package name */
    static int f25762u;

    /* renamed from: v, reason: collision with root package name */
    static Object[] f25763v;

    /* renamed from: w, reason: collision with root package name */
    static int f25764w;

    /* renamed from: q, reason: collision with root package name */
    int[] f25765q;

    /* renamed from: r, reason: collision with root package name */
    Object[] f25766r;

    /* renamed from: s, reason: collision with root package name */
    int f25767s;

    public h() {
        this.f25765q = d.f25730a;
        this.f25766r = d.f25732c;
        this.f25767s = 0;
    }

    private void a(int i7) {
        if (i7 == 8) {
            synchronized (h.class) {
                try {
                    Object[] objArr = f25763v;
                    if (objArr != null) {
                        this.f25766r = objArr;
                        f25763v = (Object[]) objArr[0];
                        this.f25765q = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f25764w--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i7 == 4) {
            synchronized (h.class) {
                try {
                    Object[] objArr2 = f25761t;
                    if (objArr2 != null) {
                        this.f25766r = objArr2;
                        f25761t = (Object[]) objArr2[0];
                        this.f25765q = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f25762u--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f25765q = new int[i7];
        this.f25766r = new Object[i7 << 1];
    }

    private static int b(int[] iArr, int i7, int i8) {
        try {
            return d.a(iArr, i7, i8);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                try {
                    if (f25764w < 10) {
                        objArr[0] = f25763v;
                        objArr[1] = iArr;
                        for (int i8 = (i7 << 1) - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f25763v = objArr;
                        f25764w++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (h.class) {
                try {
                    if (f25762u < 10) {
                        objArr[0] = f25761t;
                        objArr[1] = iArr;
                        for (int i9 = (i7 << 1) - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f25761t = objArr;
                        f25762u++;
                    }
                } finally {
                }
            }
        }
    }

    public void c(int i7) {
        int i8 = this.f25767s;
        int[] iArr = this.f25765q;
        if (iArr.length < i7) {
            Object[] objArr = this.f25766r;
            a(i7);
            if (this.f25767s > 0) {
                System.arraycopy(iArr, 0, this.f25765q, 0, i8);
                System.arraycopy(objArr, 0, this.f25766r, 0, i8 << 1);
            }
            d(iArr, objArr, i8);
        }
        if (this.f25767s != i8) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i7 = this.f25767s;
        if (i7 > 0) {
            int[] iArr = this.f25765q;
            Object[] objArr = this.f25766r;
            this.f25765q = d.f25730a;
            this.f25766r = d.f25732c;
            this.f25767s = 0;
            d(iArr, objArr, i7);
        }
        if (this.f25767s > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i7) {
        int i8 = this.f25767s;
        if (i8 == 0) {
            return -1;
        }
        int b8 = b(this.f25765q, i8, i7);
        if (b8 < 0 || obj.equals(this.f25766r[b8 << 1])) {
            return b8;
        }
        int i9 = b8 + 1;
        while (i9 < i8 && this.f25765q[i9] == i7) {
            if (obj.equals(this.f25766r[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = b8 - 1; i10 >= 0 && this.f25765q[i10] == i7; i10--) {
            if (obj.equals(this.f25766r[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (size() != hVar.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f25767s; i7++) {
                try {
                    Object i8 = i(i7);
                    Object m7 = m(i7);
                    Object obj2 = hVar.get(i8);
                    if (m7 == null) {
                        if (obj2 != null || !hVar.containsKey(i8)) {
                            return false;
                        }
                    } else if (!m7.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i9 = 0; i9 < this.f25767s; i9++) {
                try {
                    Object i10 = i(i9);
                    Object m8 = m(i9);
                    Object obj3 = map.get(i10);
                    if (m8 == null) {
                        if (obj3 != null || !map.containsKey(i10)) {
                            return false;
                        }
                    } else if (!m8.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i7 = this.f25767s;
        if (i7 == 0) {
            return -1;
        }
        int b8 = b(this.f25765q, i7, 0);
        if (b8 < 0 || this.f25766r[b8 << 1] == null) {
            return b8;
        }
        int i8 = b8 + 1;
        while (i8 < i7 && this.f25765q[i8] == 0) {
            if (this.f25766r[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = b8 - 1; i9 >= 0 && this.f25765q[i9] == 0; i9--) {
            if (this.f25766r[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int f8 = f(obj);
        return f8 >= 0 ? this.f25766r[(f8 << 1) + 1] : obj2;
    }

    int h(Object obj) {
        int i7 = this.f25767s * 2;
        Object[] objArr = this.f25766r;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f25765q;
        Object[] objArr = this.f25766r;
        int i7 = this.f25767s;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            i10 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return i10;
    }

    public Object i(int i7) {
        return this.f25766r[i7 << 1];
    }

    public boolean isEmpty() {
        return this.f25767s <= 0;
    }

    public void j(h hVar) {
        int i7 = hVar.f25767s;
        c(this.f25767s + i7);
        if (this.f25767s != 0) {
            for (int i8 = 0; i8 < i7; i8++) {
                put(hVar.i(i8), hVar.m(i8));
            }
        } else if (i7 > 0) {
            System.arraycopy(hVar.f25765q, 0, this.f25765q, 0, i7);
            System.arraycopy(hVar.f25766r, 0, this.f25766r, 0, i7 << 1);
            this.f25767s = i7;
        }
    }

    public Object k(int i7) {
        Object[] objArr = this.f25766r;
        int i8 = i7 << 1;
        Object obj = objArr[i8 + 1];
        int i9 = this.f25767s;
        int i10 = 0;
        if (i9 <= 1) {
            d(this.f25765q, objArr, i9);
            this.f25765q = d.f25730a;
            this.f25766r = d.f25732c;
        } else {
            int i11 = i9 - 1;
            int[] iArr = this.f25765q;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i7 < i11) {
                    int i12 = i7 + 1;
                    int i13 = i11 - i7;
                    System.arraycopy(iArr, i12, iArr, i7, i13);
                    Object[] objArr2 = this.f25766r;
                    System.arraycopy(objArr2, i12 << 1, objArr2, i8, i13 << 1);
                }
                Object[] objArr3 = this.f25766r;
                int i14 = i11 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                a(i9 > 8 ? i9 + (i9 >> 1) : 8);
                if (i9 != this.f25767s) {
                    throw new ConcurrentModificationException();
                }
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f25765q, 0, i7);
                    System.arraycopy(objArr, 0, this.f25766r, 0, i8);
                }
                if (i7 < i11) {
                    int i15 = i7 + 1;
                    int i16 = i11 - i7;
                    System.arraycopy(iArr, i15, this.f25765q, i7, i16);
                    System.arraycopy(objArr, i15 << 1, this.f25766r, i8, i16 << 1);
                }
            }
            i10 = i11;
        }
        if (i9 != this.f25767s) {
            throw new ConcurrentModificationException();
        }
        this.f25767s = i10;
        return obj;
    }

    public Object l(int i7, Object obj) {
        int i8 = (i7 << 1) + 1;
        Object[] objArr = this.f25766r;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public Object m(int i7) {
        return this.f25766r[(i7 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i7;
        int e8;
        int i8 = this.f25767s;
        if (obj == null) {
            e8 = g();
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            e8 = e(obj, hashCode);
        }
        if (e8 >= 0) {
            int i9 = (e8 << 1) + 1;
            Object[] objArr = this.f25766r;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~e8;
        int[] iArr = this.f25765q;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            Object[] objArr2 = this.f25766r;
            a(i11);
            if (i8 != this.f25767s) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f25765q;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f25766r, 0, objArr2.length);
            }
            d(iArr, objArr2, i8);
        }
        if (i10 < i8) {
            int[] iArr3 = this.f25765q;
            int i12 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i12, i8 - i10);
            Object[] objArr3 = this.f25766r;
            System.arraycopy(objArr3, i10 << 1, objArr3, i12 << 1, (this.f25767s - i10) << 1);
        }
        int i13 = this.f25767s;
        if (i8 == i13) {
            int[] iArr4 = this.f25765q;
            if (i10 < iArr4.length) {
                iArr4[i10] = i7;
                Object[] objArr4 = this.f25766r;
                int i14 = i10 << 1;
                objArr4[i14] = obj;
                objArr4[i14 + 1] = obj2;
                this.f25767s = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int f8 = f(obj);
        if (f8 >= 0) {
            return k(f8);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int f8 = f(obj);
        if (f8 >= 0) {
            return l(f8, obj2);
        }
        return null;
    }

    public int size() {
        return this.f25767s;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25767s * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f25767s; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object i8 = i(i7);
            if (i8 != this) {
                sb.append(i8);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m7 = m(i7);
            if (m7 != this) {
                sb.append(m7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f8 = f(obj);
        if (f8 < 0) {
            return false;
        }
        Object m7 = m(f8);
        if (obj2 != m7 && (obj2 == null || !obj2.equals(m7))) {
            return false;
        }
        k(f8);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int f8 = f(obj);
        if (f8 < 0) {
            return false;
        }
        Object m7 = m(f8);
        if (m7 != obj2 && (obj2 == null || !obj2.equals(m7))) {
            return false;
        }
        l(f8, obj3);
        return true;
    }

    public h(int i7) {
        if (i7 == 0) {
            this.f25765q = d.f25730a;
            this.f25766r = d.f25732c;
        } else {
            a(i7);
        }
        this.f25767s = 0;
    }

    public h(h hVar) {
        this();
        if (hVar != null) {
            j(hVar);
        }
    }
}
