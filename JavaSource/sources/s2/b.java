package s2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.dj0;
import com.google.android.gms.internal.ads.kb0;
import java.util.Objects;

/* compiled from: MyApplication */
final class b extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f26047b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f26048c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kb0 f26049d;

    b(w wVar, Context context, String str, kb0 kb0Var) {
        this.f26047b = context;
        this.f26048c = str;
        this.f26049d = kb0Var;
        Objects.requireNonNull(wVar);
    }

    @Override // s2.y
    protected final /* bridge */ /* synthetic */ Object a() {
        w.k(this.f26047b, "rewarded");
        return new k4();
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object b() {
        return dj0.a(this.f26047b, this.f26048c, this.f26049d);
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        return o1Var.e2(w3.b.C1(this.f26047b), this.f26048c, this.f26049d, ModuleDescriptor.MODULE_VERSION);
    }
}
