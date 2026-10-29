package t6;

import f6.a0;
import java.util.NoSuchElementException;

/* compiled from: MyApplication */
public final class b extends a0 {

    /* renamed from: q, reason: collision with root package name */
    private final int f26447q;

    /* renamed from: r, reason: collision with root package name */
    private final int f26448r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f26449s;

    /* renamed from: t, reason: collision with root package name */
    private int f26450t;

    public b(int i7, int i8, int i9) {
        this.f26447q = i9;
        this.f26448r = i8;
        boolean z7 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z7 = true;
        }
        this.f26449s = z7;
        this.f26450t = z7 ? i7 : i8;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f26449s;
    }

    @Override // f6.a0
    public int nextInt() {
        int i7 = this.f26450t;
        if (i7 != this.f26448r) {
            this.f26450t = this.f26447q + i7;
            return i7;
        }
        if (!this.f26449s) {
            throw new NoSuchElementException();
        }
        this.f26449s = false;
        return i7;
    }
}
