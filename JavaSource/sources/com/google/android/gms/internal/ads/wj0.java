package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* compiled from: MyApplication */
public final class wj0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18262a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f18263b;

    /* renamed from: c, reason: collision with root package name */
    private final v2.p1 f18264c;

    /* renamed from: d, reason: collision with root package name */
    private String f18265d = "-1";

    /* renamed from: e, reason: collision with root package name */
    private int f18266e = -1;

    wj0(Context context, v2.p1 p1Var) {
        this.f18263b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f18264c = p1Var;
        this.f18262a = context;
    }

    private final void b(String str, int i7) {
        Context context;
        boolean z7 = true;
        if (!((Boolean) s2.b0.c().d(uy.Q0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i7 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z7 = false;
        }
        this.f18264c.x0(z7);
        if (((Boolean) s2.b0.c().d(uy.L6)).booleanValue() && z7 && (context = this.f18262a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    private final void c() {
        this.f18264c.x0(true);
        v2.d.a(this.f18262a);
    }

    final void a() {
        SharedPreferences sharedPreferences = this.f18263b;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) s2.b0.c().d(uy.S0)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (((Boolean) s2.b0.c().d(uy.S0)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i7 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    v2.p1 p1Var = this.f18264c;
                    if (i7 != p1Var.Q()) {
                        c();
                    }
                    p1Var.b(i7);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    v2.p1 p1Var2 = this.f18264c;
                    if (!Objects.equals(string, p1Var2.J())) {
                        c();
                    }
                    p1Var2.a(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i8 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String valueOf = String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode == -2004976699) {
                if (!valueOf.equals("IABTCF_PurposeConsents") || string2.equals("-1") || this.f18265d.equals(string2)) {
                    return;
                }
                this.f18265d = string2;
                b(string2, i8);
                return;
            }
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) s2.b0.c().d(uy.Q0)).booleanValue() || i8 == -1 || this.f18266e == i8) {
                    return;
                }
                this.f18266e = i8;
                b(string2, i8);
            }
        } catch (Throwable th) {
            r2.t.l().i(th, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            v2.n1.l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
