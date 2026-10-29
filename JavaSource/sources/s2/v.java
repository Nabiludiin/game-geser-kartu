package s2;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.o20;
import com.google.android.gms.internal.ads.s20;
import com.google.android.gms.internal.ads.uy;
import java.util.Objects;

/* compiled from: MyApplication */
final class v extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FrameLayout f26241b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FrameLayout f26242c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f26243d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ w f26244e;

    v(w wVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f26241b = frameLayout;
        this.f26242c = frameLayout2;
        this.f26243d = context;
        Objects.requireNonNull(wVar);
        this.f26244e = wVar;
    }

    @Override // s2.y
    protected final /* bridge */ /* synthetic */ Object a() {
        w.k(this.f26243d, "native_ad_view_delegate");
        return new i4();
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object b() {
        Context context = this.f26243d;
        uy.a(context);
        if (!((Boolean) b0.c().d(uy.Jb)).booleanValue()) {
            w wVar = this.f26244e;
            return wVar.o().c(this.f26243d, this.f26241b, this.f26242c);
        }
        try {
            return o20.j8(((s20) w2.t.a(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", u.f26235a)).P6(w3.b.C1(context), w3.b.C1(this.f26241b), w3.b.C1(this.f26242c), ModuleDescriptor.MODULE_VERSION));
        } catch (RemoteException | NullPointerException | w2.s e8) {
            w wVar2 = this.f26244e;
            wVar2.r(ag0.c(this.f26243d));
            wVar2.q().a(e8, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        return o1Var.W4(w3.b.C1(this.f26241b), w3.b.C1(this.f26242c));
    }
}
