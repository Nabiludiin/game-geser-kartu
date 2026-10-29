package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class q40 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f14240a = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f14241b = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                int i7 = v2.n1.f26802b;
                w2.p.f("No label given for CSI tick.");
                return;
            }
            ly lyVar = uy.f17192r2;
            if (((Boolean) s2.b0.c().d(lyVar)).booleanValue() && !f14240a.matcher(str2).matches()) {
                int i8 = v2.n1.f26802b;
                w2.p.a("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                int i9 = v2.n1.f26802b;
                w2.p.f("No timestamp given for CSI tick.");
                return;
            }
            try {
                long b8 = r2.t.o().b() + (Long.parseLong(str4) - r2.t.o().a());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                if (!((Boolean) s2.b0.c().d(lyVar)).booleanValue() || f14240a.matcher(str3).matches()) {
                    mr0Var.m().b(str2, str3, b8);
                    return;
                } else {
                    int i10 = v2.n1.f26802b;
                    w2.p.a("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            } catch (NumberFormatException e8) {
                int i11 = v2.n1.f26802b;
                w2.p.g("Malformed timestamp for CSI tick.", e8);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                int i12 = v2.n1.f26802b;
                w2.p.f("No value given for CSI experiment.");
                return;
            }
            if (!((Boolean) s2.b0.c().d(uy.f17192r2)).booleanValue() || f14241b.matcher(str5).matches()) {
                mr0Var.m().c().d("e", str5);
                return;
            } else {
                int i13 = v2.n1.f26802b;
                w2.p.a("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                int i14 = v2.n1.f26802b;
                w2.p.f("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                int i15 = v2.n1.f26802b;
                w2.p.f("No name given for CSI extra.");
                return;
            }
            if (!((Boolean) s2.b0.c().d(uy.f17192r2)).booleanValue() || f14240a.matcher(str6).matches()) {
                mr0Var.m().c().d(str6, str7);
            } else {
                int i16 = v2.n1.f26802b;
                w2.p.a("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            }
        }
    }
}
