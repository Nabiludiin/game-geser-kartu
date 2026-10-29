package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import o2.a;

/* compiled from: MyApplication */
public final class xb extends ad {

    /* renamed from: d, reason: collision with root package name */
    private final Map f22860d;

    /* renamed from: e, reason: collision with root package name */
    public final a6 f22861e;

    /* renamed from: f, reason: collision with root package name */
    public final a6 f22862f;

    /* renamed from: g, reason: collision with root package name */
    public final a6 f22863g;

    /* renamed from: h, reason: collision with root package name */
    public final a6 f22864h;

    /* renamed from: i, reason: collision with root package name */
    public final a6 f22865i;

    /* renamed from: j, reason: collision with root package name */
    public final a6 f22866j;

    xb(pd pdVar) {
        super(pdVar);
        this.f22860d = new HashMap();
        d6 x7 = this.f22928a.x();
        Objects.requireNonNull(x7);
        this.f22861e = new a6(x7, "last_delete_stale", 0L);
        d6 x8 = this.f22928a.x();
        Objects.requireNonNull(x8);
        this.f22862f = new a6(x8, "last_delete_stale_batch", 0L);
        d6 x9 = this.f22928a.x();
        Objects.requireNonNull(x9);
        this.f22863g = new a6(x9, "backoff", 0L);
        d6 x10 = this.f22928a.x();
        Objects.requireNonNull(x10);
        this.f22864h = new a6(x10, "last_upload", 0L);
        d6 x11 = this.f22928a.x();
        Objects.requireNonNull(x11);
        this.f22865i = new a6(x11, "last_upload_attempt", 0L);
        d6 x12 = this.f22928a.x();
        Objects.requireNonNull(x12);
        this.f22866j = new a6(x12, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.ad
    protected final boolean l() {
        return false;
    }

    final Pair m(String str, d8 d8Var) {
        return d8Var.o(t4.v.AD_STORAGE) ? n(str) : new Pair("", Boolean.FALSE);
    }

    final Pair n(String str) {
        wb wbVar;
        a.C0117a c0117a;
        h();
        w6 w6Var = this.f22928a;
        long b8 = w6Var.f().b();
        wb wbVar2 = (wb) this.f22860d.get(str);
        if (wbVar2 != null && b8 < wbVar2.f22822c) {
            return new Pair(wbVar2.f22820a, Boolean.valueOf(wbVar2.f22821b));
        }
        o2.a.c(true);
        long D = w6Var.w().D(str, c5.f21936b) + b8;
        try {
            try {
                c0117a = o2.a.a(w6Var.e());
            } catch (PackageManager.NameNotFoundException unused) {
                c0117a = null;
                if (wbVar2 != null && b8 < wbVar2.f22822c + this.f22928a.w().D(str, c5.f21939c)) {
                    return new Pair(wbVar2.f22820a, Boolean.valueOf(wbVar2.f22821b));
                }
            }
        } catch (Exception e8) {
            this.f22928a.a().v().b("Unable to get advertising id", e8);
            wbVar = new wb("", false, D);
        }
        if (c0117a == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a8 = c0117a.a();
        wbVar = a8 != null ? new wb(a8, c0117a.b(), D) : new wb("", c0117a.b(), D);
        this.f22860d.put(str, wbVar);
        o2.a.c(false);
        return new Pair(wbVar.f22820a, Boolean.valueOf(wbVar.f22821b));
    }

    final String o(String str, boolean z7) {
        h();
        String str2 = z7 ? (String) n(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest C = yd.C();
        if (C == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, C.digest(str2.getBytes())));
    }
}
