package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class ib implements Comparable {

    /* renamed from: q, reason: collision with root package name */
    public final int f9948q;

    /* renamed from: r, reason: collision with root package name */
    public final db f9949r;

    public ib(int i7, db dbVar) {
        this.f9948q = i7;
        this.f9949r = dbVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f9948q, ((ib) obj).f9948q);
    }
}
