package s2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.uy;
import java.util.Objects;

/* compiled from: MyApplication */
final class f extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f26088b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kb0 f26089c;

    f(w wVar, Context context, kb0 kb0Var) {
        this.f26088b = context;
        this.f26089c = kb0Var;
        Objects.requireNonNull(wVar);
    }

    @Override // s2.y
    protected final /* bridge */ /* synthetic */ Object a() {
        w.k(this.f26088b, "out_of_context_tester");
        return null;
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object b() {
        Context context = this.f26088b;
        w3.a C1 = w3.b.C1(context);
        uy.a(context);
        if (((Boolean) b0.c().d(uy.ta)).booleanValue()) {
            try {
                return ((u2) w2.t.a(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", e.f26085a)).D2(C1, this.f26089c, ModuleDescriptor.MODULE_VERSION);
            } catch (RemoteException | NullPointerException | w2.s e8) {
                ag0.c(this.f26088b).a(e8, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        Context context = this.f26088b;
        w3.a C1 = w3.b.C1(context);
        uy.a(context);
        if (((Boolean) b0.c().d(uy.ta)).booleanValue()) {
            return o1Var.c3(C1, this.f26089c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
