package p4;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class z0 implements y1 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f25542a;

    /* renamed from: b, reason: collision with root package name */
    private final u0 f25543b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f25544c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f25545d;

    /* renamed from: e, reason: collision with root package name */
    private final s2 f25546e;

    /* renamed from: f, reason: collision with root package name */
    private final p f25547f;

    /* renamed from: g, reason: collision with root package name */
    private final e0 f25548g;

    /* renamed from: h, reason: collision with root package name */
    private final r f25549h;

    z0(Application application, u0 u0Var, Handler handler, Executor executor, s2 s2Var, p pVar, e0 e0Var, r rVar) {
        this.f25542a = application;
        this.f25543b = u0Var;
        this.f25544c = handler;
        this.f25545d = executor;
        this.f25546e = s2Var;
        this.f25547f = pVar;
        this.f25548g = e0Var;
        this.f25549h = rVar;
    }

    public static /* synthetic */ void b(z0 z0Var) {
        String concat;
        JSONObject jSONObject = new JSONObject();
        Application application = z0Var.f25542a;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                concat = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                concat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", concat);
            JSONObject jSONObject2 = new JSONObject();
            r rVar = z0Var.f25549h;
            for (String str : rVar.b().keySet()) {
                jSONObject2.put(str, rVar.b().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        z0Var.f25548g.d().d("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    private final void g(JSONObject jSONObject) {
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString)));
        }
        try {
            this.f25543b.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e8) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString)), e8);
        }
    }

    @Override // p4.y1
    public final Executor a() {
        final Handler handler = this.f25544c;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: p4.w0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r3.equals("non_personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r3.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r3.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3.equals("personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r3.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p4.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.String r3, org.json.JSONObject r4) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -1370505102: goto L82;
                case -278739366: goto L76;
                case 150940456: goto L6a;
                case 1671672458: goto La;
                default: goto L8;
            }
        L8:
            goto L90
        La:
            java.lang.String r0 = "dismiss"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L90
            java.lang.String r3 = "status"
            java.lang.String r3 = r4.optString(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -954325659: goto L4e;
                case -258041904: goto L45;
                case 429411856: goto L3c;
                case 467888915: goto L33;
                case 1666911234: goto L2a;
                case 1725474845: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L5d
        L20:
            java.lang.String r4 = "CONSENT_SIGNAL_NOT_REQUIRED"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5d
            r3 = r1
            goto L57
        L2a:
            java.lang.String r4 = "non_personalized"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5d
            goto L56
        L33:
            java.lang.String r4 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5d
            goto L56
        L3c:
            java.lang.String r4 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5d
            goto L56
        L45:
            java.lang.String r4 = "personalized"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5d
            goto L56
        L4e:
            java.lang.String r4 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5d
        L56:
            r3 = 3
        L57:
            p4.e0 r4 = r2.f25548g
            r4.h(r3)
            goto L69
        L5d:
            p4.e0 r3 = r2.f25548g
            p4.u2 r4 = new p4.u2
            java.lang.String r0 = "We are getting something wrong with the webview."
            r4.<init>(r1, r0)
            r3.i(r4)
        L69:
            return r1
        L6a:
            java.lang.String r0 = "browser"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L90
            r2.g(r4)
            return r1
        L76:
            java.lang.String r4 = "configure_app_assets"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L90
            r2.d()
            return r1
        L82:
            java.lang.String r4 = "load_complete"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L90
            p4.e0 r3 = r2.f25548g
            r3.j()
            return r1
        L90:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.z0.c(java.lang.String, org.json.JSONObject):boolean");
    }

    public final void d() {
        this.f25545d.execute(new Runnable() { // from class: p4.y0
            @Override // java.lang.Runnable
            public final void run() {
                z0.b(z0.this);
            }
        });
    }

    final void e(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        this.f25546e.b(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.f25547f);
    }

    final void f(int i7, String str, String str2) {
        this.f25548g.k(new u2(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i7), str2, str)));
    }
}
