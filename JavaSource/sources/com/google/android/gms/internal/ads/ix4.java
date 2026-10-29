package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class ix4 implements CharSequence {

    /* renamed from: q, reason: collision with root package name */
    private char[] f10258q;

    /* renamed from: r, reason: collision with root package name */
    private String f10259r;

    /* synthetic */ ix4(byte[] bArr) {
    }

    final void a(char[] cArr) {
        this.f10258q = cArr;
        this.f10259r = null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f10258q[i7];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f10258q.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return new String(this.f10258q, i7, i8 - i7);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f10259r == null) {
            this.f10259r = new String(this.f10258q);
        }
        return this.f10259r;
    }
}
