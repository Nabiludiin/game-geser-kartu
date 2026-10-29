package com.google.android.gms.internal.drive;

public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private int f20743a;

    /* renamed from: b, reason: collision with root package name */
    private int f20744b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20745c;

    private t() {
        this.f20743a = 100;
        this.f20744b = Integer.MAX_VALUE;
        this.f20745c = false;
    }

    static t a(byte[] bArr, int i7, int i8, boolean z7) {
        v vVar = new v(bArr, 0, i8, false);
        try {
            vVar.c(i8);
            return vVar;
        } catch (o0 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public abstract int b();

    public abstract int c(int i7);
}
