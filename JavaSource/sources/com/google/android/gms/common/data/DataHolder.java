package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import p3.o;
import q3.c;

/* compiled from: MyApplication */
public final class DataHolder extends q3.a implements Closeable {

    /* renamed from: q, reason: collision with root package name */
    final int f4539q;

    /* renamed from: r, reason: collision with root package name */
    private final String[] f4540r;

    /* renamed from: s, reason: collision with root package name */
    Bundle f4541s;

    /* renamed from: t, reason: collision with root package name */
    private final CursorWindow[] f4542t;

    /* renamed from: u, reason: collision with root package name */
    private final int f4543u;

    /* renamed from: v, reason: collision with root package name */
    private final Bundle f4544v;

    /* renamed from: w, reason: collision with root package name */
    int[] f4545w;

    /* renamed from: x, reason: collision with root package name */
    int f4546x;

    /* renamed from: y, reason: collision with root package name */
    boolean f4547y = false;

    /* renamed from: z, reason: collision with root package name */
    private boolean f4548z = true;
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();
    private static final a A = new com.google.android.gms.common.data.a(new String[0], null);

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f4549a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f4550b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f4551c = new HashMap();
    }

    DataHolder(int i7, String[] strArr, CursorWindow[] cursorWindowArr, int i8, Bundle bundle) {
        this.f4539q = i7;
        this.f4540r = strArr;
        this.f4542t = cursorWindowArr;
        this.f4543u = i8;
        this.f4544v = bundle;
    }

    private final void U0(String str, int i7) {
        Bundle bundle = this.f4541s;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i7 < 0 || i7 >= this.f4546x) {
            throw new CursorIndexOutOfBoundsException(i7, this.f4546x);
        }
    }

    public boolean M0(String str, int i7, int i8) {
        U0(str, i7);
        return this.f4542t[i8].getLong(i7, this.f4541s.getInt(str)) == 1;
    }

    public int N0(String str, int i7, int i8) {
        U0(str, i7);
        return this.f4542t[i8].getInt(i7, this.f4541s.getInt(str));
    }

    public long O0(String str, int i7, int i8) {
        U0(str, i7);
        return this.f4542t[i8].getLong(i7, this.f4541s.getInt(str));
    }

    public Bundle P0() {
        return this.f4544v;
    }

    public int Q0() {
        return this.f4543u;
    }

    public String R0(String str, int i7, int i8) {
        U0(str, i7);
        return this.f4542t[i8].getString(i7, this.f4541s.getInt(str));
    }

    public int S0(int i7) {
        int length;
        int i8 = 0;
        o.p(i7 >= 0 && i7 < this.f4546x);
        while (true) {
            int[] iArr = this.f4545w;
            length = iArr.length;
            if (i8 >= length) {
                break;
            }
            if (i7 < iArr[i8]) {
                i8--;
                break;
            }
            i8++;
        }
        return i8 == length ? i8 - 1 : i8;
    }

    public final void T0() {
        this.f4541s = new Bundle();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            String[] strArr = this.f4540r;
            if (i8 >= strArr.length) {
                break;
            }
            this.f4541s.putInt(strArr[i8], i8);
            i8++;
        }
        this.f4545w = new int[this.f4542t.length];
        int i9 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f4542t;
            if (i7 >= cursorWindowArr.length) {
                this.f4546x = i9;
                return;
            }
            this.f4545w[i7] = i9;
            i9 += this.f4542t[i7].getNumRows() - (i9 - cursorWindowArr[i7].getStartPosition());
            i7++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f4547y) {
                    this.f4547y = true;
                    int i7 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f4542t;
                        if (i7 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i7].close();
                        i7++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.f4548z && this.f4542t.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public int getCount() {
        return this.f4546x;
    }

    public boolean isClosed() {
        boolean z7;
        synchronized (this) {
            z7 = this.f4547y;
        }
        return z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String[] strArr = this.f4540r;
        int a8 = c.a(parcel);
        c.s(parcel, 1, strArr, false);
        c.u(parcel, 2, this.f4542t, i7, false);
        c.l(parcel, 3, Q0());
        c.f(parcel, 4, P0(), false);
        c.l(parcel, 1000, this.f4539q);
        c.b(parcel, a8);
        if ((i7 & 1) != 0) {
            close();
        }
    }
}
