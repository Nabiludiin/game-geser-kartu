package m4;

import android.content.Context;

/* compiled from: MyApplication */
final class j implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ l f24895q;

    /* synthetic */ j(l lVar, i iVar) {
        this.f24895q = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        long b8 = this.f24895q.b();
        if (b8 == -1 || com.google.android.gms.common.util.h.d().a() <= b8) {
            return;
        }
        context = this.f24895q.f24897a;
        l.f(context);
    }
}
