package b3;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.g63;
import com.google.android.gms.internal.ads.lx1;
import com.google.android.gms.internal.ads.o03;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.w03;
import com.google.android.gms.internal.ads.wx1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import s2.b5;

/* compiled from: MyApplication */
public abstract class c {
    public static boolean a(o03 o03Var) {
        return g(o03Var.f13136a.f11326a) != 1;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? "5" : str;
            case 1743582868:
                return str.equals("requester_type_6") ? "6" : str;
            case 1743582869:
                return str.equals("requester_type_7") ? "7" : str;
            case 1743582870:
                return str.equals("requester_type_8") ? "8" : str;
            default:
                return str;
        }
    }

    public static String c(b5 b5Var) {
        Bundle bundle;
        return (b5Var == null || (bundle = b5Var.f26058s) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static g63 d(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return g63.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    return g63.SCAR_REQUEST_TYPE_ADMOB;
                }
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    return g63.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                }
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    return g63.SCAR_REQUEST_TYPE_GBID;
                }
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    return g63.SCAR_REQUEST_TYPE_GOLDENEYE;
                }
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    return g63.SCAR_REQUEST_TYPE_YAVIN;
                }
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    return g63.SCAR_REQUEST_TYPE_UNITY;
                }
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    return g63.SCAR_REQUEST_TYPE_PAW;
                }
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    return g63.SCAR_REQUEST_TYPE_GUILDER;
                }
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    return g63.SCAR_REQUEST_TYPE_GAM_S2S;
                }
                break;
        }
        return g63.SCAR_REQUEST_TYPE_UNSPECIFIED;
    }

    public static void e(final wx1 wx1Var, lx1 lx1Var, final String str, final Pair... pairArr) {
        if (((Boolean) s2.b0.c().d(uy.w7)).booleanValue()) {
            final lx1 lx1Var2 = null;
            cm0.f6500a.execute(new Runnable(lx1Var2, str, pairArr) { // from class: b3.u1

                /* renamed from: r, reason: collision with root package name */
                private final /* synthetic */ String f3360r;

                /* renamed from: s, reason: collision with root package name */
                private final /* synthetic */ Pair[] f3361s;

                {
                    this.f3360r = str;
                    this.f3361s = pairArr;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    c.f(wx1.this, null, this.f3360r, this.f3361s);
                }
            });
        }
    }

    static /* synthetic */ void f(wx1 wx1Var, lx1 lx1Var, String str, Pair[] pairArr) {
        ConcurrentHashMap d8 = wx1Var.d();
        h(d8, "action", str);
        for (Pair pair : pairArr) {
            h(d8, (String) pair.first, (String) pair.second);
        }
        wx1Var.b(d8);
    }

    public static int g(w03 w03Var) {
        if (w03Var.f17973s) {
            return 2;
        }
        b5 b5Var = w03Var.f17958d;
        s2.y0 y0Var = b5Var.I;
        if (y0Var == null && b5Var.N == null) {
            return 1;
        }
        if (y0Var == null || b5Var.N == null) {
            return y0Var != null ? 3 : 4;
        }
        return 5;
    }

    private static void h(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
