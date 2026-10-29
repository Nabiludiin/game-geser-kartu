package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: MyApplication */
public final class j94 extends ud3 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f10409e;

    /* renamed from: f, reason: collision with root package name */
    private cq3 f10410f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f10411g;

    /* renamed from: h, reason: collision with root package name */
    private InputStream f10412h;

    /* renamed from: i, reason: collision with root package name */
    private long f10413i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10414j;

    public j94(Context context) {
        super(false);
        this.f10409e = context.getApplicationContext();
    }

    private static AssetFileDescriptor j(Context context, cq3 cq3Var) {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = cq3Var.f6571a.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 61);
                sb.append("rawresource:// URI must have exactly one path element, found ");
                sb.append(size);
                throw new i84(sb.toString());
            }
            identifier = l(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                String scheme = normalizeScheme.getScheme();
                StringBuilder sb2 = new StringBuilder(String.valueOf(scheme).length() + 62);
                sb2.append("Unsupported URI scheme (");
                sb2.append(scheme);
                sb2.append("). Only android.resource is supported.");
                throw new i84(sb2.toString(), null, 1004);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e8) {
                    throw new i84("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e8, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = l(path);
            } else {
                StringBuilder sb3 = new StringBuilder(packageName.length() + 1 + path.length());
                sb3.append(packageName);
                sb3.append(":");
                sb3.append(path);
                identifier = resourcesForApplication.getIdentifier(sb3.toString(), "raw", null);
                if (identifier == 0) {
                    throw new i84("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new i84("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e9) {
            throw new i84(null, e9, 2005);
        }
    }

    private static int l(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new i84("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        long j7;
        this.f10410f = cq3Var;
        c(cq3Var);
        AssetFileDescriptor j8 = j(this.f10409e, cq3Var);
        this.f10411g = j8;
        long length = j8.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f10411g.getFileDescriptor());
        this.f10412h = fileInputStream;
        if (length != -1) {
            try {
                if (cq3Var.f6575e > length) {
                    throw new i84(null, null, 2008);
                }
            } catch (i84 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new i84(null, e9, 2000);
            }
        }
        long startOffset = this.f10411g.getStartOffset();
        long j9 = cq3Var.f6575e;
        long skip = fileInputStream.skip(startOffset + j9) - startOffset;
        if (skip != j9) {
            throw new i84(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f10413i = -1L;
                j7 = -1;
            } else {
                j7 = channel.size() - channel.position();
                this.f10413i = j7;
                if (j7 < 0) {
                    throw new i84(null, null, 2008);
                }
            }
        } else {
            long j10 = length - skip;
            this.f10413i = j10;
            if (j10 < 0) {
                throw new zm3(2008);
            }
            j7 = j10;
        }
        long j11 = cq3Var.f6576f;
        if (j11 != -1) {
            this.f10413i = j7 == -1 ? j11 : Math.min(j7, j11);
        }
        this.f10414j = true;
        e(cq3Var);
        return j11 != -1 ? j11 : this.f10413i;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        cq3 cq3Var = this.f10410f;
        if (cq3Var != null) {
            return cq3Var.f6571a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        this.f10410f = null;
        try {
            try {
                try {
                    InputStream inputStream = this.f10412h;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.f10412h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f10411g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f10411g = null;
                        if (this.f10414j) {
                            this.f10414j = false;
                            g();
                        }
                    } catch (IOException e8) {
                        throw new i84(null, e8, 2000);
                    }
                } catch (IOException e9) {
                    throw new i84(null, e9, 2000);
                }
            } catch (Throwable th) {
                this.f10412h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f10411g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f10411g = null;
                    if (this.f10414j) {
                        this.f10414j = false;
                        g();
                    }
                    throw th;
                } catch (IOException e10) {
                    throw new i84(null, e10, 2000);
                }
            }
        } catch (Throwable th2) {
            this.f10411g = null;
            if (this.f10414j) {
                this.f10414j = false;
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
        long j7 = this.f10413i;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e8) {
                throw new i84(null, e8, 2000);
            }
        }
        InputStream inputStream = this.f10412h;
        String str = hi2.f9535a;
        int read = inputStream.read(bArr, i7, i8);
        if (read == -1) {
            if (this.f10413i == -1) {
                return -1;
            }
            throw new i84("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j8 = this.f10413i;
        if (j8 != -1) {
            this.f10413i = j8 - read;
        }
        f(read);
        return read;
    }
}
