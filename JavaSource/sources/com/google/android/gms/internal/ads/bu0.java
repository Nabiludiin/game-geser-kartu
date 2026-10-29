package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class bu0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6005c;

    private bu0(int i7, int i8, int i9) {
        this.f6003a = i7;
        this.f6005c = i8;
        this.f6004b = i9;
    }

    public static bu0 a(s2.g5 g5Var) {
        return g5Var.f26098t ? new bu0(3, 0, 0) : g5Var.f26103y ? new bu0(2, 0, 0) : g5Var.f26102x ? new bu0(0, 0, 0) : new bu0(1, g5Var.f26100v, g5Var.f26097s);
    }

    public static bu0 b() {
        return new bu0(0, 0, 0);
    }

    public static bu0 c(int i7, int i8) {
        return new bu0(1, i7, i8);
    }

    public static bu0 d() {
        return new bu0(4, 0, 0);
    }

    public static bu0 e() {
        return new bu0(5, 0, 0);
    }

    public final boolean f() {
        return this.f6003a == 2;
    }

    public final boolean g() {
        return this.f6003a == 3;
    }

    public final boolean h() {
        return this.f6003a == 0;
    }

    public final boolean i() {
        return this.f6003a == 4;
    }

    public final boolean j() {
        return this.f6003a == 5;
    }
}
