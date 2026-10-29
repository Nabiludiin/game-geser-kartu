package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.q;
import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final i0.b f2075a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f2076b;

    /* renamed from: c, reason: collision with root package name */
    private final a f2077c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    private final Typeface f2078d;

    /* compiled from: MyApplication */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray f2079a;

        /* renamed from: b, reason: collision with root package name */
        private f f2080b;

        private a() {
            this(1);
        }

        a a(int i7) {
            SparseArray sparseArray = this.f2079a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i7);
        }

        final f b() {
            return this.f2080b;
        }

        void c(f fVar, int i7, int i8) {
            a a8 = a(fVar.b(i7));
            if (a8 == null) {
                a8 = new a();
                this.f2079a.put(fVar.b(i7), a8);
            }
            if (i8 > i7) {
                a8.c(fVar, i7 + 1, i8);
            } else {
                a8.f2080b = fVar;
            }
        }

        a(int i7) {
            this.f2079a = new SparseArray(i7);
        }
    }

    private l(Typeface typeface, i0.b bVar) {
        this.f2078d = typeface;
        this.f2075a = bVar;
        this.f2076b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(i0.b bVar) {
        int k7 = bVar.k();
        for (int i7 = 0; i7 < k7; i7++) {
            f fVar = new f(this, i7);
            Character.toChars(fVar.f(), this.f2076b, i7 * 2);
            h(fVar);
        }
    }

    public static l b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            q.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            q.b();
        }
    }

    public char[] c() {
        return this.f2076b;
    }

    public i0.b d() {
        return this.f2075a;
    }

    int e() {
        return this.f2075a.l();
    }

    a f() {
        return this.f2077c;
    }

    Typeface g() {
        return this.f2078d;
    }

    void h(f fVar) {
        androidx.core.util.e.g(fVar, "emoji metadata cannot be null");
        androidx.core.util.e.a(fVar.c() > 0, "invalid metadata codepoint length");
        this.f2077c.c(fVar, 0, fVar.c() - 1);
    }
}
