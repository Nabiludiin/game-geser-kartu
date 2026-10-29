package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* compiled from: MyApplication */
public final class mi {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f12263a = new ArrayDeque();

    public mi(int i7) {
    }

    public final void a(long j7, long j8, long j9) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int i15 = i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12);
        hi hiVar = new hi(j7, j8, j9);
        ArrayDeque arrayDeque = this.f12263a;
        if (arrayDeque.size() >= ((i14 % 452867621) ^ i15)) {
            throw new ii();
        }
        arrayDeque.push(hiVar);
    }

    public final hi b() {
        Optional ofNullable;
        Object orElseThrow;
        ofNullable = Optional.ofNullable((hi) this.f12263a.peek());
        orElseThrow = ofNullable.orElseThrow(gi.f8929b);
        return (hi) orElseThrow;
    }
}
