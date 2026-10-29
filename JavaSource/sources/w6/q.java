package w6;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class q extends p {

    /* compiled from: MyApplication */
    public static final class a implements v6.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f27197a;

        public a(CharSequence charSequence) {
            this.f27197a = charSequence;
        }

        @Override // v6.b
        public Iterator iterator() {
            return new d(this.f27197a);
        }
    }

    public static final List A(CharSequence charSequence) {
        q6.i.e(charSequence, "<this>");
        return v6.c.c(z(charSequence));
    }

    public static final boolean B(CharSequence charSequence, int i7, CharSequence charSequence2, int i8, int i9, boolean z7) {
        q6.i.e(charSequence, "<this>");
        q6.i.e(charSequence2, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > charSequence2.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!b.d(charSequence.charAt(i7 + i10), charSequence2.charAt(i8 + i10), z7)) {
                return false;
            }
        }
        return true;
    }

    public static final String C(String str, char c8, String str2) {
        q6.i.e(str, "<this>");
        q6.i.e(str2, "missingDelimiterValue");
        int s7 = s(str, c8, 0, false, 6, null);
        if (s7 == -1) {
            return str2;
        }
        String substring = str.substring(s7 + 1, str.length());
        q6.i.d(substring, "substring(...)");
        return substring;
    }

    public static final String D(String str, String str2, String str3) {
        q6.i.e(str, "<this>");
        q6.i.e(str2, "delimiter");
        q6.i.e(str3, "missingDelimiterValue");
        int t7 = t(str, str2, 0, false, 6, null);
        if (t7 == -1) {
            return str3;
        }
        String substring = str.substring(t7 + str2.length(), str.length());
        q6.i.d(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String E(String str, char c8, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return C(str, c8, str2);
    }

    public static /* synthetic */ String F(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return D(str, str2, str3);
    }

    public static final String G(String str, char c8, String str2) {
        q6.i.e(str, "<this>");
        q6.i.e(str2, "missingDelimiterValue");
        int x7 = x(str, c8, 0, false, 6, null);
        if (x7 == -1) {
            return str2;
        }
        String substring = str.substring(x7 + 1, str.length());
        q6.i.d(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String H(String str, char c8, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return G(str, c8, str2);
    }

    public static final int n(CharSequence charSequence) {
        q6.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int o(CharSequence charSequence, char c8, int i7, boolean z7) {
        q6.i.e(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? u(charSequence, new char[]{c8}, i7, z7) : ((String) charSequence).indexOf(c8, i7);
    }

    public static final int p(CharSequence charSequence, String str, int i7, boolean z7) {
        q6.i.e(charSequence, "<this>");
        q6.i.e(str, "string");
        return (z7 || !(charSequence instanceof String)) ? r(charSequence, str, i7, charSequence.length(), z7, false, 16, null) : ((String) charSequence).indexOf(str, i7);
    }

    private static final int q(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z7, boolean z8) {
        t6.a cVar = !z8 ? new t6.c(t6.d.a(i7, 0), t6.d.b(i8, charSequence.length())) : t6.d.d(t6.d.b(i7, n(charSequence)), t6.d.a(i8, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int c8 = cVar.c();
            int e8 = cVar.e();
            int g8 = cVar.g();
            if ((g8 <= 0 || c8 > e8) && (g8 >= 0 || e8 > c8)) {
                return -1;
            }
            int i9 = c8;
            while (true) {
                String str = (String) charSequence2;
                boolean z9 = z7;
                if (p.m(str, 0, (String) charSequence, i9, str.length(), z9)) {
                    return i9;
                }
                if (i9 == e8) {
                    return -1;
                }
                i9 += g8;
                z7 = z9;
            }
        } else {
            boolean z10 = z7;
            int c9 = cVar.c();
            int e9 = cVar.e();
            int g9 = cVar.g();
            if ((g9 <= 0 || c9 > e9) && (g9 >= 0 || e9 > c9)) {
                return -1;
            }
            int i10 = c9;
            while (true) {
                boolean z11 = z10;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z10 = z11;
                if (B(charSequence4, 0, charSequence3, i10, charSequence2.length(), z11)) {
                    return i10;
                }
                if (i10 == e9) {
                    return -1;
                }
                i10 += g9;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    static /* synthetic */ int r(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z7, boolean z8, int i9, Object obj) {
        if ((i9 & 16) != 0) {
            z8 = false;
        }
        return q(charSequence, charSequence2, i7, i8, z7, z8);
    }

    public static /* synthetic */ int s(CharSequence charSequence, char c8, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return o(charSequence, c8, i7, z7);
    }

    public static /* synthetic */ int t(CharSequence charSequence, String str, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return p(charSequence, str, i7, z7);
    }

    public static final int u(CharSequence charSequence, char[] cArr, int i7, boolean z7) {
        q6.i.e(charSequence, "<this>");
        q6.i.e(cArr, "chars");
        if (!z7 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(f6.f.h(cArr), i7);
        }
        int a8 = t6.d.a(i7, 0);
        int n7 = n(charSequence);
        if (a8 > n7) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(a8);
            for (char c8 : cArr) {
                if (b.d(c8, charAt, z7)) {
                    return a8;
                }
            }
            if (a8 == n7) {
                return -1;
            }
            a8++;
        }
    }

    public static final boolean v(CharSequence charSequence) {
        q6.i.e(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!w6.a.c(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static final int w(CharSequence charSequence, char c8, int i7, boolean z7) {
        q6.i.e(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? y(charSequence, new char[]{c8}, i7, z7) : ((String) charSequence).lastIndexOf(c8, i7);
    }

    public static /* synthetic */ int x(CharSequence charSequence, char c8, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = n(charSequence);
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return w(charSequence, c8, i7, z7);
    }

    public static final int y(CharSequence charSequence, char[] cArr, int i7, boolean z7) {
        q6.i.e(charSequence, "<this>");
        q6.i.e(cArr, "chars");
        if (!z7 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(f6.f.h(cArr), i7);
        }
        for (int b8 = t6.d.b(i7, n(charSequence)); -1 < b8; b8--) {
            char charAt = charSequence.charAt(b8);
            for (char c8 : cArr) {
                if (b.d(c8, charAt, z7)) {
                    return b8;
                }
            }
        }
        return -1;
    }

    public static final v6.b z(CharSequence charSequence) {
        q6.i.e(charSequence, "<this>");
        return new a(charSequence);
    }
}
