package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: MyApplication */
public final class l8 implements p8 {

    /* renamed from: i, reason: collision with root package name */
    private static final ConcurrentMap f21093i = new ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f21094j = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f21095a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f21096b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f21097c;

    /* renamed from: g, reason: collision with root package name */
    private volatile Map f21101g;

    /* renamed from: d, reason: collision with root package name */
    private ContentObserver f21098d = null;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f21099e = true;

    /* renamed from: f, reason: collision with root package name */
    private final Object f21100f = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final List f21102h = new ArrayList();

    private l8(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        y4.h.h(contentResolver);
        y4.h.h(uri);
        this.f21095a = contentResolver;
        this.f21096b = uri;
        this.f21097c = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        if (r3 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.l8 a(final android.content.ContentResolver r3, final android.net.Uri r4, final java.lang.Runnable r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L14
            java.util.concurrent.ConcurrentMap r0 = com.google.android.gms.internal.measurement.l8.f21093i
            com.google.android.gms.internal.measurement.j8 r1 = new com.google.android.gms.internal.measurement.j8
            r1.<init>()
            java.lang.Object r3 = com.google.android.gms.internal.measurement.k8.a(r0, r4, r1)
            com.google.android.gms.internal.measurement.l8 r3 = (com.google.android.gms.internal.measurement.l8) r3
            goto L2c
        L14:
            java.util.concurrent.ConcurrentMap r0 = com.google.android.gms.internal.measurement.l8.f21093i
            java.lang.Object r1 = r0.get(r4)
            com.google.android.gms.internal.measurement.l8 r1 = (com.google.android.gms.internal.measurement.l8) r1
            if (r1 != 0) goto L2b
            com.google.android.gms.internal.measurement.l8 r1 = new com.google.android.gms.internal.measurement.l8
            r1.<init>(r3, r4, r5)
            java.lang.Object r3 = r0.putIfAbsent(r4, r1)
            com.google.android.gms.internal.measurement.l8 r3 = (com.google.android.gms.internal.measurement.l8) r3
            if (r3 != 0) goto L2c
        L2b:
            r3 = r1
        L2c:
            r4 = 0
            boolean r5 = r3.f21099e     // Catch: java.lang.SecurityException -> L4f
            if (r5 == 0) goto L4e
            monitor-enter(r3)     // Catch: java.lang.SecurityException -> L4f
            boolean r5 = r3.f21099e     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L4a
            com.google.android.gms.internal.measurement.h8 r5 = new com.google.android.gms.internal.measurement.h8     // Catch: java.lang.Throwable -> L48
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L48
            android.content.ContentResolver r0 = r3.f21095a     // Catch: java.lang.Throwable -> L48
            android.net.Uri r1 = r3.f21096b     // Catch: java.lang.Throwable -> L48
            r2 = 0
            r0.registerContentObserver(r1, r2, r5)     // Catch: java.lang.Throwable -> L48
            r3.f21098d = r5     // Catch: java.lang.Throwable -> L48
            r3.f21099e = r2     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r5 = move-exception
            goto L4c
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L48
            return r3
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L48
            throw r5     // Catch: java.lang.SecurityException -> L4f
        L4e:
            return r3
        L4f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l8.a(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.gms.internal.measurement.l8");
    }

    static void d() {
        Iterator it = f21093i.values().iterator();
        while (it.hasNext()) {
            l8 l8Var = (l8) it.next();
            synchronized (l8Var) {
                try {
                    if (l8Var.f21099e) {
                        l8Var.f21099e = false;
                    } else {
                        ContentObserver contentObserver = l8Var.f21098d;
                        if (contentObserver != null) {
                            l8Var.f21095a.unregisterContentObserver(contentObserver);
                            l8Var.f21098d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    static /* synthetic */ l8 e(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new l8(contentResolver, uri, runnable);
    }

    public final Map b() {
        Map map;
        Map map2 = this.f21101g;
        if (map2 == null) {
            synchronized (this.f21100f) {
                map2 = this.f21101g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) o8.a(new n8() { // from class: com.google.android.gms.internal.measurement.i8
                                @Override // com.google.android.gms.internal.measurement.n8
                                public final /* synthetic */ Object a() {
                                    return l8.this.f();
                                }
                            });
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e8) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e8);
                        map = Collections.EMPTY_MAP;
                    }
                    this.f21101g = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void c() {
        synchronized (this.f21100f) {
            this.f21101g = null;
            this.f21097c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f21102h.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Map f() {
        ContentResolver contentResolver = this.f21095a;
        Uri uri = this.f21096b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor query = acquireUnstableContentProviderClient.query(uri, f21094j, null, null, null);
            try {
                if (query == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                Map aVar = count <= 256 ? new r.a(count) : new HashMap(count, 1.0f);
                while (query.moveToNext()) {
                    aVar.put(query.getString(0), query.getString(1));
                }
                if (query.isAfterLast()) {
                    query.close();
                    return aVar;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map2 = Collections.EMPTY_MAP;
                query.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e8) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e8);
            return Collections.EMPTY_MAP;
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final /* bridge */ /* synthetic */ Object y(String str) {
        return (String) b().get(str);
    }
}
