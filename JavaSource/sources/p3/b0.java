package p3;

import android.content.Intent;

/* compiled from: MyApplication */
final class b0 extends c0 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Intent f25117q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ m3.j f25118r;

    b0(Intent intent, m3.j jVar, int i7) {
        this.f25117q = intent;
        this.f25118r = jVar;
    }

    @Override // p3.c0
    public final void a() {
        Intent intent = this.f25117q;
        if (intent != null) {
            this.f25118r.startActivityForResult(intent, 2);
        }
    }
}
