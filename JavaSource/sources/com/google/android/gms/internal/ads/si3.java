package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* compiled from: MyApplication */
public final class si3 extends ud3 {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f15637e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f15638f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f15639g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f15640h;

    /* renamed from: i, reason: collision with root package name */
    private long f15641i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15642j;

    public si3(Context context) {
        super(false);
        this.f15637e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        int i7;
        AssetFileDescriptor openAssetFileDescriptor;
        long j7;
        try {
            try {
                Uri normalizeScheme = cq3Var.f6571a.normalizeScheme();
                this.f15638f = normalizeScheme;
                c(cq3Var);
                if (Objects.equals(normalizeScheme.getScheme(), "content")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.f15637e.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.f15637e.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.f15639g = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    String valueOf = String.valueOf(normalizeScheme);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                    sb.append("Could not open file descriptor for: ");
                    sb.append(valueOf);
                    IOException iOException = new IOException(sb.toString());
                    i7 = 2000;
                    try {
                        throw new rh3(iOException, 2000);
                    } catch (IOException e8) {
                        e = e8;
                        throw new rh3(e, true != (e instanceof FileNotFoundException) ? i7 : 2005);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f15640h = fileInputStream;
                if (length != -1 && cq3Var.f6575e > length) {
                    throw new rh3(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long j8 = cq3Var.f6575e;
                long skip = fileInputStream.skip(startOffset + j8) - startOffset;
                if (skip != j8) {
                    throw new rh3(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f15641i = -1L;
                        j7 = -1;
                    } else {
                        j7 = size - channel.position();
                        this.f15641i = j7;
                        if (j7 < 0) {
                            throw new rh3(null, 2008);
                        }
                    }
                } else {
                    long j9 = length - skip;
                    this.f15641i = j9;
                    if (j9 < 0) {
                        throw new rh3(null, 2008);
                    }
                    j7 = j9;
                }
                long j10 = cq3Var.f6576f;
                if (j10 != -1) {
                    this.f15641i = j7 == -1 ? j10 : Math.min(j7, j10);
                }
                this.f15642j = true;
                e(cq3Var);
                return j10 != -1 ? j10 : this.f15641i;
            } catch (rh3 e9) {
                throw e9;
            }
        } catch (IOException e10) {
            e = e10;
            i7 = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        return this.f15638f;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        this.f15638f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.f15640h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.f15640h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f15639g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f15639g = null;
                        if (this.f15642j) {
                            this.f15642j = false;
                            g();
                        }
                    } catch (IOException e8) {
                        throw new rh3(e8, 2000);
                    }
                } catch (IOException e9) {
                    throw new rh3(e9, 2000);
                }
            } catch (Throwable th) {
                this.f15640h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f15639g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f15639g = null;
                    if (this.f15642j) {
                        this.f15642j = false;
                        g();
                    }
                    throw th;
                } catch (IOException e10) {
                    throw new rh3(e10, 2000);
                }
            }
        } catch (Throwable th2) {
            this.f15639g = null;
            if (this.f15642j) {
                this.f15642j = false;
                g();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f15641i;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e8) {
                throw new rh3(e8, 2000);
            }
        }
        FileInputStream fileInputStream = this.f15640h;
        String str = hi2.f9535a;
        int read = fileInputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f15641i;
        if (j8 != -1) {
            this.f15641i = j8 - read;
        }
        f(read);
        return read;
    }
}
