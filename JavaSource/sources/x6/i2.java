package x6;

/* compiled from: MyApplication */
public final class i2 extends d0 {

    /* renamed from: s, reason: collision with root package name */
    public static final i2 f27394s = new i2();

    private i2() {
    }

    @Override // x6.d0
    public boolean I(g6.i iVar) {
        return false;
    }

    @Override // x6.d0
    public void h(g6.i iVar, Runnable runnable) {
        android.support.v4.media.session.b.a(iVar.e(m2.f27413r));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // x6.d0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
