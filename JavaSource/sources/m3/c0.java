package m3;

import m3.c;

/* compiled from: MyApplication */
final class c0 implements c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f24773a;

    c0(g gVar) {
        this.f24773a = gVar;
    }

    @Override // m3.c.a
    public final void a(boolean z7) {
        g gVar = this.f24773a;
        gVar.D.sendMessage(gVar.D.obtainMessage(1, Boolean.valueOf(z7)));
    }
}
