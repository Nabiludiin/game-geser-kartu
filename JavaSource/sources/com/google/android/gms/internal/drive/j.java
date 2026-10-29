package com.google.android.gms.internal.drive;

import java.util.NoSuchElementException;

final class j extends l {

    /* renamed from: q, reason: collision with root package name */
    private int f20626q = 0;

    /* renamed from: r, reason: collision with root package name */
    private final int f20627r;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ i f20628s;

    j(i iVar) {
        this.f20628s = iVar;
        this.f20627r = iVar.size();
    }

    @Override // com.google.android.gms.internal.drive.p
    public final byte c() {
        int i7 = this.f20626q;
        if (i7 >= this.f20627r) {
            throw new NoSuchElementException();
        }
        this.f20626q = i7 + 1;
        return this.f20628s.q(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20626q < this.f20627r;
    }
}
