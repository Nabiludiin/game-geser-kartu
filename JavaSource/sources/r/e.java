package r;

/* compiled from: MyApplication */
public class e implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    private static final Object f25733u = new Object();

    /* renamed from: q, reason: collision with root package name */
    private boolean f25734q;

    /* renamed from: r, reason: collision with root package name */
    private long[] f25735r;

    /* renamed from: s, reason: collision with root package name */
    private Object[] f25736s;

    /* renamed from: t, reason: collision with root package name */
    private int f25737t;

    public e() {
        this(10);
    }

    private void g() {
        int i7 = this.f25737t;
        long[] jArr = this.f25735r;
        Object[] objArr = this.f25736s;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f25733u) {
                if (i9 != i8) {
                    jArr[i8] = jArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f25734q = false;
        this.f25737t = i8;
    }

    public void a(long j7, Object obj) {
        int i7 = this.f25737t;
        if (i7 != 0 && j7 <= this.f25735r[i7 - 1]) {
            m(j7, obj);
            return;
        }
        if (this.f25734q && i7 >= this.f25735r.length) {
            g();
        }
        int i8 = this.f25737t;
        if (i8 >= this.f25735r.length) {
            int f8 = d.f(i8 + 1);
            long[] jArr = new long[f8];
            Object[] objArr = new Object[f8];
            long[] jArr2 = this.f25735r;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f25736s;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f25735r = jArr;
            this.f25736s = objArr;
        }
        this.f25735r[i8] = j7;
        this.f25736s[i8] = obj;
        this.f25737t = i8 + 1;
    }

    public void b() {
        int i7 = this.f25737t;
        Object[] objArr = this.f25736s;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f25737t = 0;
        this.f25734q = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f25735r = (long[]) this.f25735r.clone();
            eVar.f25736s = (Object[]) this.f25736s.clone();
            return eVar;
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    public Object i(long j7) {
        return k(j7, null);
    }

    public Object k(long j7, Object obj) {
        Object obj2;
        int b8 = d.b(this.f25735r, this.f25737t, j7);
        return (b8 < 0 || (obj2 = this.f25736s[b8]) == f25733u) ? obj : obj2;
    }

    public long l(int i7) {
        if (this.f25734q) {
            g();
        }
        return this.f25735r[i7];
    }

    public void m(long j7, Object obj) {
        int b8 = d.b(this.f25735r, this.f25737t, j7);
        if (b8 >= 0) {
            this.f25736s[b8] = obj;
            return;
        }
        int i7 = ~b8;
        int i8 = this.f25737t;
        if (i7 < i8) {
            Object[] objArr = this.f25736s;
            if (objArr[i7] == f25733u) {
                this.f25735r[i7] = j7;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f25734q && i8 >= this.f25735r.length) {
            g();
            i7 = ~d.b(this.f25735r, this.f25737t, j7);
        }
        int i9 = this.f25737t;
        if (i9 >= this.f25735r.length) {
            int f8 = d.f(i9 + 1);
            long[] jArr = new long[f8];
            Object[] objArr2 = new Object[f8];
            long[] jArr2 = this.f25735r;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f25736s;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f25735r = jArr;
            this.f25736s = objArr2;
        }
        int i10 = this.f25737t;
        if (i10 - i7 != 0) {
            long[] jArr3 = this.f25735r;
            int i11 = i7 + 1;
            System.arraycopy(jArr3, i7, jArr3, i11, i10 - i7);
            Object[] objArr4 = this.f25736s;
            System.arraycopy(objArr4, i7, objArr4, i11, this.f25737t - i7);
        }
        this.f25735r[i7] = j7;
        this.f25736s[i7] = obj;
        this.f25737t++;
    }

    public void n(long j7) {
        int b8 = d.b(this.f25735r, this.f25737t, j7);
        if (b8 >= 0) {
            Object[] objArr = this.f25736s;
            Object obj = objArr[b8];
            Object obj2 = f25733u;
            if (obj != obj2) {
                objArr[b8] = obj2;
                this.f25734q = true;
            }
        }
    }

    public int o() {
        if (this.f25734q) {
            g();
        }
        return this.f25737t;
    }

    public Object p(int i7) {
        if (this.f25734q) {
            g();
        }
        return this.f25736s[i7];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25737t * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f25737t; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(l(i7));
            sb.append('=');
            Object p7 = p(i7);
            if (p7 != this) {
                sb.append(p7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public e(int i7) {
        this.f25734q = false;
        if (i7 == 0) {
            this.f25735r = d.f25731b;
            this.f25736s = d.f25732c;
        } else {
            int f8 = d.f(i7);
            this.f25735r = new long[f8];
            this.f25736s = new Object[f8];
        }
    }
}
