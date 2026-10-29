package v2;

import java.util.Objects;

/* compiled from: MyApplication */
final class a implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ b0 f26715q;

    a(b0 b0Var) {
        Objects.requireNonNull(b0Var);
        this.f26715q = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f26715q;
        b0Var.c(Thread.currentThread());
        b0Var.a();
    }
}
