package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public abstract class ng implements og {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f12727b = Logger.getLogger(ng.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final ThreadLocal f12728a = new mg(this);

    @Override // com.google.android.gms.internal.ads.og
    public final rg a(y75 y75Var, sg sgVar) {
        int D0;
        long b8;
        long d8 = y75Var.d();
        ThreadLocal threadLocal = this.f12728a;
        ((ByteBuffer) threadLocal.get()).rewind().limit(8);
        do {
            D0 = y75Var.D0((ByteBuffer) threadLocal.get());
            if (D0 == 8) {
                ((ByteBuffer) threadLocal.get()).rewind();
                long a8 = qg.a((ByteBuffer) threadLocal.get());
                byte[] bArr = null;
                if (a8 < 8 && a8 > 1) {
                    Logger logger = f12727b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(a8);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) threadLocal.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (a8 == 1) {
                        ThreadLocal threadLocal2 = this.f12728a;
                        ((ByteBuffer) threadLocal2.get()).limit(16);
                        y75Var.D0((ByteBuffer) threadLocal2.get());
                        ((ByteBuffer) threadLocal2.get()).position(8);
                        b8 = qg.d((ByteBuffer) threadLocal2.get()) - 16;
                    } else {
                        b8 = a8 == 0 ? y75Var.b() - y75Var.d() : a8 - 8;
                    }
                    if ("uuid".equals(str)) {
                        ThreadLocal threadLocal3 = this.f12728a;
                        ((ByteBuffer) threadLocal3.get()).limit(((ByteBuffer) threadLocal3.get()).limit() + 16);
                        y75Var.D0((ByteBuffer) threadLocal3.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) threadLocal3.get()).position() - 16; position < ((ByteBuffer) threadLocal3.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) threadLocal3.get()).position() - 16)] = ((ByteBuffer) threadLocal3.get()).get(position);
                        }
                        b8 -= 16;
                    }
                    long j7 = b8;
                    rg b9 = b(str, bArr, sgVar instanceof rg ? ((rg) sgVar).a() : "");
                    ThreadLocal threadLocal4 = this.f12728a;
                    ((ByteBuffer) threadLocal4.get()).rewind();
                    b9.e(y75Var, (ByteBuffer) threadLocal4.get(), j7, this);
                    return b9;
                } catch (UnsupportedEncodingException e8) {
                    throw new RuntimeException(e8);
                }
            }
        } while (D0 >= 0);
        y75Var.f(d8);
        throw new EOFException();
    }

    public abstract rg b(String str, byte[] bArr, String str2);
}
