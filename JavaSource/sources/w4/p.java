package w4;

/* compiled from: MyApplication */
final class p implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ i f27126q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ q f27127r;

    p(q qVar, i iVar) {
        this.f27127r = qVar;
        this.f27126q = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        b bVar;
        f0 f0Var4;
        f0 f0Var5;
        if (this.f27126q.l()) {
            f0Var5 = this.f27127r.f27130c;
            f0Var5.q();
            return;
        }
        try {
            bVar = this.f27127r.f27129b;
            Object a8 = bVar.a(this.f27126q);
            f0Var4 = this.f27127r.f27130c;
            f0Var4.p(a8);
        } catch (h e8) {
            if (e8.getCause() instanceof Exception) {
                f0Var3 = this.f27127r.f27130c;
                f0Var3.o((Exception) e8.getCause());
            } else {
                f0Var2 = this.f27127r.f27130c;
                f0Var2.o(e8);
            }
        } catch (Exception e9) {
            f0Var = this.f27127r.f27130c;
            f0Var.o(e9);
        }
    }
}
