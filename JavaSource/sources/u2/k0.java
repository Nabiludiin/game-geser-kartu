package u2;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.aw3;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.cw3;
import com.google.android.gms.internal.ads.dv3;
import com.google.android.gms.internal.ads.dw3;
import com.google.android.gms.internal.ads.ev3;
import com.google.android.gms.internal.ads.ew3;
import com.google.android.gms.internal.ads.fv3;
import com.google.android.gms.internal.ads.fw3;
import com.google.android.gms.internal.ads.gv3;
import com.google.android.gms.internal.ads.mr0;
import com.google.android.gms.internal.ads.uw3;
import com.google.android.gms.internal.ads.uy;
import java.util.HashMap;
import java.util.Map;
import v2.n1;

/* compiled from: MyApplication */
public final class k0 {

    /* renamed from: f, reason: collision with root package name */
    private dw3 f26524f;

    /* renamed from: c, reason: collision with root package name */
    private mr0 f26521c = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26523e = false;

    /* renamed from: a, reason: collision with root package name */
    private String f26519a = null;

    /* renamed from: d, reason: collision with root package name */
    private fv3 f26522d = null;

    /* renamed from: b, reason: collision with root package name */
    private String f26520b = null;

    private final void l() {
        if (this.f26524f == null) {
            this.f26524f = new i0(this);
        }
    }

    private final fw3 m() {
        ew3 c8 = fw3.c();
        if (!((Boolean) s2.b0.c().d(uy.zc)).booleanValue() || TextUtils.isEmpty(this.f26520b)) {
            String str = this.f26519a;
            if (str != null) {
                c8.a(str);
            } else {
                g("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c8.b(this.f26520b);
        }
        return c8.c();
    }

    public final synchronized void a(mr0 mr0Var, Context context) {
        this.f26521c = mr0Var;
        if (!b(context)) {
            g("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        i("on_play_store_bind", hashMap);
    }

    public final synchronized boolean b(Context context) {
        if (!uw3.a(context)) {
            return false;
        }
        try {
            this.f26522d = gv3.a(context);
        } catch (NullPointerException e8) {
            n1.k("Error connecting LMD Overlay service");
            r2.t.l().i(e8, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f26522d == null) {
            this.f26523e = false;
            return false;
        }
        l();
        this.f26523e = true;
        return true;
    }

    public final void c(mr0 mr0Var, aw3 aw3Var) {
        if (mr0Var == null) {
            g("adWebview missing", "onLMDShow");
            return;
        }
        this.f26521c = mr0Var;
        if (!this.f26523e && !b(mr0Var.getContext())) {
            g("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) s2.b0.c().d(uy.zc)).booleanValue()) {
            this.f26520b = aw3Var.b();
        }
        l();
        fv3 fv3Var = this.f26522d;
        if (fv3Var != null) {
            fv3Var.a(aw3Var, this.f26524f);
        }
    }

    public final void d() {
        fv3 fv3Var;
        if (!this.f26523e || (fv3Var = this.f26522d) == null) {
            n1.k("LastMileDelivery not connected");
        } else {
            fv3Var.b(m(), this.f26524f);
            h("onLMDOverlayExpand");
        }
    }

    public final void e() {
        fv3 fv3Var;
        if (!this.f26523e || (fv3Var = this.f26522d) == null) {
            n1.k("LastMileDelivery not connected");
        } else {
            fv3Var.d(m(), this.f26524f);
            h("onLMDOverlayCollapse");
        }
    }

    public final void f() {
        fv3 fv3Var;
        if (!this.f26523e || (fv3Var = this.f26522d) == null) {
            n1.k("LastMileDelivery not connected");
            return;
        }
        dv3 c8 = ev3.c();
        if (!((Boolean) s2.b0.c().d(uy.zc)).booleanValue() || TextUtils.isEmpty(this.f26520b)) {
            String str = this.f26519a;
            if (str != null) {
                c8.a(str);
            } else {
                g("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c8.b(this.f26520b);
        }
        fv3Var.c(c8.c(), this.f26524f);
    }

    final void g(String str, String str2) {
        n1.k(str);
        if (this.f26521c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            i("onError", hashMap);
        }
    }

    final void h(String str) {
        i(str, new HashMap());
    }

    final void i(final String str, final Map map) {
        cm0.f6505f.execute(new Runnable() { // from class: u2.j0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                k0.this.k(str, map);
            }
        });
    }

    final void j(cw3 cw3Var) {
        if (!TextUtils.isEmpty(cw3Var.b())) {
            if (!((Boolean) s2.b0.c().d(uy.zc)).booleanValue()) {
                this.f26519a = cw3Var.b();
            }
        }
        switch (cw3Var.a()) {
            case 8152:
                h("onLMDOverlayOpened");
                break;
            case 8153:
                h("onLMDOverlayClicked");
                break;
            case 8155:
                h("onLMDOverlayClose");
                break;
            case 8157:
                this.f26519a = null;
                this.f26520b = null;
                this.f26523e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(cw3Var.a()));
                i("onLMDOverlayFailedToOpen", hashMap);
                break;
        }
    }

    final /* synthetic */ void k(String str, Map map) {
        mr0 mr0Var = this.f26521c;
        if (mr0Var != null) {
            mr0Var.B(str, map);
        }
    }
}
