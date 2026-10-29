package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;

/* compiled from: MyApplication */
final class yz extends e3.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f19920a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a00 f19921b;

    yz(a00 a00Var, String str) {
        this.f19920a = str;
        Objects.requireNonNull(a00Var);
        this.f19921b = a00Var;
    }

    @Override // e3.b
    public final void a(String str) {
        int i7 = v2.n1.f26802b;
        w2.p.f("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            a00 a00Var = this.f19921b;
            a00Var.i().g(a00Var.e(this.f19920a, str).toString(), null);
        } catch (JSONException e8) {
            w2.p.d("Error creating PACT Error Response JSON: ", e8);
        }
    }

    @Override // e3.b
    public final void b(e3.a aVar) {
        String b8 = aVar.b();
        try {
            a00 a00Var = this.f19921b;
            a00Var.i().g(a00Var.f(this.f19920a, b8).toString(), null);
        } catch (JSONException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Error creating PACT Signal Response JSON: ", e8);
        }
    }
}
