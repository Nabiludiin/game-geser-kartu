package v2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.a12;
import com.google.android.gms.internal.ads.b12;
import com.google.android.gms.internal.ads.uy;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final Object f26886a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private String f26887b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f26888c = "";

    /* renamed from: d, reason: collision with root package name */
    private boolean f26889d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26890e = false;

    /* renamed from: f, reason: collision with root package name */
    protected String f26891f = "";

    /* renamed from: g, reason: collision with root package name */
    private b12 f26892g;

    protected static final String o(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", r2.t.g().Q(context, str2));
        a5.d b8 = new n0(context).b(0, str, hashMap, null);
        try {
            return (String) b8.get(((Integer) s2.b0.c().d(uy.B5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            String valueOf = String.valueOf(str);
            int i7 = n1.f26802b;
            w2.p.d("Interrupted while retrieving a response from: ".concat(valueOf), e8);
            b8.cancel(true);
            return null;
        } catch (TimeoutException e9) {
            String valueOf2 = String.valueOf(str);
            int i8 = n1.f26802b;
            w2.p.d("Timeout while retrieving a response from: ".concat(valueOf2), e9);
            b8.cancel(true);
            return null;
        } catch (Exception e10) {
            String valueOf3 = String.valueOf(str);
            int i9 = n1.f26802b;
            w2.p.d("Error retrieving a response from: ".concat(valueOf3), e10);
            return null;
        }
    }

    private final Uri p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f26886a) {
            if (TextUtils.isEmpty(this.f26887b)) {
                r2.t.g();
                try {
                    str5 = new String(com.google.android.gms.common.util.l.d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    int i7 = n1.f26802b;
                    w2.p.a("Error reading from internal storage.");
                    str5 = "";
                }
                this.f26887b = str5;
                if (TextUtils.isEmpty(str5)) {
                    r2.t.g();
                    this.f26887b = UUID.randomUUID().toString();
                    r2.t.g();
                    String str6 = this.f26887b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e8) {
                        int i8 = n1.f26802b;
                        w2.p.d("Error writing to file in internal storage.", e8);
                    }
                }
            }
            str4 = this.f26887b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final void a(b12 b12Var) {
        this.f26892g = b12Var;
    }

    public final b12 b() {
        return this.f26892g;
    }

    public final void c(Context context) {
        b12 b12Var;
        if (!((Boolean) s2.b0.c().d(uy.ja)).booleanValue() || (b12Var = this.f26892g) == null) {
            return;
        }
        b12Var.p(new v(this, context), a12.DEBUG_MENU);
    }

    final boolean d(Context context, String str, String str2) {
        String o7 = o(context, p(context, (String) s2.b0.c().d(uy.f17251y5), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o7)) {
            int i7 = n1.f26802b;
            w2.p.a("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(o7.trim());
            String optString = jSONObject.optString("gct");
            this.f26891f = jSONObject.optString("status");
            if (((Boolean) s2.b0.c().d(uy.ja)).booleanValue()) {
                boolean z7 = "0".equals(this.f26891f) || "2".equals(this.f26891f);
                j(z7);
                p1 q7 = r2.t.l().q();
                if (!z7) {
                    str = "";
                }
                q7.v(str);
            }
            synchronized (this.f26886a) {
                this.f26888c = optString;
            }
            return true;
        } catch (JSONException e8) {
            int i8 = n1.f26802b;
            w2.p.g("Fail to get in app preview response json.", e8);
            return false;
        }
    }

    public final boolean e(Context context, String str, String str2) {
        String o7 = o(context, p(context, (String) s2.b0.c().d(uy.f17259z5), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o7)) {
            int i7 = n1.f26802b;
            w2.p.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(o7.trim()).optString("debug_mode"));
            j(equals);
            if (((Boolean) s2.b0.c().d(uy.ja)).booleanValue()) {
                p1 q7 = r2.t.l().q();
                if (true != equals) {
                    str = "";
                }
                q7.v(str);
            }
            return equals;
        } catch (JSONException e8) {
            int i8 = n1.f26802b;
            w2.p.g("Fail to get debug mode response json.", e8);
            return false;
        }
    }

    public final void f(Context context, String str, String str2) {
        r2.t.g();
        f2.B(context, p(context, (String) s2.b0.c().d(uy.f17243x5), str, str2));
    }

    public final boolean g(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        int i7 = n1.f26802b;
        w2.p.a("Sending troubleshooting signals to the server.");
        h(context, str, str2, str3);
        return true;
    }

    public final void h(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = p(context, (String) s2.b0.c().d(uy.A5), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        r2.t.g();
        f2.p(context, str, buildUpon.build().toString());
    }

    public final String i() {
        String str;
        synchronized (this.f26886a) {
            str = this.f26888c;
        }
        return str;
    }

    public final void j(boolean z7) {
        synchronized (this.f26886a) {
            try {
                this.f26890e = z7;
                if (((Boolean) s2.b0.c().d(uy.ja)).booleanValue()) {
                    r2.t.l().q().z0(z7);
                    b12 b12Var = this.f26892g;
                    if (b12Var != null) {
                        b12Var.c(z7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        boolean z7;
        synchronized (this.f26886a) {
            z7 = this.f26890e;
        }
        return z7;
    }

    public final void l(boolean z7) {
        synchronized (this.f26886a) {
            this.f26889d = z7;
        }
    }

    public final boolean m() {
        boolean z7;
        synchronized (this.f26886a) {
            z7 = this.f26889d;
        }
        return z7;
    }

    protected final void n(Context context, String str, boolean z7, boolean z8) {
        if (context instanceof Activity) {
            f2.f26746l.post(new x(this, context, str, z7, z8));
        } else {
            int i7 = n1.f26802b;
            w2.p.e("Can not create dialog without Activity Context");
        }
    }
}
