package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class d8 implements z7 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f20873a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private HashMap f20874b = null;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f20875c = new HashMap(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f20876d = new HashMap(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f20877e = new HashMap(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f20878f = new HashMap(16, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    private Object f20879g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20880h = false;

    /* renamed from: i, reason: collision with root package name */
    private final String[] f20881i = new String[0];

    @Override // com.google.android.gms.internal.measurement.z7
    public final String a(ContentResolver contentResolver, String str, String str2) {
        String str3;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str4 = null;
                if (this.f20874b == null) {
                    this.f20873a.set(false);
                    this.f20874b = new HashMap(16, 1.0f);
                    this.f20879g = new Object();
                    contentResolver.registerContentObserver(y7.f21449a, true, new b8(this, null));
                } else if (this.f20873a.getAndSet(false)) {
                    this.f20874b.clear();
                    this.f20875c.clear();
                    this.f20876d.clear();
                    this.f20877e.clear();
                    this.f20878f.clear();
                    this.f20879g = new Object();
                    this.f20880h = false;
                }
                Object obj = this.f20879g;
                if (this.f20874b.containsKey(str)) {
                    String str5 = (String) this.f20874b.get(str);
                    if (str5 != null) {
                        str4 = str5;
                    }
                    return str4;
                }
                try {
                    Uri uri = y7.f21449a;
                    ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (acquireUnstableContentProviderClient == null) {
                            throw new c8("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (query == null) {
                                    throw new c8("ContentProvider query returned null cursor");
                                }
                                if (query.moveToFirst()) {
                                    str3 = query.getString(1);
                                    query.close();
                                    acquireUnstableContentProviderClient.release();
                                } else {
                                    query.close();
                                    acquireUnstableContentProviderClient.release();
                                    str3 = null;
                                }
                                if (str3 != null && str3.equals(null)) {
                                    str3 = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.f20879g) {
                                            this.f20874b.put(str, str3);
                                        }
                                    } finally {
                                    }
                                }
                                if (str3 != null) {
                                    return str3;
                                }
                                return null;
                            } finally {
                            }
                        } catch (RemoteException e8) {
                            throw new c8("ContentProvider query failed", e8);
                        }
                    } catch (Throwable th) {
                        acquireUnstableContentProviderClient.release();
                        throw th;
                    }
                } catch (c8 unused) {
                    return null;
                }
            } finally {
            }
        }
    }

    final /* synthetic */ AtomicBoolean b() {
        return this.f20873a;
    }
}
