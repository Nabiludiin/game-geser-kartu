package x4;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p4.k1;
import p4.s1;

/* compiled from: MyApplication */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27348a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27349b;

    /* compiled from: MyApplication */
    /* renamed from: x4.a$a, reason: collision with other inner class name */
    public static class C0146a {

        /* renamed from: b, reason: collision with root package name */
        private final Context f27351b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f27353d;

        /* renamed from: a, reason: collision with root package name */
        private final List f27350a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private int f27352c = 0;

        public C0146a(Context context) {
            this.f27351b = context.getApplicationContext();
        }

        public C0146a a(String str) {
            this.f27350a.add(str);
            return this;
        }

        public a b() {
            boolean z7 = true;
            if (!s1.a(true) && !this.f27350a.contains(k1.a(this.f27351b)) && !this.f27353d) {
                z7 = false;
            }
            return new a(z7, this, null);
        }

        public C0146a c(int i7) {
            this.f27352c = i7;
            return this;
        }
    }

    /* synthetic */ a(boolean z7, C0146a c0146a, g gVar) {
        this.f27348a = z7;
        this.f27349b = c0146a.f27352c;
    }

    public int a() {
        return this.f27349b;
    }

    public boolean b() {
        return this.f27348a;
    }
}
