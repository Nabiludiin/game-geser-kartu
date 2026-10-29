package m3;

import android.os.Bundle;

/* compiled from: MyApplication */
final class t1 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ i f24862q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f24863r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ u1 f24864s;

    t1(u1 u1Var, i iVar, String str) {
        this.f24862q = iVar;
        this.f24863r = str;
        this.f24864s = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        u1 u1Var = this.f24864s;
        i7 = u1Var.f24871b;
        if (i7 > 0) {
            i iVar = this.f24862q;
            bundle = u1Var.f24872c;
            if (bundle != null) {
                String str = this.f24863r;
                bundle3 = u1Var.f24872c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            iVar.f(bundle2);
        }
        i8 = this.f24864s.f24871b;
        if (i8 >= 2) {
            this.f24862q.j();
        }
        i9 = this.f24864s.f24871b;
        if (i9 >= 3) {
            this.f24862q.h();
        }
        i10 = this.f24864s.f24871b;
        if (i10 >= 4) {
            this.f24862q.k();
        }
        i11 = this.f24864s.f24871b;
        if (i11 >= 5) {
            this.f24862q.g();
        }
    }
}
