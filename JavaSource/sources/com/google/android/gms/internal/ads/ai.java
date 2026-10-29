package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: MyApplication */
public final class ai {

    /* renamed from: b, reason: collision with root package name */
    public static final ai f4974b = new ai(new byte[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator f4975c = new zh();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4976a;

    public ai(byte[] bArr) {
        this.f4976a = bArr;
    }

    public static ai e(byte[] bArr) {
        return new ai(h(bArr, 0, bArr.length));
    }

    public static ai f(String str) {
        return e(str.getBytes(Charset.forName(yh.a("Hn2H4l0="))));
    }

    public static int g(byte b8) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        return b8 & ((iArr[7] % 837626799) ^ (i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12)));
    }

    public static byte[] h(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return bArr2;
    }

    public final byte[] a() {
        byte[] bArr = this.f4976a;
        int length = bArr.length;
        return length == 0 ? new byte[0] : h(bArr, 0, length);
    }

    public final byte b(int i7) {
        int i8 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i9 = 2013725218 % 1633938701;
        int i10 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i11 = 1442767057 % 63299708;
        byte[] bArr = this.f4976a;
        int length = bArr.length;
        if (((length - (i7 + 1)) | i7) >= 0) {
            return bArr[i7];
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + (i8 ^ i9));
            sb.append(yh.a("Akelqh1fajntGgo="));
            sb.append(i7);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + (i10 ^ i11) + String.valueOf(length).length());
        sb2.append(yh.a("Akelqh1faDmxRUSK1T9GeQ=="));
        sb2.append(i7);
        sb2.append(yh.a("Zwk="));
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final String c() {
        Charset forName = Charset.forName(yh.a("Hn2H4l0="));
        byte[] bArr = this.f4976a;
        return new String(bArr, 0, bArr.length, forName);
    }

    public final ai d(ai aiVar) {
        byte[] bArr = aiVar.f4976a;
        int length = bArr.length;
        byte[] bArr2 = this.f4976a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ai) {
            return Arrays.equals(this.f4976a, ((ai) obj).f4976a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4976a);
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        String arrays = Arrays.toString(this.f4976a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + ((i14 % 981766422) ^ i15));
        sb.append(yh.a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(arrays);
        sb.append(yh.a("Ng=="));
        return sb.toString();
    }
}
