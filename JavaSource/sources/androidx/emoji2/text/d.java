package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: MyApplication */
public class d {

    /* renamed from: n, reason: collision with root package name */
    private static final Object f2001n = new Object();

    /* renamed from: o, reason: collision with root package name */
    private static final Object f2002o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static volatile d f2003p;

    /* renamed from: b, reason: collision with root package name */
    private final Set f2005b;

    /* renamed from: e, reason: collision with root package name */
    private final b f2008e;

    /* renamed from: f, reason: collision with root package name */
    final g f2009f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f2010g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f2011h;

    /* renamed from: i, reason: collision with root package name */
    final int[] f2012i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f2013j;

    /* renamed from: k, reason: collision with root package name */
    private final int f2014k;

    /* renamed from: l, reason: collision with root package name */
    private final int f2015l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC0036d f2016m;

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f2004a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f2006c = 3;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f2007d = new Handler(Looper.getMainLooper());

    /* compiled from: MyApplication */
    private static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.g f2017b;

        /* renamed from: c, reason: collision with root package name */
        private volatile l f2018c;

        /* compiled from: MyApplication */
        /* renamed from: androidx.emoji2.text.d$a$a, reason: collision with other inner class name */
        class C0035a extends h {
            C0035a() {
            }

            @Override // androidx.emoji2.text.d.h
            public void a(Throwable th) {
                a.this.f2020a.m(th);
            }

            @Override // androidx.emoji2.text.d.h
            public void b(l lVar) {
                a.this.d(lVar);
            }
        }

        a(d dVar) {
            super(dVar);
        }

        @Override // androidx.emoji2.text.d.b
        void a() {
            try {
                this.f2020a.f2009f.a(new C0035a());
            } catch (Throwable th) {
                this.f2020a.m(th);
            }
        }

        @Override // androidx.emoji2.text.d.b
        CharSequence b(CharSequence charSequence, int i7, int i8, int i9, boolean z7) {
            return this.f2017b.h(charSequence, i7, i8, i9, z7);
        }

        @Override // androidx.emoji2.text.d.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2018c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2020a.f2010g);
        }

        void d(l lVar) {
            if (lVar == null) {
                this.f2020a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2018c = lVar;
            l lVar2 = this.f2018c;
            i iVar = new i();
            InterfaceC0036d interfaceC0036d = this.f2020a.f2016m;
            d dVar = this.f2020a;
            this.f2017b = new androidx.emoji2.text.g(lVar2, iVar, interfaceC0036d, dVar.f2011h, dVar.f2012i);
            this.f2020a.n();
        }
    }

    /* compiled from: MyApplication */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final d f2020a;

        b(d dVar) {
            this.f2020a = dVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i7, int i8, int i9, boolean z7);

        abstract void c(EditorInfo editorInfo);
    }

    /* compiled from: MyApplication */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final g f2021a;

        /* renamed from: b, reason: collision with root package name */
        boolean f2022b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2023c;

        /* renamed from: d, reason: collision with root package name */
        int[] f2024d;

        /* renamed from: e, reason: collision with root package name */
        Set f2025e;

        /* renamed from: f, reason: collision with root package name */
        boolean f2026f;

        /* renamed from: g, reason: collision with root package name */
        int f2027g = -16711936;

        /* renamed from: h, reason: collision with root package name */
        int f2028h = 0;

        /* renamed from: i, reason: collision with root package name */
        InterfaceC0036d f2029i = new g.b();

        protected c(g gVar) {
            androidx.core.util.e.g(gVar, "metadataLoader cannot be null.");
            this.f2021a = gVar;
        }

        protected final g a() {
            return this.f2021a;
        }

        public c b(int i7) {
            this.f2028h = i7;
            return this;
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public interface InterfaceC0036d {
        boolean a(CharSequence charSequence, int i7, int i8, int i9);
    }

    /* compiled from: MyApplication */
    private static class f implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private final List f2030q;

        /* renamed from: r, reason: collision with root package name */
        private final Throwable f2031r;

        /* renamed from: s, reason: collision with root package name */
        private final int f2032s;

        f(e eVar, int i7) {
            this(Arrays.asList((e) androidx.core.util.e.g(eVar, "initCallback cannot be null")), i7, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2030q.size();
            int i7 = 0;
            if (this.f2032s != 1) {
                while (i7 < size) {
                    ((e) this.f2030q.get(i7)).a(this.f2031r);
                    i7++;
                }
            } else {
                while (i7 < size) {
                    ((e) this.f2030q.get(i7)).b();
                    i7++;
                }
            }
        }

        f(Collection collection, int i7) {
            this(collection, i7, null);
        }

        f(Collection collection, int i7, Throwable th) {
            androidx.core.util.e.g(collection, "initCallbacks cannot be null");
            this.f2030q = new ArrayList(collection);
            this.f2032s = i7;
            this.f2031r = th;
        }
    }

    /* compiled from: MyApplication */
    public interface g {
        void a(h hVar);
    }

    /* compiled from: MyApplication */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(l lVar);
    }

    /* compiled from: MyApplication */
    static class i {
        i() {
        }

        androidx.emoji2.text.h a(androidx.emoji2.text.f fVar) {
            return new n(fVar);
        }
    }

    private d(c cVar) {
        this.f2010g = cVar.f2022b;
        this.f2011h = cVar.f2023c;
        this.f2012i = cVar.f2024d;
        this.f2013j = cVar.f2026f;
        this.f2014k = cVar.f2027g;
        this.f2009f = cVar.f2021a;
        this.f2015l = cVar.f2028h;
        this.f2016m = cVar.f2029i;
        r.b bVar = new r.b();
        this.f2005b = bVar;
        Set set = cVar.f2025e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2025e);
        }
        this.f2008e = new a(this);
        l();
    }

    public static d b() {
        d dVar;
        synchronized (f2001n) {
            dVar = f2003p;
            androidx.core.util.e.h(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z7) {
        return androidx.emoji2.text.g.c(inputConnection, editable, i7, i8, z7);
    }

    public static boolean f(Editable editable, int i7, KeyEvent keyEvent) {
        return androidx.emoji2.text.g.d(editable, i7, keyEvent);
    }

    public static d g(c cVar) {
        d dVar;
        d dVar2 = f2003p;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (f2001n) {
            try {
                dVar = f2003p;
                if (dVar == null) {
                    dVar = new d(cVar);
                    f2003p = dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public static boolean h() {
        return f2003p != null;
    }

    private boolean j() {
        return d() == 1;
    }

    private void l() {
        this.f2004a.writeLock().lock();
        try {
            if (this.f2015l == 0) {
                this.f2006c = 0;
            }
            this.f2004a.writeLock().unlock();
            if (d() == 0) {
                this.f2008e.a();
            }
        } catch (Throwable th) {
            this.f2004a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.f2014k;
    }

    public int d() {
        this.f2004a.readLock().lock();
        try {
            return this.f2006c;
        } finally {
            this.f2004a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f2013j;
    }

    public void k() {
        androidx.core.util.e.h(this.f2015l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f2004a.writeLock().lock();
        try {
            if (this.f2006c == 0) {
                return;
            }
            this.f2006c = 0;
            this.f2004a.writeLock().unlock();
            this.f2008e.a();
        } finally {
            this.f2004a.writeLock().unlock();
        }
    }

    void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2004a.writeLock().lock();
        try {
            this.f2006c = 2;
            arrayList.addAll(this.f2005b);
            this.f2005b.clear();
            this.f2004a.writeLock().unlock();
            this.f2007d.post(new f(arrayList, this.f2006c, th));
        } catch (Throwable th2) {
            this.f2004a.writeLock().unlock();
            throw th2;
        }
    }

    void n() {
        ArrayList arrayList = new ArrayList();
        this.f2004a.writeLock().lock();
        try {
            this.f2006c = 1;
            arrayList.addAll(this.f2005b);
            this.f2005b.clear();
            this.f2004a.writeLock().unlock();
            this.f2007d.post(new f(arrayList, this.f2006c));
        } catch (Throwable th) {
            this.f2004a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i7, int i8) {
        return q(charSequence, i7, i8, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i7, int i8, int i9) {
        return r(charSequence, i7, i8, i9, 0);
    }

    public CharSequence r(CharSequence charSequence, int i7, int i8, int i9, int i10) {
        boolean z7;
        androidx.core.util.e.h(j(), "Not initialized yet");
        androidx.core.util.e.d(i7, "start cannot be negative");
        androidx.core.util.e.d(i8, "end cannot be negative");
        androidx.core.util.e.d(i9, "maxEmojiCount cannot be negative");
        androidx.core.util.e.a(i7 <= i8, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.e.a(i7 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.e.a(i8 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i7 == i8) {
            return charSequence;
        }
        if (i10 != 1) {
            z7 = i10 != 2 ? this.f2010g : false;
        } else {
            z7 = true;
        }
        return this.f2008e.b(charSequence, i7, i8, i9, z7);
    }

    public void s(e eVar) {
        androidx.core.util.e.g(eVar, "initCallback cannot be null");
        this.f2004a.writeLock().lock();
        try {
            if (this.f2006c != 1 && this.f2006c != 2) {
                this.f2005b.add(eVar);
                this.f2004a.writeLock().unlock();
            }
            this.f2007d.post(new f(eVar, this.f2006c));
            this.f2004a.writeLock().unlock();
        } catch (Throwable th) {
            this.f2004a.writeLock().unlock();
            throw th;
        }
    }

    public void t(e eVar) {
        androidx.core.util.e.g(eVar, "initCallback cannot be null");
        this.f2004a.writeLock().lock();
        try {
            this.f2005b.remove(eVar);
        } finally {
            this.f2004a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f2008e.c(editorInfo);
    }

    /* compiled from: MyApplication */
    public static abstract class e {
        public void b() {
        }

        public void a(Throwable th) {
        }
    }
}
