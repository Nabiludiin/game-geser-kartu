package k2;

import s2.i3;

/* compiled from: MyApplication */
public class g {

    /* renamed from: a, reason: collision with root package name */
    protected final i3 f24399a;

    protected g(k2.a aVar) {
        this.f24399a = new i3(aVar.f24374a, null);
    }

    public final i3 a() {
        return this.f24399a;
    }

    /* compiled from: MyApplication */
    public static class a extends k2.a {
        public g k() {
            return new g(this);
        }

        @Override // k2.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }
}
