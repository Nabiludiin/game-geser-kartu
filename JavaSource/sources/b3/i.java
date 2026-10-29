package b3;

import android.util.Pair;
import com.google.android.gms.internal.ads.m64;
import com.google.android.gms.internal.ads.uy;
import java.util.Objects;

/* compiled from: MyApplication */
final class i implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f3253a;

    i(w wVar) {
        Objects.requireNonNull(wVar);
        this.f3253a = wVar;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        r2.t.l().i(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", k2.c.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        w wVar = this.f3253a;
        c.e(wVar.k8(), null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(wVar.y8().get())));
        int i7 = v2.n1.f26802b;
        w2.p.d("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) s2.b0.c().d(uy.Ka)).booleanValue() || wVar.x8().get() || wVar.y8().getAndIncrement() >= ((Integer) s2.b0.c().d(uy.La)).intValue()) {
            return;
        }
        wVar.X8();
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i7 = v2.n1.f26802b;
        w2.p.a("Initialized webview successfully for SDKCore.");
        if (((Boolean) s2.b0.c().d(uy.Ka)).booleanValue()) {
            w wVar = this.f3253a;
            c.e(wVar.k8(), null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", k2.c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(wVar.y8().get())));
            wVar.x8().set(true);
        }
    }
}
