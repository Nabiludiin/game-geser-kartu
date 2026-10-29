package p4;

import android.util.Log;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import x4.f;

/* compiled from: MyApplication */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final r2 f25444a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f25445b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f25446c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f25447d = new AtomicReference();

    l0(r2 r2Var, Executor executor) {
        this.f25444a = r2Var;
        this.f25445b = executor;
    }

    public static /* synthetic */ void a(l0 l0Var, e0 e0Var) {
        final AtomicReference atomicReference = l0Var.f25447d;
        Objects.requireNonNull(atomicReference);
        e0Var.g(new f.b() { // from class: p4.h0
            @Override // x4.f.b
            public final void b(x4.b bVar) {
                atomicReference.set(bVar);
            }
        }, new f.a() { // from class: p4.i0
            @Override // x4.f.a
            public final void a(x4.e eVar) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(eVar.b())));
            }
        });
    }

    public final void b(f.b bVar, f.a aVar) {
        q1.a();
        n0 n0Var = (n0) this.f25446c.get();
        if (n0Var == null) {
            aVar.a(new u2(3, "No available form can be built.").a());
        } else {
            ((x) this.f25444a.a()).a(n0Var).b().a().g(bVar, aVar);
        }
    }

    public final void c() {
        n0 n0Var = (n0) this.f25446c.get();
        if (n0Var == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final e0 a8 = ((x) this.f25444a.a()).a(n0Var).b().a();
        a8.f25341l = true;
        q1.f25500a.post(new Runnable() { // from class: p4.g0
            @Override // java.lang.Runnable
            public final void run() {
                l0.a(l0.this, a8);
            }
        });
    }

    public final void d(n0 n0Var) {
        this.f25446c.set(n0Var);
    }
}
