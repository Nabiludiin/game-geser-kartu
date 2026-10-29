package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: MyApplication */
public final class pz3 extends ud3 {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f14176e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f14177f;

    /* renamed from: g, reason: collision with root package name */
    private long f14178g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14179h;

    public pz3() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        Uri uri = cq3Var.f6571a;
        this.f14177f = uri;
        c(cq3Var);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f14176e = randomAccessFile;
            try {
                long j7 = cq3Var.f6575e;
                randomAccessFile.seek(j7);
                long j8 = cq3Var.f6576f;
                if (j8 == -1) {
                    j8 = this.f14176e.length() - j7;
                }
                this.f14178g = j8;
                if (j8 < 0) {
                    throw new oy3(null, null, 2008);
                }
                this.f14179h = true;
                e(cq3Var);
                return this.f14178g;
            } catch (IOException e8) {
                throw new oy3(e8, 2000);
            }
        } catch (FileNotFoundException e9) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new oy3(e9, ((e9.getCause() instanceof ErrnoException) && ((ErrnoException) e9.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new oy3(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e9, 1004);
        } catch (SecurityException e10) {
            throw new oy3(e10, 2006);
        } catch (RuntimeException e11) {
            throw new oy3(e11, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        return this.f14177f;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        this.f14177f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14176e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f14176e = null;
                if (this.f14179h) {
                    this.f14179h = false;
                    g();
                }
            } catch (IOException e8) {
                throw new oy3(e8, 2000);
            }
        } catch (Throwable th) {
            this.f14176e = null;
            if (this.f14179h) {
                this.f14179h = false;
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
        long j7 = this.f14178g;
        if (j7 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f14176e;
            String str = hi2.f9535a;
            int read = randomAccessFile.read(bArr, i7, (int) Math.min(j7, i8));
            if (read > 0) {
                this.f14178g -= read;
                f(read);
            }
            return read;
        } catch (IOException e8) {
            throw new oy3(e8, 2000);
        }
    }
}
