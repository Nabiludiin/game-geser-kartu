package s2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: MyApplication */
final class m extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f26185b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g5 f26186c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f26187d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ w f26188e;

    m(w wVar, Context context, g5 g5Var, String str) {
        this.f26185b = context;
        this.f26186c = g5Var;
        this.f26187d = str;
        Objects.requireNonNull(wVar);
        this.f26188e = wVar;
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object a() {
        w.k(this.f26185b, "search");
        return new f4();
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object b() {
        return this.f26188e.l().c(this.f26185b, this.f26186c, this.f26187d, null, 3);
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        return o1Var.K7(w3.b.C1(this.f26185b), this.f26186c, this.f26187d, ModuleDescriptor.MODULE_VERSION);
    }
}
