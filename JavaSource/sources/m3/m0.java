package m3;

import android.os.Looper;

/* compiled from: MyApplication */
public final class m0 extends w {

    /* renamed from: c, reason: collision with root package name */
    private final l3.e f24830c;

    public m0(l3.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f24830c = eVar;
    }

    @Override // l3.f
    public final com.google.android.gms.common.api.internal.a g(com.google.android.gms.common.api.internal.a aVar) {
        return this.f24830c.f(aVar);
    }

    @Override // l3.f
    public final Looper i() {
        return this.f24830c.j();
    }
}
