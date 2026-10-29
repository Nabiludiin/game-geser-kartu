package r;

/* compiled from: MyApplication */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int[] f25726a;

    /* renamed from: b, reason: collision with root package name */
    private int f25727b;

    /* renamed from: c, reason: collision with root package name */
    private int f25728c;

    /* renamed from: d, reason: collision with root package name */
    private int f25729d;

    public c() {
        this(8);
    }

    private void c() {
        int[] iArr = this.f25726a;
        int length = iArr.length;
        int i7 = this.f25727b;
        int i8 = length - i7;
        int i9 = length << 1;
        if (i9 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i9];
        System.arraycopy(iArr, i7, iArr2, 0, i8);
        System.arraycopy(this.f25726a, 0, iArr2, i8, this.f25727b);
        this.f25726a = iArr2;
        this.f25727b = 0;
        this.f25728c = length;
        this.f25729d = i9 - 1;
    }

    public void a(int i7) {
        int[] iArr = this.f25726a;
        int i8 = this.f25728c;
        iArr[i8] = i7;
        int i9 = this.f25729d & (i8 + 1);
        this.f25728c = i9;
        if (i9 == this.f25727b) {
            c();
        }
    }

    public void b() {
        this.f25728c = this.f25727b;
    }

    public boolean d() {
        return this.f25727b == this.f25728c;
    }

    public int e() {
        int i7 = this.f25727b;
        if (i7 == this.f25728c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i8 = this.f25726a[i7];
        this.f25727b = (i7 + 1) & this.f25729d;
        return i8;
    }

    public c(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i7 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i7 = Integer.bitCount(i7) != 1 ? Integer.highestOneBit(i7 - 1) << 1 : i7;
        this.f25729d = i7 - 1;
        this.f25726a = new int[i7];
    }
}
