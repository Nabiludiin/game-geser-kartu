package s2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.kb0;
import java.util.Objects;

/* compiled from: MyApplication */
final class k extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f26149b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g5 f26150c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f26151d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kb0 f26152e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f26153f;

    k(w wVar, Context context, g5 g5Var, String str, kb0 kb0Var) {
        this.f26149b = context;
        this.f26150c = g5Var;
        this.f26151d = str;
        this.f26152e = kb0Var;
        Objects.requireNonNull(wVar);
        this.f26153f = wVar;
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object a() {
        w.k(this.f26149b, "banner");
        return new f4();
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object b() {
        return this.f26153f.l().c(this.f26149b, this.f26150c, this.f26151d, this.f26152e, 1);
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        return o1Var.j6(w3.b.C1(this.f26149b), this.f26150c, this.f26151d, this.f26152e, ModuleDescriptor.MODULE_VERSION);
    }
}
