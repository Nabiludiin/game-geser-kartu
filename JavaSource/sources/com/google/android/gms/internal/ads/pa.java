package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
final class pa {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f13749d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    private static final g14 f13750e = g14.n("auto", "none");

    /* renamed from: f, reason: collision with root package name */
    private static final g14 f13751f = g14.o("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    private static final g14 f13752g = g14.n("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    private static final g14 f13753h = g14.o("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f13754a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13755b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13756c;

    private pa(int i7, int i8, int i9) {
        this.f13754a = i7;
        this.f13755b = i8;
        this.f13756c = i9;
    }

    public static pa a(String str) {
        int i7;
        if (str == null) {
            return null;
        }
        String a8 = zw3.a(str.trim());
        if (a8.isEmpty()) {
            return null;
        }
        g14 t7 = g14.t(TextUtils.split(a8, f13749d));
        String str2 = (String) k14.b(f34.a(f13753h, t7), "outside");
        int hashCode = str2.hashCode();
        int i8 = 1;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                i7 = 2;
            }
            i7 = 1;
        } else {
            if (str2.equals("outside")) {
                i7 = -2;
            }
            i7 = 1;
        }
        e34 a9 = f34.a(f13750e, t7);
        int i9 = 0;
        if (a9.isEmpty()) {
            e34 a10 = f34.a(f13752g, t7);
            e34 a11 = f34.a(f13751f, t7);
            if (!a10.isEmpty() || !a11.isEmpty()) {
                String str3 = (String) k14.b(a10, "filled");
                i9 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) k14.b(a11, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        i8 = 2;
                    }
                } else if (str4.equals("sesame")) {
                    i8 = 3;
                }
            }
            i8 = -1;
        } else {
            String str5 = (String) a9.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i8 = 0;
            }
            i8 = -1;
        }
        return new pa(i8, i9, i7);
    }
}
