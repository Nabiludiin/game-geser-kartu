package w6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: MyApplication */
final class d implements Iterator {

    /* renamed from: v, reason: collision with root package name */
    private static final a f27190v = new a(null);

    /* renamed from: q, reason: collision with root package name */
    private final CharSequence f27191q;

    /* renamed from: r, reason: collision with root package name */
    private int f27192r;

    /* renamed from: s, reason: collision with root package name */
    private int f27193s;

    /* renamed from: t, reason: collision with root package name */
    private int f27194t;

    /* renamed from: u, reason: collision with root package name */
    private int f27195u;

    /* compiled from: MyApplication */
    private static final class a {
        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        private a() {
        }
    }

    public d(CharSequence charSequence) {
        q6.i.e(charSequence, "string");
        this.f27191q = charSequence;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f27192r = 0;
        int i7 = this.f27194t;
        int i8 = this.f27193s;
        this.f27193s = this.f27195u + i7;
        return this.f27191q.subSequence(i8, i7).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i7;
        int i8;
        int i9 = this.f27192r;
        if (i9 != 0) {
            return i9 == 1;
        }
        if (this.f27195u < 0) {
            this.f27192r = 2;
            return false;
        }
        int length = this.f27191q.length();
        int length2 = this.f27191q.length();
        for (int i10 = this.f27193s; i10 < length2; i10++) {
            char charAt = this.f27191q.charAt(i10);
            if (charAt == '\n' || charAt == '\r') {
                i7 = (charAt == '\r' && (i8 = i10 + 1) < this.f27191q.length() && this.f27191q.charAt(i8) == '\n') ? 2 : 1;
                length = i10;
                this.f27192r = 1;
                this.f27195u = i7;
                this.f27194t = length;
                return true;
            }
        }
        i7 = -1;
        this.f27192r = 1;
        this.f27195u = i7;
        this.f27194t = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
