package v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.c95;
import com.google.android.gms.internal.ads.vz;
import com.google.android.gms.internal.ads.wz;
import java.util.Objects;

/* compiled from: MyApplication */
final class t1 implements vz {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ wz f26848a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f26849b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f26850c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Uri f26851d;

    t1(f2 f2Var, wz wzVar, Bundle bundle, Context context, Uri uri) {
        this.f26848a = wzVar;
        this.f26849b = bundle;
        this.f26850c = context;
        this.f26851d = uri;
        Objects.requireNonNull(f2Var);
    }

    @Override // com.google.android.gms.internal.ads.vz
    public final void a() {
        wz wzVar = this.f26848a;
        d.C0013d c0013d = new d.C0013d(wzVar.c());
        f2.K(c0013d, this.f26849b);
        androidx.browser.customtabs.d a8 = c0013d.a();
        Intent intent = a8.f1034a;
        Context context = this.f26850c;
        intent.setPackage(c95.a(context));
        a8.a(context, this.f26851d);
        wzVar.b((Activity) context);
    }
}
