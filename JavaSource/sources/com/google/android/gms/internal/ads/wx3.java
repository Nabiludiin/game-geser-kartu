package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class wx3 extends px3 {

    /* renamed from: q, reason: collision with root package name */
    private final Object f18469q;

    wx3(Object obj) {
        this.f18469q = obj;
    }

    @Override // com.google.android.gms.internal.ads.px3
    public final Object a(Object obj) {
        return this.f18469q;
    }

    @Override // com.google.android.gms.internal.ads.px3
    public final px3 b(hx3 hx3Var) {
        Object apply = hx3Var.apply(this.f18469q);
        rx3.k(apply, "the Function passed to Optional.transform() must not return null.");
        return new wx3(apply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wx3) {
            return this.f18469q.equals(((wx3) obj).f18469q);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18469q.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f18469q.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 13);
        sb.append("Optional.of(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
