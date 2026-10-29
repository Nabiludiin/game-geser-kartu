package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import c1.g;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class x93 implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z93 f18676a;

    x93(z93 z93Var) {
        Objects.requireNonNull(z93Var);
        this.f18676a = z93Var;
    }

    @Override // c1.g.a
    public final void a(WebView webView, c1.e eVar, Uri uri, boolean z7, c1.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(eVar.b());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.f18676a.f(string2);
            } else if (string.equals("finishSession")) {
                this.f18676a.g(string2);
            } else {
                j93.f10408a.getClass();
            }
        } catch (JSONException e8) {
            ib3.a("Error parsing JS message in JavaScriptSessionService.", e8);
        }
    }
}
