package b3;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.b63;
import com.google.android.gms.internal.ads.m64;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.r53;
import com.google.android.gms.internal.ads.tk0;
import com.google.android.gms.internal.ads.uy;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class f implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a5.d f3229a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ al0 f3230b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ tk0 f3231c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ r53 f3232d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ w f3233e;

    f(w wVar, a5.d dVar, al0 al0Var, tk0 tk0Var, r53 r53Var) {
        this.f3229a = dVar;
        this.f3230b = al0Var;
        this.f3231c = tk0Var;
        this.f3232d = r53Var;
        Objects.requireNonNull(wVar);
        this.f3233e = wVar;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) s2.b0.c().d(uy.q8)).booleanValue()) {
            r2.t.l().j(th, "SignalGeneratorImpl.generateSignals");
        } else {
            r2.t.l().i(th, "SignalGeneratorImpl.generateSignals");
        }
        b63 Y8 = w.Y8(this.f3229a, this.f3230b);
        if (((Boolean) p00.f13598e.e()).booleanValue() && Y8 != null) {
            r53 r53Var = this.f3232d;
            r53Var.j0(th);
            r53Var.e(false);
            Y8.a(r53Var);
            Y8.h();
        }
        tk0 tk0Var = this.f3231c;
        if (tk0Var == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            tk0Var.v(message);
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        a5.d dVar = this.f3229a;
        AtomicBoolean x8 = this.f3233e.x8();
        m0 m0Var = (m0) obj;
        b63 Y8 = w.Y8(dVar, this.f3230b);
        x8.set(true);
        if (!((Boolean) s2.b0.c().d(uy.k8)).booleanValue()) {
            try {
                tk0 tk0Var = this.f3231c;
                if (tk0Var != null) {
                    tk0Var.v("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e8) {
                String concat = "QueryInfo generation has been disabled.".concat(e8.toString());
                int i7 = v2.n1.f26802b;
                w2.p.c(concat);
            }
            if (!((Boolean) p00.f13598e.e()).booleanValue() || Y8 == null) {
                return;
            }
            r53 r53Var = this.f3232d;
            r53Var.h0("QueryInfo generation has been disabled.");
            r53Var.e(false);
            Y8.a(r53Var);
            Y8.h();
            return;
        }
        try {
            try {
                if (m0Var == null) {
                    tk0 tk0Var2 = this.f3231c;
                    if (tk0Var2 != null) {
                        tk0Var2.L2(null, null, null);
                    }
                    r53 r53Var2 = this.f3232d;
                    r53Var2.e(true);
                    if (!((Boolean) p00.f13598e.e()).booleanValue() || Y8 == null) {
                        return;
                    }
                    Y8.a(r53Var2);
                    Y8.h();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(m0Var.f3295c) ? new JSONObject(m0Var.f3295c) : new JSONObject(m0Var.f3294b)).optString("request_id", ""))) {
                        int i8 = v2.n1.f26802b;
                        w2.p.f("The request ID is empty in request JSON.");
                        tk0 tk0Var3 = this.f3231c;
                        if (tk0Var3 != null) {
                            tk0Var3.v("Internal error: request ID is empty in request JSON.");
                        }
                        r53 r53Var3 = this.f3232d;
                        r53Var3.h0("Request ID empty");
                        r53Var3.e(false);
                        if (!((Boolean) p00.f13598e.e()).booleanValue() || Y8 == null) {
                            return;
                        }
                        Y8.a(r53Var3);
                        Y8.h();
                        return;
                    }
                    Bundle bundle = m0Var.f3298f;
                    w wVar = this.f3233e;
                    if (wVar.p8() && bundle != null && bundle.getInt(wVar.r8(), -1) == -1) {
                        bundle.putInt(wVar.r8(), wVar.s8().get());
                    }
                    if (wVar.o8() && bundle != null && TextUtils.isEmpty(bundle.getString(wVar.q8()))) {
                        if (TextUtils.isEmpty(wVar.u8())) {
                            wVar.v8(r2.t.g().Q(wVar.Z8(), wVar.t8().f27051q));
                        }
                        bundle.putString(wVar.q8(), wVar.u8());
                    }
                    tk0 tk0Var4 = this.f3231c;
                    if (tk0Var4 != null) {
                        if (TextUtils.isEmpty(m0Var.f3295c)) {
                            tk0Var4.L2(m0Var.f3293a, m0Var.f3294b, bundle);
                        } else {
                            tk0Var4.L2(m0Var.f3293a, m0Var.f3295c, bundle);
                        }
                    }
                    this.f3232d.e(true);
                    if (!((Boolean) p00.f13598e.e()).booleanValue() || Y8 == null) {
                        return;
                    }
                    Y8.a(this.f3232d);
                    Y8.h();
                } catch (JSONException e9) {
                    int i9 = v2.n1.f26802b;
                    w2.p.f("Failed to create JSON object from the request string.");
                    tk0 tk0Var5 = this.f3231c;
                    if (tk0Var5 != null) {
                        String obj2 = e9.toString();
                        StringBuilder sb = new StringBuilder(obj2.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(obj2);
                        tk0Var5.v(sb.toString());
                    }
                    r53 r53Var4 = this.f3232d;
                    r53Var4.j0(e9);
                    r53Var4.e(false);
                    r2.t.l().i(e9, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) p00.f13598e.e()).booleanValue() || Y8 == null) {
                        return;
                    }
                    Y8.a(r53Var4);
                    Y8.h();
                }
            } catch (RemoteException e10) {
                r53 r53Var5 = this.f3232d;
                r53Var5.j0(e10);
                r53Var5.e(false);
                int i10 = v2.n1.f26802b;
                w2.p.d("", e10);
                r2.t.l().i(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) p00.f13598e.e()).booleanValue() || Y8 == null) {
                    return;
                }
                Y8.a(this.f3232d);
                Y8.h();
            }
        } catch (Throwable th) {
            if (((Boolean) p00.f13598e.e()).booleanValue() && Y8 != null) {
                Y8.a(this.f3232d);
                Y8.h();
            }
            throw th;
        }
    }
}
