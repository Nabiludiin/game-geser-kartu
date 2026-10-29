package s2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.kb0;
import java.util.Objects;

/* compiled from: MyApplication */
final class n extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f26194b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g5 f26195c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f26196d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kb0 f26197e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f26198f;

    n(w wVar, Context context, g5 g5Var, String str, kb0 kb0Var) {
        this.f26194b = context;
        this.f26195c = g5Var;
        this.f26196d = str;
        this.f26197e = kb0Var;
        Objects.requireNonNull(wVar);
        this.f26198f = wVar;
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object a() {
        w.k(this.f26194b, "interstitial");
        return new f4();
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object b() {
        return this.f26198f.l().c(this.f26194b, this.f26195c, this.f26196d, this.f26197e, 2);
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        return o1Var.X6(w3.b.C1(this.f26194b), this.f26195c, this.f26196d, this.f26197e, ModuleDescriptor.MODULE_VERSION);
    }
}
