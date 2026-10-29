package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
final class i90 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ aa0 f9888q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ u80 f9889r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ ArrayList f9890s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f9891t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ ba0 f9892u;

    i90(ba0 ba0Var, aa0 aa0Var, u80 u80Var, ArrayList arrayList, long j7) {
        this.f9888q = aa0Var;
        this.f9889r = u80Var;
        this.f9890s = arrayList;
        this.f9891t = j7;
        Objects.requireNonNull(ba0Var);
        this.f9892u = ba0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        v2.n1.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        ba0 ba0Var = this.f9892u;
        synchronized (ba0Var.f()) {
            try {
                v2.n1.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                aa0 aa0Var = this.f9888q;
                if (aa0Var.e() != -1 && aa0Var.e() != 1) {
                    if (((Boolean) s2.b0.c().d(uy.p8)).booleanValue()) {
                        aa0Var.d(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        aa0Var.c();
                    }
                    z64 z64Var = cm0.f6505f;
                    final u80 u80Var = this.f9889r;
                    Objects.requireNonNull(u80Var);
                    z64Var.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.h90
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            u80.this.i();
                        }
                    });
                    String valueOf = String.valueOf(s2.b0.c().d(uy.f17072d));
                    int e8 = aa0Var.e();
                    int j7 = ba0Var.j();
                    ArrayList arrayList = this.f9890s;
                    if (arrayList.isEmpty()) {
                        sb = ". Still waiting for the engine to be loaded";
                    } else {
                        String valueOf2 = String.valueOf(arrayList.get(0));
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 88);
                        sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                        sb2.append(valueOf2);
                        sb = sb2.toString();
                    }
                    long a8 = r2.t.o().a() - this.f9891t;
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 107 + String.valueOf(e8).length() + 36 + String.valueOf(j7).length() + sb.length() + 39 + String.valueOf(a8).length() + 26);
                    sb3.append("Could not finish the full JS engine loading in ");
                    sb3.append(valueOf);
                    sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                    sb3.append(e8);
                    sb3.append(". Update status(fullLoadTimeout) is ");
                    sb3.append(j7);
                    sb3.append(sb);
                    sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                    sb3.append(a8);
                    sb3.append(" ms at timeout. Rejecting.");
                    v2.n1.k(sb3.toString());
                    v2.n1.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                v2.n1.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
