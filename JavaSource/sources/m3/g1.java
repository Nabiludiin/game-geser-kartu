package m3;

import android.util.Log;
import l3.f;

/* compiled from: MyApplication */
final class g1 implements f.c {

    /* renamed from: q, reason: collision with root package name */
    public final int f24796q;

    /* renamed from: r, reason: collision with root package name */
    public final l3.f f24797r;

    /* renamed from: s, reason: collision with root package name */
    public final f.c f24798s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ h1 f24799t;

    public g1(h1 h1Var, int i7, l3.f fVar, f.c cVar) {
        this.f24799t = h1Var;
        this.f24796q = i7;
        this.f24797r = fVar;
        this.f24798s = cVar;
    }

    @Override // m3.n
    public final void a(k3.b bVar) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(bVar)));
        this.f24799t.s(bVar, this.f24796q);
    }
}
