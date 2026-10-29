package w6;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class p extends o {
    public static String l(byte[] bArr) {
        q6.i.e(bArr, "<this>");
        return new String(bArr, c.f27184b);
    }

    public static final boolean m(String str, int i7, String str2, int i8, int i9, boolean z7) {
        q6.i.e(str, "<this>");
        q6.i.e(str2, "other");
        return !z7 ? str.regionMatches(i7, str2, i8, i9) : str.regionMatches(z7, i7, str2, i8, i9);
    }
}
