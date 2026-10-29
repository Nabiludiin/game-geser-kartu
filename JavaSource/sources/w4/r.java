package w4;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class r implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ i f27131q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ s f27132r;

    r(s sVar, i iVar) {
        this.f27132r = sVar;
        this.f27131q = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        b bVar;
        try {
            bVar = this.f27132r.f27134b;
            i iVar = (i) bVar.a(this.f27131q);
            if (iVar == null) {
                this.f27132r.d(new NullPointerException("Continuation returned null"));
                return;
            }
            s sVar = this.f27132r;
            Executor executor = k.f27124b;
            iVar.f(executor, sVar);
            iVar.d(executor, this.f27132r);
            iVar.a(executor, this.f27132r);
        } catch (h e8) {
            if (e8.getCause() instanceof Exception) {
                f0Var3 = this.f27132r.f27135c;
                f0Var3.o((Exception) e8.getCause());
            } else {
                f0Var2 = this.f27132r.f27135c;
                f0Var2.o(e8);
            }
        } catch (Exception e9) {
            f0Var = this.f27132r.f27135c;
            f0Var.o(e9);
        }
    }
}
