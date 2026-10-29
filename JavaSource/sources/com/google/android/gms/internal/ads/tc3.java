package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MyApplication */
public final class tc3 extends ud3 {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f16131e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f16132f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f16133g;

    /* renamed from: h, reason: collision with root package name */
    private long f16134h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16135i;

    public tc3(Context context) {
        super(false);
        this.f16131e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        try {
            Uri uri = cq3Var.f6571a;
            this.f16132f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            c(cq3Var);
            InputStream open = this.f16131e.open(path, 1);
            this.f16133g = open;
            long j7 = cq3Var.f6575e;
            if (open.skip(j7) < j7) {
                throw new ub3(null, 2008);
            }
            long j8 = cq3Var.f6576f;
            if (j8 != -1) {
                this.f16134h = j8;
            } else {
                long available = this.f16133g.available();
                this.f16134h = available;
                if (available == 2147483647L) {
                    this.f16134h = -1L;
                }
            }
            this.f16135i = true;
            e(cq3Var);
            return this.f16134h;
        } catch (ub3 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new ub3(e9, true != (e9 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        return this.f16132f;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        this.f16132f = null;
        try {
            try {
                InputStream inputStream = this.f16133g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f16133g = null;
                if (this.f16135i) {
                    this.f16135i = false;
                    g();
                }
            } catch (IOException e8) {
                throw new ub3(e8, 2000);
            }
        } catch (Throwable th) {
            this.f16133g = null;
            if (this.f16135i) {
                this.f16135i = false;
                g();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f16134h;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e8) {
                throw new ub3(e8, 2000);
            }
        }
        InputStream inputStream = this.f16133g;
        String str = hi2.f9535a;
        int read = inputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f16134h;
        if (j8 != -1) {
            this.f16134h = j8 - read;
        }
        f(read);
        return read;
    }
}
