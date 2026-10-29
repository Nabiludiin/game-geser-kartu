package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class zy {

    /* renamed from: d, reason: collision with root package name */
    String f20517d;

    /* renamed from: e, reason: collision with root package name */
    Context f20518e;

    /* renamed from: f, reason: collision with root package name */
    String f20519f;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f20521h;

    /* renamed from: i, reason: collision with root package name */
    private File f20522i;

    /* renamed from: a, reason: collision with root package name */
    final BlockingQueue f20514a = new ArrayBlockingQueue(100);

    /* renamed from: b, reason: collision with root package name */
    final LinkedHashMap f20515b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map f20516c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final HashSet f20520g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    private final void g(Map map, jz jzVar) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.f20517d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (jzVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(jzVar.a())) {
                sb.append("&it=");
                sb.append(jzVar.a());
            }
            if (!TextUtils.isEmpty(jzVar.b())) {
                sb.append("&blat=");
                sb.append(jzVar.b());
            }
            uri = sb.toString();
        }
        if (!this.f20521h.get()) {
            r2.t.g();
            v2.f2.p(this.f20518e, this.f20519f, uri);
            return;
        }
        File file = this.f20522i;
        if (file == null) {
            int i7 = v2.n1.f26802b;
            w2.p.f("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e8) {
            e = e8;
        }
        try {
            fileOutputStream.write(uri.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e9) {
                int i8 = v2.n1.f26802b;
                w2.p.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e9);
            }
        } catch (IOException e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            int i9 = v2.n1.f26802b;
            w2.p.g("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e11) {
                    w2.p.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e12) {
                    int i10 = v2.n1.f26802b;
                    w2.p.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                }
            }
            throw th;
        }
    }

    public final void a(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f20518e = context;
        this.f20519f = str;
        this.f20517d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f20521h = atomicBoolean;
        atomicBoolean.set(((Boolean) r00.f14689c.e()).booleanValue());
        if (this.f20521h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f20522i = new File(se3.a().a(externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f20515b.put((String) entry.getKey(), (String) entry.getValue());
        }
        cm0.f6500a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zy.this.f();
            }
        });
        Map map2 = this.f20516c;
        gz gzVar = gz.f9257b;
        map2.put("action", gzVar);
        map2.put("ad_format", gzVar);
        map2.put("e", gz.f9258c);
    }

    public final boolean b(kz kzVar) {
        return this.f20514a.offer(kzVar);
    }

    final Map c(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, d(str).a((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final gz d(String str) {
        gz gzVar = (gz) this.f20516c.get(str);
        return gzVar != null ? gzVar : gz.f9256a;
    }

    public final void e(String str) {
        if (this.f20520g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f20519f);
        linkedHashMap.put("ue", str);
        g(c(this.f20515b, linkedHashMap), null);
    }

    final /* synthetic */ void f() {
        while (true) {
            try {
                kz kzVar = (kz) this.f20514a.take();
                jz c8 = kzVar.c();
                if (!TextUtils.isEmpty(c8.a())) {
                    g(c(this.f20515b, kzVar.e()), c8);
                }
            } catch (InterruptedException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.g("CsiReporter:reporter interrupted", e8);
                return;
            }
        }
    }
}
