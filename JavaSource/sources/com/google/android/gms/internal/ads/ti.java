package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* compiled from: MyApplication */
public final class ti {

    /* renamed from: a, reason: collision with root package name */
    public final kh f16198a;

    /* renamed from: b, reason: collision with root package name */
    public final pi f16199b;

    /* renamed from: c, reason: collision with root package name */
    public final mi f16200c;

    /* renamed from: d, reason: collision with root package name */
    public final fi f16201d;

    public ti(kh khVar, pi piVar, fi fiVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        this.f16198a = khVar;
        this.f16199b = piVar;
        this.f16201d = fiVar;
        this.f16200c = new mi((i13 + ((((i8 & (~i7)) | i9) + ((i7 & i10) | i11)) - i12)) ^ (i14 % 454333378));
    }

    public final Optional a() {
        yg ygVar;
        Optional of;
        Optional empty;
        Optional of2;
        try {
            ArrayDeque arrayDeque = this.f16200c.f12263a;
            if (arrayDeque.isEmpty()) {
                throw new ji();
            }
            hi hiVar = (hi) arrayDeque.pop();
            long j7 = hiVar.f9530a;
            long j8 = hiVar.f9531b;
            long j9 = hiVar.f9532c;
            pi piVar = this.f16199b;
            if (piVar.f13889b < j8) {
                of2 = Optional.of(yg.X);
                return of2;
            }
            this.f16201d.a(j7);
            if (j9 == 0) {
                while (piVar.f13889b > j8) {
                    piVar.c();
                }
            }
            empty = Optional.empty();
            return empty;
        } catch (di e8) {
            e = e8;
            throw new AssertionError(yh.a("CEiv6BFfPnitUE+D"), e);
        } catch (ei e9) {
            e = e9;
            throw new AssertionError(yh.a("CEiv6BFfPnitUE+D"), e);
        } catch (ji unused) {
            ygVar = yg.N;
            of = Optional.of(ygVar);
            return of;
        } catch (ni unused2) {
            ygVar = yg.X;
            of = Optional.of(ygVar);
            return of;
        }
    }
}
