package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class b implements Collection, Set {

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f25715u = new int[0];

    /* renamed from: v, reason: collision with root package name */
    private static final Object[] f25716v = new Object[0];

    /* renamed from: w, reason: collision with root package name */
    private static Object[] f25717w;

    /* renamed from: x, reason: collision with root package name */
    private static int f25718x;

    /* renamed from: y, reason: collision with root package name */
    private static Object[] f25719y;

    /* renamed from: z, reason: collision with root package name */
    private static int f25720z;

    /* renamed from: q, reason: collision with root package name */
    private int[] f25721q;

    /* renamed from: r, reason: collision with root package name */
    Object[] f25722r;

    /* renamed from: s, reason: collision with root package name */
    int f25723s;

    /* renamed from: t, reason: collision with root package name */
    private g f25724t;

    /* compiled from: MyApplication */
    class a extends g {
        a() {
        }

        @Override // r.g
        protected void a() {
            b.this.clear();
        }

        @Override // r.g
        protected Object b(int i7, int i8) {
            return b.this.f25722r[i7];
        }

        @Override // r.g
        protected Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // r.g
        protected int d() {
            return b.this.f25723s;
        }

        @Override // r.g
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // r.g
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // r.g
        protected void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        @Override // r.g
        protected void h(int i7) {
            b.this.k(i7);
        }

        @Override // r.g
        protected Object i(int i7, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void c(int i7) {
        if (i7 == 8) {
            synchronized (b.class) {
                try {
                    Object[] objArr = f25719y;
                    if (objArr != null) {
                        this.f25722r = objArr;
                        f25719y = (Object[]) objArr[0];
                        this.f25721q = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f25720z--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i7 == 4) {
            synchronized (b.class) {
                try {
                    Object[] objArr2 = f25717w;
                    if (objArr2 != null) {
                        this.f25722r = objArr2;
                        f25717w = (Object[]) objArr2[0];
                        this.f25721q = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f25718x--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f25721q = new int[i7];
        this.f25722r = new Object[i7];
    }

    private static void g(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                try {
                    if (f25720z < 10) {
                        objArr[0] = f25719y;
                        objArr[1] = iArr;
                        for (int i8 = i7 - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f25719y = objArr;
                        f25720z++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                try {
                    if (f25718x < 10) {
                        objArr[0] = f25717w;
                        objArr[1] = iArr;
                        for (int i9 = i7 - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f25717w = objArr;
                        f25718x++;
                    }
                } finally {
                }
            }
        }
    }

    private g h() {
        if (this.f25724t == null) {
            this.f25724t = new a();
        }
        return this.f25724t;
    }

    private int i(Object obj, int i7) {
        int i8 = this.f25723s;
        if (i8 == 0) {
            return -1;
        }
        int a8 = d.a(this.f25721q, i8, i7);
        if (a8 < 0 || obj.equals(this.f25722r[a8])) {
            return a8;
        }
        int i9 = a8 + 1;
        while (i9 < i8 && this.f25721q[i9] == i7) {
            if (obj.equals(this.f25722r[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a8 - 1; i10 >= 0 && this.f25721q[i10] == i7; i10--) {
            if (obj.equals(this.f25722r[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    private int j() {
        int i7 = this.f25723s;
        if (i7 == 0) {
            return -1;
        }
        int a8 = d.a(this.f25721q, i7, 0);
        if (a8 < 0 || this.f25722r[a8] == null) {
            return a8;
        }
        int i8 = a8 + 1;
        while (i8 < i7 && this.f25721q[i8] == 0) {
            if (this.f25722r[i8] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a8 - 1; i9 >= 0 && this.f25721q[i9] == 0; i9--) {
            if (this.f25722r[i9] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i7;
        int i8;
        if (obj == null) {
            i8 = j();
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            i8 = i(obj, hashCode);
        }
        if (i8 >= 0) {
            return false;
        }
        int i9 = ~i8;
        int i10 = this.f25723s;
        int[] iArr = this.f25721q;
        if (i10 >= iArr.length) {
            int i11 = 8;
            if (i10 >= 8) {
                i11 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i11 = 4;
            }
            Object[] objArr = this.f25722r;
            c(i11);
            int[] iArr2 = this.f25721q;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f25722r, 0, objArr.length);
            }
            g(iArr, objArr, this.f25723s);
        }
        int i12 = this.f25723s;
        if (i9 < i12) {
            int[] iArr3 = this.f25721q;
            int i13 = i9 + 1;
            System.arraycopy(iArr3, i9, iArr3, i13, i12 - i9);
            Object[] objArr2 = this.f25722r;
            System.arraycopy(objArr2, i9, objArr2, i13, this.f25723s - i9);
        }
        this.f25721q[i9] = i7;
        this.f25722r[i9] = obj;
        this.f25723s++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        e(this.f25723s + collection.size());
        Iterator it = collection.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= add(it.next());
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i7 = this.f25723s;
        if (i7 != 0) {
            g(this.f25721q, this.f25722r, i7);
            this.f25721q = f25715u;
            this.f25722r = f25716v;
            this.f25723s = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void e(int i7) {
        int[] iArr = this.f25721q;
        if (iArr.length < i7) {
            Object[] objArr = this.f25722r;
            c(i7);
            int i8 = this.f25723s;
            if (i8 > 0) {
                System.arraycopy(iArr, 0, this.f25721q, 0, i8);
                System.arraycopy(objArr, 0, this.f25722r, 0, this.f25723s);
            }
            g(iArr, objArr, this.f25723s);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f25723s; i7++) {
                try {
                    if (!set.contains(l(i7))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f25721q;
        int i7 = this.f25723s;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    public int indexOf(Object obj) {
        return obj == null ? j() : i(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f25723s <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return h().m().iterator();
    }

    public Object k(int i7) {
        Object[] objArr = this.f25722r;
        Object obj = objArr[i7];
        int i8 = this.f25723s;
        if (i8 <= 1) {
            g(this.f25721q, objArr, i8);
            this.f25721q = f25715u;
            this.f25722r = f25716v;
            this.f25723s = 0;
            return obj;
        }
        int[] iArr = this.f25721q;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            int i9 = i8 - 1;
            this.f25723s = i9;
            if (i7 < i9) {
                int i10 = i7 + 1;
                System.arraycopy(iArr, i10, iArr, i7, i9 - i7);
                Object[] objArr2 = this.f25722r;
                System.arraycopy(objArr2, i10, objArr2, i7, this.f25723s - i7);
            }
            this.f25722r[this.f25723s] = null;
            return obj;
        }
        c(i8 > 8 ? i8 + (i8 >> 1) : 8);
        this.f25723s--;
        if (i7 > 0) {
            System.arraycopy(iArr, 0, this.f25721q, 0, i7);
            System.arraycopy(objArr, 0, this.f25722r, 0, i7);
        }
        int i11 = this.f25723s;
        if (i7 < i11) {
            int i12 = i7 + 1;
            System.arraycopy(iArr, i12, this.f25721q, i7, i11 - i7);
            System.arraycopy(objArr, i12, this.f25722r, i7, this.f25723s - i7);
        }
        return obj;
    }

    public Object l(int i7) {
        return this.f25722r[i7];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        k(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= remove(it.next());
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z7 = false;
        for (int i7 = this.f25723s - 1; i7 >= 0; i7--) {
            if (!collection.contains(this.f25722r[i7])) {
                k(i7);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f25723s;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i7 = this.f25723s;
        Object[] objArr = new Object[i7];
        System.arraycopy(this.f25722r, 0, objArr, 0, i7);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25723s * 14);
        sb.append('{');
        for (int i7 = 0; i7 < this.f25723s; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object l7 = l(i7);
            if (l7 != this) {
                sb.append(l7);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i7) {
        if (i7 == 0) {
            this.f25721q = f25715u;
            this.f25722r = f25716v;
        } else {
            c(i7);
        }
        this.f25723s = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f25723s) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f25723s);
        }
        System.arraycopy(this.f25722r, 0, objArr, 0, this.f25723s);
        int length = objArr.length;
        int i7 = this.f25723s;
        if (length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
