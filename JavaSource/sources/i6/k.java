package i6;

import q6.q;

/* compiled from: MyApplication */
public abstract class k extends d implements q6.f {

    /* renamed from: t, reason: collision with root package name */
    private final int f24189t;

    public k(int i7, g6.e eVar) {
        super(eVar);
        this.f24189t = i7;
    }

    @Override // q6.f
    public int b() {
        return this.f24189t;
    }

    @Override // i6.a
    public String toString() {
        if (k() != null) {
            return super.toString();
        }
        String e8 = q.e(this);
        q6.i.d(e8, "renderLambdaToString(...)");
        return e8;
    }
}
