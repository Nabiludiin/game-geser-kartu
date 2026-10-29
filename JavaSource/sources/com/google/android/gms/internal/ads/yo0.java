package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class yo0 {

    /* renamed from: a, reason: collision with root package name */
    private long f19698a;

    public final long a(ByteBuffer byteBuffer) {
        ug ugVar;
        tg tgVar;
        long j7 = this.f19698a;
        if (j7 > 0) {
            return j7;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new pg(new xo0(duplicate), cp0.f6552c).g().iterator();
            while (true) {
                ugVar = null;
                if (!it.hasNext()) {
                    tgVar = null;
                    break;
                }
                rg rgVar = (rg) it.next();
                if (rgVar instanceof tg) {
                    tgVar = (tg) rgVar;
                    break;
                }
            }
            Iterator it2 = tgVar.g().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                rg rgVar2 = (rg) it2.next();
                if (rgVar2 instanceof ug) {
                    ugVar = (ug) rgVar2;
                    break;
                }
            }
            long i7 = (ugVar.i() * 1000) / ugVar.h();
            this.f19698a = i7;
            return i7;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
