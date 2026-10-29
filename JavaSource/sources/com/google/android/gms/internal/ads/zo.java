package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class zo extends bq {

    /* renamed from: k, reason: collision with root package name */
    private static final cq f20254k = new cq();

    /* renamed from: h, reason: collision with root package name */
    private final sj f20255h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f20256i;

    /* renamed from: j, reason: collision with root package name */
    private final am f20257j;

    public zo(ko koVar, String str, String str2, ak akVar, int i7, int i8, Context context, lj ljVar, sj sjVar, am amVar) {
        super(koVar, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", akVar, i7, 27);
        this.f20256i = context;
        this.f20255h = sjVar;
        this.f20257j = amVar;
    }

    private final tl c() {
        String str;
        int intValue = ((Boolean) s2.b0.c().d(uy.f17067c3)).booleanValue() ? ((Integer) s2.b0.c().d(uy.f17121i3)).intValue() : this.f20255h.e0();
        tl tlVar = new tl((String) this.f5899e.invoke(null, this.f20256i, Boolean.FALSE, ""));
        am amVar = this.f20257j;
        if (amVar != null && amVar.a() != null) {
            try {
                str = (String) amVar.a().get(intValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            tlVar.f16234b = str;
            return tlVar;
        }
        str = "E";
        tlVar.f16234b = str;
        return tlVar;
    }

    private final String d() {
        try {
            ko koVar = this.f5895a;
            if (koVar.m() != null) {
                koVar.m().get();
            }
            xk l7 = koVar.l();
            if (l7 == null || !l7.D0()) {
                return null;
            }
            return l7.Z0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        int i7;
        tl tlVar;
        tl tlVar2;
        cq cqVar = f20254k;
        Context context = this.f20256i;
        AtomicReference a8 = cqVar.a(context.getPackageName());
        synchronized (a8) {
            try {
                tl tlVar3 = (tl) a8.get();
                if (tlVar3 != null) {
                    if (!no.c(tlVar3.f16234b)) {
                        if (!tlVar3.f16234b.equals("E")) {
                            if (tlVar3.f16234b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                            }
                            tlVar2 = (tl) a8.get();
                        }
                    }
                }
                if (no.c(null)) {
                    no.c(null);
                    i7 = 3;
                } else {
                    i7 = 5;
                }
                if (this.f20257j != null) {
                    tlVar = c();
                } else {
                    Boolean valueOf = Boolean.valueOf(i7 == 3 && !this.f20255h.d0());
                    Boolean bool = (Boolean) s2.b0.c().d(uy.Q2);
                    String b8 = ((Boolean) s2.b0.c().d(uy.P2)).booleanValue() ? b() : null;
                    if (bool.booleanValue() && this.f5895a.i() && no.c(b8)) {
                        b8 = d();
                    }
                    tl tlVar4 = new tl((String) this.f5899e.invoke(null, context, valueOf, b8));
                    if (no.c(tlVar4.f16234b) || tlVar4.f16234b.equals("E")) {
                        int i8 = i7 - 1;
                        if (i8 == 3) {
                            String d8 = d();
                            if (!no.c(d8)) {
                                tlVar4.f16234b = d8;
                            }
                        } else if (i8 == 4) {
                            throw null;
                        }
                    }
                    tlVar = tlVar4;
                }
                a8.set(tlVar);
                tlVar2 = (tl) a8.get();
            } finally {
            }
        }
        ak akVar = this.f5898d;
        synchronized (akVar) {
            if (tlVar2 != null) {
                try {
                    akVar.C0(tlVar2.f16234b);
                    akVar.I0(tlVar2.f16235c);
                    akVar.H0(tlVar2.f16236d);
                    akVar.H(tlVar2.f16237e);
                    akVar.I(tlVar2.f16238f);
                } finally {
                }
            }
        }
    }

    protected final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] b8 = no.b((String) s2.b0.c().d(uy.R2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(b8)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(no.b((String) s2.b0.c().d(uy.S2)))));
            }
            Context context = this.f20256i;
            return eq.a(context, context.getPackageName(), arrayList, this.f5895a.d());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
