package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: MyApplication */
final class cb {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f6342c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f6343d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final y82 f6344a = new y82();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f6345b = new StringBuilder();

    static void b(y82 y82Var) {
        while (true) {
            for (boolean z7 = true; y82Var.C() > 0 && z7; z7 = false) {
                char c8 = (char) y82Var.H()[y82Var.F()];
                if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
                    y82Var.J(1);
                } else {
                    int F = y82Var.F();
                    int D = y82Var.D();
                    byte[] H = y82Var.H();
                    if (F + 2 <= D) {
                        int i7 = F + 1;
                        if (H[F] == 47) {
                            int i8 = F + 2;
                            if (H[i7] == 42) {
                                while (true) {
                                    int i9 = i8 + 1;
                                    if (i9 >= D) {
                                        break;
                                    }
                                    if (((char) H[i8]) == '*' && ((char) H[i9]) == '/') {
                                        D = i8 + 2;
                                        i8 = D;
                                    } else {
                                        i8 = i9;
                                    }
                                }
                                y82Var.J(D - y82Var.F());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    static String c(y82 y82Var, StringBuilder sb) {
        b(y82Var);
        if (y82Var.C() == 0) {
            return null;
        }
        String d8 = d(y82Var, sb);
        if (!d8.isEmpty()) {
            return d8;
        }
        char R = (char) y82Var.R();
        StringBuilder sb2 = new StringBuilder(String.valueOf(R).length());
        sb2.append(R);
        return sb2.toString();
    }

    private static String d(y82 y82Var, StringBuilder sb) {
        sb.setLength(0);
        int F = y82Var.F();
        int D = y82Var.D();
        loop0: while (true) {
            for (boolean z7 = false; F < D && !z7; z7 = true) {
                char c8 = (char) y82Var.H()[F];
                if ((c8 >= 'A' && c8 <= 'Z') || ((c8 >= 'a' && c8 <= 'z') || ((c8 >= '0' && c8 <= '9') || c8 == '#' || c8 == '-' || c8 == '.' || c8 == '_'))) {
                    sb.append(c8);
                    F++;
                }
            }
        }
        y82Var.J(F - y82Var.F());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02fd, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00aa, code lost:
    
        if (")".equals(c(r4, r1)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(com.google.android.gms.internal.ads.y82 r18) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cb.a(com.google.android.gms.internal.ads.y82):java.util.List");
    }
}
