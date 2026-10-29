package w6;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class o extends n {
    public static Long j(String str) {
        q6.i.e(str, "<this>");
        return k(str, 10);
    }

    public static final Long k(String str, int i7) {
        boolean z7;
        q6.i.e(str, "<this>");
        a.a(i7);
        int length = str.length();
        Long l7 = null;
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char charAt = str.charAt(0);
        long j7 = -9223372036854775807L;
        if (q6.i.f(charAt, 48) < 0) {
            z7 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z7 = false;
                i8 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j7 = Long.MIN_VALUE;
                i8 = 1;
            }
        } else {
            z7 = false;
        }
        long j8 = 0;
        long j9 = -256204778801521550L;
        while (i8 < length) {
            int b8 = a.b(str.charAt(i8), i7);
            if (b8 < 0) {
                return l7;
            }
            if (j8 < j9) {
                if (j9 != -256204778801521550L) {
                    return l7;
                }
                j9 = j7 / i7;
                if (j8 < j9) {
                    return l7;
                }
            }
            Long l8 = l7;
            int i9 = i8;
            long j10 = j8 * i7;
            long j11 = b8;
            if (j10 < j7 + j11) {
                return l8;
            }
            j8 = j10 - j11;
            i8 = i9 + 1;
            l7 = l8;
        }
        return z7 ? Long.valueOf(j8) : Long.valueOf(-j8);
    }
}
