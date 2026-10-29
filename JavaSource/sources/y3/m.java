package y3;

import android.os.Parcel;
import android.os.Parcelable;
import p3.n;

/* compiled from: MyApplication */
public final class m extends c4.q implements n {
    public static final Parcelable.Creator<m> CREATOR = new o();

    /* renamed from: q, reason: collision with root package name */
    private final int f27715q;

    /* renamed from: r, reason: collision with root package name */
    private final String f27716r;

    /* renamed from: s, reason: collision with root package name */
    private final String f27717s;

    public m(int i7, String str, String str2) {
        this.f27715q = i7;
        this.f27716r = str;
        this.f27717s = str2;
    }

    static int M0(n nVar) {
        return p3.n.b(Integer.valueOf(nVar.m()), nVar.w(), nVar.p());
    }

    static boolean N0(n nVar, Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (obj == nVar) {
            return true;
        }
        n nVar2 = (n) obj;
        return nVar2.m() == nVar.m() && p3.n.a(nVar2.w(), nVar.w()) && p3.n.a(nVar2.p(), nVar.p());
    }

    static String O0(n nVar) {
        n.a c8 = p3.n.c(nVar);
        int i7 = 12;
        char[] cArr = new char[12];
        cArr[0] = 133;
        cArr[1] = 177;
        cArr[2] = 168;
        cArr[3] = 164;
        cArr[4] = 173;
        cArr[5] = 163;
        cArr[6] = 146;
        cArr[7] = 179;
        cArr[8] = 160;
        cArr[9] = 179;
        cArr[10] = 180;
        cArr[11] = 178;
        int i8 = 0;
        while (i8 < i7) {
            cArr[i8] = (char) (cArr[i8] - '?');
            i8++;
            i7 = i7;
        }
        int i9 = i7;
        n.a a8 = c8.a(new String(cArr), Integer.valueOf(nVar.m()));
        char[] cArr2 = new char[8];
        cArr2[0] = 141;
        cArr2[1] = 168;
        char c9 = 162;
        cArr2[2] = 162;
        cArr2[3] = 170;
        cArr2[4] = 173;
        cArr2[5] = 160;
        cArr2[6] = 172;
        cArr2[7] = 164;
        int i10 = 0;
        while (i10 < 8) {
            cArr2[i10] = (char) (cArr2[i10] - '?');
            i10++;
            c9 = c9;
        }
        n.a a9 = a8.a(new String(cArr2), nVar.w());
        char[] cArr3 = new char[18];
        cArr3[0] = 136;
        cArr3[1] = 173;
        cArr3[2] = 181;
        cArr3[3] = 168;
        cArr3[4] = 179;
        cArr3[5] = 160;
        cArr3[6] = 179;
        cArr3[7] = 168;
        cArr3[8] = 174;
        cArr3[9] = 173;
        cArr3[10] = 141;
        cArr3[11] = 168;
        cArr3[i9] = c9;
        cArr3[13] = 170;
        cArr3[14] = 173;
        cArr3[15] = 160;
        cArr3[16] = 172;
        cArr3[17] = 164;
        for (int i11 = 0; i11 < 18; i11++) {
            cArr3[i11] = (char) (cArr3[i11] - '?');
        }
        return a9.a(new String(cArr3), nVar.p()).toString();
    }

    public final boolean equals(Object obj) {
        return N0(this, obj);
    }

    public final int hashCode() {
        return M0(this);
    }

    @Override // y3.n
    public final int m() {
        return this.f27715q;
    }

    @Override // y3.n
    public final String p() {
        return this.f27717s;
    }

    public final String toString() {
        return O0(this);
    }

    @Override // y3.n
    public final String w() {
        return this.f27716r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, this.f27715q);
        q3.c.r(parcel, 2, this.f27716r, false);
        q3.c.r(parcel, 3, this.f27717s, false);
        q3.c.b(parcel, a8);
    }
}
