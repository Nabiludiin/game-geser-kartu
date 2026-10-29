package m3;

import android.app.Dialog;

/* compiled from: MyApplication */
final class j1 extends n0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f24817a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k1 f24818b;

    j1(k1 k1Var, Dialog dialog) {
        this.f24818b = k1Var;
        this.f24817a = dialog;
    }

    @Override // m3.n0
    public final void a() {
        this.f24818b.f24822r.o();
        if (this.f24817a.isShowing()) {
            this.f24817a.dismiss();
        }
    }
}
