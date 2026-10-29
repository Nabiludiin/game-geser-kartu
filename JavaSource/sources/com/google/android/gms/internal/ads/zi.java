package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class zi {

    /* renamed from: a, reason: collision with root package name */
    private Object f20184a;

    /* renamed from: b, reason: collision with root package name */
    private long f20185b;

    /* renamed from: c, reason: collision with root package name */
    private double f20186c;

    /* renamed from: d, reason: collision with root package name */
    private ai f20187d;

    /* renamed from: e, reason: collision with root package name */
    private List f20188e;

    /* renamed from: f, reason: collision with root package name */
    private qi f20189f;

    /* renamed from: g, reason: collision with root package name */
    public int f20190g = 1;

    private zi() {
    }

    public static zi a(Object obj) {
        zi ziVar = new zi();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        ziVar.r();
        ziVar.f20190g = (i14 % 1937477084) ^ i15;
        ziVar.f20184a = obj;
        return ziVar;
    }

    public static zi b(long j7) {
        zi ziVar = new zi();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        ziVar.r();
        ziVar.f20190g = (i14 % 327254586) ^ i15;
        ziVar.f20185b = j7;
        return ziVar;
    }

    public static zi c(double d8) {
        zi ziVar = new zi();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        ziVar.r();
        ziVar.f20190g = (i14 % 1605908235) ^ i15;
        ziVar.f20186c = d8;
        return ziVar;
    }

    public static zi d(ai aiVar) {
        zi ziVar = new zi();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        ziVar.r();
        ziVar.f20190g = (i14 % 1402586708) ^ i15;
        ziVar.f20187d = aiVar;
        return ziVar;
    }

    public static zi e(List list) {
        zi ziVar = new zi();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        ziVar.r();
        ziVar.f20190g = (i14 % 324763920) ^ i15;
        ziVar.f20188e = list;
        return ziVar;
    }

    public static zi f(qi qiVar) {
        zi ziVar = new zi();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        ziVar.r();
        ziVar.f20190g = (i14 % 474613996) ^ i15;
        ziVar.f20189f = qiVar;
        return ziVar;
    }

    public static zi g(Object obj) {
        if (obj instanceof Long) {
            return b(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return b(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return b(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return c(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return c(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return b(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return b(((Byte) obj).byteValue());
        }
        if (obj instanceof ai) {
            return d((ai) obj);
        }
        if (obj instanceof String) {
            return d(ai.f((String) obj));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(g(arrayList2.get(i7)));
        }
        return e(arrayList);
    }

    public static zi j(zi ziVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        int i16 = i14 % 552812661;
        try {
            int i17 = ziVar.f20190g;
            int i18 = (i16 ^ i15) + i17;
            if (i17 == 0) {
                throw null;
            }
            switch (i18) {
                case 0:
                    return new zi();
                case 1:
                    return a(ziVar.l());
                case 2:
                    return b(ziVar.m());
                case 3:
                    return d(ziVar.n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ziVar.o().iterator();
                    while (it.hasNext()) {
                        arrayList.add(j((zi) it.next()));
                    }
                    return e(arrayList);
                case 5:
                    return f(ziVar.p());
                case 6:
                    return c(ziVar.q());
                default:
                    throw new AssertionError(yh.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (vi e8) {
            throw new AssertionError(yh.a("CEiv6BFfPnitUE+D"), e8);
        }
    }

    private final void r() {
        this.f20190g = 1;
        this.f20185b = 0L;
        this.f20184a = null;
        this.f20187d = null;
        this.f20188e = null;
        this.f20189f = null;
    }

    private final void s(int i7) {
        if (i7 != this.f20190g) {
            throw new vi();
        }
    }

    public final Object h() {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        int i16 = this.f20190g;
        int i17 = ((i14 % 473891334) ^ i15) + i16;
        if (i16 == 0) {
            throw null;
        }
        switch (i17) {
            case 0:
            case 5:
                throw new vi();
            case 1:
                return l();
            case 2:
                return Long.valueOf(m());
            case 3:
                return n().a();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = o().iterator();
                while (it.hasNext()) {
                    arrayList.add(((zi) it.next()).h());
                }
                return arrayList;
            case 6:
                return Double.valueOf(q());
            default:
                throw new AssertionError(yh.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0252, code lost:
    
        if (r19.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Class r19) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zi.i(java.lang.Class):java.lang.Object");
    }

    public final void k(OutputStream outputStream) {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j7 = jArr[0];
        long j8 = jArr[1];
        long j9 = jArr[2];
        long j10 = jArr[3];
        long j11 = jArr[4];
        long j12 = jArr[5];
        long j13 = jArr[6];
        long j14 = jArr[7];
        long j15 = j13 + (((((~j7) & j8) | j9) + ((j7 & j10) | j11)) - j12);
        long j16 = j14 % 297598514;
        int i7 = ((((~136416008) & 1315652152) | 568681609) + ((136416008 & 1310591536) | 838183178)) - (-1654427070);
        int i8 = 1414460396 % 78756298;
        int i9 = ((((~1202640845) & 472047875) | 1135942642) + ((1202640845 & 1006822481) | 585369424)) - 1952913860;
        int i10 = 1225708428 % 987359759;
        int i11 = this.f20190g;
        int i12 = ((((((~1959970879) & 1489831444) | 1998984087) + ((1959970879 & (-1446423480)) | (-182037905))) - (-2117037800)) ^ (1544048623 % 665228399)) + i11;
        if (i11 == 0) {
            throw null;
        }
        switch (i12) {
            case 0:
            case 1:
            case 5:
                throw new vi();
            case 2:
                wh.b(m(), new yi(outputStream, 1), true);
                return;
            case 3:
                byte[] bArr = n().f4976a;
                wh.b(bArr.length * (j15 ^ j16), new yi(outputStream, 0), true);
                outputStream.write(bArr);
                return;
            case 4:
                List o7 = o();
                wh.b(o7.size(), new yi(outputStream, i9 ^ i10), true);
                Iterator it = o7.iterator();
                while (it.hasNext()) {
                    ((zi) it.next()).k(outputStream);
                }
                return;
            case 6:
                double q7 = q();
                yi yiVar = new yi(outputStream, i7 ^ i8);
                long doubleToRawLongBits = Double.doubleToRawLongBits(q7);
                ByteBuffer allocate = ByteBuffer.allocate((((((~1470558289) & 1721781326) | 2037102441) + ((1470558289 & 109139991) | 560281113)) - (-1975232131)) ^ (1043353969 % 656635246));
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.putLong(doubleToRawLongBits);
                for (byte b8 : allocate.array()) {
                    yiVar.a(b8);
                }
                int length = allocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object l() {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        s((iArr[7] % 235745791) ^ (i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12)));
        return this.f20184a;
    }

    public final long m() {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        s((iArr[7] % 733327814) ^ (i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12)));
        return this.f20185b;
    }

    public final ai n() {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        s((iArr[7] % 1140384172) ^ (i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12)));
        return this.f20187d;
    }

    public final List o() {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        s((iArr[7] % 1250801052) ^ (i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12)));
        return this.f20188e;
    }

    public final qi p() {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        s((iArr[7] % 395191309) ^ (i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12)));
        return this.f20189f;
    }

    public final double q() {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        s((iArr[7] % 846930886) ^ (i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12)));
        return this.f20186c;
    }
}
