package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: MyApplication */
public abstract class va extends n9 {

    /* renamed from: q, reason: collision with root package name */
    private final xa f21415q;

    /* renamed from: r, reason: collision with root package name */
    protected xa f21416r;

    protected va(xa xaVar) {
        this.f21415q = xaVar;
        if (xaVar.m()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f21416r = xaVar.o();
    }

    private static void n(Object obj, Object obj2) {
        fc.a().b(obj.getClass()).h(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.n9
    public final /* bridge */ /* synthetic */ n9 k(byte[] bArr, int i7, int i8) {
        la laVar = la.f21114c;
        int i9 = fc.f20950d;
        w(bArr, 0, i8, la.f21114c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.n9
    public final /* bridge */ /* synthetic */ n9 l(byte[] bArr, int i7, int i8, la laVar) {
        w(bArr, 0, i8, laVar);
        return this;
    }

    protected final void o() {
        if (this.f21416r.m()) {
            return;
        }
        p();
    }

    protected void p() {
        xa o7 = this.f21415q.o();
        n(o7, this.f21416r);
        this.f21416r = o7;
    }

    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final va clone() {
        va vaVar = (va) this.f21415q.E(5, null, null);
        vaVar.f21416r = h();
        return vaVar;
    }

    @Override // com.google.android.gms.internal.measurement.wb
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public xa h() {
        if (!this.f21416r.m()) {
            return this.f21416r;
        }
        this.f21416r.q();
        return this.f21416r;
    }

    public final xa s() {
        xa h8 = h();
        if (h8.l()) {
            return h8;
        }
        throw new sc(h8);
    }

    public final va v(xa xaVar) {
        if (!this.f21415q.equals(xaVar)) {
            if (!this.f21416r.m()) {
                p();
            }
            n(this.f21416r, xaVar);
        }
        return this;
    }

    public final va w(byte[] bArr, int i7, int i8, la laVar) {
        if (!this.f21416r.m()) {
            p();
        }
        try {
            fc.a().b(this.f21416r.getClass()).c(this.f21416r, bArr, 0, i8, new r9(laVar));
            return this;
        } catch (gb e8) {
            throw e8;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new gb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
