package s2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.ye0;
import java.util.Objects;

/* compiled from: MyApplication */
final class j extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f26145b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kb0 f26146c;

    j(w wVar, Context context, kb0 kb0Var) {
        this.f26145b = context;
        this.f26146c = kb0Var;
        Objects.requireNonNull(wVar);
    }

    @Override // s2.y
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object b() {
        Context context = this.f26145b;
        try {
            return ((ye0) w2.t.a(context, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", i.f26125a)).Q0(w3.b.C1(context), this.f26146c, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | NullPointerException | w2.s unused) {
            return null;
        }
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        return o1Var.o5(w3.b.C1(this.f26145b), this.f26146c, ModuleDescriptor.MODULE_VERSION);
    }
}
