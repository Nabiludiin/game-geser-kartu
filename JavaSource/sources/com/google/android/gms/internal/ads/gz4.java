package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class gz4 {

    /* renamed from: a, reason: collision with root package name */
    public int f9263a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9264b;

    /* renamed from: c, reason: collision with root package name */
    public int f9265c;

    /* renamed from: d, reason: collision with root package name */
    private int f9266d;

    public final synchronized void a() {
        this.f9266d++;
    }

    public final synchronized void b() {
        this.f9266d--;
    }

    public final synchronized int c() {
        return this.f9266d;
    }
}
