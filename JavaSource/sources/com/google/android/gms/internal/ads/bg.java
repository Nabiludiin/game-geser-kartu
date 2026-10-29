package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: MyApplication */
public final class bg implements qe {

    /* renamed from: c, reason: collision with root package name */
    private final ag f5757c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f5755a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private long f5756b = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f5758d = 5242880;

    public bg(ag agVar, int i7) {
        this.f5757c = agVar;
    }

    static byte[] g(zf zfVar, long j7) {
        long a8 = zfVar.a();
        if (j7 >= 0 && j7 <= a8) {
            int i7 = (int) j7;
            if (i7 == j7) {
                byte[] bArr = new byte[i7];
                new DataInputStream(zfVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 33 + String.valueOf(a8).length());
        sb.append("streamToBytes length=");
        sb.append(j7);
        sb.append(", maxLength=");
        sb.append(a8);
        throw new IOException(sb.toString());
    }

    static void h(OutputStream outputStream, int i7) {
        outputStream.write(i7 & 255);
        outputStream.write((i7 >> 8) & 255);
        outputStream.write((i7 >> 16) & 255);
        outputStream.write((i7 >> 24) & 255);
    }

    static int i(InputStream inputStream) {
        return (p(inputStream) << 24) | p(inputStream) | (p(inputStream) << 8) | (p(inputStream) << 16);
    }

    static void j(OutputStream outputStream, long j7) {
        outputStream.write((byte) j7);
        outputStream.write((byte) (j7 >>> 8));
        outputStream.write((byte) (j7 >>> 16));
        outputStream.write((byte) (j7 >>> 24));
        outputStream.write((byte) (j7 >>> 32));
        outputStream.write((byte) (j7 >>> 40));
        outputStream.write((byte) (j7 >>> 48));
        outputStream.write((byte) (j7 >>> 56));
    }

    static long k(InputStream inputStream) {
        return (p(inputStream) & 255) | ((p(inputStream) & 255) << 8) | ((p(inputStream) & 255) << 16) | ((p(inputStream) & 255) << 24) | ((p(inputStream) & 255) << 32) | ((p(inputStream) & 255) << 40) | ((p(inputStream) & 255) << 48) | ((p(inputStream) & 255) << 56);
    }

    static void l(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        j(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static String m(zf zfVar) {
        return new String(g(zfVar, k(zfVar)), "UTF-8");
    }

    private final void n(String str, yf yfVar) {
        Map map = this.f5755a;
        if (map.containsKey(str)) {
            this.f5756b += yfVar.f19537a - ((yf) map.get(str)).f19537a;
        } else {
            this.f5756b += yfVar.f19537a;
        }
        map.put(str, yfVar);
    }

    private final void o(String str) {
        yf yfVar = (yf) this.f5755a.remove(str);
        if (yfVar != null) {
            this.f5756b -= yfVar.f19537a;
        }
    }

    private static int p(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static final String q(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final synchronized void a(String str) {
        boolean delete = f(str).delete();
        o(str);
        if (delete) {
            return;
        }
        rf.b("Could not delete cache entry for key=%s, filename=%s", str, q(str));
    }

    @Override // com.google.android.gms.internal.ads.qe
    public final synchronized pe b(String str) {
        yf yfVar = (yf) this.f5755a.get(str);
        if (yfVar == null) {
            return null;
        }
        File f8 = f(str);
        try {
            zf zfVar = new zf(new BufferedInputStream(new FileInputStream(f8)), f8.length());
            try {
                String str2 = yf.a(zfVar).f19538b;
                if (!TextUtils.equals(str, str2)) {
                    rf.b("%s: key=%s, found=%s", f8.getAbsolutePath(), str, str2);
                    o(str);
                    return null;
                }
                byte[] g8 = g(zfVar, zfVar.a());
                pe peVar = new pe();
                peVar.f13843a = g8;
                peVar.f13844b = yfVar.f19539c;
                peVar.f13845c = yfVar.f19540d;
                peVar.f13846d = yfVar.f19541e;
                peVar.f13847e = yfVar.f19542f;
                peVar.f13848f = yfVar.f19543g;
                List<ye> list = yfVar.f19544h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (ye yeVar : list) {
                    treeMap.put(yeVar.a(), yeVar.b());
                }
                peVar.f13849g = treeMap;
                peVar.f13850h = Collections.unmodifiableList(list);
                return peVar;
            } finally {
                zfVar.close();
            }
        } catch (IOException e8) {
            rf.b("%s: %s", f8.getAbsolutePath(), e8.toString());
            a(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.qe
    public final synchronized void c(String str, boolean z7) {
        pe b8 = b(str);
        if (b8 != null) {
            b8.f13848f = 0L;
            b8.f13847e = 0L;
            e(str, b8);
        }
    }

    @Override // com.google.android.gms.internal.ads.qe
    public final synchronized void d() {
        File a8 = this.f5757c.a();
        if (a8.exists()) {
            File[] listFiles = a8.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        zf zfVar = new zf(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            yf a9 = yf.a(zfVar);
                            a9.f19537a = length;
                            n(a9.f19538b, a9);
                            zfVar.close();
                        } catch (Throwable th) {
                            zfVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!a8.mkdirs()) {
            rf.c("Unable to create cache dir %s", a8.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.qe
    public final synchronized void e(String str, pe peVar) {
        int i7;
        int i8;
        long j7;
        char c8;
        float f8;
        try {
            long j8 = this.f5756b;
            int length = peVar.f13843a.length;
            long j9 = j8 + length;
            int i9 = this.f5758d;
            float f9 = 0.9f;
            if (j9 <= i9 || length <= i9 * 0.9f) {
                File f10 = f(str);
                int i10 = 0;
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(f10));
                    yf yfVar = new yf(str, peVar);
                    try {
                        try {
                            h(bufferedOutputStream, 538247942);
                            l(bufferedOutputStream, yfVar.f19538b);
                            String str2 = yfVar.f19539c;
                            if (str2 == null) {
                                str2 = "";
                            }
                            l(bufferedOutputStream, str2);
                            j(bufferedOutputStream, yfVar.f19540d);
                            j(bufferedOutputStream, yfVar.f19541e);
                            j(bufferedOutputStream, yfVar.f19542f);
                            j(bufferedOutputStream, yfVar.f19543g);
                            List<ye> list = yfVar.f19544h;
                            if (list != null) {
                                h(bufferedOutputStream, list.size());
                                for (ye yeVar : list) {
                                    l(bufferedOutputStream, yeVar.a());
                                    l(bufferedOutputStream, yeVar.b());
                                }
                            } else {
                                h(bufferedOutputStream, 0);
                            }
                            bufferedOutputStream.flush();
                            bufferedOutputStream.write(peVar.f13843a);
                            bufferedOutputStream.close();
                            yfVar.f19537a = f10.length();
                            n(str, yfVar);
                            long j10 = this.f5756b;
                            int i11 = this.f5758d;
                            if (j10 >= i11) {
                                boolean z7 = rf.f14885b;
                                if (z7) {
                                    rf.a("Pruning old cache entries.", new Object[0]);
                                }
                                long j11 = this.f5756b;
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                Iterator it = this.f5755a.entrySet().iterator();
                                int i12 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i8 = i10;
                                        j7 = j11;
                                        c8 = 1;
                                        break;
                                    }
                                    yf yfVar2 = (yf) ((Map.Entry) it.next()).getValue();
                                    String str3 = yfVar2.f19538b;
                                    if (f(str3).delete()) {
                                        i8 = i10;
                                        j7 = j11;
                                        f8 = f9;
                                        c8 = 1;
                                        this.f5756b -= yfVar2.f19537a;
                                    } else {
                                        f8 = f9;
                                        i8 = i10;
                                        j7 = j11;
                                        c8 = 1;
                                        String q7 = q(str3);
                                        Object[] objArr = new Object[2];
                                        objArr[i8] = str3;
                                        objArr[1] = q7;
                                        rf.b("Could not delete cache entry for key=%s, filename=%s", objArr);
                                    }
                                    it.remove();
                                    i12++;
                                    if (this.f5756b < i11 * f8) {
                                        break;
                                    }
                                    j11 = j7;
                                    i10 = i8;
                                    f9 = f8;
                                }
                                if (z7) {
                                    Integer valueOf = Integer.valueOf(i12);
                                    Long valueOf2 = Long.valueOf(this.f5756b - j7);
                                    Long valueOf3 = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
                                    Object[] objArr2 = new Object[3];
                                    objArr2[i8] = valueOf;
                                    objArr2[c8] = valueOf2;
                                    objArr2[2] = valueOf3;
                                    rf.a("pruned %d files, %d bytes, %d ms", objArr2);
                                }
                            }
                        } catch (IOException e8) {
                            rf.b("%s", e8.toString());
                            bufferedOutputStream.close();
                            rf.b("Failed to write header for %s", f10.getAbsolutePath());
                            throw new IOException();
                        }
                    } catch (IOException unused) {
                        if (!f10.delete()) {
                            Object[] objArr3 = new Object[1];
                            objArr3[i7] = f10.getAbsolutePath();
                            rf.b("Could not clean up file %s", objArr3);
                        }
                        if (!this.f5757c.a().exists()) {
                            rf.b("Re-initializing cache after external clearing.", new Object[i7]);
                            this.f5755a.clear();
                            this.f5756b = 0L;
                            d();
                        }
                    }
                } catch (IOException unused2) {
                    i7 = i10;
                }
            }
        } finally {
        }
    }

    public final File f(String str) {
        return new File(this.f5757c.a(), q(str));
    }

    public bg(File file, int i7) {
        this.f5757c = new xf(this, file);
    }
}
