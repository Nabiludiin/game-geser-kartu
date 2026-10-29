package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
final class v6 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    private final y1 f17396a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f17397b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17398c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17399d;

    public v6(SparseArray sparseArray, long j7, int i7, long j8, long j9) {
        int i8;
        this.f17397b = sparseArray;
        this.f17398c = j7;
        this.f17399d = i7;
        List list = (List) sparseArray.get(i7);
        y1 y1Var = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                u6 u6Var = (u6) list.get(i10);
                jArr3[i10] = u6Var.f16604q;
                jArr[i10] = u6Var.f16605r;
            }
            while (true) {
                i8 = size - 1;
                if (i9 >= i8) {
                    break;
                }
                int i11 = i9 + 1;
                iArr[i9] = (int) (jArr[i11] - jArr[i9]);
                jArr2[i9] = jArr3[i11] - jArr3[i9];
                i9 = i11;
            }
            int i12 = i8;
            while (i12 > 0 && jArr3[i12] >= j7) {
                i12--;
            }
            iArr[i12] = (int) ((j8 + j9) - jArr[i12]);
            jArr2[i12] = j7 - jArr3[i12];
            if (i12 < i8) {
                gv1.c("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i13 = i12 + 1;
                iArr = Arrays.copyOf(iArr, i13);
                jArr = Arrays.copyOf(jArr, i13);
                jArr2 = Arrays.copyOf(jArr2, i13);
                jArr3 = Arrays.copyOf(jArr3, i13);
            }
            y1Var = new y1(iArr, jArr, jArr2, jArr3);
        }
        this.f17396a = y1Var;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f17398c;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        List list = (List) this.f17397b.get(this.f17399d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        y1 y1Var = this.f17396a;
        if (y1Var != null) {
            return y1Var.c(j7);
        }
        r3 r3Var = r3.f14717c;
        return new o3(r3Var, r3Var);
    }
}
