package com.google.android.gms.measurement.internal;

import android.content.Intent;
import java.util.Objects;

/* compiled from: MyApplication */
final class gd extends x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ pd f22187e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gd(pd pdVar, b8 b8Var) {
        super(b8Var);
        Objects.requireNonNull(pdVar);
        this.f22187e = pdVar;
    }

    @Override // com.google.android.gms.measurement.internal.x
    public final void a() {
        pd pdVar = this.f22187e;
        pdVar.b().h();
        String str = (String) pdVar.y0().pollFirst();
        if (str != null) {
            pdVar.z0(pdVar.f().b());
            pdVar.a().w().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            pd.W(pdVar.e(), intent);
        }
        pdVar.v0();
    }
}
