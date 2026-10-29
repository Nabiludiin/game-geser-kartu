package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class d8 implements u3 {

    /* renamed from: b, reason: collision with root package name */
    public static final d8 f6964b = new d8(true);

    /* renamed from: c, reason: collision with root package name */
    public static final d8 f6965c = new d8(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6966a;

    private d8(boolean z7) {
        this.f6966a = z7;
    }

    public final String toString() {
        boolean z7 = !this.f6966a;
        StringBuilder sb = new StringBuilder(String.valueOf(z7).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z7);
        sb.append("}");
        return sb.toString();
    }
}
