package k3;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class i0 extends k0 {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f24501f;

    /* synthetic */ i0(Callable callable, j0 j0Var) {
        super();
        this.f24501f = callable;
    }

    @Override // k3.k0
    final String a() {
        try {
            return (String) this.f24501f.call();
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
