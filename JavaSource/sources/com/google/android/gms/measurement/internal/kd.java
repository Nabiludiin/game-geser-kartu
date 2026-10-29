package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: MyApplication */
final class kd implements xd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pd f22308a;

    kd(pd pdVar) {
        Objects.requireNonNull(pdVar);
        this.f22308a = pdVar;
    }

    @Override // com.google.android.gms.measurement.internal.xd
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f22308a.b().t(new jd(this, str, str2, bundle));
            return;
        }
        pd pdVar = this.f22308a;
        if (pdVar.x0() != null) {
            pdVar.x0().a().o().b("AppId not known when logging event", str2);
        }
    }
}
