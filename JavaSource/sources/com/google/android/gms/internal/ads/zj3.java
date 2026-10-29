package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: MyApplication */
public final class zj3 implements ak3 {

    /* renamed from: a, reason: collision with root package name */
    private final v05 f20209a;

    public zj3(v05 v05Var) {
        this.f20209a = v05Var;
    }

    @Override // com.google.android.gms.internal.ads.ak3
    public final /* synthetic */ void a(Object obj, OutputStream outputStream) {
        ((v05) obj).o(outputStream);
    }

    @Override // com.google.android.gms.internal.ads.ak3
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        try {
            return (v05) this.f20209a.p().b(inputStream, ez4.a());
        } catch (e05 e8) {
            throw new wj3("Cannot read proto.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ak3
    public final /* synthetic */ Object d() {
        return this.f20209a;
    }
}
