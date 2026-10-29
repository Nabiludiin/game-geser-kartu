package s2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.kb0;
import java.util.Objects;

/* compiled from: MyApplication */
final class l extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f26164b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g5 f26165c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f26166d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kb0 f26167e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f26168f;

    l(w wVar, Context context, g5 g5Var, String str, kb0 kb0Var) {
        this.f26164b = context;
        this.f26165c = g5Var;
        this.f26166d = str;
        this.f26167e = kb0Var;
        Objects.requireNonNull(wVar);
        this.f26168f = wVar;
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object a() {
        w.k(this.f26164b, "app_open");
        return new f4();
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object b() {
        return this.f26168f.l().c(this.f26164b, this.f26165c, this.f26166d, this.f26167e, 4);
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        return o1Var.B7(w3.b.C1(this.f26164b), this.f26165c, this.f26166d, this.f26167e, ModuleDescriptor.MODULE_VERSION);
    }
}
