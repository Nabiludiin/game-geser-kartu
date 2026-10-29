package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public class me0 {

    /* renamed from: a, reason: collision with root package name */
    private final mr0 f12236a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12237b;

    public me0(mr0 mr0Var, String str) {
        this.f12236a = mr0Var;
        this.f12237b = str;
    }

    public final void b(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f12237b);
            mr0 mr0Var = this.f12236a;
            if (mr0Var != null) {
                mr0Var.a("onError", put);
            }
        } catch (JSONException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Error occurred while dispatching error event.", e8);
        }
    }

    public final void c(String str) {
        try {
            this.f12236a.a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Error occurred while dispatching ready Event.", e8);
        }
    }

    public final void d(int i7, int i8, int i9, int i10) {
        try {
            this.f12236a.a("onSizeChanged", new JSONObject().put("x", i7).put("y", i8).put("width", i9).put("height", i10));
        } catch (JSONException e8) {
            int i11 = v2.n1.f26802b;
            w2.p.d("Error occurred while dispatching size change.", e8);
        }
    }

    public final void e(int i7, int i8, int i9, int i10) {
        try {
            this.f12236a.a("onDefaultPositionReceived", new JSONObject().put("x", i7).put("y", i8).put("width", i9).put("height", i10));
        } catch (JSONException e8) {
            int i11 = v2.n1.f26802b;
            w2.p.d("Error occurred while dispatching default position.", e8);
        }
    }

    public final void f(String str) {
        try {
            this.f12236a.a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Error occurred while dispatching state change.", e8);
        }
    }

    public final void g(int i7, int i8, int i9, int i10, float f8, int i11) {
        try {
            this.f12236a.a("onScreenInfoChanged", new JSONObject().put("width", i7).put("height", i8).put("maxSizeWidth", i9).put("maxSizeHeight", i10).put("density", f8).put("rotation", i11));
        } catch (JSONException e8) {
            int i12 = v2.n1.f26802b;
            w2.p.d("Error occurred while obtaining screen information.", e8);
        }
    }
}
