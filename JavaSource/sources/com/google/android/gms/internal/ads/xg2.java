package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class xg2 extends kd0 {

    /* renamed from: q, reason: collision with root package name */
    private final String f18813q;

    /* renamed from: r, reason: collision with root package name */
    private final id0 f18814r;

    /* renamed from: s, reason: collision with root package name */
    private final im0 f18815s;

    /* renamed from: t, reason: collision with root package name */
    private final JSONObject f18816t;

    /* renamed from: u, reason: collision with root package name */
    private final long f18817u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18818v;

    public xg2(String str, id0 id0Var, im0 im0Var, long j7) {
        JSONObject jSONObject = new JSONObject();
        this.f18816t = jSONObject;
        this.f18818v = false;
        this.f18815s = im0Var;
        this.f18813q = str;
        this.f18814r = id0Var;
        this.f18817u = j7;
        try {
            jSONObject.put("adapter_version", id0Var.e().toString());
            jSONObject.put("sdk_version", id0Var.f().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void j8(String str, im0 im0Var) {
        synchronized (xg2.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", str);
                    jSONObject.put("signal_error", "Adapter failed to instantiate");
                    if (((Boolean) s2.b0.c().d(uy.R1)).booleanValue()) {
                        jSONObject.put("signal_error_code", 1);
                    }
                    im0Var.b(jSONObject);
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void k8(String str, int i7) {
        try {
            if (this.f18818v) {
                return;
            }
            try {
                JSONObject jSONObject = this.f18816t;
                jSONObject.put("signal_error", str);
                if (((Boolean) s2.b0.c().d(uy.S1)).booleanValue()) {
                    jSONObject.put("latency", r2.t.o().b() - this.f18817u);
                }
                if (((Boolean) s2.b0.c().d(uy.R1)).booleanValue()) {
                    jSONObject.put("signal_error_code", i7);
                }
            } catch (JSONException unused) {
            }
            this.f18815s.b(this.f18816t);
            this.f18818v = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ld0
    public final synchronized void A(s2.x2 x2Var) {
        k8(x2Var.f26260r, 2);
    }

    public final synchronized void b() {
        if (this.f18818v) {
            return;
        }
        try {
            if (((Boolean) s2.b0.c().d(uy.R1)).booleanValue()) {
                this.f18816t.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f18815s.b(this.f18816t);
        this.f18818v = true;
    }

    public final synchronized void d() {
        k8("Signal collection timeout.", 3);
    }

    @Override // com.google.android.gms.internal.ads.ld0
    public final synchronized void u(String str) {
        k8(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.ld0
    public final synchronized void y(String str) {
        if (this.f18818v) {
            return;
        }
        if (str == null) {
            u("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.f18816t;
            jSONObject.put("signals", str);
            if (((Boolean) s2.b0.c().d(uy.S1)).booleanValue()) {
                jSONObject.put("latency", r2.t.o().b() - this.f18817u);
            }
            if (((Boolean) s2.b0.c().d(uy.R1)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f18815s.b(this.f18816t);
        this.f18818v = true;
    }
}
