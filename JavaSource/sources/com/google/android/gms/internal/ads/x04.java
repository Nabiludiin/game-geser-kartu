package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class x04 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18507a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18508b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f18509c;

    x04(Object obj, Object obj2, Object obj3) {
        this.f18507a = obj;
        this.f18508b = obj2;
        this.f18509c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f18509c;
        Object obj2 = this.f18508b;
        Object obj3 = this.f18507a;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 5 + valueOf3.length() + 1 + valueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
