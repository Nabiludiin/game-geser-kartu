package b3;

import com.google.android.gms.internal.ads.b10;
import com.google.android.gms.internal.ads.g00;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class s0 extends e3.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f3345a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f3346b;

    s0(a aVar, String str) {
        this.f3345a = str;
        Objects.requireNonNull(aVar);
        this.f3346b = aVar;
    }

    @Override // e3.b
    public final void a(String str) {
        int i7 = v2.n1.f26802b;
        w2.p.f("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String concat = ((Boolean) b10.f5453c.e()).booleanValue() ? ",\"as\":".concat(this.f3346b.e().b().toString()) : "";
        String str2 = this.f3345a;
        Locale locale = Locale.getDefault();
        g00 g00Var = b10.f5455e;
        final String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) g00Var.e()).booleanValue() ? ((Long) b10.f5458h.e()).longValue() : 0L), concat);
        if (((Boolean) g00Var.e()).booleanValue()) {
            try {
                this.f3346b.d().execute(new Runnable() { // from class: b3.q0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        s0.this.f3346b.c().evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e8) {
                r2.t.l().j(e8, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.f3346b.c().evaluateJavascript(format, null);
        }
        if (((Boolean) b10.f5453c.e()).booleanValue() && ((Boolean) b10.f5454d.e()).booleanValue()) {
            this.f3346b.f().b();
        }
    }

    @Override // e3.b
    public final void b(e3.a aVar) {
        final String format;
        String b8 = aVar.b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f3345a);
            if (((Boolean) b10.f5453c.e()).booleanValue()) {
                jSONObject.put("as", this.f3346b.e().b());
            }
            jSONObject.put("sdk_ttl_ms", ((Boolean) b10.f5455e.e()).booleanValue() ? ((Long) b10.f5458h.e()).longValue() : 0L);
            jSONObject.put("signal", b8);
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String concat = ((Boolean) b10.f5453c.e()).booleanValue() ? ",\"as\":".concat(this.f3346b.e().b().toString()) : "";
            format = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f3345a, aVar.b(), Long.valueOf(((Boolean) b10.f5455e.e()).booleanValue() ? ((Long) b10.f5458h.e()).longValue() : 0L), concat);
        }
        if (((Boolean) b10.f5455e.e()).booleanValue()) {
            try {
                this.f3346b.d().execute(new Runnable() { // from class: b3.r0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        s0.this.f3346b.c().evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e8) {
                r2.t.l().j(e8, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.f3346b.c().evaluateJavascript(format, null);
        }
        if (((Boolean) b10.f5453c.e()).booleanValue() && ((Boolean) b10.f5454d.e()).booleanValue()) {
            this.f3346b.f().b();
        }
    }
}
