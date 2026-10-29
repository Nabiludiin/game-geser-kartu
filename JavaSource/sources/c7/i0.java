package c7;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract /* synthetic */ class i0 {
    public static final int a(String str, int i7, int i8, int i9) {
        return (int) g0.c(str, i7, i8, i9);
    }

    public static final long b(String str, long j7, long j8, long j9) {
        String d8 = g0.d(str);
        if (d8 == null) {
            return j7;
        }
        Long j10 = w6.e.j(d8);
        if (j10 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d8 + '\'').toString());
        }
        long longValue = j10.longValue();
        if (j8 <= longValue && longValue <= j9) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j8 + ".." + j9 + ", but is '" + longValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String d8 = g0.d(str);
        return d8 == null ? str2 : d8;
    }

    public static final boolean d(String str, boolean z7) {
        String d8 = g0.d(str);
        return d8 != null ? Boolean.parseBoolean(d8) : z7;
    }

    public static /* synthetic */ int e(String str, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i8 = 1;
        }
        if ((i10 & 8) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        return g0.b(str, i7, i8, i9);
    }

    public static /* synthetic */ long f(String str, long j7, long j8, long j9, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j8 = 1;
        }
        long j10 = j8;
        if ((i7 & 8) != 0) {
            j9 = Long.MAX_VALUE;
        }
        return g0.c(str, j7, j10, j9);
    }
}
