package r;

/* compiled from: MyApplication */
public class i implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    private static final Object f25768u = new Object();

    /* renamed from: q, reason: collision with root package name */
    private boolean f25769q;

    /* renamed from: r, reason: collision with root package name */
    private int[] f25770r;

    /* renamed from: s, reason: collision with root package name */
    private Object[] f25771s;

    /* renamed from: t, reason: collision with root package name */
    private int f25772t;

    public i() {
        this(10);
    }

    private void g() {
        int i7 = this.f25772t;
        int[] iArr = this.f25770r;
        Object[] objArr = this.f25771s;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f25768u) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f25769q = false;
        this.f25772t = i8;
    }

    public void a(int i7, Object obj) {
        int i8 = this.f25772t;
        if (i8 != 0 && i7 <= this.f25770r[i8 - 1]) {
            m(i7, obj);
            return;
        }
        if (this.f25769q && i8 >= this.f25770r.length) {
            g();
        }
        int i9 = this.f25772t;
        if (i9 >= this.f25770r.length) {
            int e8 = d.e(i9 + 1);
            int[] iArr = new int[e8];
            Object[] objArr = new Object[e8];
            int[] iArr2 = this.f25770r;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f25771s;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f25770r = iArr;
            this.f25771s = objArr;
        }
        this.f25770r[i9] = i7;
        this.f25771s[i9] = obj;
        this.f25772t = i9 + 1;
    }

    public void b() {
        int i7 = this.f25772t;
        Object[] objArr = this.f25771s;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f25772t = 0;
        this.f25769q = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.f25770r = (int[]) this.f25770r.clone();
            iVar.f25771s = (Object[]) this.f25771s.clone();
            return iVar;
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    public Object i(int i7) {
        return k(i7, null);
    }

    public Object k(int i7, Object obj) {
        Object obj2;
        int a8 = d.a(this.f25770r, this.f25772t, i7);
        return (a8 < 0 || (obj2 = this.f25771s[a8]) == f25768u) ? obj : obj2;
    }

    public int l(int i7) {
        if (this.f25769q) {
            g();
        }
        return this.f25770r[i7];
    }

    public void m(int i7, Object obj) {
        int a8 = d.a(this.f25770r, this.f25772t, i7);
        if (a8 >= 0) {
            this.f25771s[a8] = obj;
            return;
        }
        int i8 = ~a8;
        int i9 = this.f25772t;
        if (i8 < i9) {
            Object[] objArr = this.f25771s;
            if (objArr[i8] == f25768u) {
                this.f25770r[i8] = i7;
                objArr[i8] = obj;
                return;
            }
        }
        if (this.f25769q && i9 >= this.f25770r.length) {
            g();
            i8 = ~d.a(this.f25770r, this.f25772t, i7);
        }
        int i10 = this.f25772t;
        if (i10 >= this.f25770r.length) {
            int e8 = d.e(i10 + 1);
            int[] iArr = new int[e8];
            Object[] objArr2 = new Object[e8];
            int[] iArr2 = this.f25770r;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f25771s;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f25770r = iArr;
            this.f25771s = objArr2;
        }
        int i11 = this.f25772t;
        if (i11 - i8 != 0) {
            int[] iArr3 = this.f25770r;
            int i12 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i12, i11 - i8);
            Object[] objArr4 = this.f25771s;
            System.arraycopy(objArr4, i8, objArr4, i12, this.f25772t - i8);
        }
        this.f25770r[i8] = i7;
        this.f25771s[i8] = obj;
        this.f25772t++;
    }

    public int n() {
        if (this.f25769q) {
            g();
        }
        return this.f25772t;
    }

    public Object o(int i7) {
        if (this.f25769q) {
            g();
        }
        return this.f25771s[i7];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25772t * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f25772t; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(l(i7));
            sb.append('=');
            Object o7 = o(i7);
            if (o7 != this) {
                sb.append(o7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public i(int i7) {
        this.f25769q = false;
        if (i7 == 0) {
            this.f25770r = d.f25730a;
            this.f25771s = d.f25732c;
        } else {
            int e8 = d.e(i7);
            this.f25770r = new int[e8];
            this.f25771s = new Object[e8];
        }
    }
}
