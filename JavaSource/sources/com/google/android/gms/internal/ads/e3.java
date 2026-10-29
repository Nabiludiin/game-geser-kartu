package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class e3 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f7406c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f7407a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f7408b = -1;

    private final boolean c(String str) {
        Matcher matcher = f7406c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = hi2.f9535a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f7407a = parseInt;
            this.f7408b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a(le leVar) {
        w04 e8 = leVar.e(x5.class, d3.f6911q);
        int size = e8.size();
        int i7 = 0;
        while (i7 < size) {
            boolean c8 = c(((x5) e8.get(i7)).f18541d);
            i7++;
            if (c8) {
                return true;
            }
        }
        w04 e9 = leVar.e(f6.class, c3.f6234q);
        int size2 = e9.size();
        int i8 = 0;
        while (i8 < size2) {
            boolean c9 = c(((f6) e9.get(i8)).f8044d);
            i8++;
            if (c9) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        return (this.f7407a == -1 || this.f7408b == -1) ? false : true;
    }
}
