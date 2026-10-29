package b3;

import android.util.Pair;
import com.google.android.gms.internal.ads.b10;
import com.google.android.gms.internal.ads.wx1;

/* compiled from: MyApplication */
public final class k1 extends e3.b {

    /* renamed from: a, reason: collision with root package name */
    private final j1 f3278a;

    /* renamed from: b, reason: collision with root package name */
    private final wx1 f3279b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3280c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3281d;

    /* renamed from: e, reason: collision with root package name */
    private final long f3282e = r2.t.o().a();

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f3283f;

    public k1(j1 j1Var, boolean z7, int i7, Boolean bool, wx1 wx1Var) {
        this.f3278a = j1Var;
        this.f3280c = z7;
        this.f3281d = i7;
        this.f3283f = bool;
        this.f3279b = wx1Var;
    }

    private static long c() {
        return r2.t.o().a() + ((Long) b10.f5458h.e()).longValue();
    }

    private final long d() {
        return r2.t.o().a() - this.f3282e;
    }

    @Override // e3.b
    public final void a(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", k2.c.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(d()));
        int i7 = this.f3281d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i7));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f3283f));
        boolean z7 = this.f3280c;
        c.e(this.f3279b, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z7 ? "0" : "1"));
        this.f3278a.c(z7, new l1(null, str, c(), i7));
    }

    @Override // e3.b
    public final void b(e3.a aVar) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", k2.c.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(d()));
        int i7 = this.f3281d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i7));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f3283f));
        boolean z7 = this.f3280c;
        c.e(this.f3279b, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z7 ? "0" : "1"));
        this.f3278a.c(z7, new l1(aVar, "", c(), i7));
    }
}
