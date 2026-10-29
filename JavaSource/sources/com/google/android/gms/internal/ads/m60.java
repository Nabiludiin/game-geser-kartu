package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
public final class m60 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final r2.b f12083a;

    /* renamed from: b, reason: collision with root package name */
    private final rx1 f12084b;

    /* renamed from: d, reason: collision with root package name */
    private final ge0 f12086d;

    /* renamed from: e, reason: collision with root package name */
    private final v82 f12087e;

    /* renamed from: f, reason: collision with root package name */
    private final d01 f12088f;

    /* renamed from: g, reason: collision with root package name */
    private final u81 f12089g;

    /* renamed from: c, reason: collision with root package name */
    private w2.v f12085c = null;

    /* renamed from: h, reason: collision with root package name */
    private u2.b f12090h = null;

    /* renamed from: i, reason: collision with root package name */
    private final z64 f12091i = cm0.f6506g;

    public m60(r2.b bVar, ge0 ge0Var, v82 v82Var, rx1 rx1Var, d01 d01Var, u81 u81Var) {
        this.f12083a = bVar;
        this.f12086d = ge0Var;
        this.f12087e = v82Var;
        this.f12084b = rx1Var;
        this.f12088f = d01Var;
        this.f12089g = u81Var;
    }

    public static boolean b(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int c(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri d(Context context, fn fnVar, Uri uri, View view, Activity activity, a13 a13Var) {
        if (fnVar != null) {
            try {
                if (!((Boolean) s2.b0.c().d(uy.Zc)).booleanValue() || a13Var == null) {
                    if (fnVar.e(uri)) {
                        return fnVar.d(uri, context, view, activity);
                    }
                } else if (fnVar.e(uri)) {
                    return a13Var.a(uri, context, view, activity);
                }
            } catch (gn unused) {
            } catch (Exception e8) {
                r2.t.l().i(e8, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    static Uri e(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e8) {
            String valueOf = String.valueOf(uri.toString());
            int i7 = v2.n1.f26802b;
            w2.p.d("Error adding click uptime parameter to url: ".concat(valueOf), e8);
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void f(String str, s2.a aVar, Map map, String str2) {
        String str3;
        boolean z7;
        u81 u81Var;
        mr0 mr0Var = (mr0) aVar;
        c03 T = mr0Var.T();
        f03 t02 = mr0Var.t0();
        boolean z8 = false;
        if (T == null || t02 == null) {
            str3 = "";
            z7 = false;
        } else {
            str3 = t02.f7926b;
            z7 = T.b();
        }
        boolean z9 = (((Boolean) s2.b0.c().d(uy.Lb)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z10 = ((Boolean) s2.b0.c().d(uy.Nd)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (mr0Var.W()) {
                int i7 = v2.n1.f26802b;
                w2.p.f("Cannot expand WebView that is already expanded.");
                return;
            } else {
                l(false);
                ((gt0) aVar).v(b(map), c(map), z9);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            l(false);
            boolean z11 = ((Boolean) s2.b0.c().d(uy.Vc)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((gt0) aVar).y(b(map), c(map), str, z9, z11);
                return;
            } else {
                ((gt0) aVar).d(b(map), c(map), (String) map.get("html"), (String) map.get("baseurl"), z9);
                return;
            }
        }
        Intent intent = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = mr0Var.getContext();
            if (((Boolean) s2.b0.c().d(uy.f17171o5)).booleanValue()) {
                v2.n1.k("User opt out chrome custom tab.");
                g(10);
            } else {
                if (((Boolean) s2.b0.c().d(uy.f17123i5)).booleanValue()) {
                    String c8 = androidx.browser.customtabs.c.c(context, null);
                    if (c8 != null && !context.getPackageName().equals(c8)) {
                        z8 = true;
                    }
                } else {
                    z8 = wz.a(context);
                }
                if (z8) {
                    boolean z12 = z10;
                    boolean z13 = z9;
                    String str4 = str3;
                    l(true);
                    if (TextUtils.isEmpty(str)) {
                        int i8 = v2.n1.f26802b;
                        w2.p.f("Cannot open browser with null or empty url");
                        g(7);
                        return;
                    }
                    Uri e8 = e(d(mr0Var.getContext(), mr0Var.P(), Uri.parse(str), mr0Var.Z(), mr0Var.i(), mr0Var.C0()));
                    if (z7 && this.f12087e != null && i(aVar, mr0Var.getContext(), e8.toString(), str4)) {
                        return;
                    }
                    this.f12090h = new j60(this);
                    gt0 gt0Var = (gt0) aVar;
                    String uri = e8.toString();
                    u2.b bVar = this.f12090h;
                    Bundle bundle = new Bundle();
                    if (((Boolean) s2.b0.c().d(uy.f17163n5)).booleanValue()) {
                        if (map.containsKey("cct_init_h")) {
                            try {
                                bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                            } catch (NumberFormatException e9) {
                                v2.n1.l("Invalid cct initial height parameter.", e9);
                                r2.t.l().i(e9, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                        if (map.containsKey("cct_bp")) {
                            try {
                                bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                            } catch (NumberFormatException e10) {
                                v2.n1.l("Invalid cct close button position parameter.", e10);
                                r2.t.l().i(e10, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                    }
                    gt0Var.C(new u2.m(null, uri, null, null, null, null, null, null, w3.b.C1(bVar).asBinder(), true, bundle), z13, z12, str4);
                    return;
                }
                g(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            k(aVar, map, z7, str3, z9, z10);
            return;
        }
        boolean z14 = z10;
        boolean z15 = z9;
        String str5 = str3;
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            k(aVar, map, z7, str5, z15, z14);
            return;
        }
        boolean z16 = z7;
        s2.a aVar2 = aVar;
        Map map2 = map;
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) s2.b0.c().d(uy.e9)).booleanValue()) {
                l(true);
                String str6 = (String) map2.get("p");
                if (str6 == null) {
                    int i9 = v2.n1.f26802b;
                    w2.p.f("Package name missing from open app action.");
                    return;
                }
                if (z16 && this.f12087e != null && i(aVar2, mr0Var.getContext(), str6, str5)) {
                    return;
                }
                PackageManager packageManager = mr0Var.getContext().getPackageManager();
                if (packageManager == null) {
                    int i10 = v2.n1.f26802b;
                    w2.p.f("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                    if (launchIntentForPackage != null) {
                        ((gt0) aVar2).C(new u2.m(launchIntentForPackage, this.f12090h), z15, z14, str5);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        l(true);
        String str7 = (String) map2.get("intent_url");
        if (!TextUtils.isEmpty(str7)) {
            try {
                intent = Intent.parseUri(str7, 0);
            } catch (URISyntaxException e11) {
                String valueOf = String.valueOf(str7);
                int i11 = v2.n1.f26802b;
                w2.p.d("Error parsing the url: ".concat(valueOf), e11);
            }
        }
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri e12 = e(d(mr0Var.getContext(), mr0Var.P(), data, mr0Var.Z(), mr0Var.i(), mr0Var.C0()));
                if (!TextUtils.isEmpty(intent.getType())) {
                    if (((Boolean) s2.b0.c().d(uy.f9)).booleanValue()) {
                        intent.setDataAndType(e12, intent.getType());
                    }
                }
                intent.setData(e12);
            }
        }
        boolean z17 = ((Boolean) s2.b0.c().d(uy.A9)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
        if (((Boolean) s2.b0.c().d(uy.Sd)).booleanValue() && (u81Var = this.f12089g) != null) {
            u81Var.a();
        }
        HashMap hashMap = new HashMap();
        if (z17) {
            k60 k60Var = new k60(this, z15, aVar2, hashMap, map2);
            aVar2 = aVar2;
            map2 = map2;
            this.f12090h = k60Var;
        } else {
            z8 = z15;
        }
        if (intent != null) {
            if (!z16 || this.f12087e == null || !i(aVar2, mr0Var.getContext(), intent.getData().toString(), str5)) {
                ((gt0) aVar2).C(new u2.m(intent, this.f12090h), z8, z14, str5);
                return;
            } else {
                if (z17) {
                    hashMap.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((q80) aVar2).B("openIntentAsync", hashMap);
                    return;
                }
                return;
            }
        }
        String uri2 = !TextUtils.isEmpty(str) ? e(d(mr0Var.getContext(), mr0Var.P(), Uri.parse(str), mr0Var.Z(), mr0Var.i(), mr0Var.C0())).toString() : str;
        if (!z16 || this.f12087e == null || !i(aVar2, mr0Var.getContext(), uri2, str5)) {
            ((gt0) aVar2).C(new u2.m((String) map2.get("i"), uri2, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.f12090h), z8, z14, str5);
        } else if (z17) {
            hashMap.put((String) map2.get("event_id"), Boolean.TRUE);
            ((q80) aVar2).B("openIntentAsync", hashMap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.u9)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.p9)).booleanValue() : ((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.o9)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean i(s2.a r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m60.i(s2.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void j(Context context, String str, String str2) {
        v82 v82Var = this.f12087e;
        v82Var.g(str);
        rx1 rx1Var = this.f12084b;
        if (rx1Var != null) {
            i92.m8(context, rx1Var, v82Var, str, "dialog_not_shown", z04.b("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        if (com.google.android.gms.internal.ads.l60.b(r13, r8, r9, r10, r11) == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014b, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(s2.a r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m60.k(s2.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void l(boolean z7) {
        ge0 ge0Var = this.f12086d;
        if (ge0Var != null) {
            ge0Var.i(z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void g(int i7) {
        rx1 rx1Var;
        String str;
        if (!((Boolean) s2.b0.c().d(uy.f17114h5)).booleanValue() || (rx1Var = this.f12084b) == null) {
            return;
        }
        qx1 a8 = rx1Var.a();
        a8.c("action", "cct_action");
        switch (i7) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        a8.c("cct_open_status", str);
        a8.d();
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        d01 d01Var;
        s2.a aVar = (s2.a) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        mr0 mr0Var = (mr0) aVar;
        if (mr0Var.T() != null) {
            hashMap = mr0Var.T().f6195w0;
        }
        String a8 = lk0.a(str, mr0Var.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Action missing from an open GMSG.");
            return;
        }
        r2.b bVar = this.f12083a;
        if (bVar == null || bVar.b()) {
            p64.r((((Boolean) s2.b0.c().d(uy.cb)).booleanValue() && (d01Var = this.f12088f) != null && d01.c(a8)) ? d01Var.b(a8, s2.z.e()) : p64.a(a8), new i60(this, map, aVar, str2), this.f12091i);
        } else {
            bVar.c(a8);
        }
    }
}
