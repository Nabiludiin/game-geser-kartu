package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
public final class hz1 extends c70 {

    /* renamed from: q, reason: collision with root package name */
    private final mz1 f9767q;

    /* renamed from: r, reason: collision with root package name */
    private final fz1 f9768r;

    /* renamed from: s, reason: collision with root package name */
    private final Map f9769s = new HashMap();

    hz1(mz1 mz1Var, fz1 fz1Var) {
        this.f9767q = mz1Var;
        this.f9768r = fz1Var;
    }

    private static s2.b5 j8(Map map) {
        s2.c5 c5Var = new s2.c5();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return c5Var.a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (!nextName.equals("extras")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            jsonReader.beginObject();
                            Bundle bundle = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            c5Var.b(bundle);
                            break;
                        }
                    case -839117230:
                        if (!nextName.equals("isTestDevice")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            c5Var.d(jsonReader.nextBoolean());
                            break;
                        }
                    case -733436947:
                        if (!nextName.equals("tagForUnderAgeOfConsent")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!jsonReader.nextBoolean()) {
                            c5Var.f(0);
                            break;
                        } else {
                            c5Var.f(1);
                            break;
                        }
                    case -99890337:
                        if (!nextName.equals("httpTimeoutMillis")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            c5Var.h(jsonReader.nextInt());
                            break;
                        }
                    case 523149226:
                        if (!nextName.equals("keywords")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            jsonReader.beginArray();
                            ArrayList arrayList = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            c5Var.c(arrayList);
                            break;
                        }
                    case 597632527:
                        if (!nextName.equals("maxAdContentRating")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            String nextString = jsonReader.nextString();
                            if (!k2.t.f24428f.contains(nextString)) {
                                break;
                            } else {
                                c5Var.g(nextString);
                                break;
                            }
                        }
                    case 1411582723:
                        if (!nextName.equals("tagForChildDirectedTreatment")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!jsonReader.nextBoolean()) {
                            c5Var.e(0);
                            break;
                        } else {
                            c5Var.e(1);
                            break;
                        }
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i7 = v2.n1.f26802b;
            w2.p.a("Ad Request json was malformed, parsing ended early.");
        }
        s2.b5 a8 = c5Var.a();
        Bundle bundle2 = a8.C;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = a8.f26058s;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new s2.b5(a8.f26056q, a8.f26057r, bundle3, a8.f26059t, a8.f26060u, a8.f26061v, a8.f26062w, a8.f26063x, a8.f26064y, a8.f26065z, a8.A, a8.B, bundle2, a8.D, a8.E, a8.F, a8.G, a8.H, a8.I, a8.J, a8.K, a8.L, a8.M, a8.N, a8.O, a8.P, a8.Q);
    }

    @Override // com.google.android.gms.internal.ads.e70
    public final void e() {
        this.f9769s.clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.e70
    public final void y(String str) {
        if (((Boolean) s2.b0.c().d(uy.Wa)).booleanValue()) {
            v2.n1.k("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri parse = Uri.parse(str);
            r2.t.g();
            Map u7 = v2.f2.u(parse);
            String str2 = (String) u7.get("action");
            if (TextUtils.isEmpty(str2)) {
                w2.p.a("H5 gmsg did not contain an action");
                return;
            }
            int hashCode = str2.hashCode();
            if (hashCode != 579053441) {
                if (hashCode == 871091088 && str2.equals("initialize")) {
                    this.f9769s.clear();
                    this.f9768r.a();
                    return;
                }
            } else if (str2.equals("dispose_all")) {
                Map map = this.f9769s;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((bz1) it.next()).d();
                }
                map.clear();
                return;
            }
            String str3 = (String) u7.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long parseLong = Long.parseLong(str3);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            bz1 bz1Var = (bz1) this.f9769s.get(Long.valueOf(parseLong));
                            if (bz1Var != null) {
                                bz1Var.b();
                                return;
                            } else {
                                w2.p.a("Could not show H5 ad, object ID does not exist");
                                this.f9768r.d(parseLong);
                                return;
                            }
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            bz1 bz1Var2 = (bz1) this.f9769s.get(Long.valueOf(parseLong));
                            if (bz1Var2 != null) {
                                bz1Var2.b();
                                return;
                            } else {
                                w2.p.a("Could not show H5 ad, object ID does not exist");
                                this.f9768r.j(parseLong);
                                return;
                            }
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            bz1 bz1Var3 = (bz1) this.f9769s.get(Long.valueOf(parseLong));
                            if (bz1Var3 != null) {
                                bz1Var3.a(j8(u7));
                                return;
                            } else {
                                w2.p.a("Could not load H5 ad, object ID does not exist");
                                this.f9768r.j(parseLong);
                                return;
                            }
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            Map map2 = this.f9769s;
                            if (map2.size() >= ((Integer) s2.b0.c().d(uy.Xa)).intValue()) {
                                w2.p.f("Could not create H5 ad, too many existing objects");
                                this.f9768r.c(parseLong);
                                return;
                            }
                            Long valueOf = Long.valueOf(parseLong);
                            if (map2.containsKey(valueOf)) {
                                w2.p.a("Could not create H5 ad, object ID already exists");
                                this.f9768r.c(parseLong);
                                return;
                            }
                            String str4 = (String) u7.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                w2.p.f("Could not create H5 ad, missing ad unit id");
                                this.f9768r.c(parseLong);
                                return;
                            }
                            cz1 d8 = this.f9767q.d();
                            d8.c(parseLong);
                            d8.v(str4);
                            map2.put(valueOf, d8.a().a());
                            this.f9768r.b(parseLong);
                            StringBuilder sb = new StringBuilder(String.valueOf(parseLong).length() + 39 + String.valueOf(str4).length());
                            sb.append("Created H5 interstitial #");
                            sb.append(parseLong);
                            sb.append(" with ad unit ");
                            sb.append(str4);
                            v2.n1.k(sb.toString());
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            bz1 bz1Var4 = (bz1) this.f9769s.get(Long.valueOf(parseLong));
                            if (bz1Var4 != null) {
                                bz1Var4.a(j8(u7));
                                return;
                            } else {
                                w2.p.a("Could not load H5 ad, object ID does not exist");
                                this.f9768r.d(parseLong);
                                return;
                            }
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Map map3 = this.f9769s;
                            Long valueOf2 = Long.valueOf(parseLong);
                            bz1 bz1Var5 = (bz1) map3.get(valueOf2);
                            if (bz1Var5 == null) {
                                w2.p.a("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            bz1Var5.d();
                            map3.remove(valueOf2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(parseLong).length() + 16);
                            sb2.append("Disposed H5 ad #");
                            sb2.append(parseLong);
                            v2.n1.k(sb2.toString());
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            Map map4 = this.f9769s;
                            if (map4.size() >= ((Integer) s2.b0.c().d(uy.Xa)).intValue()) {
                                w2.p.f("Could not create H5 ad, too many existing objects");
                                this.f9768r.c(parseLong);
                                return;
                            }
                            Long valueOf3 = Long.valueOf(parseLong);
                            if (map4.containsKey(valueOf3)) {
                                w2.p.a("Could not create H5 ad, object ID already exists");
                                this.f9768r.c(parseLong);
                                return;
                            }
                            String str5 = (String) u7.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                w2.p.f("Could not create H5 ad, missing ad unit id");
                                this.f9768r.c(parseLong);
                                return;
                            }
                            cz1 d9 = this.f9767q.d();
                            d9.c(parseLong);
                            d9.v(str5);
                            map4.put(valueOf3, d9.a().b());
                            this.f9768r.b(parseLong);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(parseLong).length() + 35 + String.valueOf(str5).length());
                            sb3.append("Created H5 rewarded #");
                            sb3.append(parseLong);
                            sb3.append(" with ad unit ");
                            sb3.append(str5);
                            v2.n1.k(sb3.toString());
                            return;
                        }
                        break;
                }
                w2.p.a("H5 gmsg contained invalid action: ".concat(str2));
            } catch (NullPointerException | NumberFormatException unused) {
                w2.p.a("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }
}
