package com.google.android.gms.internal.ads;

import java.io.Writer;
import java.util.Objects;

/* compiled from: MyApplication */
final class kx4 extends Writer {

    /* renamed from: q, reason: collision with root package name */
    private final Appendable f11288q;

    /* renamed from: r, reason: collision with root package name */
    private final ix4 f11289r = new ix4(null);

    kx4(Appendable appendable) {
        this.f11288q = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f11288q.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i7) {
        this.f11288q.append((char) i7);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i7, int i8) {
        Objects.requireNonNull(str);
        this.f11288q.append(str, i7, i8 + i7);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i7, int i8) {
        this.f11288q.append(charSequence, i7, i8);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i7, int i8) {
        append(charSequence, i7, i8);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i8) {
        ix4 ix4Var = this.f11289r;
        ix4Var.a(cArr);
        this.f11288q.append(ix4Var, i7, i8 + i7);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
