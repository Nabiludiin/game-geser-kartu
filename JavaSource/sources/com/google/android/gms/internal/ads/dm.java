package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class dm {

    /* renamed from: a, reason: collision with root package name */
    private final xk5 f7162a = new xk5();

    public final dm a(int i7) {
        this.f7162a.a(i7);
        return this;
    }

    public final dm b(int i7, boolean z7) {
        if (z7) {
            this.f7162a.a(i7);
        }
        return this;
    }

    public final dm c(int... iArr) {
        for (int i7 = 0; i7 < 20; i7++) {
            this.f7162a.a(iArr[i7]);
        }
        return this;
    }

    public final dm d(en enVar) {
        km5 a8 = enVar.a();
        for (int i7 = 0; i7 < a8.b(); i7++) {
            this.f7162a.a(a8.c(i7));
        }
        return this;
    }

    public final en e() {
        return new en(this.f7162a.b(), null);
    }
}
