package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: MyApplication */
public final class wf {

    /* renamed from: d, reason: collision with root package name */
    protected static final Comparator f18235d = new vf();

    /* renamed from: a, reason: collision with root package name */
    private final List f18236a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f18237b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f18238c = 0;

    public wf(int i7) {
    }

    private final synchronized void c() {
        while (this.f18238c > 4096) {
            byte[] bArr = (byte[]) this.f18236a.remove(0);
            this.f18237b.remove(bArr);
            this.f18238c -= bArr.length;
        }
    }

    public final synchronized byte[] a(int i7) {
        int i8 = 0;
        while (true) {
            List list = this.f18237b;
            if (i8 >= list.size()) {
                return new byte[i7];
            }
            byte[] bArr = (byte[]) list.get(i8);
            int length = bArr.length;
            if (length >= i7) {
                this.f18238c -= length;
                list.remove(i8);
                this.f18236a.remove(bArr);
                return bArr;
            }
            i8++;
        }
    }

    public final synchronized void b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f18236a.add(bArr);
                List list = this.f18237b;
                int binarySearch = Collections.binarySearch(list, bArr, f18235d);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                list.add(binarySearch, bArr);
                this.f18238c += length;
                c();
            }
        }
    }
}
