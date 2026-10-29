package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MyApplication */
final class v9 implements a4 {

    /* renamed from: a, reason: collision with root package name */
    private final a4 f17443a;

    /* renamed from: b, reason: collision with root package name */
    private final q9 f17444b;

    /* renamed from: g, reason: collision with root package name */
    private s9 f17449g;

    /* renamed from: h, reason: collision with root package name */
    private eq5 f17450h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17451i;

    /* renamed from: d, reason: collision with root package name */
    private int f17446d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f17447e = 0;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f17448f = hi2.f9536b;

    /* renamed from: c, reason: collision with root package name */
    private final y82 f17445c = new y82();

    public v9(a4 a4Var, q9 q9Var) {
        this.f17443a = a4Var;
        this.f17444b = q9Var;
    }

    private final void i(int i7) {
        int length = this.f17448f.length;
        int i8 = this.f17447e;
        if (length - i8 >= i7) {
            return;
        }
        int i9 = i8 - this.f17446d;
        int max = Math.max(i9 + i9, i7 + i9);
        byte[] bArr = this.f17448f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f17446d, bArr2, 0, i9);
        this.f17446d = 0;
        this.f17447e = i9;
        this.f17448f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void a(final long j7, final int i7, int i8, int i9, y3 y3Var) {
        if (this.f17449g == null) {
            this.f17443a.a(j7, i7, i8, i9, y3Var);
            return;
        }
        rx3.b(y3Var == null, "DRM on subtitles is not supported");
        int i10 = (this.f17447e - i9) - i8;
        try {
            this.f17449g.a(this.f17448f, i10, i8, r9.a(), new th1() { // from class: com.google.android.gms.internal.ads.u9
                @Override // com.google.android.gms.internal.ads.th1
                public final /* synthetic */ void d(Object obj) {
                    v9.this.h(j7, i7, (k9) obj);
                }
            });
        } catch (RuntimeException e8) {
            if (!this.f17451i) {
                throw e8;
            }
            gv1.d("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e8);
        }
        int i11 = i10 + i8;
        this.f17446d = i11;
        if (i11 == this.f17447e) {
            this.f17446d = 0;
            this.f17447e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final int b(y95 y95Var, int i7, boolean z7, int i8) {
        if (this.f17449g == null) {
            return this.f17443a.b(y95Var, i7, z7, 0);
        }
        i(i7);
        int r7 = y95Var.r(this.f17448f, this.f17447e, i7);
        if (r7 != -1) {
            this.f17447e += r7;
            return r7;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void c(eq5 eq5Var) {
        String str = eq5Var.f7775o;
        str.getClass();
        rx3.a(th.g(str) == 3);
        if (!eq5Var.equals(this.f17450h)) {
            this.f17450h = eq5Var;
            q9 q9Var = this.f17444b;
            this.f17449g = q9Var.b(eq5Var) ? q9Var.c(eq5Var) : null;
        }
        if (this.f17449g == null) {
            this.f17443a.c(eq5Var);
            return;
        }
        a4 a4Var = this.f17443a;
        xn5 a8 = eq5Var.a();
        a8.l0("application/x-media3-cues");
        a8.i0(str);
        a8.q0(Long.MAX_VALUE);
        a8.k(this.f17444b.a(eq5Var));
        a4Var.c(a8.m());
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void d(y82 y82Var, int i7, int i8) {
        if (this.f17449g == null) {
            this.f17443a.d(y82Var, i7, i8);
            return;
        }
        i(i7);
        y82Var.L(this.f17448f, this.f17447e, i7);
        this.f17447e += i7;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public /* synthetic */ void e(y82 y82Var, int i7) {
        z3.b(this, y82Var, i7);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public /* synthetic */ int f(y95 y95Var, int i7, boolean z7) {
        return z3.a(this, y95Var, i7, z7);
    }

    public final void g(boolean z7) {
        this.f17451i = true;
    }

    final /* synthetic */ void h(long j7, int i7, k9 k9Var) {
        this.f17450h.getClass();
        w04 w04Var = k9Var.f10927a;
        long j8 = k9Var.f10929c;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(w04Var.size());
        Iterator<E> it = w04Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((vw0) it.next()).b());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j8);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        y82 y82Var = this.f17445c;
        int length = marshall.length;
        y82Var.A(marshall, length);
        a4 a4Var = this.f17443a;
        a4Var.e(y82Var, length);
        long j9 = k9Var.f10928b;
        if (j9 == -9223372036854775807L) {
            rx3.h(this.f17450h.f7780t == Long.MAX_VALUE);
        } else {
            long j10 = this.f17450h.f7780t;
            j7 = j10 == Long.MAX_VALUE ? j7 + j9 : j9 + j10;
        }
        a4Var.a(j7, i7 | 1, length, 0, null);
    }
}
