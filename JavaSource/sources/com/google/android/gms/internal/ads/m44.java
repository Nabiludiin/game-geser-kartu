package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public abstract class m44 extends n44 {
    public static int a(long j7) {
        int i7 = (int) j7;
        rx3.e(((long) i7) == j7, "Out of range: %s", j7);
        return i7;
    }

    public static int b(long j7) {
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    public static int c(int i7, int i8, int i9) {
        rx3.g(true, "min (%s) must be less than or equal to max (%s)", i8, 1073741823);
        return Math.min(Math.max(i7, i8), 1073741823);
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        rx3.g(length >= 4, "array too small: %s < %s", length, 4);
        return e(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int e(byte b8, byte b9, byte b10, byte b11) {
        return (b8 << 24) | ((b9 & 255) << 16) | ((b10 & 255) << 8) | (b11 & 255);
    }

    public static int[] f(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List g(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new l44(iArr, 0, length);
    }

    public static Integer h(String str, int i7) {
        Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            int i8 = charAt == '-' ? 1 : 0;
            if (i8 != str.length()) {
                int i9 = i8 + 1;
                int a8 = o44.a(str.charAt(i8));
                if (a8 >= 0 && a8 < 10) {
                    long j7 = -a8;
                    while (true) {
                        if (i9 < str.length()) {
                            int i10 = i9 + 1;
                            int a9 = o44.a(str.charAt(i9));
                            if (a9 < 0 || a9 >= 10 || j7 < -922337203685477580L) {
                                break;
                            }
                            long j8 = j7 * 10;
                            long j9 = a9;
                            if (j8 < Long.MIN_VALUE + j9) {
                                break;
                            }
                            j7 = j8 - j9;
                            i9 = i10;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j7);
                        } else if (j7 != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j7);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    static /* synthetic */ int i(int[] iArr, int i7, int i8, int i9) {
        while (i8 < i9) {
            if (iArr[i8] == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }
}
