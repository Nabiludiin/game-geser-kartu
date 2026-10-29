package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
public final class gs3 implements yl3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9109a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9110b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final yl3 f9111c;

    /* renamed from: d, reason: collision with root package name */
    private yl3 f9112d;

    /* renamed from: e, reason: collision with root package name */
    private yl3 f9113e;

    /* renamed from: f, reason: collision with root package name */
    private yl3 f9114f;

    /* renamed from: g, reason: collision with root package name */
    private yl3 f9115g;

    /* renamed from: h, reason: collision with root package name */
    private yl3 f9116h;

    /* renamed from: i, reason: collision with root package name */
    private yl3 f9117i;

    /* renamed from: j, reason: collision with root package name */
    private yl3 f9118j;

    /* renamed from: k, reason: collision with root package name */
    private yl3 f9119k;

    public gs3(Context context, yl3 yl3Var) {
        this.f9109a = context.getApplicationContext();
        this.f9111c = yl3Var;
    }

    private final yl3 c() {
        if (this.f9113e == null) {
            tc3 tc3Var = new tc3(this.f9109a);
            this.f9113e = tc3Var;
            e(tc3Var);
        }
        return this.f9113e;
    }

    private final void e(yl3 yl3Var) {
        int i7 = 0;
        while (true) {
            List list = this.f9110b;
            if (i7 >= list.size()) {
                return;
            }
            yl3Var.a((kb4) list.get(i7));
            i7++;
        }
    }

    private static final void f(yl3 yl3Var, kb4 kb4Var) {
        if (yl3Var != null) {
            yl3Var.a(kb4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void a(kb4 kb4Var) {
        kb4Var.getClass();
        this.f9111c.a(kb4Var);
        this.f9110b.add(kb4Var);
        f(this.f9112d, kb4Var);
        f(this.f9113e, kb4Var);
        f(this.f9114f, kb4Var);
        f(this.f9115g, kb4Var);
        f(this.f9116h, kb4Var);
        f(this.f9117i, kb4Var);
        f(this.f9118j, kb4Var);
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        yl3 yl3Var;
        rx3.h(this.f9119k == null);
        Uri uri = cq3Var.f6571a;
        String scheme = uri.getScheme();
        String str = hi2.f9535a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f9112d == null) {
                    pz3 pz3Var = new pz3();
                    this.f9112d = pz3Var;
                    e(pz3Var);
                }
                this.f9119k = this.f9112d;
            } else {
                this.f9119k = c();
            }
        } else if ("asset".equals(scheme)) {
            this.f9119k = c();
        } else if ("content".equals(scheme)) {
            if (this.f9114f == null) {
                si3 si3Var = new si3(this.f9109a);
                this.f9114f = si3Var;
                e(si3Var);
            }
            this.f9119k = this.f9114f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f9115g == null) {
                try {
                    yl3 yl3Var2 = (yl3) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.f9115g = yl3Var2;
                    e(yl3Var2);
                } catch (ClassNotFoundException unused) {
                    gv1.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e8) {
                    throw new RuntimeException("Error instantiating RTMP extension", e8);
                }
                if (this.f9115g == null) {
                    this.f9115g = this.f9111c;
                }
            }
            this.f9119k = this.f9115g;
        } else if ("udp".equals(scheme)) {
            if (this.f9116h == null) {
                nd4 nd4Var = new nd4(2000);
                this.f9116h = nd4Var;
                e(nd4Var);
            }
            this.f9119k = this.f9116h;
        } else if ("data".equals(scheme)) {
            if (this.f9117i == null) {
                tj3 tj3Var = new tj3();
                this.f9117i = tj3Var;
                e(tj3Var);
            }
            this.f9119k = this.f9117i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f9118j == null) {
                    j94 j94Var = new j94(this.f9109a);
                    this.f9118j = j94Var;
                    e(j94Var);
                }
                yl3Var = this.f9118j;
            } else {
                yl3Var = this.f9111c;
            }
            this.f9119k = yl3Var;
        }
        return this.f9119k.b(cq3Var);
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        yl3 yl3Var = this.f9119k;
        if (yl3Var == null) {
            return null;
        }
        return yl3Var.d();
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        yl3 yl3Var = this.f9119k;
        if (yl3Var != null) {
            try {
                yl3Var.h();
            } finally {
                this.f9119k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yl3, com.google.android.gms.internal.ads.g64
    public final Map i() {
        yl3 yl3Var = this.f9119k;
        return yl3Var == null ? Collections.EMPTY_MAP : yl3Var.i();
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        yl3 yl3Var = this.f9119k;
        yl3Var.getClass();
        return yl3Var.r(bArr, i7, i8);
    }
}
