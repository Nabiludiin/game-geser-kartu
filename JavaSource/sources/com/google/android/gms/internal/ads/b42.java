package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class b42 {

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f5552q = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    private final gu0 f5553a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5554b;

    /* renamed from: c, reason: collision with root package name */
    private final w2.a f5555c;

    /* renamed from: d, reason: collision with root package name */
    private final w03 f5556d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f5557e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f5558f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5559g;

    /* renamed from: h, reason: collision with root package name */
    private final b63 f5560h;

    /* renamed from: i, reason: collision with root package name */
    private final lx1 f5561i;

    /* renamed from: j, reason: collision with root package name */
    private final x73 f5562j;

    /* renamed from: k, reason: collision with root package name */
    private final hd1 f5563k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f5564l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private String f5565m;

    /* renamed from: n, reason: collision with root package name */
    private List f5566n;

    /* renamed from: o, reason: collision with root package name */
    private Bundle f5567o;

    /* renamed from: p, reason: collision with root package name */
    private final mh0 f5568p;

    b42(gu0 gu0Var, Context context, w2.a aVar, w03 w03Var, Executor executor, String str, b63 b63Var, lx1 lx1Var, mh0 mh0Var, b72 b72Var, ScheduledExecutorService scheduledExecutorService, x73 x73Var, hd1 hd1Var) {
        this.f5553a = gu0Var;
        this.f5554b = context;
        this.f5555c = aVar;
        this.f5556d = w03Var;
        this.f5557e = executor;
        this.f5559g = str;
        this.f5560h = b63Var;
        gu0Var.c();
        this.f5561i = lx1Var;
        this.f5568p = mh0Var;
        this.f5558f = scheduledExecutorService;
        this.f5562j = x73Var;
        this.f5563k = hd1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final a5.d g(java.lang.String r18, final java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b42.g(java.lang.String, java.lang.String):a5.d");
    }

    private final void h(yw1 yw1Var) {
        Bundle e8 = this.f5561i.e();
        if (((Boolean) s2.b0.c().d(uy.K7)).booleanValue()) {
            e8.putLong(yw1Var.c(), r2.t.o().a());
        }
    }

    private final String i(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f5559g));
            }
            return jSONObject.toString();
        } catch (JSONException e8) {
            String concat = "Failed to update the ad types for rendering. ".concat(e8.toString());
            int i7 = v2.n1.f26802b;
            w2.p.f(concat);
            return str;
        }
    }

    private static final String j(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0232, code lost:
    
        if (r5.e(r1, r2, r4) == false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f0 A[Catch: all -> 0x00e4, TryCatch #4 {all -> 0x00e4, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fd, B:34:0x0109, B:36:0x0111, B:37:0x0117, B:41:0x0120, B:44:0x015a, B:47:0x0134, B:50:0x0145, B:52:0x015f, B:55:0x00e7, B:57:0x0173, B:60:0x0190, B:64:0x0198, B:66:0x01ba, B:68:0x01cf, B:70:0x01f0, B:71:0x0205, B:74:0x0219, B:76:0x021f, B:77:0x022c, B:79:0x022e, B:81:0x0237, B:86:0x0234, B:87:0x01fa, B:88:0x01e2, B:91:0x01a6, B:94:0x0180, B:95:0x0185), top: B:21:0x0080, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021f A[Catch: all -> 0x00e4, TryCatch #4 {all -> 0x00e4, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fd, B:34:0x0109, B:36:0x0111, B:37:0x0117, B:41:0x0120, B:44:0x015a, B:47:0x0134, B:50:0x0145, B:52:0x015f, B:55:0x00e7, B:57:0x0173, B:60:0x0190, B:64:0x0198, B:66:0x01ba, B:68:0x01cf, B:70:0x01f0, B:71:0x0205, B:74:0x0219, B:76:0x021f, B:77:0x022c, B:79:0x022e, B:81:0x0237, B:86:0x0234, B:87:0x01fa, B:88:0x01e2, B:91:0x01a6, B:94:0x0180, B:95:0x0185), top: B:21:0x0080, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022e A[Catch: all -> 0x00e4, TryCatch #4 {all -> 0x00e4, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fd, B:34:0x0109, B:36:0x0111, B:37:0x0117, B:41:0x0120, B:44:0x015a, B:47:0x0134, B:50:0x0145, B:52:0x015f, B:55:0x00e7, B:57:0x0173, B:60:0x0190, B:64:0x0198, B:66:0x01ba, B:68:0x01cf, B:70:0x01f0, B:71:0x0205, B:74:0x0219, B:76:0x021f, B:77:0x022c, B:79:0x022e, B:81:0x0237, B:86:0x0234, B:87:0x01fa, B:88:0x01e2, B:91:0x01a6, B:94:0x0180, B:95:0x0185), top: B:21:0x0080, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fa A[Catch: all -> 0x00e4, TryCatch #4 {all -> 0x00e4, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fd, B:34:0x0109, B:36:0x0111, B:37:0x0117, B:41:0x0120, B:44:0x015a, B:47:0x0134, B:50:0x0145, B:52:0x015f, B:55:0x00e7, B:57:0x0173, B:60:0x0190, B:64:0x0198, B:66:0x01ba, B:68:0x01cf, B:70:0x01f0, B:71:0x0205, B:74:0x0219, B:76:0x021f, B:77:0x022c, B:79:0x022e, B:81:0x0237, B:86:0x0234, B:87:0x01fa, B:88:0x01e2, B:91:0x01a6, B:94:0x0180, B:95:0x0185), top: B:21:0x0080, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a5.d a() {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b42.a():a5.d");
    }

    final /* synthetic */ a5.d b(fa0 fa0Var, JSONObject jSONObject) {
        if (((Boolean) s2.b0.c().d(uy.f17240x2)).booleanValue()) {
            this.f5561i.e().putLong(yw1.SCAR_PRELOADER_PROCESSING_DONE.c(), r2.t.o().a());
        }
        return fa0Var.b(jSONObject);
    }

    final /* synthetic */ a5.d c(JSONObject jSONObject) {
        l03 l03Var = new l03(this.f5556d);
        String jSONObject2 = jSONObject.toString();
        return p64.a(new o03(l03Var, n03.a(new StringReader(jSONObject2), this.f5567o)));
    }

    final /* synthetic */ String d(y62 y62Var) {
        h(yw1.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i7 = 0;
        int i8 = -1;
        while (true) {
            try {
                if (i7 >= ((Integer) s2.b0.c().d(uy.J7)).intValue()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i8);
                    throw new ce2(1, sb.toString());
                }
                z62 d8 = new a72(this.f5554b, this.f5555c.f27051q, this.f5568p, Binder.getCallingUid(), null).d(y62Var);
                int i9 = d8.f20027a;
                if (((Boolean) s2.b0.c().d(uy.K7)).booleanValue()) {
                    this.f5561i.d("fr", String.valueOf(i7));
                }
                if (i9 == 200) {
                    h(yw1.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return d8.f20029c;
                }
                i7++;
                i8 = i9;
            } catch (Exception e8) {
                throw new ce2(1, e8.getMessage() == null ? "Fetch failed." : e8.getMessage(), e8);
            }
        }
    }

    final /* synthetic */ a5.d e(List list, Exception exc) {
        ce2 ce2Var;
        r2.t.l().j(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            ce2Var = new ce2(1, "Timed out waiting for ad response.");
        } else if (exc instanceof ce2) {
            ce2Var = (ce2) exc;
        } else {
            ce2Var = new ce2(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = ce2Var.getMessage() == null ? "" : ce2Var.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List e8 = gy3.a(ex3.b(':')).e(message);
                    if (e8.size() == 2) {
                        message = (String) e8.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(t73.d(t73.d((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.f5562j.a(arrayList, null);
        }
        return p64.c(ce2Var);
    }

    final /* synthetic */ hd1 f() {
        return this.f5563k;
    }
}
