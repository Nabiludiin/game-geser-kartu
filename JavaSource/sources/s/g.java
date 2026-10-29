package s;

/* compiled from: MyApplication */
class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f25951a;

    /* renamed from: b, reason: collision with root package name */
    private int f25952b;

    g(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f25951a = new Object[i7];
    }

    @Override // s.f
    public boolean a(Object obj) {
        int i7 = this.f25952b;
        Object[] objArr = this.f25951a;
        if (i7 >= objArr.length) {
            return false;
        }
        objArr[i7] = obj;
        this.f25952b = i7 + 1;
        return true;
    }

    @Override // s.f
    public Object b() {
        int i7 = this.f25952b;
        if (i7 <= 0) {
            return null;
        }
        int i8 = i7 - 1;
        Object[] objArr = this.f25951a;
        Object obj = objArr[i8];
        objArr[i8] = null;
        this.f25952b = i7 - 1;
        return obj;
    }

    @Override // s.f
    public void c(Object[] objArr, int i7) {
        if (i7 > objArr.length) {
            i7 = objArr.length;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = objArr[i8];
            int i9 = this.f25952b;
            Object[] objArr2 = this.f25951a;
            if (i9 < objArr2.length) {
                objArr2[i9] = obj;
                this.f25952b = i9 + 1;
            }
        }
    }
}
